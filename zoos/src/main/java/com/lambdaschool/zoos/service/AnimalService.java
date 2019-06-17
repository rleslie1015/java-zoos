package com.lambdaschool.zoos.service;

import com.lambdaschool.zoos.model.Animal;
import com.lambdaschool.zoos.view.CountZoosInAnimals;

import java.util.ArrayList;

public interface AnimalService
{
	ArrayList<Animal> findAll();

	ArrayList<CountZoosInAnimals> getCountZoosInAnimals();
}
