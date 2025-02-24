package tmt_v2;

public interface Observer <T>{
    void handleEvent(T object, Observed<T> observed);
}
