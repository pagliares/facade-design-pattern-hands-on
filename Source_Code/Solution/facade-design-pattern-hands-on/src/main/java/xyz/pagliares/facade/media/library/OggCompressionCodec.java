package xyz.pagliares.facade.media.library;

public class OggCompressionCodec implements Codec {
    private String type = "ogg";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
