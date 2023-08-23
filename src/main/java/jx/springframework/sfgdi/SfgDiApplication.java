package jx.springframework.sfgdi;

import jx.springframework.sfgdi.controllers.ConstructorInjectedController;
import jx.springframework.sfgdi.controllers.I18nController;
import jx.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		ConstructorInjectedController controller = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(controller.sayHello());

		System.out.println(i18nController.sayGreeting());
	}

}
