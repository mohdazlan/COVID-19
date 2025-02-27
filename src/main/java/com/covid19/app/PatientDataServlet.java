package com.covid19.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class PatientDataServlet
 */
@WebServlet("/PatientDataServlet")
public class PatientDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        String symptoms = request.getParameter("symptoms");

        // Server-side validation
        if (name == null || name.trim().isEmpty() || ageStr == null || ageStr.trim().isEmpty() || symptoms == null || symptoms.trim().isEmpty()) {
            out.println("All fields are required!");
        } else {
            try {
                int age = Integer.parseInt(ageStr);
                if (age < 1 || age > 120) {
                    out.println("Age must be between 1 and 120!");
                } else {
                    out.println("Patient data submitted successfully!<br>");
                    out.println("Name: " + name + "<br>");
                    out.println("Age: " + age + "<br>");
                    out.println("Symptoms: " + symptoms + "<br>");
                }
            } catch (NumberFormatException e) {
                out.println("Age must be a valid number!");
            }
        }
	}

}
