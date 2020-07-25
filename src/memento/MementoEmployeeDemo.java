package memento;

public class MementoEmployeeDemo {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Employee employee = new Employee();

        employee.setName("Satyam");
        employee.setAddress("India");
        employee.setPhone("123-456-7890");

        System.out.println("Employee before save : " + employee);

        caretaker.save(employee);

        employee.setPhone("098-765-4321");

        caretaker.save(employee);

        System.out.println("Employee after changed phone number save : " + employee);

        employee.setPhone("567-890-1234");

        caretaker.revert(employee);

        System.out.println("Reverts to last save point : " + employee);

        caretaker.revert(employee);

        System.out.println("Reverted to original : " + employee);
    }
}
