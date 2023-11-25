package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: InvalidateCallbackTracker.kt */
/* loaded from: classes.dex */
public final class e0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final pc.l<T, dc.w> f5502a;

    /* renamed from: b  reason: collision with root package name */
    private final pc.a<Boolean> f5503b;

    /* renamed from: c  reason: collision with root package name */
    private final ReentrantLock f5504c;

    /* renamed from: d  reason: collision with root package name */
    private final List<T> f5505d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5506e;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(pc.l<? super T, dc.w> lVar, pc.a<Boolean> aVar) {
        qc.q.i(lVar, "callbackInvoker");
        this.f5502a = lVar;
        this.f5503b = aVar;
        this.f5504c = new ReentrantLock();
        this.f5505d = new ArrayList();
    }

    public final int a() {
        return this.f5505d.size();
    }

    public final boolean b() {
        return this.f5506e;
    }

    public final boolean c() {
        List C0;
        if (this.f5506e) {
            return false;
        }
        ReentrantLock reentrantLock = this.f5504c;
        reentrantLock.lock();
        try {
            if (this.f5506e) {
                return false;
            }
            this.f5506e = true;
            C0 = ec.b0.C0(this.f5505d);
            this.f5505d.clear();
            dc.w wVar = dc.w.f13270a;
            if (C0 != null) {
                pc.l<T, dc.w> lVar = this.f5502a;
                Iterator<T> it = C0.iterator();
                while (it.hasNext()) {
                    lVar.invoke(it.next());
                }
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(T t10) {
        boolean z10;
        pc.a<Boolean> aVar = this.f5503b;
        boolean z11 = true;
        if (aVar != null && aVar.invoke().booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c();
        }
        if (this.f5506e) {
            this.f5502a.invoke(t10);
            return;
        }
        ReentrantLock reentrantLock = this.f5504c;
        reentrantLock.lock();
        try {
            if (this.f5506e) {
                dc.w wVar = dc.w.f13270a;
            } else {
                this.f5505d.add(t10);
                z11 = false;
            }
            if (z11) {
                this.f5502a.invoke(t10);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(T t10) {
        ReentrantLock reentrantLock = this.f5504c;
        reentrantLock.lock();
        try {
            this.f5505d.remove(t10);
        } finally {
            reentrantLock.unlock();
        }
    }

    public /* synthetic */ e0(pc.l lVar, pc.a aVar, int i10, qc.h hVar) {
        this(lVar, (i10 & 2) != 0 ? null : aVar);
    }
}
