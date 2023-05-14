public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food < 0)
            System.out.println("В тарелке не может быть отрицательное количество еды.");
        else
            this.food = food;
    }

    public void addFood(int food){
        this.food = this.food + food;
    }
}