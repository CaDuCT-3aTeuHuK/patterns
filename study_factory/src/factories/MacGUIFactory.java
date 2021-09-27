package factories;

import elements.MacButton;
import elements.MacSelect;
import elements.MacTextField;
import interfaces.Button;
import interfaces.Select;
import interfaces.TextField;

public class MacGUIFactory implements GUIFactory{
    public MacGUIFactory() {
        System.out.println("Создание интерфейса для ОС Mac");
    }

    @Override
    public Button createButton() {
        System.out.println("Создание кнопки для ОС Mac");
        return new MacButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("Создание поля выбора для ОС Mac");
        return new MacSelect();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Создание текстового поля для ОС Mac");
        return new MacTextField();
    }
}
