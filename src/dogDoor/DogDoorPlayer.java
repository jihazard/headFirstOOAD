package dogDoor;

public class DogDoorPlayer {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("og outside ");
        remote.pressButton();
        System.out.println("go inside");
        remote.pressButton();
        System.out.println("all done");
        remote.pressButton();
        System.out.println("back inside");
        remote.pressButton();

    }
}
