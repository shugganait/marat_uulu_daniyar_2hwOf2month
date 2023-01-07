public class Object2 extends ObjectOfRoom{
    private int width, length;

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public Object2(String name, int price, int width, int length) {
        super(name, price);
        this.width = width;
        this.length = length;
    }

    @Override
    public void print() {
        System.out.println("Обьект1: " + getName()  + "\nСтоимость: " + getPrice() + "сом" + "\nПлощадь ковра: " + (width * length) + " в квадрате");
    }
}
