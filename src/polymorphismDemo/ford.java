package polymorphismDemo;

public class ford extends car{
    public ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return "Ford -> startEngine()";
    }
    @Override
    public String accelerate(){
        return "Ford -> accelerate()";
    }
    @Override
    public String brake(){
        return "Ford -> brake()";
    }
}
