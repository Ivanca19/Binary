package game;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JOptionPane.showMessageDialog(null,"Welcome to my Binary Project.");
        JOptionPane.showMessageDialog(null,"I added a little extra if you type in 69, 420\n or 360 in the Int -> Binary");

        Overseer ERENYEAGER = new Overseer();

        int x = 0;
        while(x == 0) {
            if(!ERENYEAGER.menu()) {
                x++;
            }
        }
    }
}
