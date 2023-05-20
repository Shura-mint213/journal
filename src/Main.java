import core.DataCheckingImp;
import core.InputComponent;
import models.StudentModel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataCheckingImp dataCheckingImp = new DataCheckingImp();
        String input = "";
        while (input != "0"){
            input = new Scanner(System.in).next();
            dataCheckingImp.intValidation(input);
        }
    }
}