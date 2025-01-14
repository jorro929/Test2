package tmt;

public final class TestTime implements Comparable<TestTime>{
    private final int hours;
    private final int minutes;
    private final int seconds;
    private final int milliseconds;
    private final long initialValue;
    public TestTime(long milliseconds){
        this.initialValue = milliseconds;
        this.hours = (int)(milliseconds / 3600000);
        this.minutes = ((int)(milliseconds / 1000) / 60) % 60;
        this.seconds = (int)(milliseconds / 1000) % 60;
        this.milliseconds = (int)(milliseconds % 1000);

    }
    public long toLong() {
        return initialValue;
    }

    @Override
    public String toString() {
        return hours + "h" + minutes + "m" + seconds + "s" + milliseconds;
    }

    @Override
    public int compareTo(TestTime otherTime) {
        return Long.compare(this.initialValue, otherTime.initialValue);
    }
}
