import java.util.Scanner;

public class Animal {

    private String name;
    private String species;

    public Animal() {
    }

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setSpecies(String species){
        this.species=species;
    }

    public String getSpecies(){
        return species;
    }

    public void methodForAnimal(){
        System.out.println("Method for animals");
    }




    //TODO eto kak primer prosto nachal hotel drugoe no ne zakonchil
    /*public void getAnimalSpecies(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select 1 animal type: "+"\n1.  Shark. "+"\n2.  Turtle. "+"\n3.  Eagle. ");
        int scanAnimal=scanner.nextInt();
        Shark shark = new Shark();
        Turtle turtle = new Turtle();
        Eagle eagle = new Eagle();
        if (scanAnimal==1){
            System.out.println(shark.toString());
        } else if (scanAnimal==2) {
            System.out.println(turtle.toString());
        } else if (scanAnimal==3) {
            System.out.println(eagle.toString());
        }else {
            System.out.println("ERROR!!!");
        }
    }*/


    @Override
    public String toString() {
        return "\nAnimal name: " + name +
                "\nSpecies: " + species ;
    }
}
