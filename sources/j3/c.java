package j3;

import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pc.l;
import qc.q;

/* compiled from: InitializerViewModelFactory.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<f<?>> f19019a = new ArrayList();

    public final <T extends v0> void a(wc.b<T> bVar, l<? super a, ? extends T> lVar) {
        q.i(bVar, "clazz");
        q.i(lVar, "initializer");
        this.f19019a.add(new f<>(oc.a.a(bVar), lVar));
    }

    public final y0.b b() {
        f[] fVarArr = (f[]) this.f19019a.toArray(new f[0]);
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
