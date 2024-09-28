package Test;

import tmt.*;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.List;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Instant instant1;
        Instant instant2;
        instant1 = Instant.now();
        Thread.sleep(100);
        instant2 = Instant.now();
        System.out.println(Duration.ofSeconds(instant2.toEpochMilli() - instant1.toEpochMilli()));

    }
}
