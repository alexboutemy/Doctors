package com.wildcodeschool.Doctors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@SpringBootApplication
public class DoctorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorsApplication.class, args);
	}

	@RequestMapping("/")
	public @ResponseBody String showRoot() {

		return "<ul>" +
				"<li><a href='/doctor/1'>/doctor/1</a></li>" +
				"<li><a href='/doctor/2'>/doctor/2</a></li>" +
				"<li><a href='/doctor/3'>/doctor/3</a></li>" +
				"<li><a href='/doctor/4'>/doctor/4</a></li>" +
				"</ul>";
	}

	@RequestMapping("/doctor/{number}")
	public @ResponseBody String showDoctorNameString(@PathVariable("number") int number) {

		switch (number) {
			case 1:
				return "William Hartnell";
			case 2:
				return "Patrick Troughton";
			case 3:
				return "Jon Pertwee";
			case 4:
				return "Tom Baker";
			default:
				return "";
		}
	}
}
