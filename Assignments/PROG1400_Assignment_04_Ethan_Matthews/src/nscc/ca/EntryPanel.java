package nscc.ca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static nscc.ca.AppFrame.*;

public class EntryPanel extends JPanel {

    public EntryPanel() {
        //JPanel general settings.
        setLayout(null);
        setVisible(false);

        //ComboBox String lists.
        Animal[] animal = {getaPenguin(), getaSeaLion(), getaWalrus()};
        String[] gender = {"Male", "Female"};

        //JLabels.
        JLabel animalsObservedLBEP = new JLabel("Animals Observed:");
        animalsObservedLBEP.setBounds(10, 10, 150, 30);

        JLabel animalLBEP = new JLabel("Animal");
        animalLBEP.setBounds(10, 40, 150, 30);

        JLabel genderLBEP = new JLabel("Gender");
        genderLBEP.setBounds(10, 70, 150, 30);

        JLabel weightLBEP = new JLabel("Weight in Kg");
        weightLBEP.setBounds(10, 100, 150, 30);

        JLabel uniqueAniLBEP = new JLabel("Blood Pressure");
        uniqueAniLBEP.setBounds(10, 130, 150, 30);

        JLabel gpsLBEP = new JLabel("GPS Coordinates: (-)##.####### (-)(## or ###).#######");
        gpsLBEP.setBounds(260, 10, 600, 30);

        JTextField weightTFLB = new JTextField();
        weightTFLB.setBounds(130, 102, 100, 30);

        JTextField uniqueAniTFLB = new JTextField();
        uniqueAniTFLB.setBounds(130, 132, 100, 30);

        JTextField gpsCoTFEP = new JTextField();
        gpsCoTFEP.setBounds(260, 40, 280, 30);

        JComboBox animalCBEP = new JComboBox(animal);
        animalCBEP.setBounds(130, 40, 100, 30);

        JComboBox genderCBEP = new JComboBox(gender);
        genderCBEP.setBounds(130, 71, 100, 30);

        JButton addEntryBTEP = new JButton("Add Entry");
        addEntryBTEP.setBounds(50, 170, 130, 30);

        JButton addgpsBTEP = new JButton("Add GPS");
        addgpsBTEP.setBounds(550, 40, 130, 29);

        JButton viewreptBTEP = new JButton("View Reports");
        viewreptBTEP.setBounds(520, 220, 160, 29);

        JTextArea gpsDisplayTAEP = new JTextArea();
        gpsDisplayTAEP.setBounds(260, 71, 420, 120);
        gpsDisplayTAEP.setEditable(false);

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

        animalCBEP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal selectedAnimal = (Animal)animalCBEP.getSelectedItem();

        }
        });

        addEntryBTEP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gpsDisplayTAEP.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "At least one GPS location must be entered."
                            , "Message", JOptionPane.INFORMATION_MESSAGE);
                }
                else if (Integer.parseInt(weightTFLB.getText()) <= 0 ) {
                    JOptionPane.showMessageDialog(null,
                            "Weight: Invalid input.\n" +
                                     "Enter a whole number greater than 0."
                            , "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        addgpsBTEP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = gpsCoTFEP.getText();
                String gpsPattern = "^(-?[9][0]|-?[0-8][\\d])[.][\\d]{7}[ ](-?[1][8][0]|-?[1][0-7][\\d]|-?[\\d][\\d])[.][\\d]{7}$";
                Pattern checkPatternGPS = Pattern.compile(gpsPattern);
                Matcher matcher = checkPatternGPS.matcher(userInput);

                if (!matcher.find()) {
                    JOptionPane.showMessageDialog(null,
                            "Invalid GPS format:\n" +
                                     "Latitude values range from -90 to 90.\n" +
                                     "Longitude values range from -180 to 180.\n" +
                                     "Both values must have 7 digits after the decimal.\n" +
                                     "Separate longitude and latitude values with a space.\n" +
                                     "(-)##.####### (-)(## or ###).#######"
                            , "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    gpsDisplayTAEP.append(userInput + "\n");
                }
            }
        });
    }
}
