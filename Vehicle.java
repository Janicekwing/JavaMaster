public class Vehicle {
    private int seats;
    private int speed;
    private String engine;

    public move (int speed){
        this.setSpeed(speed);
    }

    public String getEngine() {
        return engine;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSeats() {
        return seats;
    }

}