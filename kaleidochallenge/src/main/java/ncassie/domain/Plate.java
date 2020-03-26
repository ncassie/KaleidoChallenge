package ncassie.domain;

import java.util.Hashtable;

public class Plate {
    private String plateId;
    private Hashtable<String, Well> plateWells;

    public Plate(String plateId) {
        this.plateId = plateId;
        plateWells = new Hashtable<String, Well>();

        // Assumption is that plates are standardized and come as described in problem set
        plateWells.put("A1", null);
        plateWells.put("A2", null);
        plateWells.put("A3", null);
        plateWells.put("A4", null);

        plateWells.put("B1", null);
        plateWells.put("B2", null);
        plateWells.put("B3", null);
        plateWells.put("B4", null);

        plateWells.put("C1", null);
        plateWells.put("C2", null);
        plateWells.put("C3", null);
        plateWells.put("C4", null);

    }

    public Hashtable<String, Well> getPlateWells() {
        return plateWells;
    }
}
