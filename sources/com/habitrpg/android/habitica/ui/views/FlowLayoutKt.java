package com.habitrpg.android.habitica.ui.views;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dc.w;
import ec.u;
import j0.g2;
import j0.i2;
import j0.l3;
import j0.n;
import j0.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n1.g0;
import n1.h0;
import n1.i0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.x;
import n1.y0;
import p1.g;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: FlowLayout.kt */
/* loaded from: classes4.dex */
public final class FlowLayoutKt {
    public static final void FlowLayout(androidx.compose.ui.e eVar, int i10, p<? super j0.l, ? super Integer, w> pVar, j0.l lVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        q.i(pVar, "content");
        j0.l q10 = lVar.q(1793884366);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (q10.Q(eVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (q10.i(i10)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            if (q10.l(pVar)) {
                i16 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        if ((i13 & 731) == 146 && q10.t()) {
            q10.z();
        } else {
            if (i17 != 0) {
                eVar = androidx.compose.ui.e.f2335a;
            }
            if (i18 != 0) {
                i10 = 0;
            }
            if (n.K()) {
                n.V(1793884366, i13, -1, "com.habitrpg.android.habitica.ui.views.FlowLayout (FlowLayout.kt:43)");
            }
            i0 flowLayoutMeasurePolicy = flowLayoutMeasurePolicy(i10);
            int i19 = ((i13 << 3) & 112) | ((i13 >> 6) & 14);
            q10.e(-1323940314);
            int a10 = j0.j.a(q10, 0);
            v F = q10.F();
            g.a aVar = p1.g.f20790l;
            pc.a<p1.g> a11 = aVar.a();
            pc.q<i2<p1.g>, j0.l, Integer, w> a12 = x.a(eVar);
            int i20 = ((i19 << 9) & 7168) | 6;
            if (!(q10.u() instanceof j0.f)) {
                j0.j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a11);
            } else {
                q10.H();
            }
            j0.l a13 = l3.a(q10);
            l3.b(a13, flowLayoutMeasurePolicy, aVar.e());
            l3.b(a13, F, aVar.g());
            p<p1.g, Integer, w> b10 = aVar.b();
            if (a13.n() || !q.d(a13.f(), Integer.valueOf(a10))) {
                a13.J(Integer.valueOf(a10));
                a13.I(Integer.valueOf(a10), b10);
            }
            a12.invoke(i2.a(i2.b(q10)), q10, Integer.valueOf((i20 >> 3) & 112));
            q10.e(2058660585);
            pVar.invoke(q10, Integer.valueOf((i20 >> 9) & 14));
            q10.N();
            q10.O();
            q10.N();
            if (n.K()) {
                n.U();
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        int i21 = i10;
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new FlowLayoutKt$FlowLayout$1(eVar2, i21, pVar, i11, i12));
        }
    }

    public static final i0 flowLayoutMeasurePolicy(final int i10) {
        return new i0() { // from class: com.habitrpg.android.habitica.ui.views.FlowLayoutKt$flowLayoutMeasurePolicy$1

            /* compiled from: FlowLayout.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.views.FlowLayoutKt$flowLayoutMeasurePolicy$1$1  reason: invalid class name */
            /* loaded from: classes4.dex */
            static final class AnonymousClass1 extends r implements pc.l<y0.a, w> {
                final /* synthetic */ long $constraints;
                final /* synthetic */ List<g0> $measurables;
                final /* synthetic */ int $spacing;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(List<? extends g0> list, long j10, int i10) {
                    super(1);
                    this.$measurables = list;
                    this.$constraints = j10;
                    this.$spacing = i10;
                }

                @Override // pc.l
                public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
                    invoke2(aVar);
                    return w.f13270a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(y0.a aVar) {
                    int s10;
                    int i10;
                    int i11;
                    int i12;
                    q.i(aVar, "$this$layout");
                    List<g0> list = this.$measurables;
                    long j10 = this.$constraints;
                    s10 = u.s(list, 10);
                    ArrayList<y0> arrayList = new ArrayList(s10);
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((g0) it.next()).w(j10));
                    }
                    int i13 = this.$spacing;
                    long j11 = this.$constraints;
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    for (y0 y0Var : arrayList) {
                        if (i14 != 0) {
                            i14 += i13;
                        }
                        if (y0Var.A0() + i14 > j2.b.n(j11)) {
                            i11 = i15 + i16 + i13;
                            i12 = 0;
                            i10 = 0;
                        } else {
                            i10 = i14;
                            i11 = i15;
                            i12 = i16;
                        }
                        int i17 = i12;
                        y0.a.r(aVar, y0Var, i10, i11, 0.0f, 4, null);
                        i14 = y0Var.A0() + i10;
                        i16 = i17 < y0Var.l0() ? y0Var.l0() : i17;
                        i15 = i11;
                    }
                }
            }

            @Override // n1.i0
            public /* bridge */ /* synthetic */ int maxIntrinsicHeight(n1.n nVar, List list, int i11) {
                return h0.a(this, nVar, list, i11);
            }

            @Override // n1.i0
            public /* bridge */ /* synthetic */ int maxIntrinsicWidth(n1.n nVar, List list, int i11) {
                return h0.b(this, nVar, list, i11);
            }

            @Override // n1.i0
            /* renamed from: measure-3p2s80s */
            public final j0 mo0measure3p2s80s(l0 l0Var, List<? extends g0> list, long j10) {
                q.i(l0Var, "$this$MeasurePolicy");
                q.i(list, "measurables");
                return k0.b(l0Var, j2.b.n(j10), j2.b.m(j10), null, new AnonymousClass1(list, j10, i10), 4, null);
            }

            @Override // n1.i0
            public /* bridge */ /* synthetic */ int minIntrinsicHeight(n1.n nVar, List list, int i11) {
                return h0.c(this, nVar, list, i11);
            }

            @Override // n1.i0
            public /* bridge */ /* synthetic */ int minIntrinsicWidth(n1.n nVar, List list, int i11) {
                return h0.d(this, nVar, list, i11);
            }
        };
    }

    public static /* synthetic */ i0 flowLayoutMeasurePolicy$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return flowLayoutMeasurePolicy(i10);
    }
}
