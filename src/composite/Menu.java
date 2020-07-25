package composite;

public class Menu extends MenuComponent {

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        menucomponents.add(menuComponent);
        return menuComponent;
    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
        menucomponents.remove(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString() {
        StringBuilder  builder = new StringBuilder();

        builder.append(print(this));

        for(MenuComponent menuComponent: menucomponents) {
            builder.append(menuComponent.toString());
        }

        return builder.toString();
    }

}
