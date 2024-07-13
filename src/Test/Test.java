package Test;

import tmt.*;

public class Test {
    public static void main(String[] args) {
        ParticipantList participantList = new ParticipantList();
        participantList.add(new Parcicipant("Slava"));
        participantList.add(new Parcicipant("Slava1"));
        participantList.add(new Parcicipant("Slava2"));
        participantList.add(new Parcicipant("Slava3"));
        participantList.add(new Parcicipant("Slava4"));
        participantList.add(new Parcicipant("Slava5"));
        System.out.println(participantList.toString());
        participantList.remove(new Parcicipant("Slava2"));
        System.out.println(participantList.toString());

    }
}
