package rickOfGuitarStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List inventory;


    public Inventory() {
        this.inventory = new LinkedList();
    }

    public void addInstrument(String serialNumber, double price, InstumentSpec instumentSpec) {
        System.out.println("입력된 기타 스팩 " + instumentSpec.getProperties());
        Instument instrument = new Instument(serialNumber,price,instumentSpec);
        inventory.add(instrument);
    }

    public Instument get(String serialNumber) {
        for(Iterator i = inventory.iterator();i.hasNext();){
            Instument instument = (Instument) i.next();
            if(instument.getSerialNumber().equals(serialNumber)){
                return instument;
            }
        }
        return null;
    }

    public List search(InstumentSpec spec) {
        List resultValue = new ArrayList();
        System.out.println("search guitar");

        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Instument instument = (Instument)i.next();
            System.out.println("저장된 기타" + instument.getSpec().getProperties());
            System.out.println("찾는 기타" + spec.getProperties());
            if(instument.getSpec().matches(spec)){
                resultValue.add(instument);
            }
        }
        return resultValue;
    }
}