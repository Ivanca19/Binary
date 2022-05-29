package game;

public class Binary {
    private int[] _impasta = {128, 64, 32, 16, 8, 4, 2, 1};

    private boolean[] _erenDies = {false, false, false, false, false, false, false, false};

    private boolean _sasha = false;

    private boolean _colt = false;

    private int _sussy = 0;

    public Binary() {

    }

    public boolean[] getEren() { return _erenDies; }
    public int[] getImpasta() {return _impasta; }
    public boolean getSasha() {return _sasha;}
    public boolean getColt() {return _colt;}
    public int getI() {return _sussy; }

    public void setI(int x){ _sussy = x; }
    public void reviveSasha() { _sasha = true;}
    public void reviveColt() { _colt = true;}

    public void clearEren() {
        for (int j = 0; j < _erenDies.length; j++) {
            _erenDies[j] = false;
        }
        _sasha = false;
        _colt = false;
        _sussy = 0;
    }

}