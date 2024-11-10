package com.example.springbootdemo.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Doctor {
	@Id
	@JsonProperty("dname")
	private String dname;
	@Column
	@JsonProperty("Did")
	private int Did;
	@Column
	@JsonProperty("gender")
	private String gender;
	@Column
	@JsonProperty("specialist")
	private String specialist;
	@Column
	@JsonProperty("dov")
	private Date dov;
	@Column
	@JsonProperty("medicine")
	private String medicine;
	
	
	@OneToMany(mappedBy="doctor",cascade=CascadeType.ALL)
	@JsonIgnoreProperties("doctor")
	private List<Patience> patience; 

}
