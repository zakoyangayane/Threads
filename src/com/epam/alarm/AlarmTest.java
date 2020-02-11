package com.epam.alarm;

import java.time.LocalDateTime;

public class AlarmTest {
    public static void main(String[] args) {
        Alarm alarm = new Alarm(LocalDateTime.now().withHour(00).withMinute(16).withSecond(12));
        alarm.start();
    }
}
