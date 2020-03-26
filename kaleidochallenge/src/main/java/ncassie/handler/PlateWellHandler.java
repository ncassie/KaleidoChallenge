package ncassie.handler;

import ncassie.domain.Compound;
import ncassie.domain.Plate;
import ncassie.domain.Well;

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

    // stores all wells of all plates registered by program
    private Hashtable<String, Well> wells;

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
        // add all Wells for plate to Wells Hashtable
        wells.putAll(plates.get(plateId).getPlateWells());
    }

    public void addCompoundToWell(String compoundId, String wellId){
        if(compounds.containsKey(compoundId) && wells.containsKey(wellId)){
            try{
                wells.get(wellId).setWellCompound(compounds.get(compoundId));
            } catch (Exception e){
                System.out.println(e);
            }

        } else{
            System.out.println("Could not add compound to well.  Either Compound or Well has not been registered.");
        }
    }


}
