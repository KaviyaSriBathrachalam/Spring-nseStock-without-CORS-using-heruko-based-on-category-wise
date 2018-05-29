package com.kgisl.nsedata.controller;

import java.util.*;
import com.kgisl.nsedata.*;
import com.kgisl.nsedata.model.NseData;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import io.swagger.models.Model;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class NseController {

	// NseData nse=new NseData();
	//  nseDatas:Object;
	// @Autowire
	// private NseService nseService;
		//RestTemplate restTemplate ;
	//  RestTemplate <restTemplate> ;
	
	//	@RequestMapping(value="/category",method={RequestMethod.POST})
		@RequestMapping(value = "/category/{cat}", method = RequestMethod.GET)
		public  ResponseEntity<?>  showUserTable(@PathVariable String cat,UriComponentsBuilder builder){
			System.out.println("???????????????"+cat);
		RestTemplate restTemplate = new RestTemplate();
			NseData ns=new NseData();
		  String nseDatas = restTemplate.getForObject("https://www.nseindia.com/live_market/dynaContent/live_watch/stock_watch/"+cat+"StockWatch.json", String.class);  // or however I use restTemplates, havent done it yet so still fuzzy but shouldnt be too tricky.    
		  return new ResponseEntity<>(nseDatas,HttpStatus.OK);	 
		}

		@RequestMapping(value={"Data"},method={RequestMethod.GET})
		public @ResponseBody String showUserTable1(){
			System.out.println("---------------------------------");
			return null;
	
		}
}

	

