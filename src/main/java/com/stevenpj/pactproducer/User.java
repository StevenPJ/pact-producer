package com.stevenpj.pactproducer;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class User {

    private String id;
    private String legacyId;
    private String name;
    private UserRole role;
    private Date lastLogin;
    @Singular
    private List<Friend> friends;


}
