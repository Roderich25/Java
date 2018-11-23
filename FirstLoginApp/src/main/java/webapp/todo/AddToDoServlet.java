package webapp.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/add-todo.do")
public class AddToDoServlet extends HttpServlet {
	
	private ToDoService toDoService = new ToDoService();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String newToDo = request.getParameter("todo");
		toDoService.addToDo(new ToDo(newToDo));
		response.sendRedirect("/list-todo.do");
	}
}
