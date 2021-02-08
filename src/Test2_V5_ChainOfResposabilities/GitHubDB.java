package Test2_V5_ChainOfResposabilities;

import java.util.ArrayList;
import java.util.Arrays;

public class GitHubDB {
    ArrayList<Token> database = new ArrayList<>(
            Arrays.asList(
                    new Token("Emilian","448877"),
                    new Token("Popescu","222Beta")
            ));

    public ArrayList<Token> returnDB() {
        return database;
    }
}
