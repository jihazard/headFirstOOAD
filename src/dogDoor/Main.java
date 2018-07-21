package dogDoor;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        DogDoor door = new DogDoor();
        door.addAllowedBark(new Bark("rowlf"));
        door.addAllowedBark(new Bark("roowlf"));
        door.addAllowedBark(new Bark("raowlf"));
        door.addAllowedBark(new Bark("woof"));

        BarkRcognizer barkRcognizer = new BarkRcognizer(door);

        Remote remote = new Remote(door);

        System.out.println("------start bakbakbakbakbak---------");
        barkRcognizer.recognizer(new Bark("rowlf2"));

        System.out.println("bruce has gone outside");


        try {
            Thread.currentThread().sleep(10000);

        }catch (InterruptedException e){
            System.out.println("err : " + e);
        }

        Bark smallDog  = new Bark("yip");
        System.out.println("small dog start barkin");
        barkRcognizer.recognizer(smallDog);


        try {
            Thread.currentThread().sleep(10000);

        }catch (InterruptedException e){
            System.out.println("err : " + e);
        }


        System.out.println("fido start bakbak");
        barkRcognizer.recognizer(new Bark("woof"));
        System.out.println("fido back inside");

    }
}
