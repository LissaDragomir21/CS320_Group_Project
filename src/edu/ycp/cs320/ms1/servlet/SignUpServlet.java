package edu.ycp.cs320.ms1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/_view/signUp.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//Numbers model = new Numbers();
		
		// Decode form parameters and dispatch to controller
		
		if(req.getParameter("login") != null){
			resp.sendRedirect(req.getContextPath() + "/UserHome");
		}
		
		/*if(username.equals("Test")){
			
		}
		
		
		
		
		String errorMessage = null;
		if(req.getParameter("login") != null){
			resp.sendRedirect(req.getContextPath() + "/Login");
		}
		try {
			model.setValue1(getDouble(req, "first"));
			model.setValue2(getDouble(req, "second"));
			model.setValue3(getDouble(req, "third"));

			Double first = model.getValue1();
			Double second = model.getValue2();
			Double third = model.getValue3();
			
			if (first == null || second == null || third == null) {
				errorMessage = "Please specify three numbers";
			} else {
				NumbersController controller = new NumbersController();
				model.setResult(controller.add(first, second, third));
			}
		} catch (NumberFormatException e) {
			errorMessage = "Invalid double";
		}
		
		// Add parameters as request attributes
		//req.setAttribute("first", model.getValue());
		//req.setAttribute("second", model.getValue2());
		//req.setAttribute("third", model.getValue3());
		
		// Add result objects as request attributes
		req.setAttribute("errorMessage", errorMessage);
		req.setAttribute("game", model);
		//req.setAttribute("result", result);
		
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/signUp.jsp").forward(req, resp);
	}

	private Double getDouble(HttpServletRequest req, String name) {
		return Double.parseDouble(req.getParameter(name));*/
	}
}
