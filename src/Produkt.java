public class Produkt {
    String name;
    double price;
    int id, amount;

    public Produkt(int id, String name, double price, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return
                name + ", price=" + price +
                ", id=" + id +
                ", amount=" + amount;
    }
}

