package tmt_v2.lap;

import java.util.LinkedList;
import java.util.List;

public class BaseLapBuilder extends LapBuilder{


    private List<Integer> list = new LinkedList<>();

    private String name;


    @Override
    public void addSector(int lengthOfSector) {
        list.add(lengthOfSector);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int[] getSectors() {

        return makeArray();
    }

    @Override
    public void clear() {
        name = "";
        list.clear();
    }

    @Override
    public boolean isEmpty() {
        return name.isEmpty() && list.isEmpty();
    }

    @Override
    public Lap getLap() {
        lap = new Lap(name, makeArray());
        return lap;
    }

    @Override
    public String toString() {
        return "Lap:"
                + "\nname: " + name
                + "\nSectors: " + list;
    }

    private int[] makeArray(){
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

}
