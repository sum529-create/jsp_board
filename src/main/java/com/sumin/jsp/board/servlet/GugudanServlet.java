package com.sumin.jsp.board.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");

        // /gugudan?dan=n
        int dan = Integer.parseInt(req.getParameter("dan"));
        // /gugudan?dan=n&limit=x
        int limit = Integer.parseInt(req.getParameter("limit"));

        resp.getWriter().append(String.format("<h1>%d</h1>\n", dan));
        for(int i =1; i<=limit; i++){
            resp.getWriter().append(String.format("<div>%d * %d</div>", dan, i, dan * i));
        }

    }
}
