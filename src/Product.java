public class Produkt {
    String name;
    double price;
    int id=0, amount;

    public Produkt(int id, String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", amount=" + amount +
                '}';
    }

    boolean decrease_amount(int d_amount){
        if(amount >= d_amount){
            amount -= d_amount;
            return true;
        }
        return false;
    }
}