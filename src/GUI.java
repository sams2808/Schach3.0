import javax.swing.*;
import java.awt.*;

public class GUI {

   public GUI() {
       JPanel panel = new JPanel();
       panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
       JButton btnLaden = new JButton("Laden");
       JButton btnStarten = new JButton("Starten");
       JButton btnBeenden = new JButton("Beenden");
       panel.add(btnLaden);
       panel.add(Box.createVerticalStrut(10));
       panel.add(btnStarten);
       panel.add(Box.createVerticalStrut(10));
       panel.add(btnBeenden);

       JDialog dialog = new JDialog();
       dialog.setTitle("Start-Menu");
       dialog.setModal(true);
       dialog.getContentPane().add(panel);
       dialog.pack();
       dialog.setLocationRelativeTo(null);
       

       btnLaden.addActionListener(e -> {
           // Lade-Logik hier
           dialog.dispose();
       });
       btnStarten.addActionListener(e -> {
           // Start-Logik hier
           dialog.dispose();
       });
       btnBeenden.addActionListener(e -> System.exit(0));

       dialog.setVisible(true);
                JFrame frame = new JFrame("Schachbrett");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600, 600);

                JPanel board = new JPanel();
                board.setLayout(new GridLayout(8, 8));

                for (int row = 0; row < 8; row++) {
                    for (int col = 0; col < 8; col++) {
                        JPanel square = new JPanel();
                        if ((row + col) % 2 == 0) {
                            square.setBackground(Color.WHITE);
                        } else {
                            square.setBackground(Color.GRAY);
                        }
                        board.add(square);
                    }
                }

                frame.add(board);
                frame.setVisible(true);
            }


        }
