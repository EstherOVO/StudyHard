package generic.ex03;

public class StringDataProcessor implements DataProcessor<String> {


    @Override
    public String processData(String s) {
        return s.toUpperCase();
    }
}
