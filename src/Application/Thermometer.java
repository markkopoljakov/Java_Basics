package Application;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Thermometer implements Sensor {
    private Random random;
    private boolean status;



    public Thermometer() {
      this.random = new Random();
    }

    @Override
    public boolean isOn() {
        return this.status;
    }

    @Override
    public void on() {
        this.status = true;
    }

    @Override
    public void off() {
        this.status = false;

    }

    @Override
    public int measure() {
        if (isOn() == false) {
            throw new IllegalArgumentException("The device is off");
        } else {
            return random.nextInt(30 + 1 + 30) - 30;
        }

    }
}
