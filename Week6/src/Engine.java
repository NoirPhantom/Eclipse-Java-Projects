public class Engine {
    private int rpm;
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public Engine(int rpm, String type) {
        this.rpm = rpm;
        this.type = type;
    }

    void start() {
        System.out.println("Starting Engine");
    }

    void stop() {
        System.out.println("Stopping Engine");
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public String getType() {
        return type;
    }

}
