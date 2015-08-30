package tddmicroexercises.tirepressuremonitoringsystem;

public class AlarmFake extends Alarm {

    private double pressure;
    public AlarmFake(double pressure) {
        this.pressure = pressure;
    }

    protected double getPressure() {
        return this.pressure;
    }

}
