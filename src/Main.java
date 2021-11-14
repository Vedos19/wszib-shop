import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //test
    //git status
    //git add
    //git commit
    //git push

    public static void main(String[] args) {


        int choice;
        Scanner scanner = new Scanner(System.in);
        List<Produkt> products = new ArrayList();
        products.add(new Produkt(1, "Bread", 3.5, 20));
        products.add(new Produkt(2, "Water", 1, 100));
        products.add(new Produkt(3, "Milk", 2, 30));
        products.add(new Produkt(4, "Chocolate", 4.5, 70));
        products.add(new Produkt(5, "Candy_Bar", 2.5, 40));
        products.add(new Produkt(6, "Ham", 7.5, 25));

        do {
            System.out.println("Choose action:\n" +
                    "1. List of products\n" +
                    "2. Buy product\n" +
                    "3. Sell product\n" +
                    "4. Exit\n\n" +
                    "Your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Products");

                    for(Produkt produkt : products) {
                        System.out.println(produkt);
                    }

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Missclick");
            }
        }
        while(choice != 4);
    }
}

