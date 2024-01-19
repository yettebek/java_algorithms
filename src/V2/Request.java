package V2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;

public class Request {

  public static void main(String[] args) {

    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://secure.packetizer.com/pwgen/?f=json"))
        .header("Accept", "*/*")
        .header("User-Agent", "Thunder Client (https://www.thunderclient.com)")
        .method("GET", HttpRequest.BodyPublishers.noBody())
        .build();

    try {
      HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

      System.out.println("RESPONSE BODY (PASSWORDS):\n" + response.body());
      
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
  }

}
