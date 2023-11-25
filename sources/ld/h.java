package ld;

import ec.k;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import okio.r0;
import qc.q;

/* compiled from: -FileSystem.kt */
/* loaded from: classes4.dex */
public final class h {
    public static final void a(okio.j jVar, r0 r0Var, boolean z10) throws IOException {
        q.i(jVar, "<this>");
        q.i(r0Var, "dir");
        k kVar = new k();
        for (r0 r0Var2 = r0Var; r0Var2 != null && !jVar.j(r0Var2); r0Var2 = r0Var2.l()) {
            kVar.f(r0Var2);
        }
        if (z10 && kVar.isEmpty()) {
            throw new IOException(r0Var + " already exist.");
        }
        Iterator<E> it = kVar.iterator();
        while (it.hasNext()) {
            jVar.f((r0) it.next());
        }
    }

    public static final boolean b(okio.j jVar, r0 r0Var) throws IOException {
        q.i(jVar, "<this>");
        q.i(r0Var, "path");
        if (jVar.m(r0Var) != null) {
            return true;
        }
        return false;
    }

    public static final okio.i c(okio.j jVar, r0 r0Var) throws IOException {
        q.i(jVar, "<this>");
        q.i(r0Var, "path");
        okio.i m10 = jVar.m(r0Var);
        if (m10 != null) {
            return m10;
        }
        throw new FileNotFoundException("no such file: " + r0Var);
    }
}
