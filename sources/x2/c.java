package x2;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import ec.t;
import java.util.ArrayList;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PoolingContainer.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<b> f25707a = new ArrayList<>();

    public final void a(b bVar) {
        q.i(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f25707a.add(bVar);
    }

    public final void b() {
        int k10;
        for (k10 = t.k(this.f25707a); -1 < k10; k10--) {
            this.f25707a.get(k10).b();
        }
    }

    public final void c(b bVar) {
        q.i(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f25707a.remove(bVar);
    }
}
