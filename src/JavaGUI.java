import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import java.awt.Color;

public class JavaGUI extends JFrame {

    private int milan = 0;
    private int madrid = 0;
    private JButton buttonMilan = new JButton("AC Milan");


    private JButton buttonMadrid = new JButton("Real Madrid");
    private JLabel result = new JLabel("Result: " + milan + " X " + madrid);
    private JLabel  score = new JLabel("Last Scorer: ");
    private JLabel  winner = new JLabel("Winner: " + (milan > madrid ? "milan" : milan < madrid ? "madrid" : "draw"));

    public JavaGUI(){
        super("Task 4");
        this.setBounds(200, 200, 320, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        buttonMilan.setBackground(Color.blue);
        buttonMadrid.setBackground(Color.green);

        Container container = this.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(result);
        container.add(score);
        container.add(winner);

        buttonMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan++;
                result.setText("Result: " + milan + " X " + madrid);
                score.setText("Last Scorer: milan");
                winner.setText("Winner: " + (milan > madrid ? "milan" : milan < madrid ? "madrid" : "draw"));
            }
        });
        buttonMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madrid++;
                result.setText("Result: " + milan + " X " + madrid);
                score.setText("Last Scorer: madrid");
                winner.setText("Winner: " + (milan > madrid ? "milan" : milan < madrid ? "madrid" : "draw"));
            }
        });

        container.add(buttonMilan);
        container.add(buttonMadrid);
    }

}
