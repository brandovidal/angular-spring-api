package com.brandovidal.springbootbackend.models.services;

import com.brandovidal.springbootbackend.models.entity.Client;

import java.util.List;

public interface IClientService {

    List<Client> findAll();
}
