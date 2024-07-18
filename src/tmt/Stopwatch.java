package tmt;

import java.util.HashMap;
import java.util.Map;

public class Stopwatch {
    public Stopwatch(ParticipantList workList) {
        this.workList = workList;
    }

    private ParticipantList workList;
    private Map<Participant,LapTime> runners = new HashMap<>();

    public void removeFromLap(Participant participant){
        runners.remove(participant);
    }
    public void clearRaceTrack(){
        runners.clear();
    }

    @Override
    public String toString() {
        return runners.toString();
    }

    public boolean startMeasuring(Participant participant){
        if(workList.contains(participant)){
            if(runners.containsKey(participant)) {
                endMeasuring(participant);
            }
            runners.put(participant, new LapTime(System.currentTimeMillis()));

            return true;
        }
        return false;
    }

    public boolean fixCheackPoint(Participant participant){
        if(runners.containsKey(participant)){
            runners.get(participant).sectorsEnd(System.currentTimeMillis());
            return true;
        }
        return false;
    }
    private void endMeasuring(Participant participant){
        runners.get(participant).lapEnd(System.currentTimeMillis());
        workList.registrationTimeOfLap(participant,runners.get(participant));
        removeFromLap(participant);
    }
}
