package c0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: UndoManager.kt */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    private final int f8171a;

    /* renamed from: b  reason: collision with root package name */
    private a f8172b;

    /* renamed from: c  reason: collision with root package name */
    private a f8173c;

    /* renamed from: d  reason: collision with root package name */
    private int f8174d;

    /* renamed from: e  reason: collision with root package name */
    private Long f8175e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8176f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UndoManager.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private a f8177a;

        /* renamed from: b  reason: collision with root package name */
        private b2.j0 f8178b;

        public a(a aVar, b2.j0 j0Var) {
            qc.q.i(j0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.f8177a = aVar;
            this.f8178b = j0Var;
        }

        public final a a() {
            return this.f8177a;
        }

        public final b2.j0 b() {
            return this.f8178b;
        }

        public final void c(a aVar) {
            this.f8177a = aVar;
        }

        public final void d(b2.j0 j0Var) {
            qc.q.i(j0Var, "<set-?>");
            this.f8178b = j0Var;
        }
    }

    public a1() {
        this(0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[LOOP:0: B:8:0x000e->B:14:0x001e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0023 A[EDGE_INSN: B:19:0x0023->B:15:0x0023 BREAK  A[LOOP:0: B:8:0x000e->B:14:0x001e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d() {
        /*
            r3 = this;
            c0.a1$a r0 = r3.f8172b
            r1 = 0
            if (r0 == 0) goto La
            c0.a1$a r2 = r0.a()
            goto Lb
        La:
            r2 = r1
        Lb:
            if (r2 != 0) goto Le
            return
        Le:
            if (r0 == 0) goto L1b
            c0.a1$a r2 = r0.a()
            if (r2 == 0) goto L1b
            c0.a1$a r2 = r2.a()
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L23
            c0.a1$a r0 = r0.a()
            goto Le
        L23:
            if (r0 != 0) goto L26
            goto L29
        L26:
            r0.c(r1)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.a1.d():void");
    }

    public static /* synthetic */ void f(a1 a1Var, b2.j0 j0Var, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = c1.a();
        }
        a1Var.e(j0Var, j10);
    }

    public final void a() {
        this.f8176f = true;
    }

    public final void b(b2.j0 j0Var) {
        b2.j0 j0Var2;
        String str;
        b2.j0 b10;
        qc.q.i(j0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f8176f = false;
        a aVar = this.f8172b;
        if (aVar != null) {
            j0Var2 = aVar.b();
        } else {
            j0Var2 = null;
        }
        if (qc.q.d(j0Var, j0Var2)) {
            return;
        }
        String h10 = j0Var.h();
        a aVar2 = this.f8172b;
        if (aVar2 != null && (b10 = aVar2.b()) != null) {
            str = b10.h();
        } else {
            str = null;
        }
        if (qc.q.d(h10, str)) {
            a aVar3 = this.f8172b;
            if (aVar3 != null) {
                aVar3.d(j0Var);
                return;
            }
            return;
        }
        this.f8172b = new a(this.f8172b, j0Var);
        this.f8173c = null;
        int length = this.f8174d + j0Var.h().length();
        this.f8174d = length;
        if (length > this.f8171a) {
            d();
        }
    }

    public final b2.j0 c() {
        a aVar = this.f8173c;
        if (aVar != null) {
            this.f8173c = aVar.a();
            this.f8172b = new a(this.f8172b, aVar.b());
            this.f8174d += aVar.b().h().length();
            return aVar.b();
        }
        return null;
    }

    public final void e(b2.j0 j0Var, long j10) {
        long j11;
        qc.q.i(j0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (!this.f8176f) {
            Long l10 = this.f8175e;
            if (l10 != null) {
                j11 = l10.longValue();
            } else {
                j11 = 0;
            }
            if (j10 <= j11 + b1.a()) {
                return;
            }
        }
        this.f8175e = Long.valueOf(j10);
        b(j0Var);
    }

    public final b2.j0 g() {
        a a10;
        a aVar = this.f8172b;
        if (aVar == null || (a10 = aVar.a()) == null) {
            return null;
        }
        this.f8172b = a10;
        this.f8174d -= aVar.b().h().length();
        this.f8173c = new a(this.f8173c, aVar.b());
        return a10.b();
    }

    public a1(int i10) {
        this.f8171a = i10;
    }

    public /* synthetic */ a1(int i10, int i11, qc.h hVar) {
        this((i11 & 1) != 0 ? 100000 : i10);
    }
}
