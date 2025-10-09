package Services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(endpointInterface = "Services.ICalculatrice")
public class Calculatrice implements ICalculatrice {

    @WebMethod
    public int sum(@WebParam int a, @WebParam int b){
        return a + b;
    }

    @Override
    public int sous(int a, int b) {
        return a - b;
    }

    @Override
    public int mult(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }


}