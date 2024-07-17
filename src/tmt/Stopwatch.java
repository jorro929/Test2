package tmt;

import java.util.HashMap;
import java.util.Map;

public class Stopwatch {
    public Stopwatch(ParticipantList workList) {
        this.workList = workList;
    }  

    private ParticipantList workList;
    private Map<Participant,Long> runners = new HashMap<>();

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
            runners.put(participant, System.currentTimeMillis());

            return true;
        }
        return false;

    }
    private void endMeasuring(Participant participant){
        workList.registrationTimeOfLap(participant,System.currentTimeMillis() - runners.get(participant));
        removeFromLap(participant);
    }
}
