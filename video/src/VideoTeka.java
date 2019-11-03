import java.util.HashMap;
import java.util.Map;

public class VideoTeka {
    protected Map<String, Kolcsonozheto> videok = new HashMap<>();
    protected Map<String, Kolcsonozheto> oktatoVideok = new HashMap<>();

    public VideoTeka() {
    }

    public void hozzaad(Video video) {
        if (video instanceof OktatoVideo) {
            oktatoVideok.put(video.title, video);
        } else {
            videok.put(video.title, video);
        }
    }
}
