package com.abstracts;

import java.lang.reflect.ParameterizedType;
import java.util.Optional;
import javax.persistence.MappedSuperclass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.interfaces.IBaseRepository;

import javassist.tools.rmi.ObjectNotFoundException;
public abstract class ABaseService<T, E> {
	
	@Autowired
	public E repo;
	
	public T buscar(Integer id) throws ObjectNotFoundException {
		Optional<T> obj = ((IBaseRepository)repo).findById(id);		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id " + id + ", Tipo: " + getGenericName()));
	}
	
	
	protected String getGenericName()
    {
        Class<T> class1 = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        	
		return class1.getTypeName();
    }
}
