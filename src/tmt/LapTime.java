package tmt;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LapTime {
    private final long startTime;
    private long lastPointTime;
    private TestTime TimeOfLap;
    private List<TestTime> sectorsTime = new ArrayList<>();

    public LapTime(long pointTime) {
        this.startTime = pointTime;
        this.lastPointTime = pointTime;
    }
    public void sectorsEnd(long pointTime){
            sectorsTime.add(new TestTime(pointTime - lastPointTime));
            lastPointTime = pointTime;
    }
    public void lapEnd(long pointTime){
        sectorsTime.add(new TestTime(pointTime - lastPointTime));
        lastPointTime = pointTime;
        TimeOfLap = new TestTime(pointTime - startTime);
    }

    public TestTime getTimeOfLap() {
        return TimeOfLap;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Time Of Lap = " + TimeOfLap + " {");
        for(TestTime tt: sectorsTime){
            stringBuilder.append(tt + " || ");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LapTime lapTime = (LapTime) o;
        return Objects.equals(TimeOfLap, lapTime.TimeOfLap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TimeOfLap);
    }
}
