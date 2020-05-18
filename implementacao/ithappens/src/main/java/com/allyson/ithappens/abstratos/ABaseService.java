package com.allyson.ithappens.abstratos;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.persistence.MappedSuperclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.allyson.ithappens.exceptions.ObjectNotFoundException;


//Objeto T - é o tipo de objeto que iremos retornar e/ou manipuar nas buscas. São as Entidades de Domínio
//Objeto E - seria o tipo de repositório que será utilizado pela classe do tipo T. Os Controllers ou Repositories
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

	//método genérico que busca todos os dados do objeto	
	public List buscarTodos(){
	  return ((JpaRepository)repo).findAll();
	}
	
 
	//metodo genérico que deleta um objeto
    void deletar(@PathVariable Integer id) {
    	((JpaRepository)repo).deleteById(id);
    }

	// Atuaizar
	public void Atualizar(T obj) {		
		((JpaRepository)repo).save(obj);
	}
	
	public T Salvar(T obj) {
		ABase base = ((ABase<T>)obj);
		
		if (base.getId() != null) {
			Optional<T> a = ((JpaRepository)repo).findById(base.getId());	

			if (a != null) {				
				return (T)((JpaRepository)repo).save(obj);
			}
		}
		return (T)((JpaRepository)repo).save(obj);
	}

	public List<T> Salvar(List<T> objs) {
		List<T> lista = new ArrayList<T>();
		
		objs.forEach(obj -> {
			ABase base = ((ABase<T>)obj);
			
			if (base.getId() != null) {
				Optional<T> a = ((JpaRepository)repo).findById(base.getId());	
	
				if (a != null) {
					lista.add(obj);
				}
			}
		});
		if (lista.size() > 0)
			return (List<T>)((JpaRepository)repo).saveAll(Arrays.asList(lista));
		
		return (List<T>)((JpaRepository)repo).saveAll(Arrays.asList(objs));
	}
	
	//método que retorna o nome da classe
	protected String getGenericName()
    {
        Class<T> class1 = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];        	        
		return class1.getSimpleName();
    }
}
