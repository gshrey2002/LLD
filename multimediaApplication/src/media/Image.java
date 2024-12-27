package media;

public class Image  {
    private String FileName;

    public Image(String fileName) {
        FileName = fileName;
    }

    public void display(){
        System.out.println("displaying file image "+FileName);
    }
}
