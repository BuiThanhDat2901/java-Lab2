package stepByStep.ex1;

public class client {
    public static void main(String[] args) {
        student studentA = new student(1,"Nguyen Van A",true);
        student studentB = new student(1,"Nguyen B B",false);

        studentA.printInfo();
        studentB.setName("Nguyen Van B");
        studentB.printInfo();
    }
}
