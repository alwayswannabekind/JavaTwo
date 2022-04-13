package Lesson1;

public class Lesson1 {
    public static void main(String[] args) {

        Human human1 = new Human("Vasya", 7000, 2);
        Human human2 = new Human("Max", 2000, 3);
        Cat cat1 = new Cat("Matreshka", 1000, 5);
        Robot robot1 = new Robot("Ivan", 10000, 10);

        Racetrack racetrack1 = new Racetrack(5000);
        Wall wall1 = new Wall(3);

        Participant[] participants  = { human1, human2, cat1, robot1 };

        Obstacle[] obstacles = new Obstacle[] { racetrack1, wall1 };

        for ( Participant participant: participants) {
            System.out.println("Participant " + participant.getName() + " started to overcome barriers.");
            int i =0;
            for (Obstacle obstacle: obstacles) {

                if ( obstacle.overcomeObstacle(participant) == true){
                    i++;
                }else {
                    System.out.println("Participant is out");
                    break;
                }
            }
            if ( i == obstacles.length ) {
                System.out.println("....");
                System.out.println("The participant " + participant.getName() + " successfully overcame all obstacles!");
                System.out.println("----------------------------------------");
            }
            else {
                System.out.println("The participant " + participant.getName() + " could not overcame all obstacles!");
                System.out.println("His score: " + i + " obstacles");
                System.out.println("----------------------------------------");
            }
        }
    }
}
