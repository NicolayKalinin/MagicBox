import java.util.Random;

public class MagicBox<T> {

    private int size;
    private T[] items;


    public MagicBox(int size, int size1) {
        this.size = size1;
    }
    public MagicBox(int size) {
        this.items = (T[]) new Object[size];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i += 1) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException(String.format("Коробка не полна. Осталось заполнить %s элементов", items.length - i));
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }

    public void setItems(T[] items) {
        this.items = items;
    }

    public int getSize() {
        return size;
    }
}