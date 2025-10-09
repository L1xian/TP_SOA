package Services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface ICalculatrice {
    @WebMethod
    public int sum(@WebParam int a,@WebParam int b);
    @WebMethod
    public int sous(@WebParam int a,@WebParam int b);
    @WebMethod
    public int mult(@WebParam int a,@WebParam int b);
    @WebMethod
    public int div(@WebParam int a,@WebParam int b);

}