package s9;

import android.content.Context;
import com.google.firebase.l;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;

/* compiled from: FirebasePerfEarly.java */
/* loaded from: classes3.dex */
public class b {
    public b(com.google.firebase.e eVar, l lVar, Executor executor) {
        Context j10 = eVar.j();
        com.google.firebase.perf.config.a.g().O(j10);
        com.google.firebase.perf.application.a b10 = com.google.firebase.perf.application.a.b();
        b10.i(j10);
        b10.j(new f());
        if (lVar != null) {
            AppStartTrace l10 = AppStartTrace.l();
            l10.x(j10);
            executor.execute(new AppStartTrace.c(l10));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
