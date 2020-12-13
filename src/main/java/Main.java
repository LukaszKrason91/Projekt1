import dto.InformationsDto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        OpenFoodFactsService openFoodFactsService = new OpenFoodFactsService();

        try{
            System.out.println("Podaj kod kreskowy");
            Scanner scanner = new Scanner(System.in);
            long barCode = scanner.nextLong();
            InformationsDto result = openFoodFactsService.food(barCode);
            System.out.println(result);


        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
