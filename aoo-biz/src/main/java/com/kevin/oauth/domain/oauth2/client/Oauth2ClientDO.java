package com.kevin.oauth.domain.oauth2.client;

import com.kevin.oauth.dto.oauth2.client.Oauth2ClientDTO;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Kevin5_Li on 2017/9/19.
 */
@Entity
@Table(name = "oauth2_client")
public class Oauth2ClientDO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition = "INT(11) COMMENT 'id(主键)'")
    private int id;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "client_name", nullable = false, columnDefinition = "VARCHAR(32) COMMENT '客户端名称'")
    private String clientName;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "client_id", nullable = false, columnDefinition = "VARCHAR(32) COMMENT '客户端id'")
    private String clientId;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "client_secret", nullable = false, columnDefinition = "VARCHAR(32) COMMENT '客户端安全key'")
    private String clientSecret;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public Oauth2ClientDTO toDTO() {
        Oauth2ClientDTO dto = new Oauth2ClientDTO();
        BeanUtils.copyProperties(this, dto);
        return dto;
    }

    public static List<Oauth2ClientDTO> toDTOList(List<Oauth2ClientDO> doList) {
        if (null == doList || 0 >= doList.size())
            return Collections.<Oauth2ClientDTO>emptyList();
        List<Oauth2ClientDTO> list = new ArrayList<>();
        for (Oauth2ClientDO dol : doList) {
            Oauth2ClientDTO dto = dol.toDTO();
            list.add(dto);
        }
        return list;
    }
}
