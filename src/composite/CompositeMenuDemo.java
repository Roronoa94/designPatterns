package composite;

public class CompositeMenuDemo {

    public static void main(String[] args) {

        Menu mainMenu = new  Menu("Main", "/main");

        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");

        mainMenu.add(safetyMenuItem);

        Menu claimsSunMenu = new Menu("Claims", "/claims");

        mainMenu.add(claimsSunMenu);

        MenuItem personalClaimMenu = new MenuItem("Personal Claim", "/personalClaims");

        claimsSunMenu.add(personalClaimMenu);

        System.out.println(mainMenu.toString());

    }
}
