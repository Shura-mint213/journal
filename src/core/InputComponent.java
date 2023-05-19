package core;

import interfaces.DataChecking;

import java.util.Scanner;

public class InputComponent {
    private DataChecking dataChecking;
    InputComponent() {
        dataChecking = new DataCheckingImp();
    }
    public int inputNumber(){
        int number = 0;
        try {
            Scanner input = new Scanner(System.in);
            var enteredValue = input.next();
            if (dataChecking.intValidation(enteredValue));
        } catch (Exception ex) {

        } finally { }
        return number;
    }
}
