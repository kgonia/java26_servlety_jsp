package org.sda.java26.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/favorite")
public class FavoriteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String favLang = req.getParameter("language");

        Cookie cookie = new Cookie("lang", favLang);

        cookie.setMaxAge(60*60*24*365);

        resp.addCookie(cookie);
    }
}
