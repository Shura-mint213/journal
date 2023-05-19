package database;

import database.models.TableDbModel;

import java.util.ArrayList;
import java.util.Map;

public class Database {
    private ArrayList<TableDbModel> tablesDb;

    public TableDbModel getTableDb(String tableName) {
        TableDbModel tableDb = null;
        for (var table: tablesDb) {
            if (table.getTableName() == tableName) {
                tableDb = table;
            }
        };
        return tableDb;
    }

    public <ModatDbT> void addEntry(String tableName, ModatDbT modatDb) {
        var tableDb = getTableDb(tableName);
        tableDb.addEntry(modatDb);
    }

}
