package ncassie.handler;

import ncassie.domain.Compound;
import ncassie.domain.Plate;
import ncassie.domain.Well;

import java.util.ArrayList;
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
        this.wells = new Hashtable<String, Well>();
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

    /**
     * Allows compound to be added to a well
     * @param compoundId - compound to be added to well
     * @param wellId - well to add compound to
     */
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

    /**
     * Allows contents of one well to be split to different wells.
     * Assumption is that original well's contents cannot be completely emptied, so don't need to alter contents of original well.
     * @param initialWellId
     * @param newWellIds
     */
    public void splitCompoundToAdditionalWells(String initialWellId, ArrayList<String> newWellIds){
        if((!wells.containsKey(initialWellId)) || (wells.get(initialWellId).getWellCompound() == null)){
            System.out.println("Cannot split well.  Well not registered or does not contain any contents");
        } else{
            for(String wellId : newWellIds){
                if(!wells.containsKey(wellId)){
                    System.out.println("Cannot add compound to well " + wellId + " because well is not registered");
                } else{
                    addCompoundToWell(wells.get(initialWellId).getWellCompound().getCompoundId(), wellId);
                }
            }
        }
    }

    public String getCompoundIdByWellId(String wellId){
        if(!wells.containsKey(wellId)){
            return "Well is not registered";
        } else{
            return wells.get(wellId).getWellCompound().getCompoundId();
        }
    }

}
