public class Turtle extends Animal{
    private int age;

    public Turtle(){
    }

    public Turtle(String name, String species, int age) {
        super(name, species);
        this.age = age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void swim(){
        System.out.println("Turtles can reach speeds of up to 35 km/h.");
    }




    @Override
    public String toString() {
        return super.toString()+
                "\nTurtle age: " + age;
    }
}
