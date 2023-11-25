package v5;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import dc.w;
import ec.b0;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import qc.q;
import v5.g;

/* compiled from: IdentityManager.kt */
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final i f24608a;

    /* renamed from: b  reason: collision with root package name */
    private final ReentrantReadWriteLock f24609b;

    /* renamed from: c  reason: collision with root package name */
    private c f24610c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f24611d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<f> f24612e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f24613f;

    /* compiled from: IdentityManager.kt */
    /* loaded from: classes.dex */
    public static final class a implements g.b {

        /* renamed from: a  reason: collision with root package name */
        private String f24614a;

        /* renamed from: b  reason: collision with root package name */
        private String f24615b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f24616c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f24617d;

        a(c cVar, h hVar) {
            this.f24616c = cVar;
            this.f24617d = hVar;
            this.f24614a = cVar.b();
            this.f24615b = cVar.a();
        }

        @Override // v5.g.b
        public g.b a(String str) {
            this.f24614a = str;
            return this;
        }

        @Override // v5.g.b
        public g.b b(String str) {
            this.f24615b = str;
            return this;
        }

        @Override // v5.g.b
        public void c() {
            g.a.a(this.f24617d, new c(this.f24614a, this.f24615b), null, 2, null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [qc.h, java.lang.String] */
    public h(i iVar) {
        q.i(iVar, "identityStorage");
        this.f24608a = iVar;
        this.f24609b = new ReentrantReadWriteLock(true);
        ?? r12 = 0;
        this.f24610c = new c(r12, r12, 3, r12);
        this.f24611d = new Object();
        this.f24612e = new LinkedHashSet();
        e(iVar.b(), k.Initialized);
    }

    @Override // v5.g
    public g.b a() {
        return new a(d(), this);
    }

    @Override // v5.g
    public boolean b() {
        return this.f24613f;
    }

    @Override // v5.g
    public void c(f fVar) {
        q.i(fVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.f24611d) {
            this.f24612e.add(fVar);
        }
    }

    @Override // v5.g
    public c d() {
        ReentrantReadWriteLock.ReadLock readLock = this.f24609b.readLock();
        readLock.lock();
        try {
            return this.f24610c;
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // v5.g
    public void e(c cVar, k kVar) {
        int i10;
        Set<f> H0;
        q.i(cVar, "identity");
        q.i(kVar, "updateType");
        c d10 = d();
        ReentrantReadWriteLock reentrantReadWriteLock = this.f24609b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i10 = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f24610c = cVar;
            if (kVar == k.Initialized) {
                this.f24613f = true;
            }
            w wVar = w.f13270a;
            while (i11 < i10) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
            if (!q.d(cVar, d10)) {
                synchronized (this.f24611d) {
                    H0 = b0.H0(this.f24612e);
                }
                if (kVar != k.Initialized) {
                    if (!q.d(cVar.b(), d10.b())) {
                        this.f24608a.c(cVar.b());
                    }
                    if (!q.d(cVar.a(), d10.a())) {
                        this.f24608a.a(cVar.a());
                    }
                }
                for (f fVar : H0) {
                    if (!q.d(cVar.b(), d10.b())) {
                        fVar.b(cVar.b());
                    }
                    if (!q.d(cVar.a(), d10.a())) {
                        fVar.a(cVar.a());
                    }
                    fVar.c(cVar, kVar);
                }
            }
        } catch (Throwable th) {
            while (i11 < i10) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
            throw th;
        }
    }
}
