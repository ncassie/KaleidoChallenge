package ncassie.handler;

import ncassie.domain.Compound;

import java.util.Hashtable;

/**
 * Handles functionality of Plate - Well system.
 *
 */
public class PlateWellHandler {
    // stores all compounds registered in program
    private Hashtable<String, Compound> compounds;

    public PlateWellHandler() {
        this.compounds = new Hashtable<String, Compound>();
    }

    /**
     * Allows registration of compounds
     * @param compoundId - id of compound to be registered
     */
    public void registerCompound(String compoundId){
        this.compounds.put(compoundId, new Compound(compoundId));
    }


}
