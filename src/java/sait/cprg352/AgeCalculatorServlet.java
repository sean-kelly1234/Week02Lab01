/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 642202
 */
@WebServlet(name = "AgeCalculatorServlet", urlPatterns = {"/AgeCalculatorServlet"})
public class AgeCalculatorServlet extends HttpServlet {

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
        try{
            int age = Integer.parseInt(request.getParameter("age"));
            age++;
            request.setAttribute("age", "Your age next birthday will be " +age);
            
        }
        catch (NumberFormatException e){
            request.setAttribute("age", "You must enter a number");
        }
        finally{
//            RequestDispatcher rd = request.getRequestDispatcher("/AgeCalculator.jsp");
            getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request, response);
//            rd.forward(request, response);
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request, response);
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
