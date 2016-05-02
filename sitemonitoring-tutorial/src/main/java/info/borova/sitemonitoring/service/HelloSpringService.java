package info.borova.sitemonitoring.service;

import org.springframework.stereotype.Service;

@Service("springBean")
public class HelloSpringService {
	public String sayHello() {
		return "hello from spring service";
	}
}