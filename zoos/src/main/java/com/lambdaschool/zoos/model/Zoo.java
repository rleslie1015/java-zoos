package com.lambdaschool.zoos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "zoo")
public class Zoo
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long zooid;

	private String zooname;

	@OneToMany(mappedBy = "zoo")
	@JsonIgnoreProperties("zoos")
	private List<Phone> phones = new ArrayList<>();

	public Zoo()
	{
	}

	public Zoo(String zooname)
	{
		this.zooname = zooname;
	}
}
