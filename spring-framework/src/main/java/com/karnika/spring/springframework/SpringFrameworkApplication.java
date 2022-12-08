package com.karnika.spring.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.karnika.spring.springframework.enterprise.example.web.MyWebController;
import com.karnika.spring.springframework.game.GameRunner;

@SpringBootApplication
//@ComponentScan("com.karnika.spring.springframework")
//@ComponentScan({"com.package1","com.package2"})
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		
		//MarioGame game=new MarioGame();
		//SuperContraGame game=new SuperContraGame();
	    //PacmanGame game=new PacmanGame();
	    
		//GamingConsole game=new MarioGame();
		//GameRunner runner=new GameRunner(game);
	    
		ConfigurableApplicationContext context = SpringApplication.run(SpringFrameworkApplication.class, args);
	    
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		MyWebController controller = context.getBean(MyWebController.class);
	    System.out.println(controller.returnValueFromBusinessService());
	
	}

}
