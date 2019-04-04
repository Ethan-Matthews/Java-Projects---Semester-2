package nscc.ca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static nscc.ca.AppFrame.getEntryPanel;
import static nscc.ca.EntryPanel.getAnimalInfo;

public class ReportPanel extends JPanel {

    public ReportPanel() {
        //Panel settings.
        setLayout(null);
        setVisible(false);

        //Jlabels.
        JLabel reportLBRP = new JLabel("Reports");
        reportLBRP.setBounds(10, 10, 150, 30);

        //JTextAreas.
        JTextArea outputGPSTARP = new JTextArea();
        outputGPSTARP.setBounds(10, 40, 674, 180);
        outputGPSTARP.setVisible(false);

        JScrollPane scrollGPS = new JScrollPane(outputGPSTARP);
        scrollGPS.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollGPS.setBounds(10, 40, 674, 180);

        JTextArea outputEntriesTARP = new JTextArea("");
        outputEntriesTARP.setBounds(10, 40, 674, 180);

        JScrollPane scrollEntries = new JScrollPane(outputEntriesTARP);
        scrollGPS.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollGPS.setBounds(10, 40, 674, 180);

        //JButtons
        JButton shownewentBTRP = new JButton("Show New Entries");
        shownewentBTRP.setBounds(100, 230, 160, 30);

        JButton showgpsBTRP = new JButton("Show GPS Logs");
        showgpsBTRP.setBounds(270, 230, 160, 30);

        JButton backBTRP = new JButton("Back");
        backBTRP.setBounds(440, 230, 160, 30);

        //Add objects.
        add(reportLBRP);
        add(scrollGPS);
        add(showgpsBTRP);
        add(shownewentBTRP);
        add(backBTRP);
        add(scrollEntries);
        //Action Listeners---------------------------------
        backBTRP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                getEntryPanel().setVisible(true);
            }
        });
        //Loads GPS file into text area.
        showgpsBTRP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Path filePath = Paths.get("src\\Files\\GPS.txt");
                    String gpsString = new String(Files.readAllBytes(filePath));
                    outputGPSTARP.setText(gpsString);
                } catch (Exception ex) { ex.printStackTrace();}
                outputEntriesTARP.setVisible(false);
                outputGPSTARP.setVisible(true);
            }
        });
        //Loads AnimalInfo into TextArea.
        shownewentBTRP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputEntriesTARP.append(getAnimalInfo());
                outputGPSTARP.setVisible(false);
                outputEntriesTARP.setVisible(true);

            }
        });
    }
}
