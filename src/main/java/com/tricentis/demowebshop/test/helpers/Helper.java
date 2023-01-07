package com.tricentis.demowebshop.test.helpers;

import co.com.sofka.test.evidence.reports.Report;
import com.github.javafaker.Faker;
import com.tricentis.demowebshop.test.models.CheckoutFormModel;
import com.tricentis.demowebshop.test.models.ContacUsFormModel;
import com.tricentis.demowebshop.test.models.RegisterUserModel;

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
	
	
	/*Metodo formulario de contacto*/
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
	
	
	/*Metodo formulario de Registro*/
	public static RegisterUserModel generateRegisterUserModel(String language, String country, String emailDomain){
		
		Faker faker =  Faker.instance(
				new Locale(language, country),
				new Random()
		);
		
		RegisterUserModel registerUserModel = new RegisterUserModel();
		
		registerUserModel.setEmail(
				faker.name()
						.username()
						.concat(emailDomain)
						.replace(SPACE_STRING, EMPTY_STRING)
		);
		
		registerUserModel.setFirstName(faker.name().firstName());
		registerUserModel.setLastName(faker.name().lastName());
		registerUserModel.setPassword(faker.number().digits(8));
		registerUserModel.setDayBirth(String.valueOf(faker.number().numberBetween(1, 28)));
		registerUserModel.setMonthBirth(String.valueOf(faker.number().numberBetween(1, 12)));
		registerUserModel.setYearBirth(String.valueOf(faker.number().numberBetween(1980, 2010)));
		
		registerUserModel.setAddress(faker.address().fullAddress());
		registerUserModel.setCity(faker.address().city());
		registerUserModel.setPostalCode(faker.address().zipCode());
		registerUserModel.setMobilePhone(
				String.valueOf(
								faker
										.number()
										.numberBetween(300000000, 399999999))
						.concat(
								String.valueOf(
										faker.number()
												.numberBetween(1, 9)
								)
						)
		);
		registerUserModel.setState(STATE_BY_DEFAULT_FLORIDA);
		
		return registerUserModel;
	}
	
	
	/*Metodo formulario de Checkout*/
	public static CheckoutFormModel generateCheckoutFormModel(String language, String country, String emailDomain){
		
		Faker faker =  Faker.instance(
				new Locale(language, country),
				new Random()
		);
		
		CheckoutFormModel checkoutFormModel = new CheckoutFormModel();
		
		checkoutFormModel.setEmail(
				faker.name()
						.username()
						.concat(emailDomain)
						.replace(SPACE_STRING, EMPTY_STRING)
		);
		
		checkoutFormModel.setFirstName(faker.name().firstName());
		checkoutFormModel.setLastName(faker.name().lastName());
		checkoutFormModel.setCountry(faker.address().country());
		checkoutFormModel.setState(faker.address().state());
		checkoutFormModel.setCity(faker.address().city());
		checkoutFormModel.setAddress(faker.address().fullAddress());
		checkoutFormModel.setPostalCode(faker.address().zipCode());
		checkoutFormModel.setPhoneNumber(
				String.valueOf(
								faker
										.number()
										.numberBetween(300000000, 399999999))
						.concat(
								String.valueOf(
										faker.number()
												.numberBetween(1, 9)
								)
						)
		);
		
		checkoutFormModel.setState(STATE_BY_DEFAULT_FLORIDA);
		
		return checkoutFormModel;
	}
	
}
