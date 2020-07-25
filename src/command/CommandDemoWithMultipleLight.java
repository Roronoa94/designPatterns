package command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemoWithMultipleLight {

    public static void main(String[] args) {
        Light bedRoomLight = new Light();
        Light kitchenLight = new Light();

        Switch lightSwitch = new Switch();


        List<Light> lights = new ArrayList<>();
        lights.add(bedRoomLight);
        lights.add(kitchenLight);

        Command allLightsCommand = new AllLightsCommand(lights);
        allLightsCommand.execute();

        lightSwitch.storeAndExecute(allLightsCommand);
    }

}
