package tmt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ParticipantList {
     private Map<Parcicipant, ArrayList<TestTime>> listMap = new HashMap<>();
    public void add(Parcicipant parcicipant){
        this.listMap.putIfAbsent(parcicipant, new ArrayList<>());
    }
    public void remove(Parcicipant parcicipant){
        listMap.remove(parcicipant);
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
