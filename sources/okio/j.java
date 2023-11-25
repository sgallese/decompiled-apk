package okio;

import java.io.IOException;
import java.util.List;
import okio.r0;

/* compiled from: FileSystem.kt */
/* loaded from: classes4.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f20646a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final j f20647b;

    /* renamed from: c  reason: collision with root package name */
    public static final r0 f20648c;

    /* renamed from: d  reason: collision with root package name */
    public static final j f20649d;

    /* compiled from: FileSystem.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    static {
        j sVar;
        try {
            Class.forName("java.nio.file.Files");
            sVar = new k0();
        } catch (ClassNotFoundException unused) {
            sVar = new s();
        }
        f20647b = sVar;
        r0.a aVar = r0.f20670m;
        String property = System.getProperty("java.io.tmpdir");
        qc.q.h(property, "getProperty(\"java.io.tmpdir\")");
        f20648c = r0.a.e(aVar, property, false, 1, null);
        ClassLoader classLoader = ld.c.class.getClassLoader();
        qc.q.h(classLoader, "ResourceFileSystem::class.java.classLoader");
        f20649d = new ld.c(classLoader, false);
    }

    public final y0 a(r0 r0Var) throws IOException {
        qc.q.i(r0Var, "file");
        return b(r0Var, false);
    }

    public abstract y0 b(r0 r0Var, boolean z10) throws IOException;

    public abstract void c(r0 r0Var, r0 r0Var2) throws IOException;

    public final void d(r0 r0Var) throws IOException {
        qc.q.i(r0Var, "dir");
        e(r0Var, false);
    }

    public final void e(r0 r0Var, boolean z10) throws IOException {
        qc.q.i(r0Var, "dir");
        ld.h.a(this, r0Var, z10);
    }

    public final void f(r0 r0Var) throws IOException {
        qc.q.i(r0Var, "dir");
        g(r0Var, false);
    }

    public abstract void g(r0 r0Var, boolean z10) throws IOException;

    public final void h(r0 r0Var) throws IOException {
        qc.q.i(r0Var, "path");
        i(r0Var, false);
    }

    public abstract void i(r0 r0Var, boolean z10) throws IOException;

    public final boolean j(r0 r0Var) throws IOException {
        qc.q.i(r0Var, "path");
        return ld.h.b(this, r0Var);
    }

    public abstract List<r0> k(r0 r0Var) throws IOException;

    public final i l(r0 r0Var) throws IOException {
        qc.q.i(r0Var, "path");
        return ld.h.c(this, r0Var);
    }

    public abstract i m(r0 r0Var) throws IOException;

    public abstract h n(r0 r0Var) throws IOException;

    public final y0 o(r0 r0Var) throws IOException {
        qc.q.i(r0Var, "file");
        return p(r0Var, false);
    }

    public abstract y0 p(r0 r0Var, boolean z10) throws IOException;

    public abstract Source q(r0 r0Var) throws IOException;
}
