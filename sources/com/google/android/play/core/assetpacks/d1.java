package com.google.android.play.core.assetpacks;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class d1 {

    /* renamed from: k  reason: collision with root package name */
    private static final x7.f f10749k = new x7.f("ExtractorLooper");

    /* renamed from: a  reason: collision with root package name */
    private final v1 f10750a;

    /* renamed from: b  reason: collision with root package name */
    private final x0 f10751b;

    /* renamed from: c  reason: collision with root package name */
    private final e3 f10752c;

    /* renamed from: d  reason: collision with root package name */
    private final h2 f10753d;

    /* renamed from: e  reason: collision with root package name */
    private final m2 f10754e;

    /* renamed from: f  reason: collision with root package name */
    private final t2 f10755f;

    /* renamed from: g  reason: collision with root package name */
    private final x2 f10756g;

    /* renamed from: h  reason: collision with root package name */
    private final x7.b0 f10757h;

    /* renamed from: i  reason: collision with root package name */
    private final y1 f10758i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicBoolean f10759j = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(v1 v1Var, x7.b0 b0Var, x0 x0Var, e3 e3Var, h2 h2Var, m2 m2Var, t2 t2Var, x2 x2Var, y1 y1Var) {
        this.f10750a = v1Var;
        this.f10757h = b0Var;
        this.f10751b = x0Var;
        this.f10752c = e3Var;
        this.f10753d = h2Var;
        this.f10754e = m2Var;
        this.f10755f = t2Var;
        this.f10756g = x2Var;
        this.f10758i = y1Var;
    }

    private final void b(int i10, Exception exc) {
        try {
            this.f10750a.k(i10, 5);
            this.f10750a.l(i10);
        } catch (c1 unused) {
            f10749k.b("Error during error handling: %s", exc.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        x1 x1Var;
        x7.f fVar = f10749k;
        fVar.a("Run extractor loop", new Object[0]);
        if (!this.f10759j.compareAndSet(false, true)) {
            fVar.e("runLoop already looping; return", new Object[0]);
            return;
        }
        while (true) {
            try {
                x1Var = this.f10758i.a();
            } catch (c1 e10) {
                f10749k.b("Error while getting next extraction task: %s", e10.getMessage());
                if (e10.f10729f >= 0) {
                    ((t3) this.f10757h.zza()).zzi(e10.f10729f);
                    b(e10.f10729f, e10);
                }
                x1Var = null;
            }
            if (x1Var != null) {
                try {
                    if (x1Var instanceof w0) {
                        this.f10751b.a((w0) x1Var);
                    } else if (x1Var instanceof d3) {
                        this.f10752c.a((d3) x1Var);
                    } else if (x1Var instanceof g2) {
                        this.f10753d.a((g2) x1Var);
                    } else if (x1Var instanceof j2) {
                        this.f10754e.a((j2) x1Var);
                    } else if (x1Var instanceof s2) {
                        this.f10755f.a((s2) x1Var);
                    } else if (x1Var instanceof v2) {
                        this.f10756g.a((v2) x1Var);
                    } else {
                        f10749k.b("Unknown task type: %s", x1Var.getClass().getName());
                    }
                } catch (Exception e11) {
                    f10749k.b("Error during extraction task: %s", e11.getMessage());
                    ((t3) this.f10757h.zza()).zzi(x1Var.f11085a);
                    b(x1Var.f11085a, e11);
                }
            } else {
                this.f10759j.set(false);
                return;
            }
        }
    }
}
