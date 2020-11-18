package com.Kritz0.test1.repository;


import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KundeRepo extends CrudRepository<AbstractReadWriteAccess.Item, Long> {
}
