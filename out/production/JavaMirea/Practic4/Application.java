package Practic4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Application extends JFrame {

    private int scoreMilan;
    private int scoreMadrid;

    private JButton button1;
    private JButton button2;

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    public Application() {
        super("Scorer");
        this.setBounds(100, 100, 450, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        scoreMilan = 0;
        scoreMadrid = 0;
        initFields();

        int row = 3;
        int col = 3;
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(row, col));
        JPanel[][] panelHolder = new JPanel[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                panelHolder[i][j] = new JPanel();
                container.add(panelHolder[i][j]);
            }
        }
        panelHolder[0][1].add(label1);
        panelHolder[1][0].add(button1);
        panelHolder[1][2].add(button2);
        panelHolder[2][0].add(label2);
        panelHolder[2][2].add(label3);

        button1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMilan += 1;

                updateResult("AC Milan");
            }
        });
        button2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMadrid += 1;

                updateResult("Real Madrid");
            }
        });
    }

    public void updateResult(String who) {
        label1.setText(getResult());
        label2.setText("Last Scorer: " + who);
        label3.setText("Winner: " + getWinner());
    }
    public String getWinner() {
        if(scoreMadrid == scoreMilan) return "DRAW";
        if(scoreMilan > scoreMadrid) return "AC Milan";
        return "Real Madrid";
    }

    public String getResult() {
        return "Result: " + scoreMilan + " X " + scoreMadrid;
    }

    public void initFields() {
        button1 = new JButton("AC Milan");
        button2 = new JButton("Real Madrid");

        label1 = new JLabel("Result: 0 X 0");
        label2 = new JLabel("Last Scorer: N/A ");
        label3 = new JLabel("Winner: DRAW");
    }
}
