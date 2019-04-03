package nscc.ca;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {

    private static EntryPanel entryPanel;
    private static ReportPanel reportPanel;

    private static Animal aPenguin;
    private static Animal aSeaLion;
    private static Animal aWalrus;

    public AppFrame() {

        //General JFrame settings.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new CardLayout());
        setTitle("Antarctic Animal Tracking");

        //Creates new Animal objects.
        aPenguin = new Penguin(null, 0, null, 0);
        aSeaLion = new SeaLion(null, 0, null, 0);
        aWalrus = new Walrus(null, 0, null, null);

        //Adds Panels Entry and Report.
        entryPanel = new EntryPanel();
        reportPanel = new ReportPanel();
        add(entryPanel);
        add(reportPanel);


    }

    public static Animal getaPenguin() {
        return aPenguin;
    }

    public static Animal getaSeaLion() {
        return aSeaLion;
    }

    public static Animal getaWalrus() {
        return aWalrus;
    }

    public static EntryPanel getEntryPanel() {
        return entryPanel;
    }

    public static ReportPanel getReportPanel() {
        return reportPanel;
    }
}
