package ea;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import k8.e;
import k8.h;
import k8.j;

/* compiled from: ComponentMonitor.java */
/* loaded from: classes3.dex */
public class b implements j {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, k8.c cVar, e eVar) {
        try {
            c.b(str);
            return cVar.h().a(eVar);
        } finally {
            c.a();
        }
    }

    @Override // k8.j
    public List<k8.c<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final k8.c<?> cVar : componentRegistrar.getComponents()) {
            final String i10 = cVar.i();
            if (i10 != null) {
                cVar = cVar.t(new h() { // from class: ea.a
                    @Override // k8.h
                    public final Object a(e eVar) {
                        Object c10;
                        c10 = b.c(i10, cVar, eVar);
                        return c10;
                    }
                });
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
