package application.database;

public enum TableName {
    COURSES(4),
    MEMBERS(6),
    SUBJECTS(4),
    MEMBERS_COURSES(0),
    SUBJECT_COURSES(2);

    public final int COLUMN_NUM;

    TableName(int colNum) {
        COLUMN_NUM = colNum;
    }
}
