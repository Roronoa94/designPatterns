package facade;

public class FacadeJdbcDemo {

    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();
        jdbcFacade.insertTable();
    }

}
