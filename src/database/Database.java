package database;

import database.models.TableDbModel;

import java.util.ArrayList;
import java.util.Map;

/** Class for storing database objects (tables) */
public class Database {
    private ArrayList<TableDbModel> tablesDb;

    /** Get table by name */
    public TableDbModel getTableDb(String tableName) {
        TableDbModel tableDb = null;
        for (var table: tablesDb) {
            if (table.getTableName() == tableName) {
                tableDb = table;
            }
        };
        return tableDb;
    }

    /** Add an entry to a database "table" */
    public <ModatDbT> void addEntry(String tableName, ModatDbT modatDb) {
        var tableDb = getTableDb(tableName);
        tableDb.addEntry(modatDb);
    }

}
