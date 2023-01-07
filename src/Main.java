public class Main {
    public static void main(String[] args) {
        Printable[] objects = {createObject("Object1"), createObject("Object2"), createObject("Object3")};
        for (Printable mass:objects) {
            mass.print();
            System.out.println("________________________");
        }
    }
    public static Printable createObject(String className){
        switch (className){
            case "Object1":
                Object1 lamp = new Object1("Светильник", 1550, "550W");
                return lamp;
            case "Object2":
                Object2 carpet = new Object2("Ковер", 4000, 3, 8);
                return carpet;
            case "Object3":
                Object3 cupboard = new Object3("Шкав", 12000, "Слоновый кость", 10);
                return cupboard;
        }
        return null;
    }
}