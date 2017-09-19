package com.kevin.oauth.service.oauth2.client;

import com.kevin.oauth.dto.oauth2.client.Oauth2ClientDTO;
import com.kevin.oauth.dto.oauth2.client.Oauth2ClientPDTO;

import java.util.List;

/**
 * Created by Kevin5_Li on 2017/9/19.
 */
public interface Oauth2ClientService {
    public Oauth2ClientDTO createClient(Oauth2ClientPDTO client);// 创建客户端
    public Oauth2ClientDTO updateClient(Oauth2ClientPDTO client);// 更新客户端
    public void deleteClient(Integer clientId);// 删除客户端
    Oauth2ClientDTO findOne(Integer clientId);// 根据id查找客户端
    List<Oauth2ClientDTO> findAll();// 查找所有
    Oauth2ClientDTO findByClientId(String clientId);// 根据客户端id查找客户端
    Oauth2ClientDTO findByClientSecret(String clientSecret);//根据客户端安全KEY查找客户端
}
