package F01_homework.homework_8.homework1;

import F01_homework.homework_8.homework1.Officer;

public class Worker extends Officer {

     int rank;

    Worker(String Name, int Age, String Gender, String Address, int rank) {
        super(Name, Age, Gender, Address);
        this.rank = rank;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Rank: " + rank);
    }
}
