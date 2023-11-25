package a2;

import j0.g3;

/* compiled from: FontFamilyResolver.kt */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    private final d2.s f354a = d2.r.a();

    /* renamed from: b  reason: collision with root package name */
    private final z1.b<x0, z0> f355b = new z1.b<>(16);

    /* compiled from: FontFamilyResolver.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<z0, dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ x0 f357m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x0 x0Var) {
            super(1);
            this.f357m = x0Var;
        }

        public final void a(z0 z0Var) {
            qc.q.i(z0Var, "finalResult");
            d2.s b10 = y0.this.b();
            y0 y0Var = y0.this;
            x0 x0Var = this.f357m;
            synchronized (b10) {
                if (z0Var.g()) {
                    y0Var.f355b.e(x0Var, z0Var);
                } else {
                    y0Var.f355b.f(x0Var);
                }
                dc.w wVar = dc.w.f13270a;
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(z0 z0Var) {
            a(z0Var);
            return dc.w.f13270a;
        }
    }

    public final d2.s b() {
        return this.f354a;
    }

    public final g3<Object> c(x0 x0Var, pc.l<? super pc.l<? super z0, dc.w>, ? extends z0> lVar) {
        qc.q.i(x0Var, "typefaceRequest");
        qc.q.i(lVar, "resolveTypeface");
        synchronized (this.f354a) {
            z0 d10 = this.f355b.d(x0Var);
            if (d10 != null) {
                if (d10.g()) {
                    return d10;
                }
                this.f355b.f(x0Var);
            }
            try {
                z0 invoke = lVar.invoke(new a(x0Var));
                synchronized (this.f354a) {
                    if (this.f355b.d(x0Var) == null && invoke.g()) {
                        this.f355b.e(x0Var, invoke);
                    }
                    dc.w wVar = dc.w.f13270a;
                }
                return invoke;
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
    }
}
