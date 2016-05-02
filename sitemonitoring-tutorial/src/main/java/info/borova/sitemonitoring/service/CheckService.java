package info.borova.sitemonitoring.service;

import info.borova.sitemonitoring.entity.Check;
import info.borova.sitemonitoring.repository.CheckRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckService {
	@Autowired
	private CheckRepository checkRepository;

	public List<Check> findAll() {
		return checkRepository.findAll();
	}

	public void save(Check check) {
		checkRepository.save(check);
	}
}
