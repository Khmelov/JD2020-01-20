package by.it.makarenko.calc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class ConsoleRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression;
        Parser parser = new Parser();
        Printer printer = new Printer();

        try {
            Var.loadVars();
        } catch (FileNotFoundException e) {
            Logger.logger.log("Variables have not been added yet.");
            System.out.println("Variables have not been added yet.");
        } catch (IOException | CalcException e) {
            Logger.logger.log(e.getMessage());
            System.out.println(e.getMessage());
        }


        while (true) {
            expression = scanner.nextLine();
            switch (expression) {
                case "end":
                    return;
                case "printvar":
                    printer.printVariables(false);
                    break;
                case "sortvar":
                    printer.printVariables(true);
                    break;
                default:
                    try {
                        Var result = parser.calc(expression);
                        printer.print(result);
                        Logger.logger.log(String.format("expression: %s, result: %s", expression, result));
                    } catch (CalcException e) {
                        System.out.println(e.getMessage());
                        Logger.logger.log(e.getMessage());
                    }
                    break;
            }
        }
    }
}
