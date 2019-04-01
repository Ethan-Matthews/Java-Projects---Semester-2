package nscc.ca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static nscc.ca.AppFrame.getReportPanel;

public class EntryPanel extends JPanel {

    public EntryPanel() {
        //JPanel general settings.
        setLayout(null);
        setVisible(false);

        //JLabels.
        JLabel animalsObservedLBEP = new JLabel("Animals Observed:");
        animalsObservedLBEP.setBounds(10, 10, 150, 30);

        JLabel animalLBEP = new JLabel("Animal");
        animalLBEP.setBounds(10, 40, 150, 30);

        JLabel genderLBEP = new JLabel("Gender");
        genderLBEP.setBounds(10, 70, 150, 30);

        JLabel weightLBEP = new JLabel("Weight in Kg");
        weightLBEP.setBounds(10, 100, 150, 30);

        JLabel uniqueAniLBEP = new JLabel("Placetext");
        uniqueAniLBEP.setBounds(10, 130, 150, 30);

        JLabel gpsLBEP = new JLabel("GPS Coordinates: (-)##.####### (-)(## or ###).#######");
        gpsLBEP.setBounds(260, 10, 600, 30);

        JTextField weightTFLB = new JTextField();
        weightTFLB.setBounds(130, 102, 100, 30);

        JTextField uniqueAniTFLB = new JTextField();
        uniqueAniTFLB.setBounds(130, 132, 100, 30);

        JTextField gpsCoTFEP = new JTextField();
        gpsCoTFEP.setBounds(260, 40, 280, 30);

        JComboBox animalCBEP = new JComboBox();
        animalCBEP.setBounds(130, 40, 100, 30);

        JComboBox genderCBEP = new JComboBox();
        genderCBEP.setBounds(130, 71, 100, 30);

        JButton addEntryBTEP = new JButton("Add Entry");
        addEntryBTEP.setBounds(50, 170, 130, 30);

        JButton addgpsBTEP = new JButton("Add GPS");
        addgpsBTEP.setBounds(550, 40, 130, 29);

        JButton viewreptBTEP = new JButton("View Reports");
        viewreptBTEP.setBounds(520, 220, 160, 29);

        JTextArea gpsDisplayTAEP = new JTextArea();
        gpsDisplayTAEP.setBounds(260, 71, 420, 120);

        //Add Labels.
        add(animalsObservedLBEP);
        add(animalLBEP);
        add(genderLBEP);
        add(weightLBEP);
        add(uniqueAniLBEP);
        add(gpsLBEP);
        //Add TextFields
        add(weightTFLB);
        add(uniqueAniTFLB);
        add(gpsCoTFEP);

        //Add Combo Boxes
        add(animalCBEP);
        add(genderCBEP);
        //Add Buttons
        add(addEntryBTEP);
        add(addgpsBTEP);
        add(viewreptBTEP);
        //Add TextAreas
        add(gpsDisplayTAEP);

        viewreptBTEP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                getReportPanel().setVisible(true);
            }
        });
    }

}
