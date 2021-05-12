package cst438.domain;

import cst438.weather.WeatherService;

public class TempAndTime {
	
	private double temp;
	private String condition;
	private int timezone;
	
	
	public TempAndTime() {
		
	}
	
	public TempAndTime( double temp, String condition,int timezone) {
		this.temp = temp;
		this.condition = condition;
		this.timezone = timezone;
		
	}

	public double getTemp() {
		return (temp - 273.15)*9.0/5.0 + 32;
	}
	
	public void setTemp(double temp) {
		this.temp = temp;
	}

	public String getCondition() {
		return condition;
	}
	
	public void setCondition(String condition) {
		this.condition=condition;
	}
	

	public int getTimezone() {
		return timezone;
	}

	public void setTimezone(int timezone) {
		this.timezone = timezone;
	}
	@Override
	public String toString() {
		return "TimeAndTemp [temp=" + temp + ", condition=" + condition + ", timezone=" + timezone + "]";
	}

	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TempAndTime other = (TempAndTime) obj;
		if (condition == null) {
			if (other.condition != null)
				return false;
		} else if (!condition.equals(other.condition))
			return false;
		if (Double.doubleToLongBits(temp) != Double.doubleToLongBits(other.temp))
			return false;
		return true;
	}

	

	


}