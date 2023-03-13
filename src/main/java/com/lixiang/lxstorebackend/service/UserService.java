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

    public void addUser(String username, String password) {
        UserEntity user = UserEntity.builder()
                .username(username).password(password).build();
        userRepository.save(user);
    }
}
