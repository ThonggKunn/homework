package F01_homework.homework_8.homework1;

public class Employee extends Officer {

     String job;
    Employee(String Name, int Age, String Gender, String Address, String job) {
        super(Name, Age, Gender, Address);
        this.job = job;
    }

    public void showInformation() {
        super.showInformation();
        System.out.println("Job: " + job);
    }
}
