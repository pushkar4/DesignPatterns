import java.util.LinkedList;

/*
 * This is a composite element as it could have been made up of
 * a composite element itself or a leaf.
 * So a Tasklist can be made up of either sub-Tasklists or a single task.
 */
public class TaskList implements ITodo {

  private String text;
  private LinkedList<ITodo> todos;
  private int level;

  public TaskList(String text, LinkedList<ITodo> todos, int level) {
    this.text = text;
    this.todos = todos;
    this.level = level;
  }

  /*
   * As it is a tasklist return the task heading
   * and the details of all the sub-tasks
   * which themselves could be a tasklist or a simple task
   */
  @Override
  public String getDetails() {

    String details = "";

    for (int i = 0; i < level; i++) details += "  ";

    details += text + "\n";

    for (ITodo todo : todos) {
      details += todo.getDetails() + "\n";
    }

    return details;
  }
}
