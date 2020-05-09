package org.sda.java26.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;

// http://localhost:8080/imiona?name=xxx
@WebServlet(name = "nameServlet", value = "/imiona")
public class NameServlet extends HttpServlet {

    private FileWriter fileWriter;

    // uruchamia się raz, podczas tworzenia serwletu
    @Override
    public void init() throws ServletException {
        System.out.println("Hej, tu metoda init");

        try {
            File file = new File("D:\\projects\\sda\\java26\\jsp_servlety_jav26_zajecia\\imiona.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            fileWriter = new FileWriter(file, true);
        } catch (IOException e){
            System.out.println("Something went wrong during opening a file");
            throw new ServletException("Something went wrong during opening a file", e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("===================================");
        Enumeration<String> paramNames = req.getParameterNames();
        while(paramNames.hasMoreElements()){
            String paramName = paramNames.nextElement();
            System.out.print(paramName + ": ");
            System.out.println(req.getParameter(paramName));
        }
        System.out.println("===================================");


        String nameValue = req.getParameter("name");
        String surnameValue = req.getParameter("surname");

//        fileWriter.append(nameValue + " " + surnameValue);

        fileWriter.append(nameValue);
        fileWriter.append(" ");
        fileWriter.append(surnameValue);

        fileWriter.append("\r\n");
        fileWriter.flush();

    }

    @Override
    public void destroy() {
        System.out.println("Destroy method called");
        try {
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Unable to close file");
        }
    }
}
