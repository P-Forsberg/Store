package org.example.menu;

import org.example.command.SwitchCommand;

public class WelcomeMenu extends Menu{

   public WelcomeMenu(){
       super();

       addCommand(new SwitchCommand());
   }

    @Override
    public void present() {
        System.out.println("Welcome to the store! please choose a person");
    }
}
