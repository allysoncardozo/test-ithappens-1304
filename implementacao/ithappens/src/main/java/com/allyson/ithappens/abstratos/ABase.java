package com.allyson.ithappens.abstratos;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

//Classe abstrata que que será usada de Herança nas classes de domínio
//todas as classes que herdarem dela terão automaticamente implementados o serializable
//terão a propriedade Id como chave primária

//@MappedSuperclass resolve a questão d ter o ID como chave primaria na classe filha
@MappedSuperclass
public abstract class ABase<T> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;

	public Integer getId() { return Id; }

	public void setId(Integer id) { Id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ABase other = (ABase) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	
}