package unpsjb.ing.tnt.ligadeportiva.basededatos;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PartidoDAO_Impl implements PartidoDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Partido> __insertionAdapterOfPartido;

  private final SharedSQLiteStatement __preparedStmtOfBorrarTodos;

  public PartidoDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPartido = new EntityInsertionAdapter<Partido>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `tabla_partido` (`partidoId`,`equipoA_nombre`,`equipoA_marcador`,`equipoB_nombre`,`equipoB_marcador`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Partido value) {
        stmt.bindLong(1, value.getPartidoId());
        if (value.getEquipoA_nombre() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getEquipoA_nombre());
        }
        stmt.bindLong(3, value.getEquipoA_marcador());
        if (value.getEquipoB_nombre() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEquipoB_nombre());
        }
        stmt.bindLong(5, value.getEquipoB_marcador());
      }
    };
    this.__preparedStmtOfBorrarTodos = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM tabla_partido";
        return _query;
      }
    };
  }

  @Override
  public Object insertar(final Partido partido, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPartido.insert(partido);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object borrarTodos(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfBorrarTodos.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfBorrarTodos.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public LiveData<List<Partido>> getPartidos() {
    final String _sql = "SELECT * from tabla_partido ORDER BY partidoId ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"tabla_partido"}, false, new Callable<List<Partido>>() {
      @Override
      public List<Partido> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPartidoId = CursorUtil.getColumnIndexOrThrow(_cursor, "partidoId");
          final int _cursorIndexOfEquipoANombre = CursorUtil.getColumnIndexOrThrow(_cursor, "equipoA_nombre");
          final int _cursorIndexOfEquipoAMarcador = CursorUtil.getColumnIndexOrThrow(_cursor, "equipoA_marcador");
          final int _cursorIndexOfEquipoBNombre = CursorUtil.getColumnIndexOrThrow(_cursor, "equipoB_nombre");
          final int _cursorIndexOfEquipoBMarcador = CursorUtil.getColumnIndexOrThrow(_cursor, "equipoB_marcador");
          final List<Partido> _result = new ArrayList<Partido>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Partido _item;
            final int _tmpPartidoId;
            _tmpPartidoId = _cursor.getInt(_cursorIndexOfPartidoId);
            final String _tmpEquipoA_nombre;
            _tmpEquipoA_nombre = _cursor.getString(_cursorIndexOfEquipoANombre);
            final int _tmpEquipoA_marcador;
            _tmpEquipoA_marcador = _cursor.getInt(_cursorIndexOfEquipoAMarcador);
            final String _tmpEquipoB_nombre;
            _tmpEquipoB_nombre = _cursor.getString(_cursorIndexOfEquipoBNombre);
            final int _tmpEquipoB_marcador;
            _tmpEquipoB_marcador = _cursor.getInt(_cursorIndexOfEquipoBMarcador);
            _item = new Partido(_tmpPartidoId,_tmpEquipoA_nombre,_tmpEquipoA_marcador,_tmpEquipoB_nombre,_tmpEquipoB_marcador);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object cantidadDePartidos(final Continuation<? super Integer> p0) {
    final String _sql = "SELECT COUNT(partidoId) from tabla_partido";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
