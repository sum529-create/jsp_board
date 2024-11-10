package com.sumin.jsp.board.servlet;

import com.sumin.jsp.board.Rq;

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
        Rq rq = new Rq(req, resp);

        // /gugudan?dan=n
//        int dan = Integer.parseInt(req.getParameter("dan"));
        int dan = rq.getIntParam("dan", 9);
        // /gugudan?dan=n&limit=x
//        int limit = Integer.parseInt(req.getParameter("limit"));
        int limit = rq.getIntParam("limit", 9);

//        resp.getWriter().append(String.format("<h1>%d</h1>\n", dan));
        rq.appendBody(String.format("<h1>%d단</h1>\n", dan));
        for (int i = 1; i <= limit; i++) {
//            resp.getWriter().append(String.format("<div>%d * %d = $d</div>", dan, i, dan * i));
            rq.appendBody(String.format("<h1>%d * %d = %d</h1>\n", dan, i, dan * i));
        }
        String htmlContent =
                "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<meta charset=\"UTF-8\">\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<div class=\"box\"></div>\n" +
                        "</body>\n" +
                        "<style>\n" +
                        ".box{\n" +
                        "    width: 200px;\n" +
                        "    height: 200px;\n" +
                        "    background-color: red;\n" +
                        "}\n" +
                        "</style>";

        rq.appendBody(htmlContent);
    }
}
