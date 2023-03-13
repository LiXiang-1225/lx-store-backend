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

    public void updateUserInfo(UserEntity user) {
//        UserEntity user1 = UserEntity.builder()
//                .uid(user.getUid())
//                .username(user.getUsername()).password(user.getPassword()).build();
        userRepository.save(user);
    }
}
