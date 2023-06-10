import functions.Array;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Array number = new Array(3);
          number.insert(20);
          number.insert(10);
        number.insert(2);
        number.insert(12);
        number.remove(3);
        number.indexOf(12);
        number.printItems();
    }
}