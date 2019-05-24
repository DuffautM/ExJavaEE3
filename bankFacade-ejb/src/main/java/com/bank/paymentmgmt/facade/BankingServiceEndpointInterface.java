package com.bank.paymentmgmt.facade;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author maxime
 */
@WebService(name = "BankingEndpoint")
public interface BankingServiceEndpointInterface {
    
    @WebMethod(operationName = "paymentOperation")
    @WebResult(name = "acceptedPayment")
    Boolean createPayment(@WebParam(name = "cardNumber") String ccNumber, @WebParam(name = "amountPaid") Double amount);
    
}
