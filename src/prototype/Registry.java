package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        this.loadItems();
    }

    public Item createItem(String itemType) {
        Item item = null;
        try {
            item = (Item) (items.get(itemType)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Game basicGame = new Game();
        basicGame.setTitle("");
        basicGame.setPrice("");
        basicGame.setAmount("");
        basicGame.setGameType("");
        items.put(ItemType.GAME.name(), basicGame);

        Book basicBook = new Book();
        basicBook.setTitle("");
        basicBook.setPrice("");
        basicBook.setAmount("");
        basicBook.setAuthor("");
        basicBook.setNumberOfPages("");
        items.put(ItemType.BOOK.name(), basicBook);
    }

}
