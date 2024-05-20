package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController // indica q é uma controller. Faça o import ctrl+espaço em cima do erro
@RequestMapping ("/ola-mundo") // indica qual o endereço a ser acessado no navegador para cair na controladora
public class HelloworldController {	
	
	@GetMapping // defnição de verbo http que vai atender ao método. tal como a request mapping está atendendo ao public. sempre colocar em cima do metodo
	public String ola( ) { // definir se e pub ou priv, tipo de dado e nome
		return "Olá mundo! Bom dia!";  // definir a ação do metodo		
	}
	 
	@GetMapping ("comidas") //Getmapping retorna uma visualizaçãosó o metodo sem o verbo e o endereço não roda no insomnia. P usar dois iguais,utiliza-se um complemento no endereço nesse caso ("comidas")
	public String comidasFavoritas () {
		return "sushi \nHamburguer"; // o metódo comidas (endpoint) vai estar dentro do ola mundo. Sempre colocar no insomnia olamundo/o metodo q quer visualizar
	}
	
	@GetMapping ("bsms")
	public String BSMS () {
		return "Competências Comportamentais: "
				+ "\n Comunicação"
				+ "\nProatividade"
				+ "\nOrientação ao detalhe"
				+ "\nTrabalho em equipe"
				+ "\n    "
				+"\nMentalidades:"
				+ "\nResponsabilidade pessoal"
				+ "\\nMentalidade de crescimento"
				+ "\\nOrientação ao futuro"
				+ "\\nPersistência";
	}
	@GetMapping ("objetivos")
	public String objetivosAprendizagem () {
		return "Aperfeiçoar as habilidades de gestão do tempo e proatividade";
	}
}
