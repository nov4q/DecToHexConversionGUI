package pl.polsl.DecimalToHexadecimalConversion_NowackiJakub;

import pl.polsl.DecimalToHexadecimalConversion_NowackiJakub.Controller.Controller;
import pl.polsl.DecimalToHexadecimalConversion_NowackiJakub.Model.Model;
import pl.polsl.DecimalToHexadecimalConversion_NowackiJakub.View.GUI;

/**
 * Main class.
 *
 * @author kuban
 * @version 3.0, December 2021
 *
 */
public class Main {

    /**
     * Main function of program.
     *
     * @param args unused in this version, String argument.
     */
    public static void main(String[] args) {
        Model model = new Model();
        GUI gui = new GUI();
        Controller controller = new Controller(model, gui);

        gui.setVisible(true);
        controller.controll();

    }
}
