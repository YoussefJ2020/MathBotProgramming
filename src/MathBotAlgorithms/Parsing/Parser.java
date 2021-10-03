package MathBotAlgorithms.Parsing;

import java.util.ArrayList;

public interface Parser<E> {
    void parse(String line);
    E getResult();
}