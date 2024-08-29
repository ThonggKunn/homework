package F01_homework.homework_8.homework2;

public class Magazine extends Folder {

    String published_num;
    String published_month;
    Magazine(String folder_code, String publisher_name, String num_of_published,String folder_type, String published_month, String published_num) {
        super(folder_code, publisher_name, num_of_published, folder_type);
        this.published_month = published_month;
        this.published_num = published_num;
    }
}
