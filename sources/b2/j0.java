package b2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: TextFieldValue.kt */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: d  reason: collision with root package name */
    public static final c f7783d = new c(null);

    /* renamed from: e  reason: collision with root package name */
    private static final s0.i<j0, Object> f7784e = s0.j.a(a.f7788f, b.f7789f);

    /* renamed from: a  reason: collision with root package name */
    private final v1.d f7785a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7786b;

    /* renamed from: c  reason: collision with root package name */
    private final v1.i0 f7787c;

    /* compiled from: TextFieldValue.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.p<s0.k, j0, Object> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f7788f = new a();

        a() {
            super(2);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(s0.k kVar, j0 j0Var) {
            ArrayList e10;
            qc.q.i(kVar, "$this$Saver");
            qc.q.i(j0Var, "it");
            e10 = ec.t.e(v1.a0.u(j0Var.e(), v1.a0.e(), kVar), v1.a0.u(v1.i0.b(j0Var.g()), v1.a0.q(v1.i0.f24470b), kVar));
            return e10;
        }
    }

    /* compiled from: TextFieldValue.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<Object, j0> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f7789f = new b();

        b() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final j0 invoke(Object obj) {
            v1.d a10;
            qc.q.i(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            s0.i<v1.d, Object> e10 = v1.a0.e();
            Boolean bool = Boolean.FALSE;
            v1.i0 i0Var = null;
            if (qc.q.d(obj2, bool) || obj2 == null) {
                a10 = null;
            } else {
                a10 = e10.a(obj2);
            }
            qc.q.f(a10);
            Object obj3 = list.get(1);
            s0.i<v1.i0, Object> q10 = v1.a0.q(v1.i0.f24470b);
            if (!qc.q.d(obj3, bool) && obj3 != null) {
                i0Var = q10.a(obj3);
            }
            qc.q.f(i0Var);
            return new j0(a10, i0Var.r(), (v1.i0) null, 4, (qc.h) null);
        }
    }

    /* compiled from: TextFieldValue.kt */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(qc.h hVar) {
            this();
        }
    }

    public /* synthetic */ j0(String str, long j10, v1.i0 i0Var, qc.h hVar) {
        this(str, j10, i0Var);
    }

    public static /* synthetic */ j0 c(j0 j0Var, String str, long j10, v1.i0 i0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = j0Var.f7786b;
        }
        if ((i10 & 4) != 0) {
            i0Var = j0Var.f7787c;
        }
        return j0Var.a(str, j10, i0Var);
    }

    public static /* synthetic */ j0 d(j0 j0Var, v1.d dVar, long j10, v1.i0 i0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = j0Var.f7785a;
        }
        if ((i10 & 2) != 0) {
            j10 = j0Var.f7786b;
        }
        if ((i10 & 4) != 0) {
            i0Var = j0Var.f7787c;
        }
        return j0Var.b(dVar, j10, i0Var);
    }

    public final j0 a(String str, long j10, v1.i0 i0Var) {
        qc.q.i(str, "text");
        qc.h hVar = null;
        return new j0(new v1.d(str, null, null, 6, hVar), j10, i0Var, hVar);
    }

    public final j0 b(v1.d dVar, long j10, v1.i0 i0Var) {
        qc.q.i(dVar, "annotatedString");
        return new j0(dVar, j10, i0Var, (qc.h) null);
    }

    public final v1.d e() {
        return this.f7785a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (v1.i0.g(this.f7786b, j0Var.f7786b) && qc.q.d(this.f7787c, j0Var.f7787c) && qc.q.d(this.f7785a, j0Var.f7785a)) {
            return true;
        }
        return false;
    }

    public final v1.i0 f() {
        return this.f7787c;
    }

    public final long g() {
        return this.f7786b;
    }

    public final String h() {
        return this.f7785a.i();
    }

    public int hashCode() {
        int i10;
        int hashCode = ((this.f7785a.hashCode() * 31) + v1.i0.o(this.f7786b)) * 31;
        v1.i0 i0Var = this.f7787c;
        if (i0Var != null) {
            i10 = v1.i0.o(i0Var.r());
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.f7785a) + "', selection=" + ((Object) v1.i0.q(this.f7786b)) + ", composition=" + this.f7787c + ')';
    }

    public /* synthetic */ j0(v1.d dVar, long j10, v1.i0 i0Var, qc.h hVar) {
        this(dVar, j10, i0Var);
    }

    private j0(v1.d dVar, long j10, v1.i0 i0Var) {
        qc.q.i(dVar, "annotatedString");
        this.f7785a = dVar;
        this.f7786b = v1.j0.c(j10, 0, h().length());
        this.f7787c = i0Var != null ? v1.i0.b(v1.j0.c(i0Var.r(), 0, h().length())) : null;
    }

    public /* synthetic */ j0(v1.d dVar, long j10, v1.i0 i0Var, int i10, qc.h hVar) {
        this(dVar, (i10 & 2) != 0 ? v1.i0.f24470b.a() : j10, (i10 & 4) != 0 ? null : i0Var, (qc.h) null);
    }

    public /* synthetic */ j0(String str, long j10, v1.i0 i0Var, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? v1.i0.f24470b.a() : j10, (i10 & 4) != 0 ? null : i0Var, (qc.h) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private j0(java.lang.String r8, long r9, v1.i0 r11) {
        /*
            r7 = this;
            java.lang.String r0 = "text"
            qc.q.i(r8, r0)
            v1.d r0 = new v1.d
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r0
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = r7
            r2 = r0
            r3 = r9
            r5 = r11
            r1.<init>(r2, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.j0.<init>(java.lang.String, long, v1.i0):void");
    }
}
