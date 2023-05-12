import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new ProductChocolate("Milka", "Молочный", 178, 200, 30));
        products.add(new ProductChocolate("Россия", "Темный", 220, 200, 65));
        products.add(new ProductMilk("Веселый молочник", "Молоко", 123, 0.925, 3.5));
        products.add(new ProductMilk("Домик в деревне", "Молоко", 120, 0.925, 3.5));
        products.add(new ProductMilk("Parmalat", "Молоко", 123, 1, 3.5));
        products.add(new ProductWater("BonAqua", "Не газированная", 45, 0.5));
        products.add(new ProductWater("BonAqua", "Газированная", 45, 0.5));

        for (Product product : products){
            System.out.println(product);
        }

        VendingMachine machine = new VendingMachine(products);

        ProductChocolate chocolate = machine.getChocolate("Темный", 65, 200);
        if (chocolate != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolate);
        }
        else {
            System.out.println("Нет такого шоколада");
        }
    }
}