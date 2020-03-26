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

        System.out.println("Registering compound: S");
        plateWellHandler.registerCompound("S");

        System.out.println("Adding plates: P-12345, P-3, P-7");
        plateWellHandler.addPlate("P-12345");
        plateWellHandler.addPlate("P-3");
        plateWellHandler.addPlate("P-7");

        System.out.println("Adding compound S to Well P-12345.A1");
        plateWellHandler.addCompoundToWell("S", "P-12345.A1");

        ArrayList<String> newWells = new ArrayList<>();
        newWells.add("P-3.B4");
        newWells.add("P-3.C2");
        newWells.add("P-7.A4");

        System.out.println("Splitting contents from Well P-12345.A1 to Wells P-3.B4, P-3.C2, P-7.A4");
        plateWellHandler.splitCompoundToAdditionalWells("P-12345.A1", newWells);

        System.out.println("Retrieving contents of well P-7.A4");
        System.out.println("Plate P-7.A4 contains compound: " + plateWellHandler.getCompoundIdByWellId("P-7.A4"));
    }
}
