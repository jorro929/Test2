package tmt_v2;

import tmt.Participant;

import java.util.List;

public interface DirectorOfSession extends StartAndStopable{

    void setTableOfParticipant(TableOfParticipants tableOfParticipant);

    TableOfParticipants getTableOfParticipants();

    void saveResult();

    List<Participant> getCorrectPosition();


}
