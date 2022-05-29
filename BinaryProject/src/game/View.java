package game;


import java.util.ArrayList;

public class View {
    /*

    public View(Cell iBoard) {
        _board = iBoard;
    }



    public String drawView() {

        String MAP = "";

        for(int r = 0; r < _board.getBoard().length; r++) {
            for (int c = 0; c < _board.getBoard()[r].length; c++) {
                if(_board.getBoard()[r][c] == true)
                    MAP += "  □  ";
                    //MAP += _img.HOG;
                else
                    MAP += "  ■  ";
            }
            MAP += "\n";
        }

        return MAP;
    }

     */

    private Binary _titan;

    public View(Binary titan) {
        _titan = titan;
    }

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
