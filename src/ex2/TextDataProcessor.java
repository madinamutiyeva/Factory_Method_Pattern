package ex2;

public class TextDataProcessor extends DataProcessor {
    @Override
    void process(Data data) {
        // Process text data
        System.out.println("Processing text data: " + data.getContent());
    }
}
