package application.database;

import application.helpers.EmunHelper;

public class QueryBuilder {

    private StringBuilder query;

    public QueryBuilder() {
        query = new StringBuilder();
    }

    // SELECT

    public QueryBuilder select(TableName tableName, ColumnName...columnNames) {
        query.append("SELECT");
        if (columnNames.length > 0) {
            addColumns(columnNames);
        } else {
            query.append("*");
        }
        query.append("FROM ")
                .append(EmunHelper.getDBName(tableName, false));
        return this;
    }
    public String build () {
        query.append(";");
        return query.toString();
    }

    private void addColumns (ColumnName... columnNames) {
        for (ColumnName columnName: columnNames) {
            query.append(EmunHelper.getDBName(columnName, false))
            .append(",");
        }
        query.setLength(query.length()-2);
    }

    // WHERE


}
