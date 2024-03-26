package controller;

import database.UserDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;

import java.io.IOException;

public class thongtincanhan_Servlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        if (session != null) {
            String username = (String) session.getAttribute("username");

            //lấy đầy đủ thông tin user
            User user = new UserDao().selectByUsername(username);


            //giá tri mới ghi đè giá trị cũ
            session.setAttribute("user", user);

            //sau đó ở cái JSP chỉ cần lấy đối tượng này ra và hiển thị


            RequestDispatcher ss = req.getRequestDispatcher("thongtincanhan.jsp");

            ss.forward(req,resp);
        }


    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        super.doGet(req, resp);
    }
}
