package androidx.activity;

import dc.w;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: OnBackPressedCallback.kt */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private boolean f642a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f643b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private pc.a<w> f644c;

    public m(boolean z10) {
        this.f642a = z10;
    }

    public final void a(a aVar) {
        qc.q.i(aVar, "cancellable");
        this.f643b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f642a;
    }

    public final void d() {
        Iterator<T> it = this.f643b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).cancel();
        }
    }

    public final void e(a aVar) {
        qc.q.i(aVar, "cancellable");
        this.f643b.remove(aVar);
    }

    public final void f(boolean z10) {
        this.f642a = z10;
        pc.a<w> aVar = this.f644c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void g(pc.a<w> aVar) {
        this.f644c = aVar;
    }
}
