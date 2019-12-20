public class Fish extends Animal {
    public static void cantJump(){
        System.out.println("Fish, can't jump");
    }
    public static void swim(){
    System.out.println("I am swimming");
}
public void all(){
        Fish.cantJump();
        Fish.swim();
}

}
