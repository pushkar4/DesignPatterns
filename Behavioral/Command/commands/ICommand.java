package commands;

/*
 * This is the interface which specifies that each command will
 * have an execute and unexecute function.
 */
public interface ICommand {

  public void execute();

  public void unExecute();
}
