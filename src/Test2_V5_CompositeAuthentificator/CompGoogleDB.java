package Test2_V5_CompositeAuthentificator;

import java.util.ArrayList;
import java.util.Arrays;

public class CompGoogleDB {
        ArrayList<CompToken> database = new ArrayList<>(
                Arrays.asList(
                        //   new Token("Ilie", "alpha123"),
                        //   new Token("Popescu","222Beta"),
                        new CompToken("Dobrici","bau352"),
                        new CompToken("Fabrizio","328Cellos")
                ));

        public ArrayList<CompToken> returnDB() {
            return database;
        }
    }
