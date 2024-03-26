package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.CreateCodeModel;

import java.io.IOException;

public class serveltCreateCode extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String username = req.getParameter("username");


        String pass = req.getParameter("password");


        String getCreateCode = "" + CreateCodeModel.createCode();
        HttpSession session = req.getSession();


        session.setAttribute("username", username);

        session.setAttribute("password", pass);

        session.setAttribute("codeVerify", getCreateCode);
        String url = "checkcode.jsp";

        RequestDispatcher ss = req.getRequestDispatcher(url);

        ss.forward(req, resp);


    }
}
