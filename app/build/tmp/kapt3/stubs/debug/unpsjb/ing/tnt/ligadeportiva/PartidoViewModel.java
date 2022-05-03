package unpsjb.ing.tnt.ligadeportiva;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lunpsjb/ing/tnt/ligadeportiva/PartidoViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "repositorio", "Lunpsjb/ing/tnt/ligadeportiva/basededatos/RepositorioDePartidos;", "todosLosPartidos", "Landroidx/lifecycle/LiveData;", "", "Lunpsjb/ing/tnt/ligadeportiva/basededatos/Partido;", "getTodosLosPartidos", "()Landroidx/lifecycle/LiveData;", "insert", "Lkotlinx/coroutines/Job;", "partido", "app_debug"})
public final class PartidoViewModel extends androidx.lifecycle.AndroidViewModel {
    private final unpsjb.ing.tnt.ligadeportiva.basededatos.RepositorioDePartidos repositorio = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<unpsjb.ing.tnt.ligadeportiva.basededatos.Partido>> todosLosPartidos = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<unpsjb.ing.tnt.ligadeportiva.basededatos.Partido>> getTodosLosPartidos() {
        return null;
    }
    
    /**
     * Lanzar una nueva corrutina para insertar datos en una forma no-bloqueante
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insert(@org.jetbrains.annotations.NotNull()
    unpsjb.ing.tnt.ligadeportiva.basededatos.Partido partido) {
        return null;
    }
    
    public PartidoViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}