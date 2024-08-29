package F01_homework.homework_8.homework2;

public class Folder {

    private String folder_type;
    private String folder_code;
    private String publisher_name;
    private String nums_of_published;

    Folder (String folder_code, String publisher_name, String num_of_published, String folder_type) {
        this.folder_code = folder_code;
        this.publisher_name = publisher_name;
        this.nums_of_published = num_of_published;
        this.folder_type = folder_type;
    }

    public String getFolder_type() {
        return folder_type;
    }

    public String getFolder_code() {
        return folder_code;
    }

    public void showFolder() {
        System.out.println("Type: " + folder_type);
        System.out.println("Code: " + folder_code);
        System.out.println("Publisher name: " + publisher_name);
        System.out.println("Number of Published: " + nums_of_published);
    }



}
