package nscc.ca;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {

    private static EntryPanel entryPanel;
    private static ReportPanel reportPanel;

    public AppFrame() {

        //General JFrame settings.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new CardLayout());
        setTitle("Antarctic Animal Tracking");

        //Adds Panels Entry and Report.
        entryPanel = new EntryPanel();
        reportPanel = new ReportPanel();
        add(entryPanel);
        add(reportPanel);


    }

    public static EntryPanel getEntryPanel() {
        return entryPanel;
    }

    public static ReportPanel getReportPanel() {
        return reportPanel;
    }
}
