package t4;

import java.io.Closeable;
import t4.o0;

/* compiled from: ImageSource.kt */
/* loaded from: classes.dex */
public final class o extends o0 {

    /* renamed from: f  reason: collision with root package name */
    private final okio.r0 f23595f;

    /* renamed from: m  reason: collision with root package name */
    private final okio.j f23596m;

    /* renamed from: p  reason: collision with root package name */
    private final String f23597p;

    /* renamed from: q  reason: collision with root package name */
    private final Closeable f23598q;

    /* renamed from: r  reason: collision with root package name */
    private final o0.a f23599r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f23600s;

    /* renamed from: t  reason: collision with root package name */
    private okio.e f23601t;

    public o(okio.r0 r0Var, okio.j jVar, String str, Closeable closeable, o0.a aVar) {
        super(null);
        this.f23595f = r0Var;
        this.f23596m = jVar;
        this.f23597p = str;
        this.f23598q = closeable;
        this.f23599r = aVar;
    }

    private final void j() {
        if ((!this.f23600s) != false) {
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // t4.o0
    public synchronized okio.r0 b() {
        j();
        return this.f23595f;
    }

    @Override // t4.o0
    public okio.r0 c() {
        return b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f23600s = true;
        okio.e eVar = this.f23601t;
        if (eVar != null) {
            g5.l.d(eVar);
        }
        Closeable closeable = this.f23598q;
        if (closeable != null) {
            g5.l.d(closeable);
        }
    }

    @Override // t4.o0
    public o0.a d() {
        return this.f23599r;
    }

    @Override // t4.o0
    public synchronized okio.e e() {
        j();
        okio.e eVar = this.f23601t;
        if (eVar != null) {
            return eVar;
        }
        okio.e d10 = okio.l0.d(q().q(this.f23595f));
        this.f23601t = d10;
        return d10;
    }

    public final String m() {
        return this.f23597p;
    }

    public okio.j q() {
        return this.f23596m;
    }
}
