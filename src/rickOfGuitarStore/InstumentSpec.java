package rickOfGuitarStore;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public  class InstumentSpec {

        private Map properties;

    public InstumentSpec(Map properties) {
        if(properties == null){
            this.properties = new HashMap();
        }else {
            this.properties = new HashMap(properties);
        }
    }

    public Map getProperties() {
        return properties;
    }


    public Object getProperties(String propertyName) {
        return properties.get(propertyName);
    }

        public boolean matches(InstumentSpec otherSpec) {
           for(Iterator i=otherSpec.getProperties().keySet().iterator();i.hasNext();){
               String propertyName = (String)i.next();

               if(!properties.get(propertyName).equals(otherSpec.getProperties(propertyName)))return false;

            }

            return true;
        }

    }
