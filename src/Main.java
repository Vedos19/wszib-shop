import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //test
    //git status
    //git add
    //git commit
    //git push

    public static void main(String[] args) {
        Produkt Bread = new Produkt(1, "Bread", 3.5, 20);
        Produkt Water = new Produkt(2, "Water", 1, 100);
        Produkt Milk = new Produkt(3, "Milk", 2, 30);
        Produkt Chocolate = new Produkt(4, "Chocolate", 4.5, 70);
        Produkt Candy_Bar = new Produkt(5, "Candy_Bar", 2.5, 40);
        Produkt Ham = new Produkt(6, "Ham", 7.5, 25);

        int choice;
        Scanner scanner = new Scanner(System.in);
        ArrayList Products = new ArrayList();
        Products.add(Bread);
        Products.add(Water);
        Products.add(Milk);
        Products.add(Chocolate);
        Products.add(Candy_Bar);
        Products.add(Ham);

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

                    for(Produkt product : Products){
                        System.out.println(product);
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
