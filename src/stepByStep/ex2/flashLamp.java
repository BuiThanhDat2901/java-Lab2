package stepByStep.ex2;

import java.util.Scanner;

public class flashLamp {
    private boolean status;
    private battery battery;

    public flashLamp() {
        status=false;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setBattery(battery battery) {
        this.battery=battery;
    }
    public int getBatteryInfo() {
        return battery.getEnergy();
    }

    public void light() {
        if( status==true && battery!= null && battery.getEnergy()>0) {
            battery.decreaseEnergy();
        }
    }
    public void turnOn() {
        if(battery != null && battery.getEnergy()>0) {
            status=true;
        }
        light();
    }
    public void turnOff() {
        status=false;
    }


    public static void main(String[] args) {
        flashLamp testFlashLamp = new flashLamp();
        battery testBattery = new battery();

        System.out.println("Install batteries in Flashlights");
        System.out.println("Please Wait 2s...\n");
        testFlashLamp.setBattery(testBattery);
        flashLamp.timeInstall();

        System.out.println("On OFF Light");
        System.out.println("==========================");
        System.out.println("1. On");
        System.out.println("==========================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice ==1){
            while (true){
                System.out.println("Turn ON LIGHT Yes OR NO:  y/n");
                String check = scanner.nextLine();
                if (check.equals("y")){
                    if (testFlashLamp.getBatteryInfo() == 0){
                        System.out.println("Energy Battery = " + testFlashLamp.getBatteryInfo() + " => Out of Battery");
                        break;
                    }
                    else {
                        System.out.println("LIGHT ON and wait 10s");
                        testFlashLamp.turnOn();
                        System.out.println("Energy Battery = " + testFlashLamp.getBatteryInfo());
                        for (int i = 0; i <10; i++){
                            flashLamp.timeWait();
                            System.out.println(i+1);
                        }
                        testFlashLamp.turnOff();
                        System.out.println("Light OFF");
                    }
                }
                else if (check.equals("n")){
                    System.out.println("Light OFF");
                    break;
                }
                else {
                    System.out.println("Enter Wrong, Again");
                }
            }
        } else {
            System.out.println("There's no choice there");
        }
    }

    public static void timeWait() {
        try {
            Thread.sleep(500);
        }
        catch (Exception e){

        }
    }

    public static void timeInstall() {
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){

        }
    }
}
