package checkImageRequest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by gfox on 05/05/2016.
 */
public class ImageHttpRequest {

    public static void main(String[] args) throws Exception {

     /*   URL url = new URL("https://i.ppstatic.com/img/220_Football_B10_G30_Eur.png");
        HttpURLConnection huc = (HttpURLConnection) url.openConnection();
        huc.setRequestMethod("HEAD");
        System.out.println(huc.getResponseCode());
        System.out.println(HttpURLConnection.HTTP_NOT_FOUND);*/


        URL url = new URL("http://echo.getpostman.com/get?test=123");
        HttpURLConnection huc = (HttpURLConnection) url.openConnection();
        huc.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(huc.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        System.out.println(response.toString());
    }
}
