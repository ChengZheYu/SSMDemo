package org.lanqiao.bean;

/**
 * Created by 1111 on 2017/9/4.
 */
public class Student {
    private int studId;
    private String studName;
    private Classs classs;

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public Classs getClasss() {
        return classs;
    }

    public void setClasss(Classs classs) {
        this.classs = classs;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", studName='" + studName + '\'' +
                ", classs=" + classs +
                '}';
    }
}
