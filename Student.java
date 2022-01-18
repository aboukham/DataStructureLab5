package lab5.DataStructureLab5;

import java.util.Collections;
import java.util.Comparator;

public class Student implements  Comparable {
    private int     sId;
    private String  sName;
    private int     score;

    public Student(int sId, String sName, int score) {
        this.sId = sId;
        this.sName = sName;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", score=" + score +
                '}';
    }

    public Comparator getSortByName() {
        return sortByName;
    }

    private Comparator sortByName = new Comparator(){

        @Override
        public int compare(Object o1, Object o2) {
            return ((Student) o1).sName.compareTo(((Student) o2).sName);
        }
    };

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Student))
            return false;
        Student s = (Student) obj;
        return (sId == s.sId && sName.equals(s.sName) && score == s.score);
    }

    @Override
    public int compareTo(Object o) {
        if (this.score - ((Student) o).score > 0)
            return 1;
        else if (this.score - ((Student) o).score < 0)
            return -1;
        else
            return 0;
    }
}
