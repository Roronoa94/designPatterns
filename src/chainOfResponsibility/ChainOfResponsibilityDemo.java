package chainOfResponsibility;

public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        Director satyam = new Director();
        VP ashutosh = new VP();
        CEO kanchan = new CEO();

        satyam.setSuccessor(ashutosh);
        ashutosh.setSuccessor(kanchan);

        Request request = new Request(RequestType.CONFERENCE, 500);
        satyam.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 750);
        satyam.handleRequest(request);

        request = new Request(RequestType.CONFERENCE, 2000);
        satyam.handleRequest(request);

    }

}
