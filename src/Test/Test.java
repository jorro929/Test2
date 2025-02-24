package Test;

import tmt.*;
import tmt_v2.Observed;
import tmt_v2.Observer;
import tmt_v2.lap.BaseLapBuilder;
import tmt_v2.lap.Lap;
import tmt_v2.lap.LapBuilder;



public class Test {
    public static void main(String[] args){

        TestObserver testObserver = new TestObserver();

        LapBuilder lapBuilder = new BaseLapBuilder();
        lapBuilder.setName("Monza");
        lapBuilder.addSector(1500);
        lapBuilder.addSector(2132);
        lapBuilder.addSector(1900);
        Lap testLap = lapBuilder.getLap();
        testLap.connectToTrack(testObserver);
        testLap.disconnectToTrack(testObserver);


    }
}

class TestObserver implements Observer<Participant> {

    @Override
    public void handleEvent(Participant object, Observed<Participant> observed) {
        System.out.println("Sensor " + observed + " fixes " + object + '!');
    }
}
