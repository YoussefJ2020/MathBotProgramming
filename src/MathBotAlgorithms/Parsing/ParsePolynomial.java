package MathBotAlgorithms.Parsing;

import java.util.ArrayList;

public class ParsePolynomial implements  Parser<ArrayList<Float>> {

    private ArrayList<Float> result = new ArrayList<>();

    public ParsePolynomial(String line) {
        parse(line);
    }

    public ParsePolynomial() {

    }

    @Override
    public void parse(String line) {
        result = new ArrayList<>();
        String[] numbers = line.split(",");

        for (String number : numbers) {
            result.add(Float.parseFloat(number));
        }
    }

    @Override
    public ArrayList<Float> getResult() {
       return result;
    }

}
