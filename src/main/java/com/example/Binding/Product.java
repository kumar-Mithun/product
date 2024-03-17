package com.example.Binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@XmlRootElement
public class Product
{
	private Integer pid;
	private String pname;
	private Double price;
}
