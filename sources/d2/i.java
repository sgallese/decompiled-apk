package d2;

import a1.b4;
import a1.c4;
import a1.o0;
import a1.o4;
import a1.p1;
import a1.r1;
import android.text.TextPaint;
import g2.k;

/* compiled from: AndroidTextPaint.android.kt */
/* loaded from: classes.dex */
public final class i extends TextPaint {

    /* renamed from: a  reason: collision with root package name */
    private final b4 f13078a;

    /* renamed from: b  reason: collision with root package name */
    private g2.k f13079b;

    /* renamed from: c  reason: collision with root package name */
    private o4 f13080c;

    /* renamed from: d  reason: collision with root package name */
    private c1.g f13081d;

    public i(int i10, float f10) {
        super(i10);
        ((TextPaint) this).density = f10;
        this.f13078a = o0.b(this);
        this.f13079b = g2.k.f16065b.c();
        this.f13080c = o4.f137d.a();
    }

    public final int a() {
        return this.f13078a.z();
    }

    public final void b(int i10) {
        this.f13078a.h(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r1 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        r0 = r7.f13078a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (java.lang.Float.isNaN(r11) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r11 = r7.f13078a.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        r11 = vc.l.k(r11, 0.0f, 1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r8.a(r9, r0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r0 == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(a1.e1 r8, long r9, float r11) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a1.r4
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1c
            r0 = r8
            a1.r4 r0 = (a1.r4) r0
            long r3 = r0.b()
            a1.p1$a r0 = a1.p1.f146b
            long r5 = r0.e()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 != 0) goto L2e
        L1c:
            boolean r0 = r8 instanceof a1.m4
            if (r0 == 0) goto L48
            z0.l$a r0 = z0.l.f26375b
            long r3 = r0.a()
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            r1 = 0
        L2c:
            if (r1 == 0) goto L48
        L2e:
            a1.b4 r0 = r7.f13078a
            boolean r1 = java.lang.Float.isNaN(r11)
            if (r1 == 0) goto L3d
            a1.b4 r11 = r7.f13078a
            float r11 = r11.d()
            goto L44
        L3d:
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r11 = vc.j.k(r11, r1, r2)
        L44:
            r8.a(r9, r0, r11)
            goto L50
        L48:
            if (r8 != 0) goto L50
            a1.b4 r8 = r7.f13078a
            r9 = 0
            r8.m(r9)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.i.c(a1.e1, long, float):void");
    }

    public final void d(long j10) {
        boolean z10;
        if (j10 != p1.f146b.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f13078a.v(j10);
            this.f13078a.m(null);
        }
    }

    public final void e(c1.g gVar) {
        if (gVar != null && !qc.q.d(this.f13081d, gVar)) {
            this.f13081d = gVar;
            if (qc.q.d(gVar, c1.k.f8683a)) {
                this.f13078a.u(c4.f89a.a());
            } else if (gVar instanceof c1.l) {
                this.f13078a.u(c4.f89a.b());
                c1.l lVar = (c1.l) gVar;
                this.f13078a.x(lVar.f());
                this.f13078a.o(lVar.d());
                this.f13078a.t(lVar.c());
                this.f13078a.g(lVar.b());
                this.f13078a.j(lVar.e());
            }
        }
    }

    public final void f(o4 o4Var) {
        if (o4Var != null && !qc.q.d(this.f13080c, o4Var)) {
            this.f13080c = o4Var;
            if (qc.q.d(o4Var, o4.f137d.a())) {
                clearShadowLayer();
            } else {
                setShadowLayer(e2.h.b(this.f13080c.b()), z0.f.o(this.f13080c.d()), z0.f.p(this.f13080c.d()), r1.k(this.f13080c.c()));
            }
        }
    }

    public final void g(g2.k kVar) {
        if (kVar != null && !qc.q.d(this.f13079b, kVar)) {
            this.f13079b = kVar;
            k.a aVar = g2.k.f16065b;
            setUnderlineText(kVar.d(aVar.d()));
            setStrikeThruText(this.f13079b.d(aVar.b()));
        }
    }
}
