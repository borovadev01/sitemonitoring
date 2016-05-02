package info.borova.sitemonitoring.controller;

import info.borova.sitemonitoring.entity.Check;
import info.borova.sitemonitoring.service.CheckService;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ManagedBean
public class CheckListController {

	@ManagedProperty("#{checkService}")
	private CheckService checkService;

	private List<Check> checks;

	@PostConstruct
	public void loadChecks() {
		checks = checkService.findAll();
	}
}
