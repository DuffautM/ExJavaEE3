package com.store.business.logic;

import com.store.integration.BankingEndpoint;
import com.store.integration.BankingService;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author maxime
 */
@Stateless
public class SoapPaymentValidator implements PaymentValidator {
    
    @WebServiceRef(BankingService.class)
    private BankingEndpoint banking;

    @Override
    public Boolean process(String ccNumber, Double amount) {
        
        Boolean isValid = banking.paymentOperation(ccNumber, amount);
        return isValid;
                
    }
}
