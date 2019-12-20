public class Animal {
    public static void eat(){
        System.out.println("I am eating");
    }
    public static void sleep(){
        System.out.println("I am sleeping");
    }
    public static void move(){
        System.out.println("I am moving");
    }
    public static void breathe(){
        System.out.println("I am breathe");
    }
    public void all(){
        Animal.eat();
        Animal.sleep();
        Animal.move();
        Animal.breathe();
    }
}
