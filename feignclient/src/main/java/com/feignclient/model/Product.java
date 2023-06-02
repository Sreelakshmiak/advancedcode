package com.feignclient.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	 Integer productId;
	 String name;
	 String categories;
	 String brand;
	 double price;

  
}

