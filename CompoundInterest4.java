import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CompoundInterest4 extends JFrame {

    private JTextField principalField;
    private JTextField rateField;
    private JTextField yearsField;
    private JTextField compoundField;
    private JTextField resultField;

    public CompoundInterest4() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Principal Amount:"), gbc);

        principalField = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(principalField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Annual Interest Rate (%):"), gbc);

        rateField = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(rateField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Number of Years:"), gbc);

        yearsField = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(yearsField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Compounded per Year:"), gbc);

        compoundField = new JTextField(10);
        compoundField.setText("1");
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(compoundField, gbc);

        JButton calculateButton = new JButton("Calculate");
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        add(calculateButton, gbc);   

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Future Value:"), gbc);

        resultField = new JTextField(10);
        resultField.setEditable(false);
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(resultField, gbc);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double principal = Double.parseDouble(principalField.getText());
                    double rate = Double.parseDouble(rateField.getText()) / 100;
                    int years = Integer.parseInt(yearsField.getText());
                    int compound = Integer.parseInt(compoundField.getText());

                    double futureValue = principal * Math.pow((1 + rate / compound), compound * years);
                    DecimalFormat df = new DecimalFormat("#,##0.00");
                    resultField.setText(df.format(futureValue));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(CompoundInterest4.this, "Invalid input. Please enter valid numbers.");
                }
            }
        });

        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CompoundInterest4();
    }
}