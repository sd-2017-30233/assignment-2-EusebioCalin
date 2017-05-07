package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by Calin on 23.04.2017.
 */
public class ReportCSV implements Report {
    public void generate(ArrayList<String> titles) throws FileNotFoundException
    {
        PrintWriter pw = new PrintWriter(new File("report.csv"));
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<titles.size();i++)
        {
            sb.append("Titlu");
            sb.append(',');
            sb.append(titles.get(i));
            sb.append('\n');
        }
        pw.write(sb.toString());
        pw.close();
        System.out.println("done!");
    }
}
