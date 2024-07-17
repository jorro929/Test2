package tmt;

import java.util.Objects;

public final class Participant implements Comparable<Participant>{
    private  final String NAME;
    public Participant(String name) {
        this.NAME = name;
    }

    @Override
    public String toString() {
        return "Parcicipant{" + NAME +"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return Objects.equals(NAME, that.NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME);
    }

    @Override
    public int compareTo(Participant otherParticipant) {
        return this.NAME.compareTo(otherParticipant.NAME);
    }
}
