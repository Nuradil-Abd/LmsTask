
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Shark(),new Turtle(),new Eagle(),new Shark()};


        for (Animal animal : animals) {
            if(animal instanceof Shark){
                ((Shark)animal).attack();
            }else if (animal instanceof Turtle){
                ((Turtle)animal).swim();
            }else if (animal instanceof Eagle){
                ((Eagle)animal).fly();
            }
        }

        System.out.println();

        for (Animal animal : animals) {
            if(animal.getClass().equals(Shark.class)){
                ((Shark)animal).attack();
            }else if (animal.getClass().equals(Turtle.class)){
                ((Turtle)animal).swim();
            }else if (animal.getClass().equals(Eagle.class)){
                ((Eagle)animal).fly();
            }

        }

        Shark[] sharks = new Shark[0];
        Turtle[] turtles = new Turtle[1];
        Eagle[] eagles = new Eagle[5];


        int turtleCount = 0;
        int eagleCount = 0;

        for (Animal animal : animals) {
            if(animal instanceof Shark){

                sharks = Arrays.copyOf(sharks, sharks.length + 1); // вариант с увеличением размера
                sharks[sharks.length - 1] = (Shark) animal;

            }else if(animal instanceof Turtle){

                turtles[turtleCount++] = (Turtle) animal;     // c использованием индекса, но размер задаем заранее,
                //todo если что придется дописать логику чтоб увеличить размер и при выводе сделать чтоб не показывало пустые))

            }else if(animal instanceof Eagle){
                eagles[eagleCount++] = (Eagle) animal;
            }
        }
        System.out.println();
        System.out.println("(sharks) = " + Arrays.toString(sharks));
        System.out.println("(turtles) = " + Arrays.toString(turtles));
        System.out.println("(eagles) = " + Arrays.toString(eagles));


    }
}