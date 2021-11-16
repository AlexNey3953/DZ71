package DZ;

public class Cat {

    private String name;
    private int appetite;

    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Bowl bowl) {
        if (bowl.decreaseFood(appetite)) {
            System.out.printf("%s has ate\n", name);
            System.out.printf("%s full\n", name);
            satiety = true;
        }
        else System.out.printf("%s hungry\n", name);
    }

}
