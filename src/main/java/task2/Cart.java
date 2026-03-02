package task2;

import java.util.ArrayList;
import java.util.List;
public class Cart {
    private List<Item> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        for (Item existingItem : items) {
            if (existingItem.getName().equals(item.getName())) {
                // Збільшуємо кількість
                existingItem.setQuantity(existingItem.getQuantity() + item.getQuantity());
                return;
            }
        }
        items.add(item);
    }

    public void removeItem(String itemName) {
        items.removeIf(item -> item.getName().equals(itemName));
    }

    public int getItemCount() {
        return items.size();
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void clear() {
        items.clear();
    }

    public List<Item> getItems() {
        return new ArrayList<>(items); // Повертаємо копію
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}