package media;

public class Video implements Media{

    private String FileName;

    public Video(String fileName) {
        FileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("playing video from "+FileName);

    }
}
