package Lesson1;

public class Wall implements Obstacle{
    private int length;

    public int getLength() {
        return length;
    }

    public Wall(int length) {
        this.length = length;
    }

    public boolean overcomeObstacle(Participant participant){
        int participantJumpDistance = participant.jump();
        if (participantJumpDistance >= this.length){
            System.out.println("Participant  has successfully overcame the wall! ");
            return true;
        } else {
            System.out.println("Participant can't overcome the wall. ");
            return false;
        }
    }
}