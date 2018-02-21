package com.example.tp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;

@SpringBootApplication
public class Formation {
	@Id
	private Integer id;
	private String name;
	private Integer nbrMax;

	public Formation() {
	}

	public Formation(Integer id,String name,Integer nbrMax){
		this.id=id;this.name=name;this.nbrMax=nbrMax;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNbrMax() {
		return nbrMax;
	}

	public void setNbrMax(Integer nbrMax) {
		this.nbrMax = nbrMax;
	}

	public static void main(String[] args) {
		SpringApplication.run(Formation.class, args);
	}
}
