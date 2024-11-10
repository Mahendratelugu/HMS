package com.example.springbootdemo.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="patience")
public class Patience {
	@Id
	@JsonProperty("pid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	@Column
	@JsonProperty("pname")
	private String pname;
	@Column
	@JsonProperty("age")
	private int age;
	@Column
	@JsonProperty("doj")
	private Date doj;
	@Column
	@JsonProperty("gender")
	private String gender;
	@Column
	@JsonProperty("hi")
	private String hi;
	@Column
	@JsonProperty("amount")
	private Double amount;
	
	
	
	@ManyToOne
	@JoinColumn(name="dname")
	@JsonIgnoreProperties("patience")
	private Doctor doctor;
	

}
