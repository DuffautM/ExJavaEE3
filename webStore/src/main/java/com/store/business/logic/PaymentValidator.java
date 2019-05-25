package com.store.business.logic;

import javax.ejb.Local;

/**
 *
 * @author maxime
 */
@Local
public interface PaymentValidator {
    
    public Boolean process(String ccNumber, Double amount);
    
}
