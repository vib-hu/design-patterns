package behavioral.command;

public class VolumeIncreaseCommand implements Command {

    private final Volume volume;
    public VolumeIncreaseCommand(Volume volume){
        this.volume = volume;
    }
    public void execute(){
        volume.increase();
    }
}
