package br.org.estacaoluz.epctg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.estacaoluz.epctg.bean.Discipline;

public interface DisciplineRepository extends JpaRepository<Discipline, Long> { }
