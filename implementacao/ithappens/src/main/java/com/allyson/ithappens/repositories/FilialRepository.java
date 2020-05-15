package com.allyson.ithappens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allyson.ithappens.domain.Filial;

@Repository
public interface FilialRepository extends JpaRepository<Filial, Integer>{//extends IBaseRepository<Filial>{

}
