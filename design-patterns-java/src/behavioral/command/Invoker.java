package behavioral.command;

import java.util.HashMap;

public class Invoker {

    HashMap<Integer, Command> buttonCommands = new HashMap<>();
    final int buttons = 5;

    public Invoker(){
        for(int i=1;i<=buttons;i++){
            buttonCommands.put(i, new NoCommand());
        }
    }

    public void setCommandForKey(int key, Command cmd){
        buttonCommands.put(key, cmd);
    }

    public void onButtonPressed(int buttonId){
       if(!buttonCommands.containsKey(buttonId))
           return;
        buttonCommands.get(buttonId).execute();
    }
}
