package com.allyson.ithappens.abstratos;

import java.lang.reflect.ParameterizedType;
import java.util.Optional;

import javax.persistence.MappedSuperclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.allyson.ithappens.exceptions.ObjectNotFoundException;


//Objeto T - é o tipo de objeto que iremos retornar e/ou manipuar nas buscas
//Objeto E - seria o tipo de repositório que será utilizado pela classe do tipo T
//aqui ficarão encapsulados todos os métodos que as classes de serviço utilizará 
//e que são de igual implementação.

@MappedSuperclass
@Service
public abstract class ABaseService<T, E> {
	
	//Repositorio autoinstanciado
	@Autowired
	public E repo;
	
	//Método buscar genérico
	//todas as classes que herdarem de ABAseService terão o método de 
	//Buscar por ID implementado
	public T buscar(Integer id) {
		Optional<T> obj = ((JpaRepository)repo).findById(id);		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id " + id + ", Tipo: " + getGenericName()));
	}
	
	protected String getGenericName()
    {
        Class<T> class1 = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];        	
        
		return class1.getSimpleName();
    }
}
