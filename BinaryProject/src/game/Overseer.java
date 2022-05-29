package game;

import javax.swing.*;


/*
    The Overseer class has one job. Oversee the interactions between the Binary object, the View, the User, and respond accordingly.
*/
public class Overseer {
    private Binary _erenYeager;
    private View _aTitan;

    public Overseer() {
        _erenYeager = new Binary();
        _aTitan = new View(_erenYeager);
    }
    
  
    //This is an options JOptionPane method that I use to create options in the users view
    
    public static int opt(Object[] options, String msg, String title) {
        return JOptionPane.showOptionDialog(null, msg, title, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, 0);
    }

    //This is a yes no cancel JOptionPane method that I use to create a yes no cancel choice in the users view
    public static int yNC(String msg, String title) {
        return JOptionPane.showOptionDialog(null, msg, title, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, 0);
    }

    //This is a yes no JOptionPane method that I use to create a yes no choice in the users view
    public static int yN(String msg, String title) {
        return JOptionPane.showOptionDialog(null, msg, title, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, 0);
    }

    //This is the method that coordinates the View if the user choses to convert our Binary object from an Integer to a binary representation
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

    //This is the method that coordinates the View if the user choses to convert our Binary object from an Binary to a Integer representation
    public void bToI(String amogas) {
        _erenYeager.clearEren();
        for(int i = 0; i < amogas.length(); i++) {
            if(amogas.substring(i, i + 1).equals("1"))
                _erenYeager.getEren()[i] = true;
        }
        _erenYeager.reviveSasha();
    }

    //This method creates the main view that the user will see and will allow the user to interact with the View and Binary objects
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
