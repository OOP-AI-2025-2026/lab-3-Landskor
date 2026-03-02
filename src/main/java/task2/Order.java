package task2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNumber;
    private LocalDate orderDate;
    private List<Item> items;
    private double totalPrice;

    public Order(String orderNumber) {
        this.orderNumber = orderNumber;
        this.orderDate = LocalDate.now();
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addItem(Item item) {
        items.add(item);
        totalPrice += item.getTotalPrice();
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getItemCount() {
        return items.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Замовлення #").append(orderNumber)
                .append(" від ").append(orderDate)
                .append("\nТовари:\n");

        for (Item item : items) {
            sb.append("  - ").append(item.toString()).append("\n");
        }

        sb.append("Загальна сума: ").append(totalPrice);
        return sb.toString();
    }
}