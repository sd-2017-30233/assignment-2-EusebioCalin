package model;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by Calin on 23.04.2017.
 */
public interface Report {
    void generate(ArrayList<String> titles) throws FileNotFoundException;
}
