package Command;

public class SimpleRemoteControl {
    private Command slot;
    private Command undoCommand;
    public SimpleRemoteControl() {}
    public void setCommand(Command command) {
        slot = command;
    }
    public void pressed() {
        slot.execute();
        undoCommand = slot;
    }

    public void undoPressed() {
        undoCommand.undo();
    }
}
