/*
Invoker
 */
public class Nappi {

    private Command command;

    public Nappi(Command cmd){
        this.command = cmd;
    }

    public void push(){
        command.execute();
    }
}
