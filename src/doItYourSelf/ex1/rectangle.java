package doItYourSelf.ex1;

public class rectangle {
    private int with;
    private int height;

    public rectangle() {
    }

    public rectangle(int with, int height) {
        this.with = with;
        this.height = height;
    }

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void display(){
        System.out.printf("Rectangle have with = %d ,height = %d", with,height);
    }

    public int calculatePerimeter(){
        int perimeter = (with + height) *2;
        return perimeter;
    }

    public static void main(String[] args) {
        //Do it yourself - Bài 1
        rectangle test = new rectangle(7,3);
        test.display();
        System.out.printf("\nPerimeter = %d ", test.calculatePerimeter());

    }
}
