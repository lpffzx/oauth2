package com.kevin.oauth.domain.oauth2.user;

import com.kevin.oauth.dto.oauth2.user.Oauth2UserDTO;
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
@Table(name = "oauth2_user")
public class Oauth2UserDO implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition = "INT(11) COMMENT 'id(主键)'")
    private int id;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "username", nullable = false, columnDefinition = "VARCHAR(32) COMMENT '用户名'")
    private String username;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "password", nullable = false, columnDefinition = "VARCHAR(32) COMMENT '密码'")
    private String password;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "salt", nullable = false, columnDefinition = "VARCHAR(64) COMMENT '内容'")
    private String salt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Oauth2UserDTO toDTO() {
        Oauth2UserDTO dto = new Oauth2UserDTO();
        BeanUtils.copyProperties(this, dto);
        return dto;
    }

    public static List<Oauth2UserDTO> toDTOList(List<Oauth2UserDO> doList) {
        if (null == doList || 0 >= doList.size())
            return Collections.<Oauth2UserDTO>emptyList();
        List<Oauth2UserDTO> list = new ArrayList<>();
        for (Oauth2UserDO dol : doList) {
            Oauth2UserDTO dto = dol.toDTO();
            list.add(dto);
        }
        return list;
    }
}
