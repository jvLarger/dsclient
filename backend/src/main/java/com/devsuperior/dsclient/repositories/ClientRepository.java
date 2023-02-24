package com.devsuperior.dsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsclient.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
