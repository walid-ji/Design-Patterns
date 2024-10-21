public class ComputerStore  {
    private Keyboard keyboard;
    private Mouse mouse;

    public ComputerStore(ComputerHardwareFactory factory) {
        keyboard = factory.builKeyboard();
        mouse = factory.buildMouse();
    }

    public void assembleHardware() {
        keyboard.click();
        mouse.move();
    }

    public static void main(String[] args) {
        // Gaming setup
        ComputerHardwareFactory gamingFactory = new GamingComputer();
        ComputerStore  gamingStore = new ComputerStore (gamingFactory);
        gamingStore.assembleHardware();

        // Normal setup
        ComputerHardwareFactory normalFactory = new NormalComputer();
        ComputerStore  normalStore = new ComputerStore (normalFactory);
        normalStore.assembleHardware();
    }
}