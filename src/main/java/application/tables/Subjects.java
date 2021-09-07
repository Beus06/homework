package application.tables;

public class Subjects {
    private int subjectId;
    private String subjectName;
    private int credit;
    private int lengthHour;

    public Subjects() {
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getLengthHour() {
        return lengthHour;
    }

    public void setLengthHour(int lengthHour) {
        this.lengthHour = lengthHour;
    }
}
