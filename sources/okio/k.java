package okio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ForwardingFileSystem.kt */
/* loaded from: classes4.dex */
public abstract class k extends j {

    /* renamed from: e  reason: collision with root package name */
    private final j f20650e;

    public k(j jVar) {
        qc.q.i(jVar, "delegate");
        this.f20650e = jVar;
    }

    @Override // okio.j
    public y0 b(r0 r0Var, boolean z10) throws IOException {
        qc.q.i(r0Var, "file");
        return this.f20650e.b(r(r0Var, "appendingSink", "file"), z10);
    }

    @Override // okio.j
    public void c(r0 r0Var, r0 r0Var2) throws IOException {
        qc.q.i(r0Var, "source");
        qc.q.i(r0Var2, "target");
        this.f20650e.c(r(r0Var, "atomicMove", "source"), r(r0Var2, "atomicMove", "target"));
    }

    @Override // okio.j
    public void g(r0 r0Var, boolean z10) throws IOException {
        qc.q.i(r0Var, "dir");
        this.f20650e.g(r(r0Var, "createDirectory", "dir"), z10);
    }

    @Override // okio.j
    public void i(r0 r0Var, boolean z10) throws IOException {
        qc.q.i(r0Var, "path");
        this.f20650e.i(r(r0Var, "delete", "path"), z10);
    }

    @Override // okio.j
    public List<r0> k(r0 r0Var) throws IOException {
        qc.q.i(r0Var, "dir");
        List<r0> k10 = this.f20650e.k(r(r0Var, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = k10.iterator();
        while (it.hasNext()) {
            arrayList.add(s((r0) it.next(), "list"));
        }
        ec.x.u(arrayList);
        return arrayList;
    }

    @Override // okio.j
    public i m(r0 r0Var) throws IOException {
        qc.q.i(r0Var, "path");
        i m10 = this.f20650e.m(r(r0Var, "metadataOrNull", "path"));
        if (m10 == null) {
            return null;
        }
        if (m10.e() == null) {
            return m10;
        }
        return i.b(m10, false, false, s(m10.e(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    @Override // okio.j
    public h n(r0 r0Var) throws IOException {
        qc.q.i(r0Var, "file");
        return this.f20650e.n(r(r0Var, "openReadOnly", "file"));
    }

    @Override // okio.j
    public y0 p(r0 r0Var, boolean z10) throws IOException {
        qc.q.i(r0Var, "file");
        return this.f20650e.p(r(r0Var, "sink", "file"), z10);
    }

    @Override // okio.j
    public Source q(r0 r0Var) throws IOException {
        qc.q.i(r0Var, "file");
        return this.f20650e.q(r(r0Var, "source", "file"));
    }

    public r0 r(r0 r0Var, String str, String str2) {
        qc.q.i(r0Var, "path");
        qc.q.i(str, "functionName");
        qc.q.i(str2, "parameterName");
        return r0Var;
    }

    public r0 s(r0 r0Var, String str) {
        qc.q.i(r0Var, "path");
        qc.q.i(str, "functionName");
        return r0Var;
    }

    public String toString() {
        return qc.g0.b(getClass()).a() + '(' + this.f20650e + ')';
    }
}
