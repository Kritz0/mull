package com.Kritz0.test1.repository;


import com.Kritz0.test1.pkg.Rechnung;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RechnungRepo extends CrudRepository<Rechnung, Long> {
}
