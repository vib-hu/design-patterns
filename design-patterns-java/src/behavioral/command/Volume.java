package behavioral.command;

public class Volume {

    private int volumeCounter = 0;
    private final int MIN_VOLUME = 0;
    private final int MAX_VOLUME = 50;
    public void increase(){
        if(volumeCounter>=MAX_VOLUME)
            return;

        volumeCounter++;
        System.out.println("Volume increased to "+volumeCounter);
    }

    public void decrease(){
        if(volumeCounter<=MIN_VOLUME)
            return;

        volumeCounter--;
        System.out.println("Volume decreased to "+volumeCounter);
    }
}
