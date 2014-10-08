package org.fightteam.spring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * [description]
 *
 * @author faith
 * @since 0.0.1
 */
@Getter
@Setter
public class Cat {
    @JsonProperty
    private String username;
    private String password;
    private boolean accountNonExpired = true;
    private boolean accountNonLocked = true;
    private boolean credentialsNonExpired = true;
    private boolean enabled = true;
    private Date registeTime;
    @JsonProperty
    private String ip;
    private Date loginTime;
    private Date logoutTime;
    private String loginIp;
    private Date lastLogoutTime;
    private int passwordExpiredDays = -1;
    private Date passwordChangeTime;
    private boolean loginAtSameTime = false;
    private int loginAttempt = 0;
    private int status = 0;
    private String problem;
    private String solution;
}
