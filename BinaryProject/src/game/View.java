package game;


import java.util.ArrayList;

/*
    The view class is in charge of creating the view that interacts with the options chosen by the user. 
    No matter the option chosen the view will always have a ledger that shows the conversion factor from
    binary to integer and will keep a record of the conversions done previously.
*/

public class View {
    
    private Binary _titan;

    public View(Binary titan) {
        _titan = titan;
    }

    /*
        This method returns a String called MAP. MAP is the view that the user will see,
        represented by a String. MAP is generated based on the choices that the user makes
        while operating the program.
    */
    public String drawView() {

        String MAP = "";

        MAP += "\n" + "Conversion Factor\n" + "1 1 1 1 1 1 1 1\n" +
                "128 64 32 16 8 4 2 1";

        ArrayList<Integer> paths = new ArrayList<Integer>();
        int snl = 0;

        if(_titan.getSasha()) {
            MAP += "\n \n";
            for(int i = 0; i < _titan.getEren().length; i++) {
                if(_titan.getEren()[i])
                    MAP += "1";
                else
                    MAP += "0";
            }
            MAP += "\n";
            for(int i = 0; i < _titan.getEren().length; i++) {
                if(_titan.getEren()[i]) {
                    MAP += _titan.getImpasta()[i] + " ";
                    paths.add(_titan.getImpasta()[i]);
                    snl += _titan.getImpasta()[i];
                }
                else
                    MAP += "0 ";
            }
            MAP += "\n";
            for(int i = 0; i < paths.size(); i++) {
                MAP += paths.get(i);
                if(i != paths.size()-1)
                    MAP += " + ";
            }
            MAP += " = " + snl;

        }
        else if(_titan.getColt()) {
            MAP += "\n \n";

            MAP += _titan.getI() + "\n";

            for(int i = 0; i < _titan.getEren().length; i++) {
                if(_titan.getEren()[i]) {
                    MAP += _titan.getImpasta()[i] + " ";
                    paths.add(_titan.getImpasta()[i]);
                    snl += _titan.getImpasta()[i];
                }
                else
                    MAP += "0 ";
            }
            MAP += "\n";

            for(int i = 0; i < _titan.getEren().length; i++) {
                if(_titan.getEren()[i])
                    MAP += "1";
                else
                    MAP += "0";
            }
        }


        return MAP;
    }

}
