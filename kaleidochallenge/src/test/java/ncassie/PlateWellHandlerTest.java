package ncassie;


import ncassie.handler.PlateWellHandler;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class PlateWellHandlerTest {

    @Test
    public void testPlateWellHandler(){
        PlateWellHandler plateWellHandler = new PlateWellHandler();

        plateWellHandler.registerCompound("S");

        plateWellHandler.addPlate("P-12345");
        plateWellHandler.addPlate("P-3");
        plateWellHandler.addPlate("P-7");

        plateWellHandler.addCompoundToWell("S", "P-12345.A1");

        ArrayList<String> newWells = new ArrayList<>();
        newWells.add("P-3.B4");
        newWells.add("P-3.C2");
        newWells.add("P-7.A4");

        plateWellHandler.splitCompoundToAdditionalWells("P-12345.A1", newWells);
        assertEquals(plateWellHandler.getCompoundIdByWellId("P-7.A4"), "S");
    }

}
