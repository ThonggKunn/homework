package F01_homework.homework_8.homework2;

import java.util.Scanner;

public class Folder_Controller {

    Folder[] folder_list;
    int num_of_folder;

    public Folder_Controller(int size) {
        folder_list = new Folder[size];
        num_of_folder = 0;
    }

    public void addFolder(Folder folder) {
        if (num_of_folder < folder_list.length) {
            folder_list[num_of_folder] = folder;
        } else {
            System.out.println("Folder is full");
        }
    }

    public Folder findFolder(String type) {
        for (int i = 1; i < num_of_folder; i++) {
            if (folder_list[i].getFolder_type().equals(type)) {
                return folder_list[i];
            }
        }
        return null;
    }

    public void show_folder_list() {
        for (int i = 0; i < num_of_folder; i++) {
            folder_list[i].showFolder();
            System.out.println();
        }
    }

//    public void removeFolder(String code) {
//        for (int i = 0; i < num_of_folder; i++) {
//            if (folder_list[i].getFolder_code().equals(code)) {
//                folder_list[i].
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter folder type: ");
        String a = scanner.nextLine();

        Folder_Controller folderController = new Folder_Controller(3);

        Book book = new Book("123","Thong", "12ab","book", "nguyen van a", "8");
        Magazine magazine = new Magazine("456","Thong","34cd","magazine", "9","11");
        Newspaper newspaper = new Newspaper("789", "thong", "56ef", "newspaper", "24");

        folderController.addFolder(book);
        folderController.addFolder(magazine);
        folderController.addFolder(newspaper);

        System.out.println("Folder List");
        folderController.show_folder_list();

        System.out.println("Find Folder");
        Folder foundFolder = folderController.findFolder(a);
        if (foundFolder != null) {
            System.out.println("Found!");
            foundFolder.showFolder();
        } else {
            System.out.println("Not found");
        }
    }
}
