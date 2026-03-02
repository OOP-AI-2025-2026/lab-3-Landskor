package task3;

public class Main {
    public static void main(String[] args) {
        IntStack stack = new IntStack();

        System.out.println("Створено новий стек");
        System.out.println("Стек порожній? " + stack.isEmpty());
        System.out.println("Розмір стека: " + stack.size());
        System.out.println();
        System.out.println("Додаємо елементи: 10, 20, 30, 40, 50");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Стек: " + stack);
        System.out.println("Розмір стека: " + stack.size());
        System.out.println("Стек порожній? " + stack.isEmpty());
        System.out.println("Верхній елемент (peek): " + stack.peek());
        System.out.println();
        System.out.println("Видаляємо елемент: " + stack.pop());
        System.out.println("Стек після pop: " + stack);
        System.out.println("Видаляємо елемент: " + stack.pop());
        System.out.println("Стек після pop: " + stack);
        System.out.println("Розмір стека: " + stack.size());
        System.out.println();
        System.out.println("Додаємо 60, 70");
        stack.push(60);
        stack.push(70);
        System.out.println("Стек: " + stack);
        System.out.println("Розмір стека: " + stack.size());
        System.out.println();
        System.out.println("Очищаємо стек");
        stack.clear();
        System.out.println("Стек після clear: " + stack);
        System.out.println("Розмір стека: " + stack.size());
        try {
            System.out.println("Спроба pop з порожнього стека:");
            stack.pop();
        } catch (Exception e) {
            System.out.println("Отримано виняток: " + e.getClass().getSimpleName());
        }
    }
}