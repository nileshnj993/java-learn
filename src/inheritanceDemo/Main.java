package inheritanceDemo;

public class Main {

    public static void main(String[] args) {
        Dog d = new Dog("Dog",3,"Chicken","Labrador");
        d.eat();
        Dog d1 = new Dog("Dog",2,"Fish","German Shepherd");
        System.out.println(Dog.count);
    }
}
