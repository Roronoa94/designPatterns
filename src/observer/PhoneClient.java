package observer;

public class PhoneClient extends Observer {

    public PhoneClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " : - send from phone");
    }

    @Override
    void update() {
        System.out.println("Phone stream : " + subject.getState());
    }
}
