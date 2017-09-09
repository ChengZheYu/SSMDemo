package org.lanqiao.bean;

/**
 * Created by 1111 on 2017/9/2.
 */
public class Action {
    private User user;
    private String messager;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessager() {
        return messager;
    }

    public void setMessager(String messager) {
        this.messager = messager;
    }

    @Override
    public String toString() {
        return "Action{" +
                "user=" + user +
                ", messager='" + messager + '\'' +
                '}';
    }
}
