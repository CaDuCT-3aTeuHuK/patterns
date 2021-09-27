package factories;

import elements.WindowsButton;
import elements.WindowsSelect;
import elements.WindowsTextfield;
import interfaces.Button;
import interfaces.Select;
import interfaces.TextField;

public class WindowsGUIFactory implements GUIFactory{

    public WindowsGUIFactory() {
        System.out.println("Идет создание GUI для ОС Windows");
    }

    @Override
    public Button createButton() {
        System.out.println("Создание кнопки для ОС Windows");
        return new WindowsButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("Создание поля выбора для ОС Windows");
        return new WindowsSelect();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Создание текстового поля для ОС Windows");
        return new WindowsTextfield();
    }
}
