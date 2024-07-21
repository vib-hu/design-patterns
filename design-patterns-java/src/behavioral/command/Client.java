package behavioral.command;

public class Client {

    public void testCommandPattern(){
        Light light = new Light();
        LightOnCommand onCmd = new LightOnCommand(light);
        LightOffCommand offCmd = new LightOffCommand(light);

        Volume volume = new Volume();
        VolumeIncreaseCommand increaseCmd = new VolumeIncreaseCommand(volume);
        VolumeDecreaseCommand decreaseCmd = new VolumeDecreaseCommand(volume);

        RemoteControl remote = new RemoteControl();
        remote.setCommandForKey(1, onCmd);
        remote.setCommandForKey(2, offCmd);

        remote.setCommandForKey(3, increaseCmd);
        remote.setCommandForKey(4, decreaseCmd);

        remote.onButtonPressed(1);
        remote.onButtonPressed(2);
        remote.onButtonPressed(3);
        remote.onButtonPressed(4);
    }
}
