package com.skilldistillery.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.data.ProductDao;
import com.skilldistillery.data.ProductDaoMemoryImpl;


public class LotteryServlet extends HttpServlet {
  
	ProductDao dao = new ProductDaoMemoryImpl();
	List<Integer> balls= new ArrayList<>();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String numbers = req.getParameter("numBalls");
		String range = req.getParameter("maxNum");
		//String x1=req.getParameter("numberone");
		//String x2=req.getParameter("numbertwo");
//		Product lotteryProduct=ProductDao.
//		if (lotteryProduct != null) {
//			req.setAttribute( numbers, balls);
//			req.setAttribute( range, balls);
//			req.getRequestDispatcher("/results.jsp").forward(req, resp);
//		}
//		else {
//			req.getRequestDispatcher("/error.jsp").forward(req, resp);
//		}
		
		
		
		if(numbers != null && range != null){
			req.setAttribute("listOfNums", dao.MakeLotteryBalls(Integer.parseInt(numbers), Integer.parseInt(numbers)));

		
			
			req.getRequestDispatcher("/results.jsp").forward(req, resp);
		}
//		else if(x1 != null && x2 != null){
//			int a= Integer.parseInt(x1);
//			int b=Integer.parseInt(x2);
//			int multiple = a*b;
//			req.setAttribute("numberone", x1);
//			req.setAttribute("numbertwo", x2);
//			req.setAttribute("multiple", multiple);
//			req.getRequestDispatcher("/results.jsp").forward(req, resp);
//			
//		}
		else{
			req.getRequestDispatcher("/error.jsp").forward(req, resp);
		}
}
}
