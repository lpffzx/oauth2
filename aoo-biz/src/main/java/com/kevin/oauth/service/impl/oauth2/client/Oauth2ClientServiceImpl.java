package com.kevin.oauth.service.impl.oauth2.client;

import com.kevin.oauth.dao.oauth2.client.Oauth2ClientDAO;
import com.kevin.oauth.domain.oauth2.client.Oauth2ClientDO;
import com.kevin.oauth.dto.oauth2.client.Oauth2ClientDTO;
import com.kevin.oauth.dto.oauth2.client.Oauth2ClientPDTO;
import com.kevin.oauth.service.oauth2.client.Oauth2ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Kevin5_Li on 2017/9/19.
 */
@Service
@Transactional
public class Oauth2ClientServiceImpl implements Oauth2ClientService {

    @Autowired
    Oauth2ClientDAO clientDAO;

    @Override
    public Oauth2ClientDTO createClient(Oauth2ClientPDTO client) {
        return null;
    }

    @Override
    public Oauth2ClientDTO updateClient(Oauth2ClientPDTO client) {
        return null;
    }

    @Override
    public void deleteClient(Integer clientId) {

    }

    @Override
    public Oauth2ClientDTO findOne(Integer clientId) {
        Oauth2ClientDO clientDO = clientDAO.getById(clientId);
        return clientDO != null ? clientDO.toDTO() : null;
    }

    @Override
    public List<Oauth2ClientDTO> findAll() {
        return Oauth2ClientDO.toDTOList(clientDAO.list());
    }

    @Override
    public Oauth2ClientDTO findByClientId(String clientId) {
        Oauth2ClientDO clientDO = clientDAO.findByClientId(clientId);
        return clientDO != null ? clientDO.toDTO() : null;
    }

    @Override
    public Oauth2ClientDTO findByClientSecret(String clientSecret) {
        Oauth2ClientDO clientDO = clientDAO.findByClientSecret(clientSecret);
        return clientDO != null ? clientDO.toDTO() : null;
    }
}
