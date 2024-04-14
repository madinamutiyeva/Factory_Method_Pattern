package ex2;

public class AudioDataProcessor extends DataProcessor {
    @Override
    void process(Data data) {
        // Process audio data
        System.out.println("Processing audio data: " + data.getContent());
    }
}
