package cst438.service;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import cst438.domain.City;
import cst438.domain.CityInfo;
import cst438.domain.CityRepository;
import cst438.domain.TempAndTime;
import cst438.weather.WeatherService;
import cst438.domain.CityWeather;
import java.math.*;

@Service
public abstract class CityService {

		@Autowired
		private CityRepository cityRepository;
		
		@Autowired
		private TempAndTime weatherService;
		
		@Autowired
		private WeatherService serviceWeather;
		
	
	
		public CityInfo getCityInfo(String cityName) {
			List<City> cities = cityRepository.findByName(cityName);
			City city = cities.get(0);
			CityWeather cityWeather = serviceWeather.getWeather(cityName);
			double tempFtoC;
			cityWeather.setTemp(tempFtoC);
			
			return new CityInfo(city.getID(),
						city.getName(), 
						city.getPopulation(),
						String.valueOf(city.getTempAndTime().getTemp()) + "F"
						city.getCountry().getCode(),
						city.getCountry().getName(),
						city.getDistrict());
			
		}



		



	


}