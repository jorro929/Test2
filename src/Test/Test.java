package Test;

import tmt.*;

public class Test {
    public static void main(String[] args) {
        ParticipantList participantList = new ParticipantList();
        Parcicipant parcicipant1 = new Parcicipant("Slava");
        participantList.add(parcicipant1);
        System.out.println(participantList);
        participantList.fixingHotLap(parcicipant1, 3124124414l);
        participantList.fixingHotLap(parcicipant1, 212344414l);
        participantList.fixingHotLap(parcicipant1, 7999414l);
        participantList.fixingHotLap(parcicipant1, 1232443785l);
        participantList.showAllTimesOfLap(parcicipant1);

    }
}
