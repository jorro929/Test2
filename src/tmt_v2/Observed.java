package tmt_v2;

public interface Observed <T>{
    void addObserver(Observer<T> observer);
    void removeObserver(Observer<T> observer);
    void notifyObserver();
}