/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ceddOz.src;

import calc_Logic.calculatorLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author juand
 */
public class CalcServlet extends HttpServlet {

    @EJB
    private calculatorLocal calculator;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<LINK REL=\"styleSheet\" HREF=\"/JEE-Calculator-war/style.css\" TYPE=\"text/css\">");
            out.println("<title>Servlet CalcServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            int a = Integer.parseInt(request.getParameter("valueA"));
            int b = Integer.parseInt(request.getParameter("valueB"));
            String operation = request.getParameter("op");
            out.println("<h1> Resultado </h1>");
            if(operation != null){
                switch(operation){
                    case "+":
                        out.println("<h1>"+a+operation+b+"="+calculator.add(a, b)+"</h1>");
                        break;
                    case "-":
                        out.println("<h1>"+a+operation+b+" = "+calculator.substract(a, b)+"</h1>");
                        break;
                    case "*":
                        out.println("<h1>"+a+operation+b+" = "+calculator.multiply(a, b)+"</h1>");
                        break;
                    case "/":
                        out.println("<h1>"+a+operation+b+" = "+calculator.divide(a, b)+"</h1>");
                        break;
                    case "%":
                        out.println("<h1>"+a+operation+b+" = "+calculator.module(a, b)+"</h1>");
                        break;
                    case "^":
                        out.println("<h1>"+a+operation+b+" = "+calculator.power(a, b)+"</h1>");
                }
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
