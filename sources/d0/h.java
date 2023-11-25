package d0;

import c0.z0;
import e0.q;
import j0.f2;
import n1.s;
import qc.r;
import v1.g0;

/* compiled from: SelectionController.kt */
/* loaded from: classes.dex */
public final class h implements f2 {

    /* renamed from: f  reason: collision with root package name */
    private final q f13016f;

    /* renamed from: m  reason: collision with root package name */
    private final long f13017m;

    /* renamed from: p  reason: collision with root package name */
    private j f13018p;

    /* renamed from: q  reason: collision with root package name */
    private e0.i f13019q;

    /* renamed from: r  reason: collision with root package name */
    private final long f13020r;

    /* renamed from: s  reason: collision with root package name */
    private final androidx.compose.ui.e f13021s;

    /* compiled from: SelectionController.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.a<s> {
        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final s invoke() {
            return h.this.f13018p.d();
        }
    }

    /* compiled from: SelectionController.kt */
    /* loaded from: classes.dex */
    static final class b extends r implements pc.a<g0> {
        b() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final g0 invoke() {
            return h.this.f13018p.e();
        }
    }

    /* compiled from: SelectionController.kt */
    /* loaded from: classes.dex */
    static final class c extends r implements pc.a<s> {
        c() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final s invoke() {
            return h.this.f13018p.d();
        }
    }

    /* compiled from: SelectionController.kt */
    /* loaded from: classes.dex */
    static final class d extends r implements pc.a<g0> {
        d() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final g0 invoke() {
            return h.this.f13018p.e();
        }
    }

    public /* synthetic */ h(q qVar, long j10, j jVar, qc.h hVar) {
        this(qVar, j10, jVar);
    }

    @Override // j0.f2
    public void b() {
        e0.i iVar = this.f13019q;
        if (iVar != null) {
            this.f13016f.b(iVar);
            this.f13019q = null;
        }
    }

    @Override // j0.f2
    public void c() {
        e0.i iVar = this.f13019q;
        if (iVar != null) {
            this.f13016f.b(iVar);
            this.f13019q = null;
        }
    }

    @Override // j0.f2
    public void d() {
        this.f13019q = this.f13016f.a(new e0.h(this.f13020r, new c(), new d()));
    }

    public final void e(c1.f fVar) {
        qc.q.i(fVar, "drawScope");
        e0.j jVar = this.f13016f.f().get(Long.valueOf(this.f13020r));
        if (jVar == null) {
            return;
        }
        if (!jVar.b()) {
            jVar.c();
            throw null;
        } else {
            jVar.a();
            throw null;
        }
    }

    public final androidx.compose.ui.e f() {
        return this.f13021s;
    }

    public final void g(s sVar) {
        qc.q.i(sVar, "coordinates");
        this.f13018p = j.c(this.f13018p, sVar, null, 2, null);
    }

    public final void h(g0 g0Var) {
        qc.q.i(g0Var, "textLayoutResult");
        this.f13018p = j.c(this.f13018p, null, g0Var, 1, null);
    }

    private h(q qVar, long j10, j jVar) {
        androidx.compose.ui.e c10;
        qc.q.i(qVar, "selectionRegistrar");
        qc.q.i(jVar, "params");
        this.f13016f = qVar;
        this.f13017m = j10;
        this.f13018p = jVar;
        long c11 = qVar.c();
        this.f13020r = c11;
        c10 = i.c(qVar, c11, new a(), new b(), z0.a());
        this.f13021s = c0.e.a(c10, qVar);
    }

    public /* synthetic */ h(q qVar, long j10, j jVar, int i10, qc.h hVar) {
        this(qVar, j10, (i10 & 4) != 0 ? j.f13042c.a() : jVar, null);
    }
}
