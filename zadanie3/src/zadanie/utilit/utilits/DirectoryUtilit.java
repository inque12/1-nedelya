package zadanie.utilit.utilits;
import zadanie.utilit.entity.Directory;
import zadanie.utilit.entity.File;

public class DirectoryUtilit {

    private Directory directory;

    public DirectoryUtilit(Directory directory) {
        this.directory = directory;
    }

    public boolean addFile(File file){
        return directory.getFiles().add(file);
    }

    public boolean deleteFile(File file){
        return directory.getFiles().remove(file);
    }

    public void printFiles(){
        if (directory.getFiles().isEmpty()){
            System.out.println("The directory is empty!");
            return;
        }

        for (File file: directory.getFiles()){
            System.out.println(file);
        }
    }
}