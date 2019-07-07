import java.util.LinkedList;

public class TestTodoApp {

	public static void main(String[] args) {
		
		/*
		 * We would like to make the below todo list:
		 * 
		 * My todos
		 * - Do homework
		 *   - Do data structures hw
		 *     - Implement heaps
		 *     - Implement tree
		 *       - Implement BST
		 *       - Implement AVL tree
		 *   - Do os homework
		 *   - Do dbms hw
		 * - Buy groceries
		 *   - milk
		 *   - bread
		 */
		
		/*
		 * This could be programmed bu we are going to build it manually
		 * piece by piece.
		 */
		
		LinkedList<ITodo> l1 = new LinkedList<ITodo>();
		l1.add(new Task("Implement BST", 4));
		l1.add(new Task("Implement AVL tree", 4));
		ITodo t1 = new TaskList("Implement tree", l1, 3);
		
		LinkedList<ITodo> l2 = new LinkedList<ITodo>();
		l2.add(new Task("Implement heaps", 3));
		l2.add(t1);
		ITodo t2 = new TaskList("Do data structures hw", l2, 2);
		
		LinkedList<ITodo> l3 = new LinkedList<ITodo>();
		l3.add(t2);
		l3.add(new Task("Do os homework", 2));
		l3.add(new Task("Do dbms hw", 2));
		ITodo t3 = new TaskList("Do homework", l3, 1);
		
		LinkedList<ITodo> l4 = new LinkedList<ITodo>();
		l4.add(new Task("Milk", 2));
		l4.add(new Task("Bread", 2));
		ITodo t4 = new TaskList("Buy groceries", l4, 1);
		
		LinkedList<ITodo> l5 = new LinkedList<ITodo>();
		l5.add(t3);
		l5.add(t4);
		
		ITodo todo = new TaskList("My todos", l5, 0);
		
		System.out.println(todo.getDetails());
		
	}
}
