package e0;

import b2.j0;
import c0.v0;
import java.util.List;
import v1.i0;

/* compiled from: TextPreparedSelection.kt */
/* loaded from: classes.dex */
public final class t extends b<t> {

    /* renamed from: i  reason: collision with root package name */
    private final j0 f13680i;

    /* renamed from: j  reason: collision with root package name */
    private final v0 f13681j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t(b2.j0 r10, b2.x r11, c0.v0 r12, e0.y r13) {
        /*
            r9 = this;
            java.lang.String r0 = "currentValue"
            qc.q.i(r10, r0)
            java.lang.String r0 = "offsetMapping"
            qc.q.i(r11, r0)
            java.lang.String r0 = "state"
            qc.q.i(r13, r0)
            v1.d r2 = r10.e()
            long r3 = r10.g()
            if (r12 == 0) goto L1e
            v1.g0 r0 = r12.i()
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r5 = r0
            r8 = 0
            r1 = r9
            r6 = r11
            r7 = r13
            r1.<init>(r2, r3, r5, r6, r7, r8)
            r9.f13680i = r10
            r9.f13681j = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.t.<init>(b2.j0, b2.x, c0.v0, e0.y):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int c0(c0.v0 r6, int r7) {
        /*
            r5 = this;
            n1.s r0 = r6.c()
            if (r0 == 0) goto L15
            n1.s r1 = r6.b()
            r2 = 0
            if (r1 == 0) goto L13
            r3 = 0
            r4 = 2
            z0.h r2 = n1.r.a(r1, r0, r3, r4, r2)
        L13:
            if (r2 != 0) goto L1b
        L15:
            z0.h$a r0 = z0.h.f26359e
            z0.h r2 = r0.a()
        L1b:
            b2.x r0 = r5.p()
            b2.j0 r1 = r5.f13680i
            long r3 = r1.g()
            int r1 = v1.i0.i(r3)
            int r0 = r0.b(r1)
            v1.g0 r1 = r6.i()
            z0.h r0 = r1.d(r0)
            float r1 = r0.i()
            float r0 = r0.l()
            long r2 = r2.k()
            float r2 = z0.l.g(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r0 = r0 + r2
            b2.x r7 = r5.p()
            v1.g0 r6 = r6.i()
            long r0 = z0.g.a(r1, r0)
            int r6 = r6.w(r0)
            int r6 = r7.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.t.c0(c0.v0, int):int");
    }

    public final List<b2.f> a0(pc.l<? super t, ? extends b2.f> lVar) {
        List<b2.f> l10;
        List<b2.f> d10;
        qc.q.i(lVar, "or");
        if (!i0.h(w())) {
            l10 = ec.t.l(new b2.b("", 0), new b2.i0(i0.l(w()), i0.l(w())));
            return l10;
        }
        b2.f invoke = lVar.invoke(this);
        if (invoke != null) {
            d10 = ec.s.d(invoke);
            return d10;
        }
        return null;
    }

    public final j0 b0() {
        return j0.d(this.f13680i, e(), w(), null, 4, null);
    }

    public final t d0() {
        boolean z10;
        v0 v0Var;
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (v0Var = this.f13681j) != null) {
            V(c0(v0Var, 1));
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final t e0() {
        boolean z10;
        v0 v0Var;
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (v0Var = this.f13681j) != null) {
            V(c0(v0Var, -1));
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }
}
