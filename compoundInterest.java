import javax.swing.JOptionPane;
public class compoundInterest {
    
    public static void main(String[] args) {
        String Principal, Time, Rate, Num;
        Principal = JOptionPane.showInputDialog(null,"Enter the principal Amount");
        Time = JOptionPane.showInputDialog("Enter the time (t) in years:");
        Rate = JOptionPane.showInputDialog("Enter the rate of interest (r) in percentage:");
        Num = JOptionPane.showInputDialog("Enter the number of times interest is compounded per year (n):");

        double principal = Double.parseDouble(Principal);
        double time = Double.parseDouble(Time);
        double rate = Double.parseDouble(Rate) / 100;
        int num = Integer.parseInt(Num);

        double compoundInterest = principal * Math.pow((1 + rate / num), num * time) - principal;

        JOptionPane.showMessageDialog(null, "The compound interest is: " + compoundInterest);
    }
}