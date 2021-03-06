package com.pl10.califi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pl10.califi.model.NotaModel;
import com.pl10.califi.service.NotaService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	@Qualifier("notaService")
	NotaService notaService;

	@GetMapping("")
	public ModelAndView requestHome(){
		ModelAndView model = new ModelAndView("index");
		List<NotaModel> notaModels = notaService.listAllNotaModels();
		model.addObject("notas", notaModels);
		return model;
	}
}
