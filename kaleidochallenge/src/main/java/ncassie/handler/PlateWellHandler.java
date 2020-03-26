package ncassie.handler;

import ncassie.domain.Compound;
import ncassie.domain.Plate;

import java.util.Hashtable;

/**
 * Handles functionality of Plate - Well system.
 *
 */
public class PlateWellHandler {
    // stores all compounds registered in program
    private Hashtable<String, Compound> compounds;

    // stores all plates registered in program
    private Hashtable<String, Plate> plates;

    public PlateWellHandler() {
        this.compounds = new Hashtable<String, Compound>();
        this.plates = new Hashtable<String, Plate>();
    }

    /**
     * Allows registration of compounds
     * @param compoundId - id of compound to be registered
     */
    public void registerCompound(String compoundId){
        this.compounds.put(compoundId, new Compound(compoundId));
    }

    /**
     * allows registration of plates
     * @param plateId - id of plate to be registered
     */
    public void addPlate(String plateId){
        plates.put(plateId, new Plate(plateId));
    }


}
