package Lesson1;

public class Racetrack implements Obstacle{
    private int distance;

    public int getDistance() {
        return distance;
    }

    public Racetrack(int distance) {
        this.distance = distance;
    }

    public boolean overcomeObstacle(Participant participant){
        int participantJumpDistance = participant.run();
        if (participantJumpDistance >= this.distance){
            System.out.println("Participant  has successfully overcame the distance! ");
            return true;
        } else {
            System.out.println("Participant can't overcome the distance. ");
            return false;
        }
    }
}