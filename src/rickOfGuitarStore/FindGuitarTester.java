package rickOfGuitarStore;

import rickOfGuitarStore.enumPack.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory;
        inventory = new Inventory();

        System.out.println("start");
        initializeInventory(inventory);

        Map properties = new HashMap();
        properties.put("builder", Builder.GIBSON);
        properties.put("topWood", Wood.JAPAN_FUCKINGWOOD);
        InstumentSpec cliensSpec = new InstumentSpec(properties);


        List matchingInstruments = inventory.search(cliensSpec);
        if (!matchingInstruments.isEmpty()) {
            System.out.println("당신이 찾는 악기 :");
            for (Iterator i = matchingInstruments.iterator(); i.hasNext(); ) {
                Instument instument = (Instument) i.next();
                InstumentSpec spec = instument.getSpec();
                System.out.println("발견 " + spec.getProperties("instruementType"));

                for (Iterator j = spec.getProperties().keySet().iterator(); j.hasNext(); ) {
                    String propertyName = (String) j.next();
                    if (propertyName.equals("instrumentType")) continue;
                    System.out.println("  -----------" + propertyName + " :" + spec.getProperties("propertyName"));
                }
                System.out.println(" ::::::::::::" + spec.getProperties("instrumentType") + "//" + instument.getPrice());

            }
        } else {
            System.out.println("찾는 제품없음");
        }

    }

    private static void initializeInventory(Inventory inventory) {
            Map properties = new HashMap();
            properties.put("instrumentType" , InstrumentType.GUITAR);
            properties.put("builder" , Builder.GIBSON);
            properties.put("model" , "CJ");
            properties.put("type" , Type.ACOUSTIC);
            properties.put("numString" , 6);
            properties.put("topWood" , Wood.JAPAN_FUCKINGWOOD);
            properties.put("backWood" , Wood.BRAILIAN_ROSEWOOD);
        inventory.addInstrument("1111",1111,new InstumentSpec(properties));

        properties.put("instrumentType" , InstrumentType.MANDOLIN);
        properties.put("builder" , Builder.GIBSON);
        properties.put("model" , "CJ2");
        properties.put("type" , Type.ACOUSTIC);
        properties.put("numString" , 6);
        properties.put("topWood" , Wood.JAPAN_FUCKINGWOOD);
        properties.put("backWood" , Wood.BRAILIAN_ROSEWOOD);
        inventory.addInstrument("2222",2222,new InstumentSpec(properties));

        properties.put("instrumentType" , InstrumentType.BASS);
        properties.put("builder" , Builder.GIBSON);
        properties.put("model" , "CJ3");
        properties.put("type" , Type.ACOUSTIC);
        properties.put("numString" , 6);
        properties.put("topWood" , Wood.JAPAN_FUCKINGWOOD);
        properties.put("backWood" , Wood.BRAILIAN_ROSEWOOD);
        inventory.addInstrument("3333",3333 ,new InstumentSpec(properties));

    }

}
