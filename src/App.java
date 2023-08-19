import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        filterOption(getOption());
    }

    private static int getOption() {
        System.out.println("""
                Choose a drink:
                1 - Espresso
                2 - Cappuccino
                3 - Latte
                """);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void filterOption(int option) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        switch (option) {
            case 1 -> {
                coffeeMachine.setDrink(
                        new Espresso()
                );

                coffeeMachine.startTesting();

            }
            case 2 -> {
                coffeeMachine.setDrink(
                        new Cappuccino());
                coffeeMachine.startTesting();
            }
            case 3 -> {
                coffeeMachine.setDrink(
                        new Latte()
                );

                coffeeMachine.startTesting();
            }
            default -> {
                coffeeMachine.setDrink(
                        new MissingFromTheMenu()
                );

                coffeeMachine.startTesting();
            }
        }


    }}

