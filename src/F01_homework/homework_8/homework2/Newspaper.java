package F01_homework.homework_8.homework2;

public class Newspaper extends Folder{
    String published_day;


    Newspaper(String folder_code, String publisher_name, String num_of_published,String folder_type, String published_day) {
        super(folder_code, publisher_name, num_of_published, folder_type);
        this.published_day = published_day;
    }
}
