package com.kevin.oauth.service.oauth2.user;

import com.kevin.oauth.dto.oauth2.user.Oauth2UserDTO;
import com.kevin.oauth.dto.oauth2.user.Oauth2UserPDTO;

import java.util.List;

/**
 * Created by Kevin5_Li on 2017/9/19.
 */
public interface Oauth2UserService {
    Oauth2UserDTO createUser(Oauth2UserPDTO user);// 创建用户
    Oauth2UserDTO updateUser(Oauth2UserPDTO user);// 更新用户
    void deleteUser(Integer userId);// 删除用户
    void changePassword(Integer userId, String newPassword); //修改密码
    Oauth2UserDTO findOne(Integer userId);// 根据id查找用户
    List<Oauth2UserDTO> findAll();// 得到所有用户
    Oauth2UserDTO findByUsername(String username);// 根据用户名查找用户
}
