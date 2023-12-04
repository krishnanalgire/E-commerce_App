package com.shekru.model;

import java.time.LocalDate;

import jakarta.persistence.Column;


public class PaymentInformation {
	
	
	 @Column (name="cardholder_name")
	 private String cardholderName;
	 
	 @Column (name="card_number")
	 private String csrdNumber;
	 
	 @Column (name="cvv")
	 private String cvv;
	 @Column (name="expiration_date")
	 private LocalDate expirationDate;
	 
	

}
