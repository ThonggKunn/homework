package F01_homework.homework_8.homework2;

public class Book extends Folder {

    String writer_name;
    String num_of_page;


    Book(String folder_code, String publisher_name, String num_of_published,String folder_type, String writer_name, String num_of_page) {
        super(folder_code, publisher_name, num_of_published, folder_type);
        this.writer_name = writer_name;
        this.num_of_page = num_of_page;
    }
}
