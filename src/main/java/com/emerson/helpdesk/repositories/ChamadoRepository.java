package com.emerson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emerson.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
