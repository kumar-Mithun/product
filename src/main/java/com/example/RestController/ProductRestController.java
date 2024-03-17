package com.example.RestController;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Binding.Product;

@RestController
public class ProductRestController
{
	@GetMapping(value="/product",
			produces={"application/xml","application/json"})
	public ResponseEntity<Product> getProduct()
	{
		Product productObj = new Product();
		productObj.setPid(101);
		productObj.setPname("mobile");
		productObj.setPrice(25000.00);
		
		return new ResponseEntity<Product>(productObj,HttpStatus.OK);
	}
	@GetMapping(value="/products",
			produces={"application/xml","application/json"})
	public ResponseEntity<List<Product>> getProducts()
	{
		Product p1 = new Product(101,"moniter",8000.00);
		Product p2 = new Product(102,"keyboard",550.00);
		Product p3 = new Product(103,"Mouse",2000.00);
		
		List<Product> products = Arrays.asList(p1,p2,p3);
		
		return new ResponseEntity<>(products,HttpStatus.OK);
	}
}
