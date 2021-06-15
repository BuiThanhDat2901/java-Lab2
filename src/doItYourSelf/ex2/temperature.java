package doItYourSelf.ex2;

public class temperature {
    private double cTemp;

    public temperature() {
    }

    public temperature(double temp) {
        this.cTemp = temp;
    }

    public double getTemp() {
        return cTemp;
    }

    public void setTemp(double temp) {
        this.cTemp = temp;
    }

    public double getFTemp(){
        double f = ( 9/5* cTemp) +32;
        return f;
    }

    public double getKTemp(){
        double k = cTemp + 273.15;
        return k;
    }

    public static void main(String[] args) {
        temperature test = new temperature(25);
        System.out.println(test.getTemp() + " ºC convert temperatures from Celsius to Fahrenheit = " + test.getFTemp() + " ºF");
        System.out.println(test.getTemp() +" ºC convert temperatures from Celsius to Kelvin = " + test.getKTemp() + " ºK");
    }
}
