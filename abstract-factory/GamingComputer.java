
public class GamingComputer implements ComputerHardwareFactory {

    @Override
    public Keyboard builKeyboard() {
       return new GamingKeyboard();
    }

    @Override
    public Mouse buildMouse() {
        return new GamingMouse();
    }
    
}