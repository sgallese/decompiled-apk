package androidx.activity;

import dc.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: FullyDrawnReporter.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f634a;

    /* renamed from: b  reason: collision with root package name */
    private final pc.a<w> f635b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f636c;

    /* renamed from: d  reason: collision with root package name */
    private int f637d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f638e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f639f;

    /* renamed from: g  reason: collision with root package name */
    private final List<pc.a<w>> f640g;

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f641h;

    public k(Executor executor, pc.a<w> aVar) {
        qc.q.i(executor, "executor");
        qc.q.i(aVar, "reportFullyDrawn");
        this.f634a = executor;
        this.f635b = aVar;
        this.f636c = new Object();
        this.f640g = new ArrayList();
        this.f641h = new Runnable() { // from class: androidx.activity.j
            @Override // java.lang.Runnable
            public final void run() {
                k.d(k.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(k kVar) {
        qc.q.i(kVar, "this$0");
        synchronized (kVar.f636c) {
            kVar.f638e = false;
            if (kVar.f637d == 0 && !kVar.f639f) {
                kVar.f635b.invoke();
                kVar.b();
            }
            w wVar = w.f13270a;
        }
    }

    public final void b() {
        synchronized (this.f636c) {
            this.f639f = true;
            Iterator<T> it = this.f640g.iterator();
            while (it.hasNext()) {
                ((pc.a) it.next()).invoke();
            }
            this.f640g.clear();
            w wVar = w.f13270a;
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f636c) {
            z10 = this.f639f;
        }
        return z10;
    }
}
