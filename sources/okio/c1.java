package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import okio.r0;

/* compiled from: ZipFileSystem.kt */
/* loaded from: classes4.dex */
public final class c1 extends j {

    /* renamed from: i  reason: collision with root package name */
    private static final a f20613i = new a(null);
    @Deprecated

    /* renamed from: j  reason: collision with root package name */
    private static final r0 f20614j = r0.a.e(r0.f20670m, "/", false, 1, null);

    /* renamed from: e  reason: collision with root package name */
    private final r0 f20615e;

    /* renamed from: f  reason: collision with root package name */
    private final j f20616f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<r0, ld.d> f20617g;

    /* renamed from: h  reason: collision with root package name */
    private final String f20618h;

    /* compiled from: ZipFileSystem.kt */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public c1(r0 r0Var, j jVar, Map<r0, ld.d> map, String str) {
        qc.q.i(r0Var, "zipPath");
        qc.q.i(jVar, "fileSystem");
        qc.q.i(map, "entries");
        this.f20615e = r0Var;
        this.f20616f = jVar;
        this.f20617g = map;
        this.f20618h = str;
    }

    private final r0 r(r0 r0Var) {
        return f20614j.o(r0Var, true);
    }

    private final List<r0> s(r0 r0Var, boolean z10) {
        List<r0> C0;
        ld.d dVar = this.f20617g.get(r(r0Var));
        if (dVar != null) {
            C0 = ec.b0.C0(dVar.b());
            return C0;
        } else if (!z10) {
            return null;
        } else {
            throw new IOException("not a directory: " + r0Var);
        }
    }

    @Override // okio.j
    public y0 b(r0 r0Var, boolean z10) {
        qc.q.i(r0Var, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.j
    public void c(r0 r0Var, r0 r0Var2) {
        qc.q.i(r0Var, "source");
        qc.q.i(r0Var2, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.j
    public void g(r0 r0Var, boolean z10) {
        qc.q.i(r0Var, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.j
    public void i(r0 r0Var, boolean z10) {
        qc.q.i(r0Var, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.j
    public List<r0> k(r0 r0Var) {
        qc.q.i(r0Var, "dir");
        List<r0> s10 = s(r0Var, true);
        qc.q.f(s10);
        return s10;
    }

    @Override // okio.j
    public i m(r0 r0Var) {
        Long valueOf;
        e eVar;
        qc.q.i(r0Var, "path");
        ld.d dVar = this.f20617g.get(r(r0Var));
        Throwable th = null;
        if (dVar == null) {
            return null;
        }
        boolean z10 = !dVar.h();
        boolean h10 = dVar.h();
        r0 r0Var2 = null;
        if (dVar.h()) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(dVar.g());
        }
        i iVar = new i(z10, h10, r0Var2, valueOf, null, dVar.e(), null, null, 128, null);
        if (dVar.f() == -1) {
            return iVar;
        }
        h n10 = this.f20616f.n(this.f20615e);
        try {
            eVar = l0.d(n10.E(dVar.f()));
            if (n10 != null) {
                try {
                    n10.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (n10 != null) {
                try {
                    n10.close();
                } catch (Throwable th4) {
                    dc.b.a(th3, th4);
                }
            }
            th = th3;
            eVar = null;
        }
        if (th == null) {
            qc.q.f(eVar);
            return ld.e.h(eVar, iVar);
        }
        throw th;
    }

    @Override // okio.j
    public h n(r0 r0Var) {
        qc.q.i(r0Var, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.j
    public y0 p(r0 r0Var, boolean z10) {
        qc.q.i(r0Var, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.j
    public Source q(r0 r0Var) throws IOException {
        e eVar;
        qc.q.i(r0Var, "file");
        ld.d dVar = this.f20617g.get(r(r0Var));
        if (dVar != null) {
            h n10 = this.f20616f.n(this.f20615e);
            Throwable th = null;
            try {
                eVar = l0.d(n10.E(dVar.f()));
                if (n10 != null) {
                    try {
                        n10.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                if (n10 != null) {
                    try {
                        n10.close();
                    } catch (Throwable th4) {
                        dc.b.a(th3, th4);
                    }
                }
                eVar = null;
                th = th3;
            }
            if (th == null) {
                qc.q.f(eVar);
                ld.e.k(eVar);
                if (dVar.d() == 0) {
                    return new ld.b(eVar, dVar.g(), true);
                }
                return new ld.b(new p(new ld.b(eVar, dVar.c(), true), new Inflater(true)), dVar.g(), false);
            }
            throw th;
        }
        throw new FileNotFoundException("no such file: " + r0Var);
    }
}
