package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.m1;
import dc.w;
import p1.u0;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Padding.kt */
/* loaded from: classes.dex */
public final class PaddingElement extends u0<k> {

    /* renamed from: c  reason: collision with root package name */
    private float f2026c;

    /* renamed from: d  reason: collision with root package name */
    private float f2027d;

    /* renamed from: e  reason: collision with root package name */
    private float f2028e;

    /* renamed from: f  reason: collision with root package name */
    private float f2029f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2030g;

    /* renamed from: h  reason: collision with root package name */
    private final pc.l<m1, w> f2031h;

    public /* synthetic */ PaddingElement(float f10, float f11, float f12, float f13, boolean z10, pc.l lVar, qc.h hVar) {
        this(f10, f11, f12, f13, z10, lVar);
    }

    public boolean equals(Object obj) {
        PaddingElement paddingElement;
        if (obj instanceof PaddingElement) {
            paddingElement = (PaddingElement) obj;
        } else {
            paddingElement = null;
        }
        if (paddingElement == null || !j2.h.l(this.f2026c, paddingElement.f2026c) || !j2.h.l(this.f2027d, paddingElement.f2027d) || !j2.h.l(this.f2028e, paddingElement.f2028e) || !j2.h.l(this.f2029f, paddingElement.f2029f) || this.f2030g != paddingElement.f2030g) {
            return false;
        }
        return true;
    }

    @Override // p1.u0
    public int hashCode() {
        return (((((((j2.h.m(this.f2026c) * 31) + j2.h.m(this.f2027d)) * 31) + j2.h.m(this.f2028e)) * 31) + j2.h.m(this.f2029f)) * 31) + t.k.a(this.f2030g);
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public k e() {
        return new k(this.f2026c, this.f2027d, this.f2028e, this.f2029f, this.f2030g, null);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(k kVar) {
        q.i(kVar, "node");
        kVar.O1(this.f2026c);
        kVar.P1(this.f2027d);
        kVar.M1(this.f2028e);
        kVar.L1(this.f2029f);
        kVar.N1(this.f2030g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private PaddingElement(float r2, float r3, float r4, float r5, boolean r6, pc.l<? super androidx.compose.ui.platform.m1, dc.w> r7) {
        /*
            r1 = this;
            java.lang.String r0 = "inspectorInfo"
            qc.q.i(r7, r0)
            r1.<init>()
            r1.f2026c = r2
            r1.f2027d = r3
            r1.f2028e = r4
            r1.f2029f = r5
            r1.f2030g = r6
            r1.f2031h = r7
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L25
            j2.h$a r4 = j2.h.f18979m
            float r4 = r4.b()
            boolean r2 = j2.h.l(r2, r4)
            if (r2 == 0) goto L5c
        L25:
            float r2 = r1.f2027d
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L37
            j2.h$a r4 = j2.h.f18979m
            float r4 = r4.b()
            boolean r2 = j2.h.l(r2, r4)
            if (r2 == 0) goto L5c
        L37:
            float r2 = r1.f2028e
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L49
            j2.h$a r4 = j2.h.f18979m
            float r4 = r4.b()
            boolean r2 = j2.h.l(r2, r4)
            if (r2 == 0) goto L5c
        L49:
            float r2 = r1.f2029f
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L5e
            j2.h$a r3 = j2.h.f18979m
            float r3 = r3.b()
            boolean r2 = j2.h.l(r2, r3)
            if (r2 == 0) goto L5c
            goto L5e
        L5c:
            r2 = 0
            goto L5f
        L5e:
            r2 = 1
        L5f:
            if (r2 == 0) goto L62
            return
        L62:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Padding must be non-negative"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.PaddingElement.<init>(float, float, float, float, boolean, pc.l):void");
    }
}
