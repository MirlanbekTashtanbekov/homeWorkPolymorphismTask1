public class Shark extends Animal{
    private int age;

    public Shark() {
    }

    public Shark(String name, String species, int age) {
        super(name, species);
        this.age = age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void attack(){
        System.out.println("Shark attacks very quickly and smells blood.");
    }



    @Override
    public String toString() {
        return super.toString()+
                "\nShark age: " + age;
    }
}
