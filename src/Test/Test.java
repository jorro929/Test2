package Test;

import tmt.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
/*        ParticipantList participantList = new ParticipantList();
        Sensor<Participant> sensor = new Sensor<>();
        Participant participant1 = new Participant("Slava");
        Participant participant2 = new Participant("Alex");
        Participant participant3 = new Participant("Andrew");
        participantList.add(participant1);
        participantList.add(participant2);
        participantList.add(participant3);
        System.out.println(participantList);
        Stopwatch stopwatch = new Stopwatch(participantList, sensor);
        stopwatch.startMeasuring(participant1);
        stopwatch.startMeasuring(participant2);
        stopwatch.startMeasuring(participant3);
        stopwatch.toString();
        Thread.sleep(3000);
        stopwatch.startMeasuring(participant1);
        stopwatch.removeFromLap(participant2);
        stopwatch.startMeasuring(participant3);
        stopwatch.toString();
        participantList.showAllTimesOfLap(participant1);
        participantList.showAllTimesOfLap(participant2);
        participantList.showAllTimesOfLap(participant3);
        Thread.sleep(3000);
        stopwatch.startMeasuring(participant1);
        stopwatch.startMeasuring(participant2);
        stopwatch.removeFromLap(participant3);
        System.out.println(stopwatch.toString());
        participantList.showAllTimesOfLap(participant1);
        participantList.showAllTimesOfLap(participant2);
        participantList.showAllTimesOfLap(participant3);
        Thread.sleep(3000);
        participantList.remove(participant3);
        stopwatch.startMeasuring(participant1);
        stopwatch.startMeasuring(participant2);
        stopwatch.startMeasuring(participant3);
        System.out.println(stopwatch.toString());
        participantList.showAllTimesOfLap(participant1);
        participantList.showAllTimesOfLap(participant2);
        participantList.showAllTimesOfLap(participant3);
        Thread.sleep(3000);
        stopwatch.clearRaceTrack();
        System.out.println(stopwatch.toString());
        participantList.showAllTimesOfLap(participant1);
        participantList.showAllTimesOfLap(participant2);
        participantList.showAllTimesOfLap(participant3);*/

        ParticipantList participantList = new ParticipantList();
        Participant participant1 = new Participant("Kolya");
        Participant participant2 = new Participant("Alex");
        Participant participant3 = new Participant("Stas");

        participantList.add(participant1);
        participantList.add(participant2);
        participantList.add(participant3);

        Sensor<Participant> trackSensor= new Sensor<>();
        Stopwatch stopwatch = new Stopwatch(participantList);

        stopwatch.startMeasuring(trackSensor.fixingOdject(participant1));
        Thread.sleep(3000);
        stopwatch.startMeasuring(trackSensor.fixingOdject(participant2));

        participantList.showAllTimesOfLap(participant1);
    }
}
