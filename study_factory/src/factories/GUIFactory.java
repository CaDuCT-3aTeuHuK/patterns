package factories;

import interfaces.Button;
import interfaces.Select;
import interfaces.TextField;

public interface GUIFactory {
    Button createButton();
    Select createSelect();
    TextField createTextField();
}
