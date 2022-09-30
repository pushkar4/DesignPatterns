/*
 * This is equivalent to a leaf.
 * A Task will have no subtasks.
 */
public class Task implements ITodo {

  private String text;
  private int level;

  public Task(String text, int level) {
    this.text = text;
    this.level = level;
  }

  /*
   * As it is a single task return the details
   */
  @Override
  public String getDetails() {

    String details = "";

    for (int i = 0; i < level; i++) details += "  ";

    details += text;

    return details;
  }
}
