package unpsjb.ing.tnt.ligadeportiva.basededatos;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PartidoRoomDatabase_Impl extends PartidoRoomDatabase {
  private volatile PartidoDAO _partidoDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tabla_partido` (`partidoId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `equipoA_nombre` TEXT NOT NULL, `equipoA_marcador` INTEGER NOT NULL, `equipoB_nombre` TEXT NOT NULL, `equipoB_marcador` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '84e71872b9e2bd28b5c1f13d83148743')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `tabla_partido`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTablaPartido = new HashMap<String, TableInfo.Column>(5);
        _columnsTablaPartido.put("partidoId", new TableInfo.Column("partidoId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTablaPartido.put("equipoA_nombre", new TableInfo.Column("equipoA_nombre", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTablaPartido.put("equipoA_marcador", new TableInfo.Column("equipoA_marcador", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTablaPartido.put("equipoB_nombre", new TableInfo.Column("equipoB_nombre", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTablaPartido.put("equipoB_marcador", new TableInfo.Column("equipoB_marcador", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTablaPartido = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTablaPartido = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTablaPartido = new TableInfo("tabla_partido", _columnsTablaPartido, _foreignKeysTablaPartido, _indicesTablaPartido);
        final TableInfo _existingTablaPartido = TableInfo.read(_db, "tabla_partido");
        if (! _infoTablaPartido.equals(_existingTablaPartido)) {
          return new RoomOpenHelper.ValidationResult(false, "tabla_partido(unpsjb.ing.tnt.ligadeportiva.basededatos.Partido).\n"
                  + " Expected:\n" + _infoTablaPartido + "\n"
                  + " Found:\n" + _existingTablaPartido);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "84e71872b9e2bd28b5c1f13d83148743", "371f9db4eeb28b5e523f384e8a6ffe1a");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "tabla_partido");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `tabla_partido`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public PartidoDAO partidoDao() {
    if (_partidoDAO != null) {
      return _partidoDAO;
    } else {
      synchronized(this) {
        if(_partidoDAO == null) {
          _partidoDAO = new PartidoDAO_Impl(this);
        }
        return _partidoDAO;
      }
    }
  }
}
