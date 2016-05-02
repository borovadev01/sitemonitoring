package info.borova.sitemonitoring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

import org.hibernate.validator.constraints.URL;

@Entity
@Getter
@Setter
public class Check {
	@Id
	@GeneratedValue
	private int id;

	@Size(min = 1,
			message = "Name cannot be empty!")
	private String name;

	@Size(min = 1,
			message = "Url cannot be empty!")
	@URL
	private String url;
}