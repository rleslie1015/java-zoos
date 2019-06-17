package com.lambdaschool.zoos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "zoos")
public class Zoo
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long zooid;

	private String zooname;

	@OneToMany(mappedBy = "zoo")
	@JsonIgnoreProperties("zoo")
	private List<Telephones> telephones = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "zooanimals",
			joinColumns = {@JoinColumn(name = "zooid")},
			inverseJoinColumns = {@JoinColumn(name = "animalid")})
	@JsonIgnoreProperties("zoo")
	private List<Animal> animals = new ArrayList<>();

	public Zoo()
	{
	}

	public Zoo(String zooname)
	{
		this.zooname = zooname;
	}

	public long getZooid()
	{
		return zooid;
	}

	public void setZooid(long zooid)
	{
		this.zooid = zooid;
	}

	public String getZooname()
	{
		return zooname;
	}

	public void setZooname(String zooname)
	{
		this.zooname = zooname;
	}

	public List<Telephones> getTelephones()
	{
		return telephones;
	}

	public void setTelephones(List<Telephones> telephones)
	{
		this.telephones = telephones;
	}

	public List<Animal> getAnimals()
	{
		return animals;
	}

	public void setAnimals(List<Animal> animals)
	{
		this.animals = animals;
	}
}
