package br.mercale.vaga.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.mercale.dominio.Setor;

@Repository
public interface SetorRepository extends CrudRepository<Setor, Long>{

}
