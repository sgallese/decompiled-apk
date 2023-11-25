package ld;

import ec.b0;
import ec.u;
import ec.y;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import okio.Source;
import okio.r0;
import okio.y0;
import pc.l;
import qc.q;
import qc.r;
import yc.v;
import yc.w;

/* compiled from: ResourceFileSystem.kt */
/* loaded from: classes4.dex */
public final class c extends okio.j {

    /* renamed from: f  reason: collision with root package name */
    private static final a f19655f = new a(null);
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    private static final r0 f19656g = r0.a.e(r0.f20670m, "/", false, 1, null);

    /* renamed from: e  reason: collision with root package name */
    private final dc.f f19657e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceFileSystem.kt */
    /* loaded from: classes4.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ResourceFileSystem.kt */
        /* renamed from: ld.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0442a extends r implements l<d, Boolean> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0442a f19658f = new C0442a();

            C0442a() {
                super(1);
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(d dVar) {
                q.i(dVar, "entry");
                return Boolean.valueOf(c.f19655f.c(dVar.a()));
            }
        }

        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(r0 r0Var) {
            boolean p10;
            p10 = v.p(r0Var.j(), ".class", true);
            return !p10;
        }

        public final r0 b() {
            return c.f19656g;
        }

        public final r0 d(r0 r0Var, r0 r0Var2) {
            String n02;
            String A;
            q.i(r0Var, "<this>");
            q.i(r0Var2, "base");
            String r0Var3 = r0Var2.toString();
            r0 b10 = b();
            n02 = w.n0(r0Var.toString(), r0Var3);
            A = v.A(n02, '\\', '/', false, 4, null);
            return b10.n(A);
        }

        public final List<dc.l<okio.j, r0>> e(ClassLoader classLoader) {
            List<dc.l<okio.j, r0>> r02;
            q.i(classLoader, "<this>");
            Enumeration<URL> resources = classLoader.getResources("");
            q.h(resources, "getResources(\"\")");
            ArrayList<URL> list = Collections.list(resources);
            q.h(list, "list(this)");
            ArrayList arrayList = new ArrayList();
            for (URL url : list) {
                a aVar = c.f19655f;
                q.h(url, "it");
                dc.l<okio.j, r0> f10 = aVar.f(url);
                if (f10 != null) {
                    arrayList.add(f10);
                }
            }
            Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
            q.h(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
            ArrayList<URL> list2 = Collections.list(resources2);
            q.h(list2, "list(this)");
            ArrayList arrayList2 = new ArrayList();
            for (URL url2 : list2) {
                a aVar2 = c.f19655f;
                q.h(url2, "it");
                dc.l<okio.j, r0> g10 = aVar2.g(url2);
                if (g10 != null) {
                    arrayList2.add(g10);
                }
            }
            r02 = b0.r0(arrayList, arrayList2);
            return r02;
        }

        public final dc.l<okio.j, r0> f(URL url) {
            q.i(url, "<this>");
            if (!q.d(url.getProtocol(), "file")) {
                return null;
            }
            return dc.r.a(okio.j.f20647b, r0.a.d(r0.f20670m, new File(url.toURI()), false, 1, null));
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            r0 = yc.w.c0(r10, "!", 0, false, 6, null);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final dc.l<okio.j, okio.r0> g(java.net.URL r10) {
            /*
                r9 = this;
                java.lang.String r0 = "<this>"
                qc.q.i(r10, r0)
                java.lang.String r10 = r10.toString()
                java.lang.String r0 = "toString()"
                qc.q.h(r10, r0)
                java.lang.String r0 = "jar:file:"
                r7 = 0
                r1 = 2
                r8 = 0
                boolean r0 = yc.m.F(r10, r0, r7, r1, r8)
                if (r0 != 0) goto L1a
                return r8
            L1a:
                java.lang.String r2 = "!"
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                r1 = r10
                int r0 = yc.m.c0(r1, r2, r3, r4, r5, r6)
                r1 = -1
                if (r0 != r1) goto L29
                return r8
            L29:
                okio.r0$a r1 = okio.r0.f20670m
                java.io.File r2 = new java.io.File
                r3 = 4
                java.lang.String r10 = r10.substring(r3, r0)
                java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
                qc.q.h(r10, r0)
                java.net.URI r10 = java.net.URI.create(r10)
                r2.<init>(r10)
                r10 = 1
                okio.r0 r10 = okio.r0.a.d(r1, r2, r7, r10, r8)
                okio.j r0 = okio.j.f20647b
                ld.c$a$a r1 = ld.c.a.C0442a.f19658f
                okio.c1 r10 = ld.e.d(r10, r0, r1)
                okio.r0 r0 = r9.b()
                dc.l r10 = dc.r.a(r10, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ld.c.a.g(java.net.URL):dc.l");
        }
    }

    /* compiled from: ResourceFileSystem.kt */
    /* loaded from: classes4.dex */
    static final class b extends r implements pc.a<List<? extends dc.l<? extends okio.j, ? extends r0>>> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ClassLoader f19659f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ClassLoader classLoader) {
            super(0);
            this.f19659f = classLoader;
        }

        @Override // pc.a
        public final List<? extends dc.l<? extends okio.j, ? extends r0>> invoke() {
            return c.f19655f.e(this.f19659f);
        }
    }

    public c(ClassLoader classLoader, boolean z10) {
        dc.f b10;
        q.i(classLoader, "classLoader");
        b10 = dc.h.b(new b(classLoader));
        this.f19657e = b10;
        if (z10) {
            u().size();
        }
    }

    private final r0 t(r0 r0Var) {
        return f19656g.o(r0Var, true);
    }

    private final List<dc.l<okio.j, r0>> u() {
        return (List) this.f19657e.getValue();
    }

    private final String v(r0 r0Var) {
        return t(r0Var).m(f19656g).toString();
    }

    @Override // okio.j
    public y0 b(r0 r0Var, boolean z10) {
        q.i(r0Var, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.j
    public void c(r0 r0Var, r0 r0Var2) {
        q.i(r0Var, "source");
        q.i(r0Var2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.j
    public void g(r0 r0Var, boolean z10) {
        q.i(r0Var, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.j
    public void i(r0 r0Var, boolean z10) {
        q.i(r0Var, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.j
    public List<r0> k(r0 r0Var) {
        List<r0> C0;
        int s10;
        q.i(r0Var, "dir");
        String v10 = v(r0Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (dc.l<okio.j, r0> lVar : u()) {
            okio.j a10 = lVar.a();
            r0 b10 = lVar.b();
            try {
                List<r0> k10 = a10.k(b10.n(v10));
                ArrayList arrayList = new ArrayList();
                for (Object obj : k10) {
                    if (f19655f.c((r0) obj)) {
                        arrayList.add(obj);
                    }
                }
                s10 = u.s(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(s10);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f19655f.d((r0) it.next(), b10));
                }
                y.w(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            C0 = b0.C0(linkedHashSet);
            return C0;
        }
        throw new FileNotFoundException("file not found: " + r0Var);
    }

    @Override // okio.j
    public okio.i m(r0 r0Var) {
        q.i(r0Var, "path");
        if (!f19655f.c(r0Var)) {
            return null;
        }
        String v10 = v(r0Var);
        for (dc.l<okio.j, r0> lVar : u()) {
            okio.i m10 = lVar.a().m(lVar.b().n(v10));
            if (m10 != null) {
                return m10;
            }
        }
        return null;
    }

    @Override // okio.j
    public okio.h n(r0 r0Var) {
        q.i(r0Var, "file");
        if (f19655f.c(r0Var)) {
            String v10 = v(r0Var);
            for (dc.l<okio.j, r0> lVar : u()) {
                try {
                    return lVar.a().n(lVar.b().n(v10));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + r0Var);
        }
        throw new FileNotFoundException("file not found: " + r0Var);
    }

    @Override // okio.j
    public y0 p(r0 r0Var, boolean z10) {
        q.i(r0Var, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.j
    public Source q(r0 r0Var) {
        q.i(r0Var, "file");
        if (f19655f.c(r0Var)) {
            String v10 = v(r0Var);
            for (dc.l<okio.j, r0> lVar : u()) {
                try {
                    return lVar.a().q(lVar.b().n(v10));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + r0Var);
        }
        throw new FileNotFoundException("file not found: " + r0Var);
    }
}
