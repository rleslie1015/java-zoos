package com.lambdaschool.zoos.repository;

import com.lambdaschool.zoos.model.Animal;
import com.lambdaschool.zoos.view.CountZoosInAnimals;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
//	SELECT animals.animalid, animals.animaltype, count (zooid) as zoocount
//	FROM zooanimals z
//	INNER JOIN animals
//	ON z.animalid = animals.animalid
//	GROUP BY z.animalid, animals.animaltype

	@Query(value = "SELECT animals.animalid, animals.animaltype, count (zooid) as zoocount\n" + "FROM zooanimals z\n" + "INNER JOIN animals \n" + "ON z.animalid = animals.animalid\n" + "GROUP BY z.animalid, animals.animaltype", nativeQuery = true)
	ArrayList<CountZoosInAnimals> getCountZoosInAnimals();
}
