package model;

/**
 * Created by Calin on 23.04.2017.
 */
public class ReportFactory {
    public Report getReport(String reportType) {
        if (reportType == null) {
            return null;
        }
        if (reportType.equalsIgnoreCase("PDF")) {
            return new ReportPDF();

        } else if (reportType.equalsIgnoreCase("CSV")) {
            return new ReportCSV();
        }
            return null;
        }

}
