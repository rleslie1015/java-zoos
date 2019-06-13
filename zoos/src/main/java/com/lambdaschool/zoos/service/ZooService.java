package com.lambdaschool.zoos.service;

import com.lambdaschool.zoos.model.Zoo;

import java.util.ArrayList;

public interface ZooService
{
//	Zoo save(Zoo zoo);

	ArrayList<Zoo> findAll();

//	ArrayList<CountAnimalsInZoos> getCountAnimalsInZoos();

	void delete(long id);
}
