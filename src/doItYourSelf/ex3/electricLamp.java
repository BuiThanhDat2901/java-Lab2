package doItYourSelf.ex3;

public class electricLamp {
    private boolean status;

    public electricLamp() {
        status = true;
    }

    public electricLamp(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void turnOn(){
        status = true;
        setStatus(status);
    }

    public void turnOff(){
        status = false;
        setStatus(status);
    }
}
