package DZ;

public class Bowl {

    private int foodAmount;

    public boolean decreaseFood(int amount) {

        if (foodAmount > amount) {
            foodAmount -= amount;
            System.out.printf("Food decreased for %d, %d left\n", amount, foodAmount);
            return true;
        }

        System.out.println("There's not enough food in the bowl");
        return false;

    }

    public void putFood(int amount) {
        foodAmount += amount;
        System.out.printf("Food increased for %d, %d now\n", amount, foodAmount);
    }

    public int getFoodAmount() {
        return foodAmount;
    }

}
