import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class AnalogClock extends JFrame {

    public AnalogClock() {
        setTitle("Analog Clock");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        ClockPanel clockPanel = new ClockPanel();
        add(clockPanel);
        
        // Update every second
        Timer timer = new Timer(1000, e -> clockPanel.repaint());
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AnalogClock().setVisible(true);
        });
    }

    class ClockPanel extends JPanel {
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);



            
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            int centerX = getWidth() / 2;
            int centerY = getHeight() / 2;
            int radius = Math.min(centerX, centerY) - 10;
            
            // Draw clock face
            g2d.setColor(Color.BLACK);
            g2d.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
            g2d.setColor(Color.RED);
            g2d.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);

            
            // Draw clock numbers
            g2d.setFont(new Font("Arial", Font.BOLD, 16));
            for (int i = 1; i <= 12; i++) {
                double angle = Math.toRadians(90 - i * 30);
                int numX = (int) (centerX + (radius - 20) * Math.cos(angle));
                int numY = (int) (centerY - (radius - 20) * Math.sin(angle));
                g2d.drawString(Integer.toString(i), numX - 5, numY + 5);
            }
            
            // Get current time
            LocalDateTime now = LocalDateTime.now();
            int hours = now.getHour() % 12;
            int minutes = now.getMinute();
            int seconds = now.getSecond();

            
            // Calculate hand angles (90° offset to start at top)
            double hourAngle = Math.toRadians(90 - (hours * 30 + minutes * 0.5));
            double minuteAngle = Math.toRadians(90 - minutes * 6);
            double secondAngle = Math.toRadians(90 - seconds * 6);
            
            // Draw hour hand
            drawHand(g2d, centerX, centerY, hourAngle, radius * 0.5, 6, Color.PINK);
            
            // Draw minute hand
            drawHand(g2d, centerX, centerY, minuteAngle, radius * 0.7, 4, Color.PINK);
            
            // Draw second hand
            drawHand(g2d, centerX, centerY, secondAngle, radius * 0.9, 2, Color.RED);
            
            // Draw center cap
            g2d.setColor(Color.PINK);
            g2d.fillOval(centerX - 5, centerY - 5, 10, 10);
        }
        
        private void drawHand(Graphics2D g2d, int x, int y, double angle, double length, int width, Color color) {
            int endX = (int) (x + length * Math.cos(angle));
            int endY = (int) (y - length * Math.sin(angle));
            g2d.setColor(color);
            g2d.setStroke(new BasicStroke(width));
            g2d.drawLine(x, y, endX, endY);
        }
    }
}