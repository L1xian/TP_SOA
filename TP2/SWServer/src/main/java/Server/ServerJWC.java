package Server;

import Services.Calculatrice;
import jakarta.xml.ws.Endpoint;

public class ServerJWC {
    public static void main(){
        String URL = "http://localhost:8080/calculatrice";
        Endpoint.publish(URL, new Calculatrice());
        System.out.println("service in "+URL);
    }
}