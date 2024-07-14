package tmt;

import java.util.HashMap;
import java.util.Map;

public class Stopwatch {
    public Stopwatch(ParticipantList workList) {
        this.workList = workList;
    }
    private ParticipantList workList;
    Map<Parcicipant,Long> runners = new HashMap<>();

    public void removeFromLap(Parcicipant parcicipant){
        runners.remove(parcicipant);
    }
    public void clearRaceTrack(){
        runners.clear();
    }

    @Override
    public String toString() {
        return runners.toString();
    }

    public boolean startMeasuring(Parcicipant parcicipant){
        if(workList.contains(parcicipant)){
            if(runners.containsKey(parcicipant)) {
                endMeasuring(parcicipant);
            }
            runners.put(parcicipant, System.currentTimeMillis());

            return true;
        }
        return false;

    }
    private void endMeasuring(Parcicipant parcicipant){
        workList.registrationTimeOfLap(parcicipant,System.currentTimeMillis() - runners.get(parcicipant));
        removeFromLap(parcicipant);
    }
}
