package Test2_V5_CompositeAuthentificator;

import java.util.ArrayList;
import java.util.Arrays;

public class CompApplicationDB {
    ArrayList<CompToken> database = new ArrayList<>(
            Arrays.asList(
                    new CompToken("Ilie", "alpha123"),
                    new CompToken("Popescu","222Beta"),
                    new CompToken("Dobrici","bau352"),
                    new CompToken("Fabrizio","328Cellos")
            ));

    public ArrayList<CompToken> returnDB() {
        return database;
    }
}
