package com.allyson.ithappens.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allyson.ithappens.domain.Estoque;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Integer>{//

}
