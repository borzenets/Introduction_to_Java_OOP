public class ProductWater extends Product {

    protected double volume;
    public ProductWater(String brand, String name, double price, double volume) {
        super(brand, name, price);
        if (volume < 0.2)
            throw new RuntimeException("Объем не может быть меньше 0,2.");
        else
            this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%s - %s  объем: %.3f, цена: %.2f", brand, name, volume, price);
    }

    public double getVolume() {
        return volume;
    }
}
