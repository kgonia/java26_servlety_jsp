package org.sda.java26.servlets;

import org.sda.java26.math.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/calculation")
public class CalculationServlet extends HttpServlet {

    private Calculator calculator = new Calculator();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int liczba1 = parserAsIntOrDefault(req, "liczba1", 0);
        int liczba2 = parserAsIntOrDefault(req, "liczba2", 1);

        String type = req.getParameter("type");

        double wynik = handleOperation(type, liczba1, liczba2);
        printOnPage(resp.getWriter(), wynik);
    }

    private int parserAsIntOrDefault(HttpServletRequest req, String paramName, int defaultValue){
        String param = req.getParameter(paramName);

        int liczba = param == null ? defaultValue : Integer.parseInt(param);
//        int liczba1 = param != null ? Integer.parseInt(param) : defaultValue;
        return liczba;
    }

    private double handleOperation(String type, int liczba1, int liczba2){
        double wynik = 0;

        switch (type) {
            case "add":
                wynik = calculator.add(liczba1, liczba2);
                break;
            case "sub":
                wynik = calculator.subtract(liczba1, liczba2);
                break;
            case "mul":
                wynik = calculator.multiply(liczba1, liczba2);
                break;
            case "div":
                wynik = calculator.divide(liczba1, liczba2);
                break;

            case "clear":
                try {
                    calculator.clearOperations();
                } catch (NumberFormatException exception) {
                    System.out.println("Nie przejmuj się");
                } finally {
                    calculator.clearOperations();
                }
                break;
            default:
                System.out.println("podałeś złe wartości");
        }

        return wynik;
    }

    private void printOnPage(PrintWriter writer, double wynik) {
        writer.println(wynik);

        writer.println("Operacje wykonane: ");
        for (String operation : calculator.getOperations()) {
            writer.println(operation);
        }
    }
}
