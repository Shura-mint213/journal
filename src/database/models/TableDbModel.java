package database.models;

import java.util.ArrayList;

public class TableDbModel<TableT> {

    private String tableName;

    private ArrayList<TableT> dbEntry;

    public TableDbModel(String tableName) {
        this.tableName = tableName;
        this.dbEntry = new ArrayList<TableT>();
    }

    public String getTableName() {
        return tableName;
    }

    public void addEntry(TableT dbEntry) {
        this.dbEntry.add(dbEntry);
    }
}
