package com.pls.model.dto;

import com.pls.model.entities.User;

/**
 * Created by Administrator on 2016/7/4.
 */
public class Credential {
    private User user;
    private Boolean approved;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Boolean isApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }
}
