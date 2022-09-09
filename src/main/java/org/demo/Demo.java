package org.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Demo extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		if(request.getParameter("number1")!=null && request.getParameter("number2")!=null)
		{
			Long numb1 = Long.parseLong( request.getParameter("number1"));
			Long numb2 =Long.parseLong(request.getParameter("number2"));
		    out.println(numb1*numb2);
			}
		else {
			out.println("Enter the valid input");
		}
		}
		
	}


