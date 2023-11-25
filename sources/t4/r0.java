package t4;

import java.io.File;
import okio.r0;
import t4.o0;

/* compiled from: ImageSource.kt */
/* loaded from: classes.dex */
public final class r0 extends o0 {

    /* renamed from: f  reason: collision with root package name */
    private final o0.a f23625f;

    /* renamed from: m  reason: collision with root package name */
    private boolean f23626m;

    /* renamed from: p  reason: collision with root package name */
    private okio.e f23627p;

    /* renamed from: q  reason: collision with root package name */
    private pc.a<? extends File> f23628q;

    /* renamed from: r  reason: collision with root package name */
    private okio.r0 f23629r;

    public r0(okio.e eVar, pc.a<? extends File> aVar, o0.a aVar2) {
        super(null);
        this.f23625f = aVar2;
        this.f23627p = eVar;
        this.f23628q = aVar;
    }

    private final void j() {
        if ((!this.f23626m) != false) {
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    private final okio.r0 m() {
        pc.a<? extends File> aVar = this.f23628q;
        qc.q.f(aVar);
        File invoke = aVar.invoke();
        if (invoke.isDirectory()) {
            return r0.a.d(okio.r0.f20670m, File.createTempFile("tmp", null, invoke), false, 1, null);
        }
        throw new IllegalStateException("cacheDirectory must be a directory.".toString());
    }

    @Override // t4.o0
    public synchronized okio.r0 b() {
        Throwable th;
        Long l10;
        j();
        okio.r0 r0Var = this.f23629r;
        if (r0Var != null) {
            return r0Var;
        }
        okio.r0 m10 = m();
        okio.d c10 = okio.l0.c(q().p(m10, false));
        try {
            okio.e eVar = this.f23627p;
            qc.q.f(eVar);
            l10 = Long.valueOf(c10.g0(eVar));
            if (c10 != null) {
                try {
                    c10.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = null;
        } catch (Throwable th3) {
            if (c10 != null) {
                try {
                    c10.close();
                } catch (Throwable th4) {
                    dc.b.a(th3, th4);
                }
            }
            th = th3;
            l10 = null;
        }
        if (th == null) {
            qc.q.f(l10);
            this.f23627p = null;
            this.f23629r = m10;
            this.f23628q = null;
            return m10;
        }
        throw th;
    }

    @Override // t4.o0
    public synchronized okio.r0 c() {
        j();
        return this.f23629r;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f23626m = true;
        okio.e eVar = this.f23627p;
        if (eVar != null) {
            g5.l.d(eVar);
        }
        okio.r0 r0Var = this.f23629r;
        if (r0Var != null) {
            q().h(r0Var);
        }
    }

    @Override // t4.o0
    public o0.a d() {
        return this.f23625f;
    }

    @Override // t4.o0
    public synchronized okio.e e() {
        j();
        okio.e eVar = this.f23627p;
        if (eVar != null) {
            return eVar;
        }
        okio.j q10 = q();
        okio.r0 r0Var = this.f23629r;
        qc.q.f(r0Var);
        okio.e d10 = okio.l0.d(q10.q(r0Var));
        this.f23627p = d10;
        return d10;
    }

    public okio.j q() {
        return okio.j.f20647b;
    }
}
