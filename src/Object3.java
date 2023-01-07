public class Object3 extends ObjectOfRoom{
    private String color;
    private int numberOfShelves;

    public String getColor() {
        return color;
    }

    public int getNumberOfShelves() {
        return numberOfShelves;
    }

    public Object3(String name, int price, String color, int numberOfShelves) {
        super(name, price);
        this.color = color;
        this.numberOfShelves = numberOfShelves;
    }

    @Override
    public void print() {
        System.out.println("Обьект1: " + getName()  + "\nСтоимость: " + getPrice() + "сом" + "\nЦвет: " + getColor() + "\nКоличество полок: " + getNumberOfShelves());
    }
}
