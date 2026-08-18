package com.quiz;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/quiz")
public class QuizServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String answer = request.getParameter("answer");

        out.println("<html><body>");
        out.println("<h1>Online Quiz Result</h1>");

        if ("Java".equals(answer)) {
            out.println("<h2>Correct Answer! 🎉</h2>");
        } else {
            out.println("<h2>Wrong Answer!</h2>");
        }

        out.println("<a href='quiz.html'>Try Again</a>");
        out.println("</body></html>");
    }
}
