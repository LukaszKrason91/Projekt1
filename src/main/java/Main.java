import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        OpenFoodFactsService openFoodFactsService = new OpenFoodFactsService();

        try{
            System.out.println("Podaj kod kreskowy");
            Scanner scanner = new Scanner(System.in);
            String result;
            long qrCode = scanner.nextLong();
            result = openFoodFactsService.food(qrCode);
            System.out.println(result);
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
