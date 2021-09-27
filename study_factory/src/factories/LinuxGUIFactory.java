package factories;

import elements.LinuxButton;
import elements.LinuxSelect;
import elements.LinuxTextField;
import interfaces.Button;
import interfaces.Select;
import interfaces.TextField;

public class LinuxGUIFactory implements GUIFactory {
    public LinuxGUIFactory() {
        System.out.println("Создание интерфейса для ОС Linux");
    }

    @Override
    public Button createButton() {
        System.out.println("Создание кнопки для ОС Linux");
        return new LinuxButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("Создание поля выбора для ОС Linux");
        return new LinuxSelect();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Создание текстового поля для ОС Linux");
        return new LinuxTextField();
    }
}
