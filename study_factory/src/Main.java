import factories.GUIFactory;
import factories.LinuxGUIFactory;
import factories.MacGUIFactory;
import factories.WindowsGUIFactory;

public class Main {

    private OrderForm orderForm;

    public static void main(String[] args) {
        Main main = new Main();
        main.drawOrderForm();
    }

    public void drawOrderForm(){
        String osName = "linux";
        GUIFactory guiFactory;

        if(osName.startsWith("win")){
            guiFactory = new WindowsGUIFactory();
        } else if (osName.startsWith("mac")){
            guiFactory = new MacGUIFactory();
        } else if(osName.startsWith("linux")) {
            guiFactory = new LinuxGUIFactory();
        } else {
            System.out.println("Unknown OS");
            return;
        }
        orderForm = new OrderForm(guiFactory);
    }
}
