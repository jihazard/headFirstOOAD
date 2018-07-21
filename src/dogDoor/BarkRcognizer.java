package dogDoor;

public class BarkRcognizer {
    private DogDoor door;

    public BarkRcognizer(DogDoor door ){
        this.door = door;
    }

    public void recognizer( Bark bark) {
        System.out.println("bark recognize : heard  " + bark.getSound());
        if(door.getAllowedBark().contains(bark)){
            System.out.println("포함된 목소리");
            door.open();
        }else{
            System.out.println("포함안된 목소리");

        }

        /*if(door.getAllowedBark().equals(bark)){
            door.open();
        }else {
            System.out.println("this dog is not allowed");
        }
        door.open();*/
    }
}
