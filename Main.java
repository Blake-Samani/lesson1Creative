// I didnt use anything not from the lecture other than setText. I found setText on the oracle tutorials for buttons.
import javax.swing.JFrame;

import view.MenuScreen;

public class Main {
    

    public static void main(String[] args){

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(550, 250);
        //add stuff into window
        var menu = new MenuScreen(window);
        menu.init();

        window.pack();
        window.setVisible(true);

    }

}