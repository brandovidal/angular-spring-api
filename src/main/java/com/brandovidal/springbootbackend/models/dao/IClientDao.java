package com.brandovidal.springbootbackend.models.dao;

import com.brandovidal.springbootbackend.models.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface IClientDao extends CrudRepository<Client, Long> {
}
