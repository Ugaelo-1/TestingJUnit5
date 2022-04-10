import java.util.stream.DoubleStream;

public class Calc {

    static double Counting(double... operands){
        return DoubleStream.of(operands).count();
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b - 1);
    }
}