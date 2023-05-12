/**
 *  Базовый класс Product
 */
public class Product {
    protected String name;
    protected String brand;
    protected double price;

    public Product(String name, double price){
        this("NoName", name, price);
    }

    public Product(String brand, String name, double price){
        if (brand.length() < 3)
            throw new RuntimeException("Название бренда должно быть длиннее 3-х символов.");
        else
            this.brand = brand;
        if (name.length() < 3)
            throw new RuntimeException("Название должно быть длиннее 3-х символов.");
        else
            this.name = name;
        if (price <= 0)
            throw new RuntimeException("Цена указана некорректно.");
        else
            this.price = price;
    }
    /**
     * Получить информацию по продукту
     * @return Получить информацию по продукту
     */

    @Override
    public String toString() {
        return String.format("%s - %s - %.2f", brand, name, price);
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0)
            throw new RuntimeException("Цена указана некорректно.");
        else
            this.price = price;
    }
}