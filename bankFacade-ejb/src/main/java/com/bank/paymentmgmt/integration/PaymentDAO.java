/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.paymentmgmt.integration;

import com.bank.paymentmgmt.domain.Payment;
import java.util.List;

/**
 *
 * @author maxime
 */
public interface PaymentDAO {
    
    Payment add(Payment payment);
    Payment delete(Long id);
    Payment find(Long id);
    List<Payment>getAllStoredPayments();
    
}
