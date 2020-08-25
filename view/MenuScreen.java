package view;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MenuScreen {

    private JFrame window;

    public MenuScreen(JFrame window) {
        this.window = window;
        window.setTitle("Slightly Functional Minesweeper");
    }

    public void init() {
        Container cp = window.getContentPane(); //configures graphics for program, BODY OF WINDOW must be initialized
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(800, 500));
        panel.setLayout(new GridLayout(1, 1));
        JButton startButton = new JButton("CLICK TO PLAY MINESWEEPER");
        startButton.setFont(new Font("SimSun", Font.PLAIN, 45));
        panel.add(startButton);
        cp.add(BorderLayout.CENTER,panel);

        startButton.addActionListener((e) ->{
            window.getContentPane().removeAll();
            var matcher = new MatcherGame(window);
            matcher.init();
            window.pack();
        });
    }
    
}