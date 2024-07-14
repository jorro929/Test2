package tmt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ParticipantList {
     private Map<Parcicipant, ArrayList<TestTime>> listMap = new HashMap<>();
    public void add(Parcicipant parcicipant){
        this.listMap.putIfAbsent(parcicipant, new ArrayList<>());
    }
    public void remove(Parcicipant parcicipant){
        listMap.remove(parcicipant);
    }
    public void registrationTimeOfLap(Parcicipant parcicipant, long timeOfLap){
        listMap.get(parcicipant).add(new TestTime(timeOfLap));
    }
    public boolean contains(Parcicipant parcicipant){
        return listMap.containsKey(parcicipant);
    }

    public void showAllTimesOfLap(Parcicipant parcicipant){
        System.out.print("Time of " + parcicipant + "'s laps:\n{");
        Iterator<TestTime> iterator = listMap.get(parcicipant).iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println('}');
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("List of Parcicipant: \n{");
        for (Map.Entry<Parcicipant, ArrayList<TestTime>> entry: listMap.entrySet()) {
            stringBuilder.append(entry.getKey() + "\n");
        }
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
