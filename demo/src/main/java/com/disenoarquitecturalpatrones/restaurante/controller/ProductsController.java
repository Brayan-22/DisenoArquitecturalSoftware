package com.disenoarquitecturalpatrones.restaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/products")
public class ProductsController {
	@GetMapping(path = "/")
	public String getMethodName() {
		return "inicioProductos";
	}
	
}
