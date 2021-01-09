package com.brandovidal.springbootbackend.models.services;

import com.brandovidal.springbootbackend.models.entity.Client;

import java.util.List;

public interface IClientService {

    List<Client> findAll();

    Client findById(Long id);

    Client save(Client cliente);

    void delete(Long id);
}
