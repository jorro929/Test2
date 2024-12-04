package tmt;

import tmt_v2.TableOfParticipants;

import java.util.*;

public class ParticipantList implements TableOfParticipants {


     private Map<Participant, List<LapTime>> listMap = new HashMap<>();

     @Override
    public boolean add(Participant participant){
        if(listMap.containsKey(participant)){

            return false;
        }

        this.listMap.put(participant, new ArrayList<>());
        return true;
    }

    @Override
    public boolean remove(Participant participant){

        if(!listMap.containsKey(participant)){
            return false;
        }

        this.listMap.remove(participant, new ArrayList<>());
        return true;

    }

    @Override
    public boolean registrationTimeOfLap(Participant participant, LapTime timeOfLap){

        if(!listMap.containsKey(participant)){
            return false;
        }

        listMap.get(participant).add(timeOfLap);
        return true;

    }

    @Override
    public List<LapTime> getTime(Participant participant) {

        return new ArrayList<>(listMap.get(participant));

    }

    @Override
    public List<Participant> getList() {
        List<Participant> participants = new ArrayList<>();
        for (Map.Entry<Participant, List<LapTime>> entry: listMap.entrySet()) {
            participants.add(entry.getKey());
        }
        return participants;

    }

    @Override
    public Map<Participant, List<LapTime>> getAllTable() {
        Map<Participant, List<LapTime>> participantLapTimeMap = new HashMap<>();
        participantLapTimeMap.putAll(listMap);
        return participantLapTimeMap;
    }

    @Override
    public boolean contains(Participant participant){
        return listMap.containsKey(participant);
    }


    public void showAllTimesOfLap(Participant participant){
        if(!listMap.containsKey(participant)){
            System.out.print(participant + " is not in this list\n");
            return;
        }
        System.out.print("Time of " + participant + "'s laps:\n{");
       listMap.get(participant).stream().forEach(System.out::println);
        System.out.println('}');
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("List of participant: \n{");
        for (Map.Entry<Participant, List<LapTime>> entry: listMap.entrySet()) {
            stringBuilder.append(entry.getKey() + "\n");
        }
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
