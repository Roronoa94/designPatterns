package facade;

public class MyConnection {
    private String connectionName;

    public void startConnection() {
        System.out.println("Connection establised");
    }

    public void stopConnection() {
        System.out.println("Connection stopped");
    }

    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }
}
