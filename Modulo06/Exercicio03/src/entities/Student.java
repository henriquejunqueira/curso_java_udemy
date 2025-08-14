package entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double average(){
        return grade1 + grade2 + grade3;
    }

    public double resultPoints(){
        if(average() < 60.0){
            return 60.0 - average();
        }else {
            return 0.0;
        }
    }

}
