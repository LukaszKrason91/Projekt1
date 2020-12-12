import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class OpenFoodFactsService {

    public String food(long qrCode) throws CustomException {

        String uri = "https://word.openfoodfacts.org/api/v0/product/" + qrCode;

        try {
            URL url = new URL(uri);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder stringBuilder = new StringBuilder();

            while ((line = in.readLine()) != null) {
                stringBuilder.append(line);
            }
            in.close();

            if (stringBuilder.toString() == "") {
                throw new CustomException("Nie znaleziono produktu");
            }

            return stringBuilder.toString();

        } catch (MalformedURLException e) {
            throw new CustomException("błędny format kodu kreskowego");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
