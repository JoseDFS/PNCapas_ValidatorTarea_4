package com.uca.capas.tareaValidator.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.tareaValidator.domain.Producto;

@Controller
public class MainController {
	
	@RequestMapping("/producto")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("producto", new Producto());
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/procesar")
	public ModelAndView procesar(@Valid @ModelAttribute Producto producto, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		if(result.hasErrors()) {
			mv.setViewName("index");
		}else {
			mv.addObject("nombreProducto", producto.getNombreProducto());
			mv.setViewName("registrado");
		}
		return mv;
	}
}
