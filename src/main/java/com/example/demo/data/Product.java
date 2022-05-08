package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@RequiredArgsConstructor
@Getter
@Setter
@Entity
public class Product {
	@Id
	@NotBlank(message = "Code không để trống !!!")
	private String code;
	@NotBlank(message = "Description không để trống !!!")
	private String description;
	@Min(value = 1, message = "Nhập Price lớn hơn 0 !!!")
	private int price;
}
