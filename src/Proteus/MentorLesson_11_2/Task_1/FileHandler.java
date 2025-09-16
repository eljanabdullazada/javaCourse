package Proteus.MentorLesson_11_2.Task_1;

public class FileHandler implements AutoCloseable{
    private String fileName;

    public FileHandler(String fileName){
        this.fileName = fileName;
        System.out.println("Resource for " + fileName + " is allocated.");
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void close(){
        System.out.println("Warning: file " + fileName + " is being closed. (close is executed.)");
    }
}
