package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JFrame;

import view.MatcherGame;
import view.MenuScreen;

public class ButtonClickListener implements ActionListener {

    private MatcherGame panel;

    public ButtonClickListener(MatcherGame panel) {  //ask prof
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var button = e.getSource();
        if (button == panel.getQuitButton()) {
            JFrame window = panel.getWindow();
            window.getContentPane().removeAll();
            var menu = new MenuScreen(window);
            menu.init();
            window.pack();
            window.revalidate();
            System.out.println("QUITTER");
        } else if (button == panel.getButton1()) {      // the abstract button here, VSCode fixed for me, so i didnt actually look this up. 
            ((AbstractButton) button).setText("NOT A BOMB");
        } else if(button == panel.getButton2()){
            ((AbstractButton) button).setText("NOT A BOMB");
        } else if(button == panel.getButton3()){
            ((AbstractButton) button).setText("NOT A BOMB");
        } else if(button == panel.getButton4()){
            ((AbstractButton) button).setText("NOT A BOMB");
        } else if(button == panel.getButton5()){
            ((AbstractButton) button).setText("NOT A BOMB");
        } else if(button == panel.getButton6()){
            ((AbstractButton) button).setText("NOT A BOMB");
        } else if(button == panel.getButton7()){
            ((AbstractButton) button).setText("ISSA BOMB! BOOM! YOU LOSE!");
        } else if(button == panel.getButton8()){
            ((AbstractButton) button).setText("NOT A BOMB");
        } else if(button == panel.getButton9()){
            ((AbstractButton) button).setText("NOT A BOMB");
        } else if(button == panel.getButton10()){
            ((AbstractButton) button).setText("NOT A BOMB");
        } else if(button == panel.getButton11()){
            ((AbstractButton) button).setText("NOT A BOMB");
        } else if(button == panel.getButton12()){
            ((AbstractButton) button).setText("NOT A BOMB");
        }

    }
    
}