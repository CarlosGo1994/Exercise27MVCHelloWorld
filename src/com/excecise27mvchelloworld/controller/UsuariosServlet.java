package com.excecise27mvchelloworld.controller;

//import com.excercise27mvchelloworls.model.UserModel;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UsuariosServlet")
public class UsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuariosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Hello World");
		
		String sid="";
		int iid=0;
		String sname="";
		String sage="";
		short shage=0;
		
		sid = request.getParameter("txtId");
		iid = Integer.parseInt(sid);
		sname = request.getParameter("txtName");
		sage = request.getParameter("txtAge");
		shage = Short.parseShort(sage);
		
		userBean
		
	/*	response.getWriter().append("The id input is:"+sid);
		response.getWriter().append("The name input is:"+sname);
		response.getWriter().append("The age input is:"+sage);*/
	
	/*
	UserModel Juanito;
	Juanito = new UserModel();
	Juanito.setEdad(10);
		*/
	}

}
