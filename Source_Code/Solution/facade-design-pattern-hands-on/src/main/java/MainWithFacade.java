import xyz.pagliares.facade.media.library.facade.VideoConverterFacade;

public class MainWithFacade {
    public static void main(String[] args) {
        VideoConverterFacade facade = new VideoConverterFacade();
        facade.convertVideo("youtubevideo.ogg", "mp4");
    }
}
