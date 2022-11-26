package com.rajan.model;

import java.util.List;

import javax.persistence.Entity;
@Entity
public class Cart {
	private Integer totalCartValue;
	private List<Product> products;
}
