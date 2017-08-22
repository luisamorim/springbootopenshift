package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemRestController {

	
	private static List<Item> itens = new ArrayList<Item>();
	
	static {
		
		itens.add(new Item(1, "lavar o carro", false));
		itens.add(new Item(2, "instalar o mongodb",false));
	}
	
	
	@RequestMapping(method=RequestMethod.GET, path="/itens")
	public List<Item> getall(){
		return itens;
	}
	
}


