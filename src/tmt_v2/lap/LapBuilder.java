package tmt_v2.lap;


import java.util.List;

public abstract class LapBuilder {

    protected Lap lap;

    public abstract void addSector(int lengthOfSector);

    public abstract void setName(String name);

    public abstract int[] getSectors();

    public abstract void clear();

    public abstract boolean isEmpty();


    public abstract Lap getLap();


}
