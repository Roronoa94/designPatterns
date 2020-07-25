package facade;

public class JdbcFacade {

    DBSingleton instance = null;

    public JdbcFacade() {
        instance = DBSingleton.getInstance();
    }

    public void createTable() {
        MyConnection conn = instance.getConnection();

        conn.startConnection();
        conn.setConnectionName("Create Tables");
        System.out.println(conn.getConnectionName());
        conn.stopConnection();
    }

    public void insertTable() {
        MyConnection conn = instance.getConnection();

        conn.startConnection();
        conn.setConnectionName("Insert Tables");
        System.out.println(conn.getConnectionName());
        conn.stopConnection();
    }

}
