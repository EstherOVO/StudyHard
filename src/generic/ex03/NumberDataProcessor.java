package generic.ex03;

public class NumberDataProcessor implements DataProcessor<Integer> {

    @Override
    public Integer processData(Integer integer) {
        return integer * 2;
    }
}
