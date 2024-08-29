package F01_homework.homework_8.homework1;

public class Officer {

    private String Name;
    private int Age;
    private String Gender;
    private String Address;

    Officer(String Name, int Age, String Gender, String Address) {
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
        this.Gender = Gender;
    }

    public String getName() {
        return Name;
    }

    public void showInformation() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Address: " + Address);
        System.out.println("Gender: " + Gender);
    }


}
