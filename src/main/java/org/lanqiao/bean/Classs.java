package org.lanqiao.bean;

import java.util.List;

/**
 * Created by 1111 on 2017/9/4.
 */
public class Classs {
    private int classId;
    private String className;
    private Teach teach;
    private List<Student> students;
    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teach getTeach() {
        return teach;
    }

    public void setTeach(Teach teach) {
        this.teach = teach;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classs{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", teach=" + teach +
                ", students=" + students +
                '}';
    }
}
