public class ProductMilk extends Product{

    protected double volume;
    protected double fat;

    public ProductMilk(String brand, String name, double price, double volume, double fat) {
        super(brand, name, price);
        if (volume < 0.2)
            throw new RuntimeException("Объем не может быть меньше 0,2.");
        else
            this.volume = volume;
        this.fat = fat;
    }

    public double getVolume() {
        return volume;
    }

    public double getFat() {
        return fat;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - объем: %.3f, цена: %.2f", brand, name, volume, price);
    }
}
