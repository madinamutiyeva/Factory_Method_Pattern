package ex2;

public class DataProcessorCreator {
    private DataProcessor processor;

    void setProcessor(DataProcessor processor) {
        this.processor = processor;
    }

    void processData(Data data) {
        processor.process(data);
    }
}