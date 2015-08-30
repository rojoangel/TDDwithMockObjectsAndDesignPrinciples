package tddmicroexercises.tirepressuremonitoringsystem;

import org.junit.Test;
import static org.junit.Assert.*;
public class AlarmTest {

    @Test
    public void testCheckLowThresholdAlarm()
    {

        // setup impostor
        AlarmFake alarm = new AlarmFake(16);
        // call check
        alarm.check();
        // assert expected value
        assertTrue(alarm.isAlarmOn());

    }

    @Test
    public void testCheckHighThresholdAlarm()
    {

        // setup impostor
        AlarmFake alarm = new AlarmFake(99);
        // call check
        alarm.check();
        // assert expected value
        assertTrue(alarm.isAlarmOn());

    }

    @Test
    public void testCheckNoAlarm()
    {

        // setup impostor
        AlarmFake alarm = new AlarmFake(18);
        // call check
        alarm.check();
        // assert expected value
        assertFalse(alarm.isAlarmOn());

    }
}
