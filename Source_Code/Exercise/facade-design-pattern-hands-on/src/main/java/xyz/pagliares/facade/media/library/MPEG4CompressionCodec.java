package xyz.pagliares.facade.media.library;

public class MPEG4CompressionCodec implements Codec {
    private String type = "mp4";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
