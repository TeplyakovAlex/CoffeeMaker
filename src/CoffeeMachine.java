
class CoffeeMachine {

    private Drink drink;

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public void startTesting() {
        drink.make();
    }
}
