package behavioral.command;

public class VolumeDecreaseCommand implements Command {

    private final Volume volume;
    public VolumeDecreaseCommand(Volume volume){
        this.volume = volume;
    }
    public void execute(){
        volume.decrease();
    }
}
