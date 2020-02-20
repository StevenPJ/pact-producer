package com.stevenpj.pactproducer;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class UserService {

    public User findUser(String userId) {
        return User.builder()
            .id(userId)
            .name("something")
            .legacyId(UUID.randomUUID().toString())
            .role(UserRole.ADMIN)
            .lastLogin(new Date())
            .friend(Friend.builder().id("2").name("Ronald Smith").build())
            .friend(Friend.builder().id("3").name("Matt Spencer").build())
            .build();
    }
}
