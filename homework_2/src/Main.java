public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[] {
                new Cat("Барсик", 5),
                new Cat("Сема", 6),
                new Cat("Пушок", 4),
                new Cat("Проглот", 8)
        };

        Plate plate = new Plate(21);
        plate.info();
        for (Cat cat : cats) {
            if(cat.getHungry()) {
                if (cat.eat(plate.getFood())) {
                    System.out.printf("%s - поел и теперь сыт\n", cat.getName());
                    plate.setFood(plate.getFood() - cat.getAppetite());
                    cat.setHungry(false);
                }
                else{
                    System.out.printf("%s - не хвалило еды, остался голоден\n", cat.getName());
                    plate.info();
                }
            }
        }
    }
}