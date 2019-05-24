package com.bank.paymentmgmt.facade;

import com.bank.paymentmgmt.domain.Payment;
import com.bank.paymentmgmt.integration.PaymentDAO;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

/**
 *
 * @author maxime
 */
@Stateless
@WebService(
        endpointInterface= "com.bank.paymentmgmt.facade.BankingServiceEndpointInterface",
        portName = "BankingPort",
        serviceName = "BankingService"
)
public class BankingServiceBean implements BankingServiceEndpointInterface {
    
    @Inject
    private PaymentDAO paymentDAO;

    @Override
    public Boolean createPayment(String ccNumber, Double amount) {
        
        if(ccNumber.length() == 10) {
            System.out.println("Montant payé :" + amount + " €");
            Payment p = new Payment();
            p.setCcNumber(ccNumber);
            p.setAmount(amount);
            p = paymentDAO.add(p);
            paymentDAO.getAllStoredPayments();
            return true;
        }
        else {
            return false;
        }
    }
}
