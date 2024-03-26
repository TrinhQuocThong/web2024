package controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


public class thongtincanhan_Filter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {


        HttpServletRequest h = (HttpServletRequest) servletRequest;

        HttpSession session = h.getSession();
        String url = "";


        //ở đây chúng ta lấy session đã được add vào request để kiểm tra
        if (session.getAttribute("user") == null) {

            url = "login.jsp";
            RequestDispatcher s = servletRequest.getRequestDispatcher(url);

            s.forward(servletRequest, servletResponse);

        }


        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
