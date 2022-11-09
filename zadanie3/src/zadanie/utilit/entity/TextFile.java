package zadanie.utilit.entity;

import java.time.LocalDateTime;

public class TextFile extends File {

    private Text content;

    public TextFile(String name) {
        super(name);
        content = new Text("");
    }

    @Override
    public void read() {
        if (isReadable()) {
            System.out.println("Текстовый файл открыт!");
            setOpened(LocalDateTime.now());
        }else {
            System.out.println("Невозможно прочитать файл!");
        }
    }

    @Override
    public void printContent() {
        if (isReadable()) {
            System.out.println("Содержание: " + content.getContent());
        } else {
            System.out.println("Невозможно распечатать файл!");
        }
    }

    @Override
    public int getSize(){
        int size = content.getContent().getBytes().length;
        System.out.println("Размер текстового файла = " + size + " байт");
        return size;
    }

    public void addContent(String content) {
        if (isWritable()) {
            this.content.addContent(content);
            setModified(LocalDateTime.now());
            System.out.println("Файл был изменен!");
        } else {
            System.out.println("Невозможно записать файл!");
        }
    }
}
