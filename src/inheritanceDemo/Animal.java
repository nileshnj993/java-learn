package inheritanceDemo;

public class Animal {
    protected String name;
    protected int age;
    protected String food;

    public Animal(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }

    public void eat(){
        System.out.println("Animal.eat() called");
    }
}
