import Decoration.HighQualityMediaDecorator;
import collection.MediaCollection;
import media.*;

import java.util.ArrayList;

public class MultimediaApp {

    public static void main(String[] args) {
        Media video=new Video("shreymovie.mp4");
        Media audio=new Audio("song.mp3");
        Image img=new Image("ello.jpg");
        Media image=new ImageAdapter(img);

        Media highQuality=new HighQualityMediaDecorator(audio);

        MediaCollection allmedia=new MediaCollection(new ArrayList<>());

        allmedia.addMedia(video);
        allmedia.addMedia(highQuality);
        allmedia.addMedia(image);

        allmedia.play();

    }
}
