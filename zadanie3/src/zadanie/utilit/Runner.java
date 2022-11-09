package zadanie.utilit;

import zadanie.utilit.entity.Directory;
import zadanie.utilit.entity.File;
import zadanie.utilit.entity.TextFile;
import zadanie.utilit.utilits.DirectoryUtilit;



public class Runner {

    public static void main(String[] args) {

        DirectoryUtilit directoryUtils = new DirectoryUtilit(new Directory("Books"));

        File book1 = new TextFile("Играть");
        File book2 = new TextFile("Изучение Java");
        File book3 = new TextFile("Алгоритмы");
        File book4 = new TextFile("Изучение MySql");
        File book5 = new TextFile("Пока");

        directoryUtils.addFile(book1);
        directoryUtils.addFile(book2);
        directoryUtils.addFile(book3);
        directoryUtils.addFile(book4);
        directoryUtils.addFile(book5);

        directoryUtils.printFiles();

        System.out.println(book1.getCreated());

        book1.read();
        System.out.println(book1.getOpened());

        book1.printContent();

        book1.addContent("Привет");
        System.out.println(book1.getModified());

        book1.getSize();

        book1.printContent();



    }
}