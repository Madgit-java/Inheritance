public class Cat extends Animal {
    public static void mainProperti(){
        System.out.println("Cat, people's favorite");
    }
public static void mew(){
    System.out.println("I am mewing");
}
public static void jump(){
    System.out.println("I am jumping");
}
public static void run(){
    System.out.println("I am running");
}
public void all(){
        Cat.mainProperti();
        Cat.mew();
        Cat.jump();
        Cat.run();
}
}
