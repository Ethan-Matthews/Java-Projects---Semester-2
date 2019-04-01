package nscc.ca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static nscc.ca.AppFrame.getEntryPanel;

public class ReportPanel extends JPanel {

    public ReportPanel() {
        setLayout(null);
        setVisible(false);

        JLabel reportLBRP = new JLabel("Reports");
        reportLBRP.setBounds(10, 10, 150, 30);

        JTextArea outputTARP = new JTextArea();
        outputTARP.setBounds(10, 40, 674, 180);

        JButton shownewentBTRP = new JButton("Show New Entries");
        shownewentBTRP.setBounds(100, 230, 160, 30);

        JButton showgpsBTRP = new JButton("Show GPS Logs");
        showgpsBTRP.setBounds(270, 230, 160, 30);

        JButton backBTRP = new JButton("Back");
        backBTRP.setBounds(440, 230, 160, 30);

        add(reportLBRP);
        add(outputTARP);
        add(showgpsBTRP);
        add(shownewentBTRP);
        add(backBTRP);

        backBTRP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                getEntryPanel().setVisible(true);
            }
        });

    }

}
