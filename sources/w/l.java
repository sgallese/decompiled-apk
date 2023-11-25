package w;

import n1.y0;
import v0.b;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final b f25177a = new b(null);

    /* renamed from: b  reason: collision with root package name */
    private static final l f25178b = a.f25181e;

    /* renamed from: c  reason: collision with root package name */
    private static final l f25179c = e.f25184e;

    /* renamed from: d  reason: collision with root package name */
    private static final l f25180d = c.f25182e;

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    private static final class a extends l {

        /* renamed from: e  reason: collision with root package name */
        public static final a f25181e = new a();

        private a() {
            super(null);
        }

        @Override // w.l
        public int a(int i10, j2.r rVar, y0 y0Var, int i11) {
            qc.q.i(rVar, "layoutDirection");
            qc.q.i(y0Var, "placeable");
            return i10 / 2;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }

        public final l a(b.InterfaceC0571b interfaceC0571b) {
            qc.q.i(interfaceC0571b, "horizontal");
            return new d(interfaceC0571b);
        }

        public final l b(b.c cVar) {
            qc.q.i(cVar, "vertical");
            return new f(cVar);
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    private static final class c extends l {

        /* renamed from: e  reason: collision with root package name */
        public static final c f25182e = new c();

        private c() {
            super(null);
        }

        @Override // w.l
        public int a(int i10, j2.r rVar, y0 y0Var, int i11) {
            qc.q.i(rVar, "layoutDirection");
            qc.q.i(y0Var, "placeable");
            if (rVar != j2.r.Ltr) {
                return 0;
            }
            return i10;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    private static final class d extends l {

        /* renamed from: e  reason: collision with root package name */
        private final b.InterfaceC0571b f25183e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b.InterfaceC0571b interfaceC0571b) {
            super(null);
            qc.q.i(interfaceC0571b, "horizontal");
            this.f25183e = interfaceC0571b;
        }

        @Override // w.l
        public int a(int i10, j2.r rVar, y0 y0Var, int i11) {
            qc.q.i(rVar, "layoutDirection");
            qc.q.i(y0Var, "placeable");
            return this.f25183e.a(0, i10, rVar);
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    private static final class e extends l {

        /* renamed from: e  reason: collision with root package name */
        public static final e f25184e = new e();

        private e() {
            super(null);
        }

        @Override // w.l
        public int a(int i10, j2.r rVar, y0 y0Var, int i11) {
            qc.q.i(rVar, "layoutDirection");
            qc.q.i(y0Var, "placeable");
            if (rVar == j2.r.Ltr) {
                return 0;
            }
            return i10;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    private static final class f extends l {

        /* renamed from: e  reason: collision with root package name */
        private final b.c f25185e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b.c cVar) {
            super(null);
            qc.q.i(cVar, "vertical");
            this.f25185e = cVar;
        }

        @Override // w.l
        public int a(int i10, j2.r rVar, y0 y0Var, int i11) {
            qc.q.i(rVar, "layoutDirection");
            qc.q.i(y0Var, "placeable");
            return this.f25185e.a(0, i10);
        }
    }

    public /* synthetic */ l(qc.h hVar) {
        this();
    }

    public abstract int a(int i10, j2.r rVar, y0 y0Var, int i11);

    public Integer b(y0 y0Var) {
        qc.q.i(y0Var, "placeable");
        return null;
    }

    public boolean c() {
        return false;
    }

    private l() {
    }
}
