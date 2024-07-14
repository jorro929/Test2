package Test;

import tmt.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ParticipantList participantList = new ParticipantList();
        Parcicipant parcicipant1 = new Parcicipant("Slava");
        Parcicipant parcicipant2 = new Parcicipant("Alex");
        Parcicipant parcicipant3 = new Parcicipant("Andrew");
        participantList.add(parcicipant1);
        participantList.add(parcicipant2);
        participantList.add(parcicipant3);
        System.out.println(participantList);
        Stopwatch stopwatch = new Stopwatch(participantList);
        stopwatch.startMeasuring(parcicipant1);
        stopwatch.startMeasuring(parcicipant2);
        stopwatch.startMeasuring(parcicipant3);
        stopwatch.toString();
        Thread.sleep(3000);
        stopwatch.startMeasuring(parcicipant1);
        stopwatch.removeFromLap(parcicipant2);
        stopwatch.startMeasuring(parcicipant3);
        stopwatch.toString();
        participantList.showAllTimesOfLap(parcicipant1);
        participantList.showAllTimesOfLap(parcicipant2);
        participantList.showAllTimesOfLap(parcicipant3);
        Thread.sleep(3000);
        stopwatch.startMeasuring(parcicipant1);
        stopwatch.startMeasuring(parcicipant2);
        stopwatch.removeFromLap(parcicipant3);
        System.out.println(stopwatch.toString());
        participantList.showAllTimesOfLap(parcicipant1);
        participantList.showAllTimesOfLap(parcicipant2);
        participantList.showAllTimesOfLap(parcicipant3);
        Thread.sleep(3000);
        stopwatch.startMeasuring(parcicipant1);
        stopwatch.startMeasuring(parcicipant2);
        stopwatch.startMeasuring(parcicipant3);
        System.out.println(stopwatch.toString());
        participantList.showAllTimesOfLap(parcicipant1);
        participantList.showAllTimesOfLap(parcicipant2);
        participantList.showAllTimesOfLap(parcicipant3);
        Thread.sleep(3000);
        stopwatch.clearRaceTrack();
        System.out.println(stopwatch.toString());
        participantList.showAllTimesOfLap(parcicipant1);
        participantList.showAllTimesOfLap(parcicipant2);
        participantList.showAllTimesOfLap(parcicipant3);

    }
}
