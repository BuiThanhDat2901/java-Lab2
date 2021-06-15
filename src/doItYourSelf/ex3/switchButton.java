package doItYourSelf.ex3;

import stepByStep.ex2.battery;
import stepByStep.ex2.flashLamp;

import java.util.Scanner;

public class switchButton {
    private boolean status;
    private electricLamp lamp;

    public switchButton() {
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void switchOn(){
        status = true;
        setStatus(status);
    }

    public void switchOff(){
        status = false;
        setStatus(status);
    }

    public void connectToLamp(electricLamp lamp){
        this.lamp = lamp;
    }

    public boolean getLampInfo() {
        return lamp.isStatus();
    }

    public static void main(String[] args) {
        switchButton testSwitchButton = new switchButton();
        electricLamp testElectricLamp = new electricLamp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Connect the SwitchButton object to the ElectricLamp");
        System.out.println("Please Wait 2s...\n");
        testSwitchButton.connectToLamp(testElectricLamp);
        switchButton.timeWait();

        while (true){
            System.out.println("Turn ON ElectricLamp Yes OR NO:  y/n");
            String choice = scanner.nextLine();
            if (choice.equals("y")){
                testSwitchButton.switchOn();
                System.out.println("ElectricLamp ON and wait 10s");
                for (int i = 0; i <10; i++){
                    flashLamp.timeWait();
                    System.out.println(i+1);
                }
                testSwitchButton.switchOff();
                System.out.println("ElectricLamp OFF");
            } else if (choice.equals("n")){
                System.out.println("ElectricLamp FINNISH");
                break;
            }

        }

    }

    public static void timeWait() {
        try {
            Thread.sleep(500);
        }
        catch (Exception e){

        }
    }
}
