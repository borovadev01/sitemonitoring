package info.borova.sitemonitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import info.borova.sitemonitoring.entity.Check;

public interface CheckRepository extends JpaRepository<Check, Integer>{

}
