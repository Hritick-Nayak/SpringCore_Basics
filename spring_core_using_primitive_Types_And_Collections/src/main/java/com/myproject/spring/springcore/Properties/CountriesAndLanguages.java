package com.myproject.spring.springcore.Properties;

import java.util.Properties;

public class CountriesAndLanguages {

	private Properties countryAndLangs;

	public Properties getCountryAndLangs() {
		return countryAndLangs;
	}

	public void setCountryAndLangs(Properties countryAndLangs) {
		this.countryAndLangs = countryAndLangs;
	}

	public String toString() {
		return "CountriesAndLaanguages [countryAndLangs=" + countryAndLangs + "]";
	}

}
