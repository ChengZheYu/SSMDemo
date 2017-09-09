package org.lanqiao.bean;

/**
 * Created by 1111 on 2017/9/4.
 */
public class Teach {
    private int teachId;
    private String teachName;

    public int getTeachId() {
        return teachId;
    }

    public void setTeachId(int teachId) {
        this.teachId = teachId;
    }

    public String getTeachName() {
        return teachName;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName;
    }

    @Override
    public String toString() {
        return "teach{" +
                "teachId=" + teachId +
                ", teachName='" + teachName + '\'' +
                '}';
    }
}
