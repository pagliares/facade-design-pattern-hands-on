package xyz.pagliares.facade.media.library.facade;

import xyz.pagliares.facade.media.library.*;

public class VideoConverterFacade {
    public void convertVideo(String fileName, String format) {
        System.out.println("Video conversion program");
        System.out.println("Conversion started.");

        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.createCodec(file);

        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }

        VideoFile buffer = BitrateConverter.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateConverter.convert(buffer, destinationCodec);

        AudioMixer audioMixer = new AudioMixer();
        audioMixer.fix(intermediateResult);

        System.out.println("Conversion completed.");
    }
}
