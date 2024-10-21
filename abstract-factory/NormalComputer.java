
public class NormalComputer implements ComputerHardwareFactory {

    @Override
    public Keyboard builKeyboard() {
        return new NormalKeyboard();
    }

    @Override
    public Mouse buildMouse() {
        return new NormalMouse();
    }

}