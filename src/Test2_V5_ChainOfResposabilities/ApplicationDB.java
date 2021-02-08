package Test2_V5_ChainOfResposabilities;

import java.util.ArrayList;
import java.util.Arrays;

public class ApplicationDB {
    ArrayList<Token> database = new ArrayList<>(
            Arrays.asList(
                    new Token("Ilie", "alpha123"),
                  //  new Token("Popescu","222Beta"),
                    new Token("Dobrici","bau352"),
                    new Token("Fabrizio","328Cellos")
            ));

    public ArrayList<Token> returnDB() {
        return database;
    }
}
