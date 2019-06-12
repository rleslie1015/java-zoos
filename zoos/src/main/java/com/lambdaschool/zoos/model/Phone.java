package com.lambdaschool.zoos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "phone")
public class Phone
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long phoneid;

	private String phonetype;
	private String phonenumber;

	@ManyToOne
	@JoinColumn(name = "zooid")
	@JsonIgnoreProperties("phones")
	private Zoo zooid;

	public Phone()
	{
	}

	public Phone(String phonetype, String phonenumber, Zoo zooid)
	{
		this.phonetype = phonetype;
		this.phonenumber = phonenumber;
		this.zooid = zooid;
	}
}
