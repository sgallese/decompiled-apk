package e1;

import a1.a1;
import a1.e1;
import a1.p1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ImageVector.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: j  reason: collision with root package name */
    public static final b f13756j = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f13757a;

    /* renamed from: b  reason: collision with root package name */
    private final float f13758b;

    /* renamed from: c  reason: collision with root package name */
    private final float f13759c;

    /* renamed from: d  reason: collision with root package name */
    private final float f13760d;

    /* renamed from: e  reason: collision with root package name */
    private final float f13761e;

    /* renamed from: f  reason: collision with root package name */
    private final s f13762f;

    /* renamed from: g  reason: collision with root package name */
    private final long f13763g;

    /* renamed from: h  reason: collision with root package name */
    private final int f13764h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f13765i;

    /* compiled from: ImageVector.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f13766a;

        /* renamed from: b  reason: collision with root package name */
        private final float f13767b;

        /* renamed from: c  reason: collision with root package name */
        private final float f13768c;

        /* renamed from: d  reason: collision with root package name */
        private final float f13769d;

        /* renamed from: e  reason: collision with root package name */
        private final float f13770e;

        /* renamed from: f  reason: collision with root package name */
        private final long f13771f;

        /* renamed from: g  reason: collision with root package name */
        private final int f13772g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f13773h;

        /* renamed from: i  reason: collision with root package name */
        private final ArrayList<C0329a> f13774i;

        /* renamed from: j  reason: collision with root package name */
        private C0329a f13775j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f13776k;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: ImageVector.kt */
        /* renamed from: e1.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0329a {

            /* renamed from: a  reason: collision with root package name */
            private String f13777a;

            /* renamed from: b  reason: collision with root package name */
            private float f13778b;

            /* renamed from: c  reason: collision with root package name */
            private float f13779c;

            /* renamed from: d  reason: collision with root package name */
            private float f13780d;

            /* renamed from: e  reason: collision with root package name */
            private float f13781e;

            /* renamed from: f  reason: collision with root package name */
            private float f13782f;

            /* renamed from: g  reason: collision with root package name */
            private float f13783g;

            /* renamed from: h  reason: collision with root package name */
            private float f13784h;

            /* renamed from: i  reason: collision with root package name */
            private List<? extends i> f13785i;

            /* renamed from: j  reason: collision with root package name */
            private List<u> f13786j;

            public C0329a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }

            public final List<u> a() {
                return this.f13786j;
            }

            public final List<i> b() {
                return this.f13785i;
            }

            public final String c() {
                return this.f13777a;
            }

            public final float d() {
                return this.f13779c;
            }

            public final float e() {
                return this.f13780d;
            }

            public final float f() {
                return this.f13778b;
            }

            public final float g() {
                return this.f13781e;
            }

            public final float h() {
                return this.f13782f;
            }

            public final float i() {
                return this.f13783g;
            }

            public final float j() {
                return this.f13784h;
            }

            public C0329a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends i> list, List<u> list2) {
                qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                qc.q.i(list, "clipPathData");
                qc.q.i(list2, "children");
                this.f13777a = str;
                this.f13778b = f10;
                this.f13779c = f11;
                this.f13780d = f12;
                this.f13781e = f13;
                this.f13782f = f14;
                this.f13783g = f15;
                this.f13784h = f16;
                this.f13785i = list;
                this.f13786j = list2;
            }

            public /* synthetic */ C0329a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, qc.h hVar) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) == 0 ? f14 : 1.0f, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) == 0 ? f16 : 0.0f, (i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? t.e() : list, (i10 & 512) != 0 ? new ArrayList() : list2);
            }
        }

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, qc.h hVar) {
            this(str, f10, f11, f12, f13, j10, i10, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a b(a aVar, String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i10, Object obj) {
            String str2;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            List<i> list2;
            if ((i10 & 1) != 0) {
                str2 = "";
            } else {
                str2 = str;
            }
            float f22 = 0.0f;
            if ((i10 & 2) != 0) {
                f17 = 0.0f;
            } else {
                f17 = f10;
            }
            if ((i10 & 4) != 0) {
                f18 = 0.0f;
            } else {
                f18 = f11;
            }
            if ((i10 & 8) != 0) {
                f19 = 0.0f;
            } else {
                f19 = f12;
            }
            float f23 = 1.0f;
            if ((i10 & 16) != 0) {
                f20 = 1.0f;
            } else {
                f20 = f13;
            }
            if ((i10 & 32) == 0) {
                f23 = f14;
            }
            if ((i10 & 64) != 0) {
                f21 = 0.0f;
            } else {
                f21 = f15;
            }
            if ((i10 & 128) == 0) {
                f22 = f16;
            }
            if ((i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                list2 = t.e();
            } else {
                list2 = list;
            }
            return aVar.a(str2, f17, f18, f19, f20, f23, f21, f22, list2);
        }

        private final s d(C0329a c0329a) {
            return new s(c0329a.c(), c0329a.f(), c0329a.d(), c0329a.e(), c0329a.g(), c0329a.h(), c0329a.i(), c0329a.j(), c0329a.b(), c0329a.a());
        }

        private final void g() {
            if ((!this.f13776k) != false) {
                return;
            }
            throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
        }

        private final C0329a h() {
            Object d10;
            d10 = g.d(this.f13774i);
            return (C0329a) d10;
        }

        public final a a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends i> list) {
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            qc.q.i(list, "clipPathData");
            g();
            g.f(this.f13774i, new C0329a(str, f10, f11, f12, f13, f14, f15, f16, list, null, 512, null));
            return this;
        }

        public final a c(List<? extends i> list, int i10, String str, e1 e1Var, float f10, e1 e1Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
            qc.q.i(list, "pathData");
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            g();
            h().a().add(new x(str, list, i10, e1Var, f10, e1Var2, f11, f12, i11, i12, f13, f14, f15, f16, null));
            return this;
        }

        public final f e() {
            g();
            while (this.f13774i.size() > 1) {
                f();
            }
            f fVar = new f(this.f13766a, this.f13767b, this.f13768c, this.f13769d, this.f13770e, d(this.f13775j), this.f13771f, this.f13772g, this.f13773h, null);
            this.f13776k = true;
            return fVar;
        }

        public final a f() {
            Object e10;
            g();
            e10 = g.e(this.f13774i);
            h().a().add(d((C0329a) e10));
            return this;
        }

        private a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10) {
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.f13766a = str;
            this.f13767b = f10;
            this.f13768c = f11;
            this.f13769d = f12;
            this.f13770e = f13;
            this.f13771f = j10;
            this.f13772g = i10;
            this.f13773h = z10;
            ArrayList<C0329a> arrayList = new ArrayList<>();
            this.f13774i = arrayList;
            C0329a c0329a = new C0329a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.f13775j = c0329a;
            g.f(arrayList, c0329a);
        }

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, int i11, qc.h hVar) {
            this((i11 & 1) != 0 ? "" : str, f10, f11, f12, f13, (i11 & 32) != 0 ? p1.f146b.e() : j10, (i11 & 64) != 0 ? a1.f62b.z() : i10, (i11 & 128) != 0 ? false : z10, null);
        }
    }

    /* compiled from: ImageVector.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }
    }

    public /* synthetic */ f(String str, float f10, float f11, float f12, float f13, s sVar, long j10, int i10, boolean z10, qc.h hVar) {
        this(str, f10, f11, f12, f13, sVar, j10, i10, z10);
    }

    public final boolean a() {
        return this.f13765i;
    }

    public final float b() {
        return this.f13759c;
    }

    public final float c() {
        return this.f13758b;
    }

    public final String d() {
        return this.f13757a;
    }

    public final s e() {
        return this.f13762f;
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!qc.q.d(this.f13757a, fVar.f13757a) || !j2.h.l(this.f13758b, fVar.f13758b) || !j2.h.l(this.f13759c, fVar.f13759c)) {
            return false;
        }
        if (this.f13760d == fVar.f13760d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (this.f13761e == fVar.f13761e) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && qc.q.d(this.f13762f, fVar.f13762f) && p1.q(this.f13763g, fVar.f13763g) && a1.G(this.f13764h, fVar.f13764h) && this.f13765i == fVar.f13765i) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f13764h;
    }

    public final long g() {
        return this.f13763g;
    }

    public final float h() {
        return this.f13761e;
    }

    public int hashCode() {
        return (((((((((((((((this.f13757a.hashCode() * 31) + j2.h.m(this.f13758b)) * 31) + j2.h.m(this.f13759c)) * 31) + Float.floatToIntBits(this.f13760d)) * 31) + Float.floatToIntBits(this.f13761e)) * 31) + this.f13762f.hashCode()) * 31) + p1.w(this.f13763g)) * 31) + a1.H(this.f13764h)) * 31) + t.k.a(this.f13765i);
    }

    public final float i() {
        return this.f13760d;
    }

    private f(String str, float f10, float f11, float f12, float f13, s sVar, long j10, int i10, boolean z10) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        qc.q.i(sVar, "root");
        this.f13757a = str;
        this.f13758b = f10;
        this.f13759c = f11;
        this.f13760d = f12;
        this.f13761e = f13;
        this.f13762f = sVar;
        this.f13763g = j10;
        this.f13764h = i10;
        this.f13765i = z10;
    }
}
