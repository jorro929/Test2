package Test;

import tmt.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Sensor<Participant> sensor1 = new Sensor<>();
        Sensor<Participant> sensor2 = new Sensor<>();
        Sensor<Participant> sensor3 = new Sensor<>();

        ParticipantList participantList = new ParticipantList();

        Participant p1 = new Participant("Pido");
        Participant p2 = new Participant("Frodo");
        Participant p3 = new Participant("Timur");

        participantList.add(p1);
        participantList.add(p2);
        participantList.add(p3);

        Stopwatch stopwatch = new Stopwatch(participantList);

        stopwatch.startMeasuring(sensor1.fixingOdject(p1));
        Thread.sleep(3000);
        stopwatch.fixCheackPoint(sensor2.fixingOdject(p1));
        Thread.sleep(3000);
        stopwatch.fixCheackPoint(sensor3.fixingOdject(p1));
        Thread.sleep(3000);
        stopwatch.startMeasuring(sensor1.fixingOdject(p1));
        stopwatch.removeFromLap(p1);

        participantList.showAllTimesOfLap(p1);

    }
}
