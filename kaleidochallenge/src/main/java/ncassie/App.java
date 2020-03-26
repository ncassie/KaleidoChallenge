package ncassie;

import ncassie.domain.Well;
import ncassie.handler.PlateWellHandler;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PlateWellHandler plateWellHandler = new PlateWellHandler();

        plateWellHandler.registerCompound("S");

        plateWellHandler.addPlate("P-12345");
        plateWellHandler.addPlate("P3");
        plateWellHandler.addPlate("P7");

        Hashtable<String, Well> testWells = plateWellHandler.getWells();
        testWells.forEach((s, w) -> System.out.println("key: " + s + " value: " + w.toString()));

        plateWellHandler.addCompoundToWell("S", "P-12345.A1");

        ArrayList<String> newWells = new ArrayList<>();
        newWells.add("P-3.B4");
        newWells.add("P-3.C2");
        newWells.add("P-7.A4");

        plateWellHandler.splitCompoundToAdditionalWells("P-12345.A1", newWells);
        System.out.println(plateWellHandler.getCompoundIdByWellId("P-7.A4"));
    }
}
