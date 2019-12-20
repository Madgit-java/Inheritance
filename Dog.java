public class Dog extends Animal {
    public static void mainProperti(){
        System.out.println("Dog, man’s true friend");
    }
public static void bark(){
    System.out.println("I am barking");
}
public static void hunt(){
    System.out.println("I am hunting");
}
    public static void run(){
        System.out.println("I am running");
    }
    public static void growl(){
        System.out.println("I am growling");
    }
    public  void all(){
        Dog.mainProperti();
        Dog.bark();
        Dog.growl();
        Dog.hunt();
        Dog.run();
    }

}
