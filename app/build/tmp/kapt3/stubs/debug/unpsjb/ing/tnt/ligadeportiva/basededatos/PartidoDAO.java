package unpsjb.ing.tnt.ligadeportiva.basededatos;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\'J\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lunpsjb/ing/tnt/ligadeportiva/basededatos/PartidoDAO;", "", "borrarTodos", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cantidadDePartidos", "", "getPartidos", "Landroidx/lifecycle/LiveData;", "", "Lunpsjb/ing/tnt/ligadeportiva/basededatos/Partido;", "insertar", "partido", "(Lunpsjb/ing/tnt/ligadeportiva/basededatos/Partido;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PartidoDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from tabla_partido ORDER BY partidoId ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<unpsjb.ing.tnt.ligadeportiva.basededatos.Partido>> getPartidos();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object insertar(@org.jetbrains.annotations.NotNull()
    unpsjb.ing.tnt.ligadeportiva.basededatos.Partido partido, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM tabla_partido")
    public abstract java.lang.Object borrarTodos(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT COUNT(partidoId) from tabla_partido")
    public abstract java.lang.Object cantidadDePartidos(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p0);
}