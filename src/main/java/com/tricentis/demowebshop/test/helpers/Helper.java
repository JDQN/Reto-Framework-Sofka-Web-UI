package com.tricentis.demowebshop.test.helpers;

import co.com.sofka.test.evidence.reports.Report;
import com.github.javafaker.Faker;
import com.tricentis.demowebshop.test.models.ContacUsFormModel;

import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;

import static com.tricentis.demowebshop.test.helpers.Dictionary.*;

public class Helper {
	
	private Helper() {
	}
	
	public static String getProperty(String property) {
		Properties properties = new Properties();
		try (FileReader fileReader = new FileReader(CONFIGURATION_PROPERTIES_FILE)) {
			properties.load(fileReader);
		} catch (IOException e) {
			Report.reportFailure("Fallo al consultar una propiedad del archivo "
					                     + CONFIGURATION_PROPERTIES_FILE, e);
		}
		
		return properties.getProperty(property);
	}
	
	public static ContacUsFormModel generateCustomer(String language, String country, String emailDomain) {
		
		Faker faker = Faker.instance(
				new Locale(language, country),
				new Random()
		);
		
		ContacUsFormModel contacUsFormModel = new ContacUsFormModel();
		
		contacUsFormModel.setFirstName(faker.name().firstName());
		contacUsFormModel.setEmail(
				faker.name()
						.username()
						.concat(emailDomain)
						.replace(SPACE_STRING, EMPTY_STRING)
		);
		contacUsFormModel.setEnquiry(faker.lorem().sentence());
		
		return contacUsFormModel;
	}
}
