package tmt_v2.lap;

import tmt.Participant;
import tmt.Sensor;
import tmt_v2.Observer;

import java.util.Arrays;

public final class Lap {

    final Sector[] SECTORS;

    final String NAME;

    public void connectToTrack(Observer<Participant> observer) {

        for (Sector s : SECTORS) {
            s.connectToSector(observer);
        }

    }

    public void disconnectToTrack(Observer<Participant> observer) {

        for (Sector s : SECTORS) {
            s.disconnectToSector(observer);
        }

    }

    Lap(String name, int[] lengthSectors) {
        NAME = name;
        SECTORS = new Sector[lengthSectors.length];
        makeSectors(lengthSectors);

    }

    private void makeSectors(int[] lengthSectors) {
        for (int i = 0; i < SECTORS.length; i++) {
            SECTORS[i] = new Sector("P" + (i + 1), lengthSectors[i]);
        }
    }


    private class Sector {

        private int length;

        private final Sensor sensor;

        public Sector(String nameOfSectors, int length) {
            sensor = new Sensor(nameOfSectors);
            this.length = length;
        }

        public void connectToSector(Observer<Participant> observer) {

            sensor.addObserver(observer);
            System.out.println(sensor + ": Connect is successful");

        }

        public void disconnectToSector(Observer<Participant> observer) {

            sensor.removeObserver(observer);
            System.out.println(sensor + ": Disconnect is successful");

        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        @Override
        public String toString() {
            return "Sector{" +
                    "length=" + length +
                    ", sensor=" + sensor +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Lap{" +
                "NAME='" + NAME + '\'' +
                ", SECTORS=" + Arrays.toString(SECTORS) +
                '}';
    }
}
