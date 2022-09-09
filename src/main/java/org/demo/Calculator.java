package org.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/calculator"})
public class Calculator extends GenericServlet {
    protected void processRequest(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }


	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	        PrintWriter out = response.getWriter();
	                String num1 = request.getParameter("number1");
	                String num2 = request.getParameter("number2");
	                String operator = request.getParameter("operator");                
	        switch (operator) {
	            case "Addition":
	                out.println("Answer = "+(Integer.parseInt(num1) + Integer.parseInt(num2)));
	                break;
	            case "Subtraction":
	                out.println("Answer = "+(Integer.parseInt(num1) - Integer.parseInt(num2)));
	                break;
	            case "Multiplication":
	                out.println("Answer = "+(Integer.parseInt(num1) * Integer.parseInt(num2)));
	                break;
	            default:
	                out.println("Answer = "+(Integer.parseInt(num1) / Integer.parseInt(num2)));
	                break;
	        } 
	        
	    }
	

	}


