package ex2;

public class Main {
    public static void main(String[] args) {
        DataProcessorCreator creator = new DataProcessorCreator();

        Data textData = new Data("text", "This is a text message.");
        Data audioData = new Data("audio", "Audio data...");
        Data videoData = new Data("video", "Video data...");

        creator.setProcessor(new TextDataProcessor());
        creator.processData(textData);

        creator.setProcessor(new AudioDataProcessor());
        creator.processData(audioData);

        creator.setProcessor(new VideoDataProcessor());
        creator.processData(videoData);
        System.out.println(textData);
    }
}
