public abstract class ObjectOfRoom implements Printable{
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public ObjectOfRoom(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
