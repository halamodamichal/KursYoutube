package Kurs;

import Kurs.drive.HDDDrive;
import Kurs.drive.SSDDrive;
import Kurs.usbdevice.MemoryStick;
import Kurs.usbdevice.Mouse;


public class Main {

    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        //HDDDrive drive = new HDDDrive();
        SSDDrive drive = new SSDDrive();
        Computer computer = new Computer(monitor, drive);

 //       drive.addFile(new File("jnsp.jpg"));
 //      drive.listFiles();
        MemoryStick memoryStick = new MemoryStick("Pendrive");
        Mouse mouse = new Mouse("Logitech G102");

        computer.addUSBDevice(memoryStick);
        computer.addUSBDevice(mouse);

 //       memoryStick.eject();

        computer.removeUSBDeivce(memoryStick);
        computer.removeUSBDeivce(mouse);



    }
}
