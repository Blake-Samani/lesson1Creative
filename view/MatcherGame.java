package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ButtonClickListener;



public class MatcherGame {
    
    private JFrame window;
    private JButton button1 = new JButton();
    private JButton button2 = new JButton();
    private JButton button3 = new JButton();
    private JButton button4 = new JButton();
    private JButton button5 = new JButton();
    private JButton button6 = new JButton();
    private JButton button7 = new JButton();
    private JButton button8 = new JButton();
    private JButton button9 = new JButton();
    private JButton button10 = new JButton();
    private JButton button11 = new JButton();
    private JButton button12 = new JButton();

    


    private JButton quit = new JButton("Quit");


    public MatcherGame(JFrame window){
        this.window = window;
    }

    public void init() {
        Container cp = window.getContentPane();
        

        JPanel southPanel = new JPanel();
        cp.add(BorderLayout.SOUTH, southPanel);

        JPanel northPanel = new JPanel();
        cp.add(BorderLayout.NORTH, northPanel);

        southPanel.setLayout(new GridLayout(4, 1));
        southPanel.setPreferredSize(new Dimension(800, 500));
        JPanel row1 = new JPanel();
        row1.setLayout(new GridLayout(1, 3));
        row1.add(button1);
        row1.add(button2);
        row1.add(button3);
        southPanel.add(row1);

        JPanel row2 = new JPanel();
        row2.setLayout(new GridLayout(1, 3));
        row2.add(button4);
        row2.add(button5);
        row2.add(button6);
        southPanel.add(row2);

        JPanel row3 = new JPanel();
        row3.setLayout(new GridLayout(1, 3));
        row3.add(button7);
        row3.add(button8);
        row3.add(button9);
        southPanel.add(row3);

        JPanel row4 = new JPanel();
        row4.setLayout(new GridLayout(1, 3));
        row4.add(button10);
        row4.add(button11);
        row4.add(button12);
        southPanel.add(row4);

        JPanel row5 = new JPanel();
        row5.setLayout(new GridLayout(1, 3));
        row5.add(quit);
        northPanel.add(row5);

        ButtonClickListener buttonClickListener = new ButtonClickListener(this);

        button1.addActionListener(buttonClickListener);
        button2.addActionListener(buttonClickListener);
        button3.addActionListener(buttonClickListener);
        button4.addActionListener(buttonClickListener);
        button5.addActionListener(buttonClickListener);
        button6.addActionListener(buttonClickListener);
        button7.addActionListener(buttonClickListener);
        button8.addActionListener(buttonClickListener);
        button9.addActionListener(buttonClickListener);
        button10.addActionListener(buttonClickListener);
        button11.addActionListener(buttonClickListener);
        button12.addActionListener(buttonClickListener);
        quit.addActionListener(buttonClickListener);

    }

    public JButton getButton1() {
        return button1;
    }
    public JButton getButton2() {
        return button2;
    }
    public JButton getButton3() {
        return button3;
    }
    public JButton getButton4() {
        return button4;
    }
    public JButton getButton5() {
        return button5;
    }
    public JButton getButton6() {
        return button6;
    }
    public JButton getButton7() {
        return button7;
    }
    public JButton getButton8() {
        return button8;
    }
    public JButton getButton9() {
        return button9;
    }
    public JButton getButton10() {
        return button10;
    }
    public JButton getButton11() {
        return button11;
    }
    public JButton getButton12() {
        return button12;
    }
    public JButton getQuitButton() {
        return quit;
    }

    public JFrame getWindow() {
        return window;
    }
}