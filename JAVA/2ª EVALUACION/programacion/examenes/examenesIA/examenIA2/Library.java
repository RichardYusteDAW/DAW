package examenIA2;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Item> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showItems() {
        for (Item item : items) {
            item.showDetails();
            System.out.println();
        }
    }
}
