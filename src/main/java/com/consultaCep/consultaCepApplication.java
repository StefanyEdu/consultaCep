package com.consultaCep;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class consultaCepApplication {
	
	//private static final Logger log = LoggerFactory.getLogger(AccessingDataJPAApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(consultaCepApplication.class);
	}
	@Bean
	public CommandLineRunner com(CepRepository repository) {
		return(args)->{
			// save information 
			repository.save(new ConsultaCep("90250554" ,"Paulo Renato Ketzer de Souza ","Porto Alegre", "Rio Grande do Sul "));
			repository.save(new ConsultaCep("90620001","Princesa Isabel","Porto Alegre","Rio Grande do sul"));
			repository.save(new ConsultaCep("94853310","Manoel Bernardes","Alvorada","Rio Grande do Sul"));
			
			/*
			log.info("Customers found with findAll():");
		      log.info("-------------------------------");
		      for (ConsultaCep consulta : repository.findAll()) {
		        log.info(consulta.toString());
		      }
		      log.info("");
			// id
		      ConsultaCep consulta  = repository.findById(1L);
		      log.info("Consulta CEP found with findById(1L):");
		      log.info("--------------------------------");
		      log.info(consulta.toString());
		      log.info("");
		      
		      // cep
		      log.info("Consulta CEP found with findByCep(''):");
		      log.info("--------------------------------------------");
		      repository.findByCep("90250554").forEach(cep-> {
		      log.info(cep.toString());
		      });
		      log.info("");
		      
		      //rua
		      
		      log.info("Consulta CEP with findByRua(''):");
		      log.info("--------------------------------------------");
		      repository.findByRua("Paulo Renato Ketzer de Souza ").forEach(rua-> {
		      log.info(rua.toString());
		      });
		      log.info("");
		      
		      // cidade
		      log.info("Consulta CEP with findByCidade(''):");
		      log.info("--------------------------------------------");
		      repository.findByCidade("Porto Alegre").forEach(cidade-> {
		      log.info(cidade.toString());
		    });
		     
		      log.info("");
		      
		      // estado 
		      log.info("Consulta CEP with findByEstado(''):");
		      log.info("--------------------------------------------");
		      repository.findByEstado("Rio Grande do Sul ").forEach(estado-> {
		      log.info(estado.toString());
		      });
		      log.info("");
*/
		      
			
		};
		
	}
}
	
	


