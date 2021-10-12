package MathBotAlgorithms.Parsing;

public interface Parser<E> {
    void parse(String line);

    E getResult();
}