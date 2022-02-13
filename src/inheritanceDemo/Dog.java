package inheritanceDemo;

public class Dog extends Animal{
    private String breed;
    public static int count = 0;
    public Dog(String name, int age, String food,String breed) {
        super(name, age, food);
        this.breed = breed;
        count++;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        System.out.println(name+" of breed "+breed+" aged "+age+" eats "+food);
        super.eat();
    }
}
