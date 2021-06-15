package stepByStep.ex1;

public class student {
    /**
     * Khai bao cac truong dung de luu gia tri cua cac thuoc tinh trong lop
     */
    private int id;
    private String name;
    private boolean gender;

    /**
     * Constructor khong co doi so
     */
    public student() {
    }

    public student(int id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void printInfo() {
        System.out.println("-----------------------------------");
        System.out.println("| ID | Name | Male |");
        if (this.gender == true){
            System.out.printf("| %d | %s | %s |\n",this.id,this.name,"Nam");
        } else if (this.gender == false){
            System.out.printf("| %d | %s | %s |\n",this.id,this.name,"Nữ");
        }
    }
}
