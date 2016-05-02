package info.borova.sitemonitoring.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import lombok.Getter;
import lombok.Setter;
import info.borova.sitemonitoring.service.HelloSpringService;

@Setter
@Getter
@ManagedBean
public class HelloController {
	@ManagedProperty("#{springBean}")
	private HelloSpringService helloSpringService;

	public String showHello() {
		return helloSpringService.sayHello();
	}

}
