package okio;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Path.kt */
/* loaded from: classes4.dex */
public final class r0 implements Comparable<r0> {

    /* renamed from: m  reason: collision with root package name */
    public static final a f20670m = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public static final String f20671p;

    /* renamed from: f  reason: collision with root package name */
    private final f f20672f;

    /* compiled from: Path.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public static /* synthetic */ r0 d(a aVar, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.a(file, z10);
        }

        public static /* synthetic */ r0 e(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.b(str, z10);
        }

        public static /* synthetic */ r0 f(a aVar, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.c(path, z10);
        }

        public final r0 a(File file, boolean z10) {
            qc.q.i(file, "<this>");
            String file2 = file.toString();
            qc.q.h(file2, "toString()");
            return b(file2, z10);
        }

        public final r0 b(String str, boolean z10) {
            qc.q.i(str, "<this>");
            return ld.i.k(str, z10);
        }

        @IgnoreJRERequirement
        public final r0 c(Path path, boolean z10) {
            qc.q.i(path, "<this>");
            return b(path.toString(), z10);
        }
    }

    static {
        String str = File.separator;
        qc.q.h(str, "separator");
        f20671p = str;
    }

    public r0(f fVar) {
        qc.q.i(fVar, "bytes");
        this.f20672f = fVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public int compareTo(r0 r0Var) {
        qc.q.i(r0Var, TaskSetupFragment.TYPE_OTHER);
        return d().compareTo(r0Var.d());
    }

    public final f d() {
        return this.f20672f;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof r0) && qc.q.d(((r0) obj).d(), d())) {
            return true;
        }
        return false;
    }

    public final r0 f() {
        int h10 = ld.i.h(this);
        if (h10 == -1) {
            return null;
        }
        return new r0(d().F(0, h10));
    }

    public final List<f> g() {
        ArrayList arrayList = new ArrayList();
        int h10 = ld.i.h(this);
        if (h10 == -1) {
            h10 = 0;
        } else if (h10 < d().D() && d().i(h10) == 92) {
            h10++;
        }
        int D = d().D();
        int i10 = h10;
        while (h10 < D) {
            if (d().i(h10) == 47 || d().i(h10) == 92) {
                arrayList.add(d().F(i10, h10));
                i10 = h10 + 1;
            }
            h10++;
        }
        if (i10 < d().D()) {
            arrayList.add(d().F(i10, d().D()));
        }
        return arrayList;
    }

    public int hashCode() {
        return d().hashCode();
    }

    public final boolean i() {
        if (ld.i.h(this) != -1) {
            return true;
        }
        return false;
    }

    public final String j() {
        return k().I();
    }

    public final f k() {
        int d10 = ld.i.d(this);
        if (d10 != -1) {
            return f.G(d(), d10 + 1, 0, 2, null);
        }
        if (r() != null && d().D() == 2) {
            return f.f20622r;
        }
        return d();
    }

    public final r0 l() {
        r0 r0Var;
        if (qc.q.d(d(), ld.i.b()) || qc.q.d(d(), ld.i.e()) || qc.q.d(d(), ld.i.a()) || ld.i.g(this)) {
            return null;
        }
        int d10 = ld.i.d(this);
        if (d10 == 2 && r() != null) {
            if (d().D() == 3) {
                return null;
            }
            r0Var = new r0(f.G(d(), 0, 3, 1, null));
        } else if (d10 == 1 && d().E(ld.i.a())) {
            return null;
        } else {
            if (d10 == -1 && r() != null) {
                if (d().D() == 2) {
                    return null;
                }
                r0Var = new r0(f.G(d(), 0, 2, 1, null));
            } else if (d10 == -1) {
                return new r0(ld.i.b());
            } else {
                if (d10 == 0) {
                    r0Var = new r0(f.G(d(), 0, 1, 1, null));
                } else {
                    return new r0(f.G(d(), 0, d10, 1, null));
                }
            }
        }
        return r0Var;
    }

    public final r0 m(r0 r0Var) {
        qc.q.i(r0Var, TaskSetupFragment.TYPE_OTHER);
        if (qc.q.d(f(), r0Var.f())) {
            List<f> g10 = g();
            List<f> g11 = r0Var.g();
            int min = Math.min(g10.size(), g11.size());
            int i10 = 0;
            while (i10 < min && qc.q.d(g10.get(i10), g11.get(i10))) {
                i10++;
            }
            boolean z10 = true;
            if (i10 == min && d().D() == r0Var.d().D()) {
                return a.e(f20670m, ".", false, 1, null);
            }
            if (g11.subList(i10, g11.size()).indexOf(ld.i.c()) != -1) {
                z10 = false;
            }
            if (z10) {
                c cVar = new c();
                f f10 = ld.i.f(r0Var);
                if (f10 == null && (f10 = ld.i.f(this)) == null) {
                    f10 = ld.i.i(f20671p);
                }
                int size = g11.size();
                for (int i11 = i10; i11 < size; i11++) {
                    cVar.B0(ld.i.c());
                    cVar.B0(f10);
                }
                int size2 = g10.size();
                while (i10 < size2) {
                    cVar.B0(g10.get(i10));
                    cVar.B0(f10);
                    i10++;
                }
                return ld.i.q(cVar, false);
            }
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + r0Var).toString());
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + r0Var).toString());
    }

    public final r0 n(String str) {
        qc.q.i(str, "child");
        return ld.i.j(this, ld.i.q(new c().W(str), false), false);
    }

    public final r0 o(r0 r0Var, boolean z10) {
        qc.q.i(r0Var, "child");
        return ld.i.j(this, r0Var, z10);
    }

    public final File p() {
        return new File(toString());
    }

    @IgnoreJRERequirement
    public final Path q() {
        Path path;
        path = Paths.get(toString(), new String[0]);
        qc.q.h(path, "get(toString())");
        return path;
    }

    public final Character r() {
        boolean z10;
        boolean z11 = false;
        if (f.q(d(), ld.i.e(), 0, 2, null) != -1 || d().D() < 2 || d().i(1) != 58) {
            return null;
        }
        char i10 = (char) d().i(0);
        if ('a' <= i10 && i10 < '{') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if ('A' <= i10 && i10 < '[') {
                z11 = true;
            }
            if (!z11) {
                return null;
            }
        }
        return Character.valueOf(i10);
    }

    public String toString() {
        return d().I();
    }
}
