package com.excecise27mvchelloworld.controller;

//import com.excercise27mvchelloworls.model.UserModel;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.excercise27mvchelloworls.model.UserBean;


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
		
		UserBean myUser1 = new UserBean(iid, sname, shage);
		UserBean myUser2 = new UserBean();
		myUser2.setId(iid);
		myUser2.setName(sname);
		myUser2.setAge(shage);
		
		response.getWriter().append("The id input myUser1 is:"+myUser1.getId());
		response.getWriter().append("The name input myUser1 is:"+myUser1.getName());
		response.getWriter().append("The age input myUser1 is:"+myUser1.getAge());
		

	}

}
