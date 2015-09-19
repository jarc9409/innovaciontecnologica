/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author User
 */
@WebService(serviceName = "WindowsAzureWS")
public class WindowsAzureWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "HolaMundo")
    public String hello(@WebParam(name = "HolaMundo") String str) {
        return "Hello " + str + " !";
    }
}
