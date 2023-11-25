package a2;

import androidx.recyclerview.widget.m;
import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import java.util.List;

/* compiled from: FontWeight.kt */
/* loaded from: classes.dex */
public final class c0 implements Comparable<c0> {
    private static final c0 A;
    private static final c0 B;
    private static final c0 C;
    private static final c0 D;
    private static final c0 E;
    private static final c0 F;
    private static final c0 G;
    private static final List<c0> H;

    /* renamed from: m  reason: collision with root package name */
    public static final a f239m = new a(null);

    /* renamed from: p  reason: collision with root package name */
    private static final c0 f240p;

    /* renamed from: q  reason: collision with root package name */
    private static final c0 f241q;

    /* renamed from: r  reason: collision with root package name */
    private static final c0 f242r;

    /* renamed from: s  reason: collision with root package name */
    private static final c0 f243s;

    /* renamed from: t  reason: collision with root package name */
    private static final c0 f244t;

    /* renamed from: u  reason: collision with root package name */
    private static final c0 f245u;

    /* renamed from: v  reason: collision with root package name */
    private static final c0 f246v;

    /* renamed from: w  reason: collision with root package name */
    private static final c0 f247w;

    /* renamed from: x  reason: collision with root package name */
    private static final c0 f248x;

    /* renamed from: y  reason: collision with root package name */
    private static final c0 f249y;

    /* renamed from: z  reason: collision with root package name */
    private static final c0 f250z;

    /* renamed from: f  reason: collision with root package name */
    private final int f251f;

    /* compiled from: FontWeight.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final c0 a() {
            return c0.G;
        }

        public final c0 b() {
            return c0.E;
        }

        public final c0 c() {
            return c0.A;
        }

        public final c0 d() {
            return c0.C;
        }

        public final c0 e() {
            return c0.B;
        }

        public final c0 f() {
            return c0.D;
        }

        public final c0 g() {
            return c0.f249y;
        }

        public final c0 h() {
            return c0.f240p;
        }

        public final c0 i() {
            return c0.f241q;
        }

        public final c0 j() {
            return c0.f242r;
        }

        public final c0 k() {
            return c0.f243s;
        }

        public final c0 l() {
            return c0.f244t;
        }

        public final c0 m() {
            return c0.f245u;
        }

        public final c0 n() {
            return c0.f246v;
        }

        public final c0 o() {
            return c0.f247w;
        }

        public final c0 p() {
            return c0.f248x;
        }
    }

    static {
        c0 c0Var = new c0(100);
        f240p = c0Var;
        c0 c0Var2 = new c0(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        f241q = c0Var2;
        c0 c0Var3 = new c0(300);
        f242r = c0Var3;
        c0 c0Var4 = new c0(400);
        f243s = c0Var4;
        c0 c0Var5 = new c0(500);
        f244t = c0Var5;
        c0 c0Var6 = new c0(600);
        f245u = c0Var6;
        c0 c0Var7 = new c0(700);
        f246v = c0Var7;
        c0 c0Var8 = new c0(800);
        f247w = c0Var8;
        c0 c0Var9 = new c0(900);
        f248x = c0Var9;
        f249y = c0Var;
        f250z = c0Var2;
        A = c0Var3;
        B = c0Var4;
        C = c0Var5;
        D = c0Var6;
        E = c0Var7;
        F = c0Var8;
        G = c0Var9;
        H = ec.r.l(c0Var, c0Var2, c0Var3, c0Var4, c0Var5, c0Var6, c0Var7, c0Var8, c0Var9);
    }

    public c0(int i10) {
        this.f251f = i10;
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i10).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c0) && this.f251f == ((c0) obj).f251f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f251f;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f251f + ')';
    }

    @Override // java.lang.Comparable
    /* renamed from: u  reason: merged with bridge method [inline-methods] */
    public int compareTo(c0 c0Var) {
        qc.q.i(c0Var, TaskSetupFragment.TYPE_OTHER);
        return qc.q.k(this.f251f, c0Var.f251f);
    }

    public final int v() {
        return this.f251f;
    }
}
