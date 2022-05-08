package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
public class Product {
	@Id
	@NotBlank(message = "Code không để trống !!!")
	private String code;
	@NotBlank(message = "Description không để trống !!!")
	private String description;
	@NotBlank(message = "Price không để trống !!!")
	@Min(value = 0, message = "Nhập Price lớn hơn 0 !!!")
	private int price;
}
