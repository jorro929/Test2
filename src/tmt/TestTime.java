package tmt;

public class TestTime {
    private int hours;
    private int minutes;
    private int seconds;
    private int milliseconds;
    public TestTime(Long milliseconds){
        this.hours = (int)(milliseconds / 3600000);
        this.minutes = ((int)(milliseconds / 1000) / 60) % 60;
        this.seconds = (int)(milliseconds / 1000) % 60;
        this.milliseconds = (int)(milliseconds % 1000);

    }

    @Override
    public String toString() {
        return hours + "h" + minutes + "m" + seconds + "s" + milliseconds;
    }
}
