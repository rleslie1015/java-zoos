package com.lambdaschool.zoos.repository;

import com.lambdaschool.zoos.model.Telephones;
import org.springframework.data.repository.CrudRepository;

public interface PhoneRepository extends CrudRepository<Telephones, Long>
{

}
