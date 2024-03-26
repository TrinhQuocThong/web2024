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

public class loginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String username = req.getParameter("username");


        String pass = req.getParameter("password");

        String satlString = Encrypt.saltString();
        String pass_Hash = "";

        String url = "";
        if (username != null && pass != null)
            try {

                User user = new UserDao().selectByUsername(username);

                pass_Hash = Encrypt.hashPassword(pass, satlString);


                //nếu giống
                if (pass_Hash.equals(user.getPasswords())) {


                    url = "index.jsp";

                    HttpSession session = req.getSession();

                    session.setAttribute("user", user);


                } else {
                    url = "error.jsp";
                }

            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }

        RequestDispatcher ss = req.getRequestDispatcher(url);

        ss.forward(req, resp);


    }


}
