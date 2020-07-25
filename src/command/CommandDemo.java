package command;

public class CommandDemo {

    public static void main(String[] args) {
        Light light = new Light();
        Switch lightSwitch = new Switch();

        //Command onCommand = new OnCommand(light);
        Command toggleCommand = new ToggleCommand(light);

        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);

    }

}
