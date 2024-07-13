package tmt;

import java.util.Objects;

public final class Parcicipant implements Comparable<Parcicipant>{
    private  final String NAME;
    public Parcicipant(String name) {
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
        Parcicipant that = (Parcicipant) o;
        return Objects.equals(NAME, that.NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME);
    }

    @Override
    public int compareTo(Parcicipant otherParcicipant) {
        return this.NAME.compareTo(otherParcicipant.NAME);
    }
}
