package game;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Unit {
    private String type;
    private int id;
    private String name;
    private List weapons;
    private Map properties;

    public Unit(int id) {
        this.id = id;
    }

    public void addWeapon(Weapon weapon){
        if( weapon == null) {
           this.weapons = new LinkedList();
        }
        this.weapons.add(weapon);
    }

    public void setProperty(String property, Object value) {
        if(property == null) {
            properties = new HashMap();
        }
        properties.put(property,value);
    }

    public Object getProperty(String property) throws  RuntimeException{
        if(properties == null) throw new RuntimeException("프로퍼티가 없습니다.");
        Object value = properties.get(property);
        if(value == null) throw  new RuntimeException("값이 없습니다.");

        return value;
    }

    public List getWeapons() {

        return weapons;
    }

    public String getType() {
        return type;
    }

    public Unit setType(String type) {
        this.type = type;
        return this;
    }

    public int getId() {
        return id;
    }

    public Unit setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Unit setName(String name) {
        this.name = name;
        return this;
    }
}
