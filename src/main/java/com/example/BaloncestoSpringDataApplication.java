package com.example;

import com.example.service.EquipoService;
import com.example.service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BaloncestoSpringDataApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(BaloncestoSpringDataApplication.class, args);

		EquipoService equipoService = context.getBean(EquipoService.class);
		JugadorService jugadorService = context.getBean(JugadorService.class);

		equipoService.alta_cinc_equips();
		jugadorService.dar_alta_5_jugadores();
	}
}
