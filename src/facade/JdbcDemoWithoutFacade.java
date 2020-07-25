package facade;

public class JdbcDemoWithoutFacade {

    public static void main(String[] args) {
        DBSingleton instance = DBSingleton.getInstance();

        MyConnection conn = instance.getConnection();

        conn.startConnection();
        conn.setConnectionName("Create Tables");
        System.out.println(conn.getConnectionName());
        conn.stopConnection();

        conn.startConnection();
        conn.setConnectionName("Insert Tables");
        System.out.println(conn.getConnectionName());
        conn.stopConnection();
    }

}
