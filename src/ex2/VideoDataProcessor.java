package ex2;

public class VideoDataProcessor extends DataProcessor {
    @Override
    void process(Data data) {
        System.out.println("Processing video data: " + data.getContent());
    }
}
