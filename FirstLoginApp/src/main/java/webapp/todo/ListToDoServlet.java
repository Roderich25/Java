package webapp.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/list-todo.do")
public class ListToDoServlet extends HttpServlet {
	
	private ToDoService toDoService = new ToDoService();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		request.setAttribute("todos", toDoService.retrieveToDos());
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
		
	}

}
