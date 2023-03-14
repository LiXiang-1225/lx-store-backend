package com.lixiang.lxstorebackend.service;

import com.lixiang.lxstorebackend.entity.UserEntity;
import com.lixiang.lxstorebackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Slf4j
@RequiredArgsConstructor

public class UserService {
    private final UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public void addUser(UserEntity user) {
//        UserEntity user = UserEntity.builder()
//                .username(username).password(password).build();
        userRepository.save(user);
    }

    public void deleteUser(Integer uid) {
        userRepository.deleteById(uid);
    }

    public void updateUserInfo(Integer uid, UserEntity user) {
        user.setUid(uid);
//        UserEntity userEntity = userRepository.findById(uid).orElseThrow();
//        if (user.getUsername() != null) {
//            userEntity.setUsername(user.getUsername());
//        }
//        if (user.getPassword() != null) {
//            userEntity.setPassword(user.getPassword());
//        }
//        if (user.getPhone() != null) {
//            userEntity.setPhone(user.getPhone());
//        }
//        if (user.getEmail() != null) {
//            userEntity.setEmail(user.getEmail());
//        }
//        if (user.getGender() != null) {
//            userEntity.setGender(user.getGender());
//        }
//        if (user.getAvatar() != null) {
//            userEntity.setAvatar(user.getAvatar());
//        }
//        userRepository.save(userEntity);
        userRepository.save(user);
    }
}
