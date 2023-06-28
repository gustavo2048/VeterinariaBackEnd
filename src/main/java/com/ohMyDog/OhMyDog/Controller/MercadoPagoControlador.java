package com.ohMyDog.OhMyDog.Controller;
import com.mercadopago.*;

import com.mercadopago.client.payment.PaymentClient;
import com.mercadopago.client.payment.PaymentCreateRequest;
import com.mercadopago.client.payment.PaymentPayerRequest;
import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.payment.Payment;
import java.math.BigDecimal;

public class MercadoPagoControlador {


	  public static void main(String[] args) {
	    MercadoPagoConfig.setAccessToken("TEST-1252012392550608-062816-21eab6e6a23508346d53fe5bdeb94d0d-13789517");

	    PaymentClient client = new PaymentClient();

	    PaymentCreateRequest createRequest =
	        PaymentCreateRequest.builder()
	            .transactionAmount(new BigDecimal(1000))
	            .token("your_cardtoken")
	            .description("description")
	            .installments(1)
	            .paymentMethodId("visa")
	            .payer(PaymentPayerRequest.builder().email("dummy_email").build())
	            .build();

	    try {
	      Payment payment = client.create(createRequest);
	      System.out.println(payment);
	    } catch (MPApiException ex) {
	      System.out.printf(
	          "MercadoPago Error. Status: %s, Content: %s%n",
	          ex.getApiResponse().getStatusCode(), ex.getApiResponse().getContent());
	    } catch (MPException ex) {
	      ex.printStackTrace();
	    }
	  }
	}

