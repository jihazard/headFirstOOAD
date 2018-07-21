package dogDoor;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

    private boolean open;
    List barkList = new ArrayList<>();

    public DogDoor(){
        this.open = false;
    }

    public void open () {
        System.out.println(" open!!!!!!");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
               close();
                timer.cancel();
            }
        }, 5000);

    }

    public void close () {
        System.out.println(" close!!!!!!");
        open = false;
    }

    public boolean isOpen () {
        return open;
    }


    public List getAllowedBark(){
        return barkList;
    }

    public void addAllowedBark(Bark bark) {

       barkList.add(bark);

    }
}
