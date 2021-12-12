package com.github.rdmoedas.java_cities_api.states.repositories;

import com.github.rdmoedas.java_cities_api.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
