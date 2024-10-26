//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shark shark1 = new Shark("Baby", "Shark", 2 );
        System.out.println(shark1);
        Shark shark2 = new Shark("Bi-bi", "Shark", 1 );
        System.out.println(shark2);
        System.out.println("~~~~~~~~~~~");

        Turtle turtle1 = new Turtle("Ninja","Turtle", 10);
        System.out.println(turtle1);
        Turtle turtle2 = new Turtle("Shi-fu","Turtle", 14);
        System.out.println(turtle2);
        System.out.println("~~~~~~~~~~~");

        Eagle eagle1 = new Eagle("Bernardo","Eagle",4);
        System.out.println(eagle1);
        Eagle eagle2 = new Eagle("Torro","Eagle",6);
        System.out.println(eagle2);
        System.out.println("~~~~~~~~~~~");
        System.out.println("\nMethods: "+"\n");

        Animal[] animals = {shark1,shark2,turtle1,turtle2,eagle1,eagle2};

        Shark [] sharks = new Shark[5];
        Turtle [] turtles = new Turtle[5];
        Eagle [] eagles = new Eagle[5];

        int sharkCount = 0;                     // создал счетчик для обьектов чтобы видеть сколько обьектов положил из массива
        int turtleCount = 0;                    // родительского класса в свои класы
        int eagleCount = 0;

        for (Animal animal : animals) {
            if (animal instanceof Shark && animal.getClass()==Shark.class) {
                Shark shark = new Shark();
                shark.attack();                               //Метод будет 2 раза выходить т.к. сосздал 2 обьекта акул
                if (sharkCount<sharks.length){
                    sharks[sharkCount++]=shark;
                }
            } else if (animal instanceof Turtle && animal.getClass()==Turtle.class) {
                Turtle turtle = new Turtle();
                turtle.swim();                                 //Метод будет 2 раза выходить т.к. сосздал 2 обьекта черепах
                if (turtleCount<turtles.length){
                    turtles[turtleCount++]=turtle;
                }
            } else if (animal instanceof Eagle && animal.getClass()==Eagle.class) {
                Eagle eagle = new Eagle();
                eagle.fly();                                    //Метод будет 2 раза выходить т.к. сосздал 2 обьекта орлов
                if (eagleCount<eagles.length){
                    eagles[eagleCount++]=eagle;
                }
            }else break;
        }
        System.out.println(" ");
        System.out.println("~~~~~~~Количество животных~~~~~~~");
        System.out.println("Количество акул составляет: "+sharkCount);
        System.out.println("Количество черепах составляет: "+turtleCount);
        System.out.println("Количество орлов составляет: "+eagleCount);








    }
}