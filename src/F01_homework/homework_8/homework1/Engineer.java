package F01_homework.homework_8.homework1;

public class Engineer extends Officer {

      String training_industry;
    Engineer(String Name, int Age, String Gender, String Address, String training_industry) {
        super(Name, Age, Gender, Address);
        this.training_industry = training_industry;
    }

    public void showInformation() {
        super.showInformation();
        System.out.println("Training industry: " + training_industry);
    }
}
