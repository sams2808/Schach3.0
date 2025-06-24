import javax.swing.*;
import java.awt.*;

public class GUI {

   public GUI() {
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
