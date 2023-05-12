import java.util.List;
import java.util.Objects;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public ProductWater getWater(String name, double volume){
        for (Product product : products){
            if ( product instanceof ProductWater){
                if (Objects.equals(product.getName(), name) &&
                        ((ProductWater) product).getVolume() == volume){
                    return (ProductWater)product;
                }
            }
        }
        return null;
    }
    public ProductMilk getMilk(String name, double volume, double fat){

        for(Product product : products){
            if (product instanceof ProductMilk){
                if(Objects.equals(product.getName(), name) &&
                        ((ProductMilk) product).getVolume() == volume &&
                        ((ProductMilk) product).getFat() == fat){
                    return (ProductMilk)product;
                }
            }
        }
        return null;
    }

    public ProductChocolate getChocolate(String name, double cocoa, double weight){

        for(Product product : products){
            if (product instanceof ProductChocolate){
                if(Objects.equals(product.getName(), name) &&
                        ((ProductChocolate) product).getCocoa() == cocoa &&
                        ((ProductChocolate) product).getWeight() == weight){
                    return (ProductChocolate) product;
                }
            }
        }
        return null;
    }
}
