/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author miske
 */
@WebServlet(name = "CalculaI", urlPatterns = {"/calcula"})
public class CalculaImc extends HttpServlet {

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

        Double peso;
        Double altura;
        Double imc;

        peso = Double.valueOf(request.getParameter("peso"));
        altura = Double.valueOf(request.getParameter("altura"));

        imc = peso / (altura * altura);
        String situacao = "";

        if (imc < 17) {
            situacao = "Muito abaixo do peso";
        } else if (imc < 18.5) {
            situacao = "Abaixo do peso";
        } else if (imc < 25) {
            situacao = "Peso normal";
        } else if (imc < 30) {
            situacao = "Acima do peso";
        } else if (imc < 35) {
            situacao = "Obesidade I";
        } else if (imc < 40) { 
            situacao = "Obesidade II(severa)";
        } else situacao = "Obesidade III(mórbida)";
        

            response.setContentType("text/html;charset=UTF-8");
            try ( PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<link rel='stylesheet' href='style.css'/>");
                out.println("<title>Calcula o Imc</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Cálculo do Imc</h1>");
                out.println("<p>Valor do IMC: " + imc + "</p>");
                out.println("<p>Situação: " + situacao + "</p>");

                String tabela = "<table>"
                        + "            <thead>"
                        + "                <tr>"
                        + "                    <th>IMC</th>"
                        + "                    <th>Situação</th>"
                        + "                </tr>"
                        + "            </thead>"
                        + "            <tbody>"
                        + "                <tr>"
                        + "                    <td>Abaixo de 17</td>"
                        + "                    <td>Muito abaixo do peso</td>"
                        + "                </tr>"
                        + "                <tr>"
                        + "                    <td>Entre 18 e 18,49</td>"
                        + "                    <td>Abaixo do peso</td>"
                        + "                </tr>"
                        + "                <tr>"
                        + "                    <td>Entre 18,5 e 24,99</td>"
                        + "                    <td>Peso normal</td>"
                        + "                </tr>"
                        + "                <tr>"
                        + "                    <td>Entre 25 e 29,99</td>"
                        + "                    <td>Acima do peso</td>"
                        + "                </tr>"
                        + "                <tr>"
                        + "                    <td>Entre 30 34,99</td>"
                        + "                    <td>Obesidade I</td>"
                        + "                </tr>"
                        + "                <tr>"
                        + "                    <td>Entre 35 e 39,99</td>"
                        + "                    <td>Obesidade II (severa)</td>"
                        + "                </tr>"
                        + "                <tr>"
                        + "                    <td>Acima de 40</td>"
                        + "                    <td>Obesidade III (mórbida)</td>"
                        + "                </tr>"
                        + "            </tbody>"
                        + "        </table>";
                out.println(tabela);
                out.println("<button type='text'> <a href='./'>Calcular Novamente</a></button>");
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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
