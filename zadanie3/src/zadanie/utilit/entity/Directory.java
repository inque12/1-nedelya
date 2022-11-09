package zadanie.utilit.entity;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private String name;
    private List<File> files;

    public Directory(String name) {
        this.name = name;
        files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<File> getFiles() {
        return files;
    }

    @Override
    public String toString() {
        return "Каталог{" + "имя='" + name + '\'' + '}';
    }
}
