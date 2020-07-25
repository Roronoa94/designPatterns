package prototype;

public class PrototypeItemDemo {
    public static void main(String[] args) {

        Registry registry = new Registry();

        Game godOfWar = (Game) registry.createItem(ItemType.GAME.name());
        godOfWar.setTitle("God Of War");
        godOfWar.setPrice("20$");
        godOfWar.setAmount("1");
        godOfWar.setGameType("PS4 Game");

        System.out.println(godOfWar);
        System.out.println(godOfWar.getGameType());

        Game mortalKombat = (Game) registry.createItem(ItemType.GAME.name());
        mortalKombat.setTitle("Mortal Kombat");
        mortalKombat.setPrice("25$");
        mortalKombat.setAmount("1");
        mortalKombat.setGameType("All Platform Game");

        System.out.println(mortalKombat);
        System.out.println(mortalKombat.getGameType());

        Book javaForDummies = (Book) registry.createItem(ItemType.BOOK.name());
        javaForDummies.setTitle("Java For Dummies");
        javaForDummies.setPrice("10$");
        javaForDummies.setAmount("1");
        javaForDummies.setAuthor("Anonymous");
        javaForDummies.setNumberOfPages("220");

        System.out.println(javaForDummies);
        System.out.println(javaForDummies.getAuthor());

    }
}
