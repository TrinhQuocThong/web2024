package controller;

import database.UserDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Encrypt;
import model.User;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;

public class CheckCodeServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String code = req.getParameter("code");



        HttpSession session = req.getSession();

        String codes = (String) session.getAttribute("codeVerify");
        if (session != null && code != null && code.equals(codes)) {


            try {
                String username = (String) session.getAttribute("username");
                String pass = (String) session.getAttribute("password");
                String saltString = Encrypt.saltString();
                String hashPass = Encrypt.hashPassword(pass, saltString);
                User user = new User(username, hashPass, new Timestamp(System.currentTimeMillis()), (byte) 1, saltString, (byte) 0, (byte) 0);
                new UserDao().add(user);
                session.setAttribute("user", user);

                RequestDispatcher ss = req.getRequestDispatcher("index.jsp");
                ss.forward(req,resp);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            } catch (Exception e) {
                e.printStackTrace();
            }


        } else {
            RequestDispatcher ss = req.getRequestDispatcher("error.jsp");
            ss.forward(req, resp);
        }

    }
}

