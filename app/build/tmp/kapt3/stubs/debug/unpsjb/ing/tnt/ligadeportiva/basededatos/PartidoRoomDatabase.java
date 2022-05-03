package unpsjb.ing.tnt.ligadeportiva.basededatos;

import java.lang.System;

@androidx.room.Database(entities = {unpsjb.ing.tnt.ligadeportiva.basededatos.Partido.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lunpsjb/ing/tnt/ligadeportiva/basededatos/PartidoRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "partidoDao", "Lunpsjb/ing/tnt/ligadeportiva/basededatos/PartidoDAO;", "Companion", "app_debug"})
public abstract class PartidoRoomDatabase extends androidx.room.RoomDatabase {
    private static volatile unpsjb.ing.tnt.ligadeportiva.basededatos.PartidoRoomDatabase INSTANCIA;
    public static final unpsjb.ing.tnt.ligadeportiva.basededatos.PartidoRoomDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract unpsjb.ing.tnt.ligadeportiva.basededatos.PartidoDAO partidoDao();
    
    public PartidoRoomDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lunpsjb/ing/tnt/ligadeportiva/basededatos/PartidoRoomDatabase$Companion;", "", "()V", "INSTANCIA", "Lunpsjb/ing/tnt/ligadeportiva/basededatos/PartidoRoomDatabase;", "obtenerDatabase", "context", "Landroid/content/Context;", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "PartidoDatabaseCallback", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final unpsjb.ing.tnt.ligadeportiva.basededatos.PartidoRoomDatabase obtenerDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope viewModelScope) {
            return null;
        }
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lunpsjb/ing/tnt/ligadeportiva/basededatos/PartidoRoomDatabase$Companion$PartidoDatabaseCallback;", "Landroidx/room/RoomDatabase$Callback;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "cargarBaseDeDatos", "", "partidoDAO", "Lunpsjb/ing/tnt/ligadeportiva/basededatos/PartidoDAO;", "(Lunpsjb/ing/tnt/ligadeportiva/basededatos/PartidoDAO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onOpen", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "app_debug"})
        static final class PartidoDatabaseCallback extends androidx.room.RoomDatabase.Callback {
            private final kotlinx.coroutines.CoroutineScope scope = null;
            
            /**
             * Lo que hacemos en esta clase es sobreescribir el método onOpen
             * para cargar la base de datos.
             */
            @java.lang.Override()
            public void onOpen(@org.jetbrains.annotations.NotNull()
            androidx.sqlite.db.SupportSQLiteDatabase db) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object cargarBaseDeDatos(@org.jetbrains.annotations.NotNull()
            unpsjb.ing.tnt.ligadeportiva.basededatos.PartidoDAO partidoDAO, @org.jetbrains.annotations.NotNull()
            kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
                return null;
            }
            
            public PartidoDatabaseCallback(@org.jetbrains.annotations.NotNull()
            kotlinx.coroutines.CoroutineScope scope) {
                super();
            }
        }
    }
}