package com.brandovidal.springbootbackend.models.services;

import com.brandovidal.springbootbackend.models.dao.IClientDao;
import com.brandovidal.springbootbackend.models.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IClientServiceImpl implements IClientService {
    @Autowired
    private IClientDao clienteDao;

    @Transactional(readOnly = true)
    public List<Client> findAll() {
        return (List<Client>) clienteDao.findAll();
    }
}
