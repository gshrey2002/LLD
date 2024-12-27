package media;

public class Audio implements Media{

    private String FileName;

    public Audio(String fileName) {
        FileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing video "+FileName);
    }
}
