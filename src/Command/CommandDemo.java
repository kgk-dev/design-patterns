package Command;

public class CommandDemo {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
/*        LightOnCommand onLight = new LightOnCommand(light);
        LightOffCommand offLight = new LightOffCommand(light);
        remote.setCommand(onLight);
        remote.pressed();
        remote.setCommand(offLight);
        remote.pressed();*/
        remote.setCommand(light::on);
        remote.pressed();
        remote.setCommand(light::off);
        remote.pressed();
    }
}
