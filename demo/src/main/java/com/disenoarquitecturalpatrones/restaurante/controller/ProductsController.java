package com.disenoarquitecturalpatrones.restaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/producto")
public class ProductsController {
	@GetMapping(path = "/inicio")
	public String getMethodName() {
		return "inicioProductos";
	}
	
}
