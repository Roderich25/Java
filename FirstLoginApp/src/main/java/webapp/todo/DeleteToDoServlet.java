package webapp.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/delete-todo.do")
public class DeleteToDoServlet extends HttpServlet {
	
	private ToDoService toDoService = new ToDoService();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		toDoService.deleteToDo(new ToDo(request.getParameter("todo")));
		response.sendRedirect("/list-todo.do");
		
	}

}
