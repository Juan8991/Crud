package com.crud.repositories;

import com.crud.models.Detail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends CrudRepository<Detail,Long> {
}
