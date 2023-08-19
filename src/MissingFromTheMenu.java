class MissingFromTheMenu implements Drink {

    @Override
    public void make() {
        System.out.println("This drink is not on the menu. Make the right choice ! :( ");
    }
}
