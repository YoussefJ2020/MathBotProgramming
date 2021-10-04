package MathBotAlgorithms.Parsing;

import java.util.ArrayList;

public class ParsePolynomialCommand implements Parser<ArrayList<ArrayList<Float>>> {

    private Parser<ArrayList<Float>> parser;
    private ArrayList<ArrayList<Float>> result;

    public ParsePolynomialCommand(Parser<ArrayList<Float>> parser, String line) {
        this.parser = parser;
        parse(line);
    }

    @Override
    public void parse(String line) {

        result = new ArrayList<>();

        String[] keywords = line.split(" ");

        // Start at one here because the first element in
        // keywords will be the name of the command
        for (int i = 1; i < keywords.length; i++) {
            parser.parse(keywords[i]);
            ArrayList<Float> numbers = parser.getResult();

            result.add(numbers);
        }
    }

    @Override
    public ArrayList<ArrayList<Float>> getResult() {
        return result;
    }
}
