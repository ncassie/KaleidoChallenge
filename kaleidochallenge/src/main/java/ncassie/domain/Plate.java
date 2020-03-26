package ncassie.domain;

import java.util.Hashtable;

public class Plate {
    private String plateId;
    private Hashtable<String, Well> plateWells;

    public Plate(String plateId) {
        this.plateId = plateId;
        plateWells = new Hashtable<String, Well>();

        // Assumption is that plates are standardized and come as described in problem set
        plateWells.put(plateId + "A1", new Well(plateId + "A1"));
        plateWells.put(plateId + "A2", new Well(plateId + "A2"));
        plateWells.put(plateId + "A3", new Well(plateId + "A3"));
        plateWells.put(plateId + "A4", new Well(plateId + "A4"));

        plateWells.put(plateId + "B1", new Well(plateId + "B1"));
        plateWells.put(plateId + "B2", new Well(plateId + "B2"));
        plateWells.put(plateId + "B3", new Well(plateId + "B3"));
        plateWells.put(plateId + "B4", new Well(plateId + "B4"));

        plateWells.put(plateId + "C1", new Well(plateId + "C1"));
        plateWells.put(plateId + "C2", new Well(plateId + "C2"));
        plateWells.put(plateId + "C3", new Well(plateId + "C3"));
        plateWells.put(plateId + "C4", new Well(plateId + "C4"));

    }

    public Hashtable<String, Well> getPlateWells() {
        return plateWells;
    }
}
