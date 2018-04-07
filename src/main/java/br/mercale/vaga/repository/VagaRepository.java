package br.mercale.vaga.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.mercale.dominio.Vaga;

@Repository
public interface VagaRepository extends CrudRepository<Vaga, Long>{
	
	@Query("SELECT v FROM Vaga v WHERE v.id = :id")
    public Vaga findByPrimaryKey(@Param("id") int id);
    

}
