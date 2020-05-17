package org.sda.java26.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static org.sda.java26.utils.AddressesUtil.HELLO_SERVLET_URL;


// http://localhost:8080/hello?name=Krzysztof
// HELLO_SERVLET_URL = "/hello"
@WebServlet(name = "helloServlet", value = HELLO_SERVLET_URL)
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nameValue = req.getParameter("user_name");

        PrintWriter printWriter = resp.getWriter();
        printWriter.print("Hello " + nameValue);
    }
}
