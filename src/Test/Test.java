package Test;

import tmt.*;
import tmt_v2.lap.BaseLapBuilder;
import tmt_v2.lap.LapBuilder;

import java.lang.reflect.Array;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        LapBuilder lapBuilder = new BaseLapBuilder();
        lapBuilder.addSector(230);
        lapBuilder.addSector(315);
        lapBuilder.addSector(194);
        lapBuilder.setName("Monza");

        System.out.println(lapBuilder.getLap());
    }
}
