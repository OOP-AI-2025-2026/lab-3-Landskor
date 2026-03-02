package task2;
public class Main {
    public static void main(String[] args) {
        Item laptop = new Item("Ноутбук", 25000.0, 1);
        Item mouse = new Item("Миша", 500.0, 2);
        Item keyboard = new Item("Клавіатура", 1200.0, 1);
        Cart cart = new Cart();
        cart.addItem(laptop);
        cart.addItem(mouse);
        cart.addItem(keyboard);

        System.out.println("Кошик:");
        for (Item item : cart.getItems()) {
            System.out.println("  " + item);
        }
        System.out.println("Загальна сума: " + cart.getTotalPrice());
        System.out.println();
        Order order = new Order("ORD-001");
        order.addItem(laptop);
        order.addItem(mouse);
        order.addItem(keyboard);
        System.out.println(order);
    }
}