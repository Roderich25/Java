package webapp.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.todo.ToDoService;


@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet{
	
	private LoginService loginService = new LoginService();
	private ToDoService todoService = new ToDoService();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String user = request.getParameter("name");
		String pass = request.getParameter("pw");
		if(loginService.isUserValid(user, pass)) {
			request.getSession().setAttribute("name", user);
			response.sendRedirect("/list-todo.do");			
		} else {
			request.setAttribute("errorMessage", "Invalid credentials!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}

	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException, ServletException {
			
			//request.setAttribute("name", request.getParameter("name"));
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
			
		
	}
}