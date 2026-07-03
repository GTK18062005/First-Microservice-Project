package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {
@GetMapping("/addr")
public static String address()
{
	return " my address ";
}
}
