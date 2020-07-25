package mediator;

public class MediatorDemo {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightCommand = new TurnOnAllLightsCommand(mediator);

        turnOnAllLightCommand.execute();

        Command turnOffAllLightCommand = new TurnOffAllLightsCommand(mediator);

        turnOffAllLightCommand.execute();
    }

}
