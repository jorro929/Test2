package tmt;

public class DifferentLapException extends Exception {
    public DifferentLapException() {
        System.err.println("These time of lap are different");
    }
}
