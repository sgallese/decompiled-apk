package a2;

import j0.g3;

/* compiled from: FontFamily.kt */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: m  reason: collision with root package name */
    public static final a f298m = new a(null);

    /* renamed from: p  reason: collision with root package name */
    private static final s0 f299p = new i();

    /* renamed from: q  reason: collision with root package name */
    private static final e0 f300q = new e0("sans-serif", "FontFamily.SansSerif");

    /* renamed from: r  reason: collision with root package name */
    private static final e0 f301r = new e0("serif", "FontFamily.Serif");

    /* renamed from: s  reason: collision with root package name */
    private static final e0 f302s = new e0("monospace", "FontFamily.Monospace");

    /* renamed from: t  reason: collision with root package name */
    private static final e0 f303t = new e0("cursive", "FontFamily.Cursive");

    /* renamed from: f  reason: collision with root package name */
    private final boolean f304f;

    /* compiled from: FontFamily.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final e0 a() {
            return l.f303t;
        }

        public final s0 b() {
            return l.f299p;
        }

        public final e0 c() {
            return l.f302s;
        }

        public final e0 d() {
            return l.f300q;
        }

        public final e0 e() {
            return l.f301r;
        }
    }

    /* compiled from: FontFamily.kt */
    /* loaded from: classes.dex */
    public interface b {
        g3<Object> a(l lVar, c0 c0Var, int i10, int i11);
    }

    public /* synthetic */ l(boolean z10, qc.h hVar) {
        this(z10);
    }

    private l(boolean z10) {
        this.f304f = z10;
    }
}
