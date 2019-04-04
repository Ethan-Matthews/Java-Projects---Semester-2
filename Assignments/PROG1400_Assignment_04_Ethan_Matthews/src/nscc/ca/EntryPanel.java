package nscc.ca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static nscc.ca.AppFrame.*;

public class EntryPanel extends JPanel {

    private static Animal selectedAnimal;
    private static String animalInfo;

    public EntryPanel() {

        selectedAnimal = getaPenguin();

        //JPanel general settings.
        setLayout(null);
        setVisible(false);

        //ComboBox String lists.
        Animal[] animal = {getaPenguin(), getaSeaLion(), getaWalrus()};
        String[] gender = {"Male", "Female"};
        String[] dentalHealth = {"Good", "Average", "Poor"};
        animalInfo = "";

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

        //JText fields.
        JTextField weightTFLB = new JTextField();
        weightTFLB.setBounds(130, 102, 100, 30);

        JTextField uniqueAniTFLB = new JTextField();
        uniqueAniTFLB.setBounds(130, 132, 100, 30);

        JTextField gpsCoTFEP = new JTextField();
        gpsCoTFEP.setBounds(260, 40, 280, 30);

        //JCombo boxes
        JComboBox<Animal> animalCBEP = new JComboBox<>(animal);
        animalCBEP.setBounds(130, 40, 100, 30);

        JComboBox<String> genderCBEP = new JComboBox<>(gender);
        genderCBEP.setBounds(130, 71, 100, 30);

        JComboBox<String> dentHthCBEP = new JComboBox<>(dentalHealth);
        dentHthCBEP.setBounds(130, 132, 100, 30);
        dentHthCBEP.setVisible(false);

        //JButtons
        JButton addEntryBTEP = new JButton("Add Entry");
        addEntryBTEP.setBounds(50, 170, 130, 30);

        JButton addgpsBTEP = new JButton("Add GPS");
        addgpsBTEP.setBounds(550, 40, 130, 29);

        JButton viewreptBTEP = new JButton("View Reports");
        viewreptBTEP.setBounds(520, 220, 160, 29);

        //JTextAreas.
        JTextArea gpsDisplayTAEP = new JTextArea();
        gpsDisplayTAEP.setBounds(260, 71, 420, 120);
        gpsDisplayTAEP.setEditable(false);

        JScrollPane scroll = new JScrollPane(gpsDisplayTAEP);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(260, 71, 420, 120);


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
        add(dentHthCBEP);
        //Add Buttons
        add(addEntryBTEP);
        add(addgpsBTEP);
        add(viewreptBTEP);
        //Add TextAreas(Scroll)
        add(scroll);
        //Action Listeners----------------------------------------------------------------------------------------------
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
                //switches combo boxes and text fields for animal special traits.
                dentHthCBEP.setVisible(false);
                uniqueAniTFLB.setVisible(false);
                //gets selected Animal.
                selectedAnimal = (Animal)animalCBEP.getSelectedItem();
                //Compares selected animal to classes. Changes output accordingly.
                if (selectedAnimal.getClass() == Walrus.class) {
                    uniqueAniLBEP.setText("Dental Health");
                    dentHthCBEP.setVisible(true);
                } else if (selectedAnimal.getClass() == SeaLion.class) {
                    uniqueAniLBEP.setText("Number of Spots");
                    uniqueAniTFLB.setVisible(true);
                } else if (selectedAnimal.getClass() == Penguin.class) {
                    uniqueAniLBEP.setText("Blood Pressure");
                    uniqueAniTFLB.setVisible(true);
                }



        }
        });

        addEntryBTEP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean errorCheck = true;
                //Regex for Patterns.
                String intInput = weightTFLB.getText();
                String weightPattern = "^[1-9]\\d*$";
                Pattern checkPatternWeight = Pattern.compile(weightPattern);
                Matcher matcherWeight = checkPatternWeight.matcher(intInput);

                String spotInput = weightTFLB.getText();
                String spotPattern = "^[1-9]\\d*$";
                Pattern checkPatternSpots = Pattern.compile(spotPattern);
                Matcher matcherSpots = checkPatternSpots.matcher(spotInput);

                String bloodPressureInput = uniqueAniTFLB.getText();
                String bloodPressurePattern = "^([1-9]|[1-9][\\d]*)[.][\\d]*$";
                Pattern checkPatternInt = Pattern.compile(bloodPressurePattern);
                Matcher matcherDouble = checkPatternInt.matcher(bloodPressureInput);
                //Error checking for gps display.
                if (gpsDisplayTAEP.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "At least one GPS location must be entered."
                            , "Message", JOptionPane.INFORMATION_MESSAGE);
                    errorCheck = false;
                }
                //Error checking for weight.
                if (!matcherWeight.find()) {
                    JOptionPane.showMessageDialog(null,
                            "Weight: Invalid input.\n" +
                                    "Enter a whole number greater than 0."
                            , "Message", JOptionPane.INFORMATION_MESSAGE);
                    errorCheck = false;
                }
                //Error checking for spots.
                if (selectedAnimal.getClass() == SeaLion.class) {
                    if (!matcherSpots.find()) {
                        JOptionPane.showMessageDialog(null,
                                "Number of Spots: Invalid input.\n" +
                                         "Enter a whole number greater than 0."
                                , "Message", JOptionPane.INFORMATION_MESSAGE);
                        errorCheck = false;
                    }
                }
                //Error checking for doubles.
                if (selectedAnimal.getClass() == Penguin.class) {
                    if (!matcherDouble.find()) {
                        JOptionPane.showMessageDialog(null,
                                "Blood Pressure: Invalid input.\n" +
                                         "Enter a decimal number greater than 0.0.",
                                  "Message", JOptionPane.INFORMATION_MESSAGE);
                        errorCheck = false;
                    }
                }
                //If error checks are passed.
                if (errorCheck) {
                    selectedAnimal.setGender((String)genderCBEP.getSelectedItem());
                    selectedAnimal.setWeight(Integer.parseInt(weightTFLB.getText()));
                    GPS currentGPS = new GPS(gpsDisplayTAEP.getText());
                    selectedAnimal.setGPS(currentGPS);
                    //Appends GPS co-ordinates to file and sets special properties.
                    if (selectedAnimal.getClass() == Walrus.class) {
                        ((Walrus) selectedAnimal).setDentalHealth(uniqueAniTFLB.getText());
                        ((Walrus) selectedAnimal).writeFile();
                    } else if (selectedAnimal.getClass() == SeaLion.class) {
                        ((SeaLion) selectedAnimal).setNumberOfSpots(Integer.parseInt(uniqueAniTFLB.getText()));
                        ((SeaLion) selectedAnimal).writeFile();
                    } else if (selectedAnimal.getClass() == Penguin.class) {
                        ((Penguin) selectedAnimal).setBloodPressure(Double.parseDouble(uniqueAniTFLB.getText()));
                        ((Penguin) selectedAnimal).writeFile();
                    }

                    JOptionPane.showMessageDialog(null,
                            selectedAnimal + " saved as new entry.",
                              "Message", JOptionPane.INFORMATION_MESSAGE);
                    //String for concat output.
                    String currentEntry = animalLBEP.getText() + ": " + animalCBEP.getSelectedItem() + "\n" +
                                        genderLBEP.getText() + ": " + genderCBEP.getSelectedItem() + "\n" +
                                        weightLBEP.getText() + ": " + weightTFLB.getText() + "\n" +
                                        "GPS Location(s): \n" + selectedAnimal.getGPS().getLocation() + "\n" +
                                        "----------------------------\n";
                    animalInfo = animalInfo.concat(currentEntry);
//                    //For error checking.
//                    System.out.println(animalLBEP.getText() + ": " + animalCBEP.getSelectedItem());
//                    System.out.println(genderLBEP.getText() + ": " + genderCBEP.getSelectedItem());
//                    System.out.println(weightLBEP.getText() + ": " + weightTFLB.getText());
//                    System.out.println("GPS Location(s): \n" + (selectedAnimal.getGPS().getLocation()));
//                    System.out.println("-----------------------");
                    //Reset fields.
                    uniqueAniTFLB.setText(null);
                    weightTFLB.setText(null);
                    gpsDisplayTAEP.setText(null);
                    animalCBEP.setSelectedIndex(0);
                    genderCBEP.setSelectedIndex(0);

                }
            }
        });
        //Regex for checking GPS patterns.
        addgpsBTEP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = gpsCoTFEP.getText();
                String gpsPattern = "^(-?[9][0]|-?[0-8][\\d])[.][\\d]{7}[ ](-?[1][8][0]|-?[1][0-7][\\d]|-?[\\d][\\d])[.][\\d]{7}$";
                Pattern checkPatternGPS = Pattern.compile(gpsPattern);
                Matcher matcherGPS = checkPatternGPS.matcher(userInput);

                if (!matcherGPS.find()) {
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
                    System.out.println(gpsDisplayTAEP.getText());
                    gpsCoTFEP.setText(null);
                }
            }
        });
    }
    //gets animalInfo string.
    public static String getAnimalInfo() {
        return animalInfo;
    }
}
