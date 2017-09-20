package com.kevin.oauth.service.impl.oauth2.user;

import com.kevin.oauth.dao.oauth2.user.Oauth2UserDAO;
import com.kevin.oauth.domain.oauth2.user.Oauth2UserDO;
import com.kevin.oauth.dto.oauth2.user.Oauth2UserDTO;
import com.kevin.oauth.dto.oauth2.user.Oauth2UserPDTO;
import com.kevin.oauth.service.oauth2.user.Oauth2UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Kevin5_Li on 2017/9/19.
 */
@Service
@Transactional
public class Oauth2UserServiceImpl implements Oauth2UserService {

    @Autowired
    Oauth2UserDAO userDAO;

    @Override
    public Oauth2UserDTO createUser(Oauth2UserPDTO user) {
        Oauth2UserDO dol = new Oauth2UserDO();
        dol.setUsername(user.getUsername());
        dol.setPassword(user.getPassword());
        dol.setSalt(user.getSalt());
        dol = userDAO.save(dol);
        return dol != null ? dol.toDTO() : null;
    }

    @Override
    public Oauth2UserDTO updateUser(Oauth2UserPDTO user) {
        return null;
    }

    @Override
    public void deleteUser(Integer userId) {

    }

    @Override
    public void changePassword(Integer userId, String newPassword) {

    }

    @Override
    public Oauth2UserDTO findOne(Integer userId) {
        Oauth2UserDO userDO = userDAO.findOne(userId);
        return userDO != null ? userDO.toDTO() : null;
    }

    @Override
    public List<Oauth2UserDTO> findAll() {
        return Oauth2UserDO.toDTOList(userDAO.findAll());
    }

    @Override
    public Oauth2UserDTO findByUsername(String username) {
        Oauth2UserDO userDO = userDAO.findByUsername(username);
        return userDO != null ? userDO.toDTO() : null;
    }
}
