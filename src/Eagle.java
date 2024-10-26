public class Eagle extends Animal{
    private int age;

    public Eagle(){
    }

    public Eagle(String name, String species, int age) {
        super(name, species);
        this.age = age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void fly(){
        System.out.println("Eagle can fly up to 9 km in height");
    }







    @Override
    public String toString() {
        return super.toString()+
                "\nEagle age: " + age;
    }
}
