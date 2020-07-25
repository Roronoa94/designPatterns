package singleton;

public class DBSingleton {

    private static volatile DBSingleton instance = null;
    private static volatile MyConnection conn = null;

    private DBSingleton() {
        if (instance!= null) {
            throw new RuntimeException("Use method getInstance() to create");
        }
    }

    public static DBSingleton getInstance() {
        if (instance == null) {
            synchronized (DBSingleton.class) {
                if (instance == null) {
                    instance = new DBSingleton();
                }
            }
        }

        return instance;
    }

    public MyConnection getConnection() {
        if (conn == null) {
            synchronized (DBSingleton.class) {
                if (conn == null) {
                    conn = new MyConnection();
                }
            }
        }

        return conn;
    }

}
