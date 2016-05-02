package info.borova.sitemonitoring.controller;

import info.borova.sitemonitoring.entity.Check;
import info.borova.sitemonitoring.service.CheckService;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ManagedBean
@ViewScoped
public class CheckListController implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty("#{checkService}")
	private CheckService checkService;

	private List<Check> checks;

	private Check check = new Check();

	@PostConstruct
	public void loadChecks() {
		checks = checkService.findAll();
	}

	public void save() {
		checkService.save(check);
		check = new Check();
	}
}
