package Application;


import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private List<Integer> readingList;
    private List<Sensor> sensorList;

    public AverageSensor(){
        this.readingList = new ArrayList<Integer>();
        this.sensorList = new ArrayList<Sensor>();
    }

    public void addSensor(Sensor additional){
        sensorList.add(additional);
    }



    @Override
    public boolean isOn() {
        for (Sensor s : sensorList) {
            if (s.isOn()) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void on() {
        for (Sensor s : sensorList) {
            s.on();
        }

    }

    @Override
    public void off() {
        for (Sensor s : sensorList) {
            s.off();
        }

    }

    @Override
    public int measure() {
        if (isOn()== false){
            throw new IllegalStateException("The average sensor is off");
        }
        int totalTemperature = 0;
        for (Sensor s : sensorList){
            totalTemperature += s.measure();
        }
        readingList.add(totalTemperature);
        return totalTemperature;
    }

    public List<Integer> readings() {
        return readingList;
    }
}