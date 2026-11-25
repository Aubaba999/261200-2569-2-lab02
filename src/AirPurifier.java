class AirPurifier {
    String model;
    int serialNo;
    boolean isOn;
    int fanSpeed;
    int pm25;

    static int maxFanSpeed = 3;
    static int minFanSpeed = 1;
    static String companyName = "Aubabajra";
    static int modelCount;

    AirPurifier(String model, int serialNo) {
        this.model = model;
        this.serialNo = serialNo;
        this.fanSpeed = minFanSpeed;
        modelCount++;
    }

    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    void setFanSpeed(int speed) {
        if (speed >= minFanSpeed && speed <= maxFanSpeed) {
            fanSpeed = speed;
        } else {
            System.out.println("Invalid speed: " + speed);
        }
    }

    void setPM25(int value) {
        pm25 = value;
        if (value <= 100) setFanSpeed(minFanSpeed);
        else if (value <= 150) setFanSpeed(2);
        else setFanSpeed(maxFanSpeed);
    }

    static int getModelCount() {
        return modelCount;
    }
}
