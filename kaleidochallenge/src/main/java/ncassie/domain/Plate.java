package ncassie.domain;

import java.util.Hashtable;

public class Plate {
    private String plateId;
    private Hashtable<String, Well> plateWells;

    public Plate(String plateId) {
        this.plateId = plateId;
        plateWells = new Hashtable<String, Well>();

        // Assumption is that plates are standardized and come as described in problem set
        plateWells.put(plateId + "A1", null);
        plateWells.put(plateId + "A2", null);
        plateWells.put(plateId + "A3", null);
        plateWells.put(plateId + "A4", null);

        plateWells.put(plateId + "B1", null);
        plateWells.put(plateId + "B2", null);
        plateWells.put(plateId + "B3", null);
        plateWells.put(plateId + "B4", null);

        plateWells.put(plateId + "C1", null);
        plateWells.put(plateId + "C2", null);
        plateWells.put(plateId + "C3", null);
        plateWells.put(plateId + "C4", null);

    }

    public Hashtable<String, Well> getPlateWells() {
        return plateWells;
    }
}
