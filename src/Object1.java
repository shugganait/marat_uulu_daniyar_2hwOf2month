public class Object1 extends ObjectOfRoom{
    private String powerOfLightning;

    public String getPowerOfLightning() {
        return powerOfLightning;
    }

    public Object1(String name, int price, String powerOfLightning) {
        super(name, price);
        this.powerOfLightning = powerOfLightning;
    }

    @Override
    public void print() {
        System.out.println("Обьект1: " + getName()  + "\nСтоимость: " + getPrice() + "сом" + "\nТрата энергии на освещение: " + getPowerOfLightning());
    }
}
