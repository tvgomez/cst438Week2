package cst438.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cst438.domain.City;
import cst438.domain.CityInfo;
import cst438.domain.CityRepository;
import cst438.domain.CityWeather;
import cst438.service.CityService;
import cst438.weather.WeatherService;
import cst438.domain.TempAndTime;

@Controller
public class CityController {
	
	@Autowired
	CityRepository cityRepository;
	
	@Autowired
	CityService cityService;
	
	@GetMapping("/cities/{city}")
	public String getCityInfo(@PathVariable("city") String cityName, Model model) {
		CityInfo city = cityService.getCityInfo(cityName);
		model.addAttribute("city", city);
		return "city_show";
	}
		
	
}
