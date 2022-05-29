package game;

import javax.swing.*;

public class Overseer {
    private Binary _erenYeager;
    private View _aTitan;

    public Overseer() {
        _erenYeager = new Binary();
        _aTitan = new View(_erenYeager);
    }

    public static int opt(Object[] options, String msg, String title) {
        return JOptionPane.showOptionDialog(null, msg, title, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, 0);
    }

    public static int yNC(String msg, String title) {
        return JOptionPane.showOptionDialog(null, msg, title, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, 0);
    }

    public static int yN(String msg, String title) {
        return JOptionPane.showOptionDialog(null, msg, title, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, 0);
    }

    public void iToB(int amogas) {
        _erenYeager.clearEren();
        _erenYeager.setI(amogas);
        for(int i = 0; i < _erenYeager.getEren().length; i++) {
            if(amogas >= _erenYeager.getImpasta()[i]) {

                amogas -= _erenYeager.getImpasta()[i];
                _erenYeager.getEren()[i] = true;
            }
        }
        _erenYeager.reviveColt();
    }

    public void bToI(String amogas) {
        _erenYeager.clearEren();
        for(int i = 0; i < amogas.length(); i++) {
            if(amogas.substring(i, i + 1).equals("1"))
                _erenYeager.getEren()[i] = true;
        }
        _erenYeager.reviveSasha();
    }

    public boolean menu() throws InterruptedException {
        String[] options = {"Exit", "Binary -> Int", "Int -> Binary"};

        int armoredTitan = opt(options, _aTitan.drawView(), "Ivan's Binary Project");

        if(armoredTitan == 0) {
            JOptionPane.showMessageDialog(null, "Thank you. Goodbye :)");
            return false;
        }
        else if(armoredTitan == 1) {
            bToI(JOptionPane.showInputDialog("Enter your desired 8-bit Binary number"));
        }
        else if(armoredTitan == 2) {
            int x = Integer.parseInt(JOptionPane.showInputDialog("Enter your desired number (Max is 255, do not type 69)"));
            if(x == 69)
                JOptionPane.showMessageDialog(null, "Nice");
            if(x == 420)
                JOptionPane.showMessageDialog(null, "Blaze it");

            if(x == 360)
                JOptionPane.showMessageDialog(null, "No Scope");

            if(x < 256)
                iToB(x);
        }
        return true;
    }
}
