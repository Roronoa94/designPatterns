package chainOfResponsibility;

public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO's can handle anything");
    }

}
