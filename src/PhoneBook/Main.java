package PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        for (int i = 0; i < 20; i++) {
            long number = 89183234652L;
            phoneBook.add("Ф.И." + (i+ 1), String.valueOf(number + i));
        }
        phoneBook.print();

    }
}