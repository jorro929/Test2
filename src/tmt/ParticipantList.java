package tmt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ParticipantList {
     private Map<Participant, ArrayList<LapTime>> listMap = new HashMap<>();
    public void add(Participant parcicipant){
        this.listMap.putIfAbsent(parcicipant, new ArrayList<>());
    }
    public void remove(Participant parcicipant){
        listMap.remove(parcicipant);
    }
    public void registrationTimeOfLap(Participant parcicipant, LapTime timeOfLap){
        listMap.get(parcicipant).add(timeOfLap);
    }
    public boolean contains(Participant parcicipant){
        return listMap.containsKey(parcicipant);
    }

    public void showAllTimesOfLap(Participant parcicipant){
        if(!listMap.containsKey(parcicipant)){
            System.out.print(parcicipant + " is not in this list\n");
            return;
        }
        System.out.print("Time of " + parcicipant + "'s laps:\n{");
       listMap.get(parcicipant).stream().forEach(System.out::println);
        System.out.println('}');
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("List of Parcicipant: \n{");
        for (Map.Entry<Participant, ArrayList<LapTime>> entry: listMap.entrySet()) {
            stringBuilder.append(entry.getKey() + "\n");
        }
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
