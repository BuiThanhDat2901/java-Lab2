package stepByStep.ex2;

public class battery {
    private int energy;

    public battery() {
        energy = 100;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void decreaseEnergy() {
        energy--;
    }

}