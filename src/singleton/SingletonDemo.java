package singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        DBSingleton instance = DBSingleton.getInstance();
        DBSingleton anotherinstance = DBSingleton.getInstance();

        MyConnection conn = instance.getConnection();
        MyConnection anotherConn = instance.getConnection();

        MyConnection yetAnotherConn = anotherinstance.getConnection();

        System.out.println(instance);
        System.out.println(anotherinstance);
        System.out.println(conn);
        System.out.println(anotherConn);
        System.out.println(yetAnotherConn);

        conn.setConnectionName("Old Connection");

        System.out.println(anotherConn.getConnectionName());
        System.out.println(yetAnotherConn.getConnectionName());

        yetAnotherConn.setConnectionName("New Connection");
        System.out.println(conn.getConnectionName());
    }
}
