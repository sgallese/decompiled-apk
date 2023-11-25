package p5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qc.q;

/* compiled from: State.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private String f21098a;

    /* renamed from: b  reason: collision with root package name */
    private String f21099b;

    /* renamed from: c  reason: collision with root package name */
    private final List<r5.e> f21100c = new ArrayList();

    public final boolean a(r5.e eVar, a aVar) {
        boolean add;
        q.i(eVar, "plugin");
        q.i(aVar, "amplitude");
        synchronized (this.f21100c) {
            eVar.b(aVar);
            add = c().add(eVar);
        }
        return add;
    }

    public final String b() {
        return this.f21099b;
    }

    public final List<r5.e> c() {
        return this.f21100c;
    }

    public final String d() {
        return this.f21098a;
    }

    public final void e(String str) {
        this.f21099b = str;
        Iterator<T> it = this.f21100c.iterator();
        while (it.hasNext()) {
            ((r5.e) it.next()).h(str);
        }
    }

    public final void f(String str) {
        this.f21098a = str;
        Iterator<T> it = this.f21100c.iterator();
        while (it.hasNext()) {
            ((r5.e) it.next()).i(str);
        }
    }
}
