package polymorphismDemo;

public class holden extends car{
    public holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return "Holden -> startEngine()";
    }
    @Override
    public String accelerate(){
        return "Holden -> accelerate()";
    }
    @Override
    public String brake(){
        return "Holden -> brake()";
    }
}
