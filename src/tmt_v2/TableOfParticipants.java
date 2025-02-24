package tmt_v2;

import tmt.LapTime;
import tmt.Participant;

import java.util.List;
import java.util.Map;

public interface TableOfParticipants {

    boolean add(Participant participant);

    boolean remove(Participant participant);

    boolean registrationTimeOfLap(Participant participant, LapTime timeOfLap);

    List<LapTime> getTime(Participant participant);

    List<Participant> getList();

    Map<Participant, List<LapTime>> getAllTable();

    boolean contains(Participant parcicipant);


}
