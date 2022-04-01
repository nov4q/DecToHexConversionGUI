package pl.polsl.DecimalToHexadecimalConversion_NowackiJakub.Controller;

import pl.polsl.DecimalToHexadecimalConversion_NowackiJakub.View.GUI;
import pl.polsl.DecimalToHexadecimalConversion_NowackiJakub.Model.Model;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import pl.polsl.DecimalToHexadecimalConversion_NowackiJakub.Exception.CustomException;

/**
 * Class Controller responsible for converting decimal into hexadecimal.
 *
 * @author kuban
 * @version 3.0, December 2021
 *
 */
public class Controller {

    /**
     * Object of class Model.
     */
    private Model model;
    /**
     * Object of class GUI.
     */
    private GUI gui;

    /**
     * Constructor of class Controller.
     *
     * @param model object of class Model.
     * @param gui object of class GUI.
     */
    public Controller(Model model, GUI gui) {
        this.model = model;
        this.gui = gui;
    }

    /**
     * Sorts and converts input numbers given in decimal system, to hexadecimal.
     */
    public void controll() {

        this.gui.addEncodeListener(evt -> {
            try {
                List<Integer> inputList = gui.getTableValues().stream().sorted().collect(Collectors.toList());
                List<String> outputList = new ArrayList<>();

                for (Integer element : inputList) {
                    model.setDecFromInput(element);
                    model.convertToHex();
                    outputList.add(model.getHex());
                }

                gui.setTableValues(inputList, outputList);
            } catch (CustomException except) {
                gui.displayErrorMessage("Input has to be greater than 0");
            }
        }
        );

    }
}
