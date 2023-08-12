package com.pah.propertiesconfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PropertiesConfigurationApplication {
	@Value("${khoahoc.ten}")
	String ten ;
	@Value("${khoahoc.huongdan}")
	String huongdan ;
	public static void main(String[] args) {
		SpringApplication.run(PropertiesConfigurationApplication.class, args);
	}
	@GetMapping("/")
public String info (){
	return  "Ten " +ten +" nguoi huong dan " + huongdan ;
}
}
