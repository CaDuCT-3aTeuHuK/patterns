import factories.GUIFactory;
import interfaces.Button;
import interfaces.Select;
import interfaces.TextField;

public class OrderForm {
    private final TextField customerNameTextField;
    private final Select colorTypeSelect;
    private final Button orderButton;

    public OrderForm(GUIFactory factory) {
        System.out.println("Создается форма заказа");
        customerNameTextField = factory.createTextField();
        colorTypeSelect = factory.createSelect();
        orderButton = factory.createButton();
    }
}
