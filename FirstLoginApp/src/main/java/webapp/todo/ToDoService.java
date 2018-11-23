package webapp.todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoService {
	
	private static List<ToDo> toDoList = new ArrayList<>();
	
	static {
		toDoList.add(new ToDo("Learn Web Application Development"));
		toDoList.add(new ToDo("Learn Spring MVC"));
		toDoList.add(new ToDo("Learn Spring REST services"));
	}
	
	public List<ToDo> retrieveToDos(){
		return toDoList;
	}
	
	public void addToDo(ToDo todo) {
		toDoList.add(todo);
	}

	public void deleteToDo(ToDo todo) {
		toDoList.remove(todo);
	}

}
