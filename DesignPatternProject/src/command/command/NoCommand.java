package command.command;

import command.command.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("아무것도 하지 않음");
    }

    @Override
    public void undo() {
        System.out.println("취소");
    }
}
