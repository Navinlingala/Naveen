package com.naveen.ecommerce.service;

import com.naveen.ecommerce.dto.PaymentInfo;
import com.naveen.ecommerce.dto.Purchase;
import com.naveen.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;

}