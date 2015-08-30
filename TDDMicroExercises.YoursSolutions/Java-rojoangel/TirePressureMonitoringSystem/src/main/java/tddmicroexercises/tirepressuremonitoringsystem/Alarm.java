package tddmicroexercises.tirepressuremonitoringsystem;

public class Alarm
{
    private final double LowPressureThreshold = 17;
    private final double HighPressureThreshold = 21;

    // @todo - review this initialization
    private Sensor sensor = new Sensor();

    private boolean alarmOn = false;

    public void check()
    {
        double psiPressureValue = getPressure();

        if (psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue)
        {
            alarmOn = true;
        }
    }

    protected double getPressure() {
        return sensor.popNextPressurePsiValue();
    }

    public boolean isAlarmOn()
    {
        return alarmOn; 
    }
}
