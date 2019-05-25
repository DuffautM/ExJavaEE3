package com.store.model;

import com.store.business.logic.PaymentValidator;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author maxime
 */
@Named(value = "paymentModel")
@RequestScoped
public class PaymentBean {
    
    @Inject
    private PaymentValidator paymentValidator;

    private String ccNumber;
    private Double amount;
    
    public String doPaymentWithSoap() {
        
        System.out.println("Le paiment commence");
        boolean isValid = paymentValidator.process(ccNumber, amount);
        
        if(isValid == true) {
            return "valid";
        }
        else {
            return "invalid";
        }
    }
    
    public String getCcNumber() {
        return ccNumber;
    }
    
    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }
    
    public Double getAmount() {
        return amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
}
