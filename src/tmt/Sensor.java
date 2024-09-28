package tmt;

import tmt_v2.Observed;
import tmt_v2.Observer;

import java.util.ArrayList;
import java.util.List;

public class Sensor implements Observed <Participant>{
    private String name;
    private Participant lastParticipant;
    List<Observer<Participant>> observerList = new ArrayList<>();

    public Sensor(String name) {
        this.name = name;
    }

    public void setLastParticipant(Participant lastParticipant) {
        this.lastParticipant = lastParticipant;
    }

    @Override
    public void addObserver(Observer<Participant> observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer<Participant> observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {


    }
}
