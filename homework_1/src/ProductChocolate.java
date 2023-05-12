public class ProductChocolate extends Product {
    protected int weight;
    protected int cocoa;
    public ProductChocolate(String brand, String name, double price, int weight, int cocoa) {
        super(brand, name, price);
        if (weight <= 0)
            throw new RuntimeException("Вес указан некорректно.");
        else
            this.weight = weight;
        if (cocoa <= 0 || cocoa >= 100)
            throw new RuntimeException("Процент какао указан неверно.");
        else
            this.cocoa = cocoa;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - какао: %d, вес: %d, цена: %.2f", brand, name, cocoa, weight, price);
    }

    public int getWeight() {
        return weight;
    }

    public int getCocoa() {
        return cocoa;
    }
}
