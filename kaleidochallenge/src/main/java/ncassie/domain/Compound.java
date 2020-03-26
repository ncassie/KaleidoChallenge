package ncassie.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Compound class to hold Compounds registered in handler
 */
public class Compound {

    private String compoundId;
    private List<Well> compoundWells;

    public Compound(String compoundId) {
        this.compoundId = compoundId;
        compoundWells = new ArrayList<Well>();
    }

    public String getCompoundId() {
        return compoundId;
    }

    public List<Well> getCompoundWells() {
        return compoundWells;
    }

    public void addCompoundWell(Well well){
        compoundWells.add(well);
    }
}