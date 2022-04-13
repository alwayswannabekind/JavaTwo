package Lesson1;

public class Robot implements Participant{
    private String name;
    private int maxRunDistance;
    private int maxJumpDistance;

    public String getName() {
        return name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxJumpDistance() {
        return maxJumpDistance;
    }

    public Robot(String name, int maxRunDistance, int maxJumpDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
    }

    public int run(){
        System.out.println("Began to run");
        return maxRunDistance;
    }

    @Override
    public int jump(){
        System.out.println("Began to jump");
        return maxJumpDistance;
    }
}
