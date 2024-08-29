package F01_homework.homework_8.homework1;

import java.util.Scanner;

public class Officer_Controller {

    Officer[] officer_list;
    protected int num_of_officer;

    public Officer_Controller(int size) {
        officer_list = new Officer[size];
        num_of_officer = 0;
    }

    public void addOfficer( Officer officer) {
        if (num_of_officer < officer_list.length) { // kiểm tra có đủ chỗ để add
            officer_list[num_of_officer] = officer; // thêm officer vào index hiện tại
            num_of_officer++;
        } else {
            System.out.println("The list is full");
        }
    }

    public Officer find_officer(String name) {
        for (int i = 0; i < num_of_officer; i++) {
            if (officer_list[i].getName().equals(name)) { //lấy từng tên để so sánh
                return officer_list[i]; //=> trùng => return officer
            }
        }
        return null;
    }

    public void show_officer_list() {
        for (int i = 0; i < num_of_officer; i++) {
            officer_list[i].showInformation();//=> trả về thông tin từng Office được lặp
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Officer's name: ");
        String a = scanner.nextLine();


        Officer_Controller officerController = new Officer_Controller(3);

        Worker worker = new Worker("Le Van A",23,"Male","Ha Noi",3);
        Engineer engineer = new Engineer("Le van b", 24, "female", "HCM", "Wood");
        Employee employee = new Employee("Le van c", 22,"male","da nang","office");

        officerController.addOfficer(worker);
        officerController.addOfficer(employee);
        officerController.addOfficer(engineer);

        System.out.println("Officer List");
        officerController.show_officer_list();

        System.out.println("Find Officer");
        Officer officer_found = officerController.find_officer(a);
        if (officer_found != null) {
            System.out.println("Found!");
            officer_found.showInformation();
        } else {
            System.out.println("Not found");
        }
    }
}
