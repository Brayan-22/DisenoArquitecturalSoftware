package com.disenoarquitecturalpatrones.restaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.disenoarquitecturalpatrones.restaurante.models.Cliente;

import jakarta.validation.Valid;


@Controller
@RequestMapping(path = "/inicio")
public class IndexController {

	@GetMapping(path = "/index")
	public String inicio() {
		return "index";
	}
	
}
