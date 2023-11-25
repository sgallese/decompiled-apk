package com.habitrpg.android.habitica.ui.views;

import android.content.Context;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.j0;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.helpers.NumberAbbreviator;
import dc.w;
import f0.f2;
import j0.i2;
import j0.l3;
import j0.n;
import j0.v;
import j2.t;
import java.text.NumberFormat;
import n1.i0;
import n1.x;
import p1.g;
import pc.p;
import pc.q;
import qc.r;
import v0.b;
import w.b0;
import w.d0;
import w.y;
import w.z;

/* compiled from: LabeledBar.kt */
/* loaded from: classes4.dex */
final class LabeledBarKt$LabeledBar$1$2$1 extends r implements q<r.j, j0.l, Integer, w> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $abbreviateMax;
    final /* synthetic */ boolean $abbreviateValue;
    final /* synthetic */ float $animatedValue;
    final /* synthetic */ double $cleanedMaxValue;
    final /* synthetic */ boolean $disabled;
    final /* synthetic */ NumberFormat $formatter;
    final /* synthetic */ String $label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabeledBarKt$LabeledBar$1$2$1(boolean z10, boolean z11, float f10, NumberFormat numberFormat, boolean z12, double d10, String str, int i10) {
        super(3);
        this.$disabled = z10;
        this.$abbreviateValue = z11;
        this.$animatedValue = f10;
        this.$formatter = numberFormat;
        this.$abbreviateMax = z12;
        this.$cleanedMaxValue = d10;
        this.$label = str;
        this.$$dirty = i10;
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(r.j jVar, j0.l lVar, Integer num) {
        invoke(jVar, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(r.j jVar, j0.l lVar, int i10) {
        int i11;
        String str;
        double d10;
        String format;
        String format2;
        qc.q.i(jVar, "$this$AnimatedVisibility");
        if (n.K()) {
            n.V(-1015243945, i10, -1, "com.habitrpg.android.habitica.ui.views.LabeledBar.<anonymous>.<anonymous>.<anonymous> (LabeledBar.kt:114)");
        }
        b.c h10 = v0.b.f24258a.h();
        e.a aVar = androidx.compose.ui.e.f2335a;
        androidx.compose.ui.e m10 = androidx.compose.foundation.layout.j.m(aVar, 0.0f, j2.h.j(2), 0.0f, 0.0f, 13, null);
        boolean z10 = this.$disabled;
        boolean z11 = this.$abbreviateValue;
        float f10 = this.$animatedValue;
        NumberFormat numberFormat = this.$formatter;
        boolean z12 = this.$abbreviateMax;
        double d11 = this.$cleanedMaxValue;
        String str2 = this.$label;
        int i12 = this.$$dirty;
        lVar.e(693286680);
        i0 a10 = y.a(w.a.f25135a.e(), h10, lVar, 48);
        lVar.e(-1323940314);
        int a11 = j0.j.a(lVar, 0);
        v F = lVar.F();
        g.a aVar2 = p1.g.f20790l;
        pc.a<p1.g> a12 = aVar2.a();
        q<i2<p1.g>, j0.l, Integer, w> a13 = x.a(m10);
        if (!(lVar.u() instanceof j0.f)) {
            j0.j.c();
        }
        lVar.s();
        if (lVar.n()) {
            lVar.B(a12);
        } else {
            lVar.H();
        }
        j0.l a14 = l3.a(lVar);
        l3.b(a14, a10, aVar2.e());
        l3.b(a14, F, aVar2.g());
        p<p1.g, Integer, w> b10 = aVar2.b();
        if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
            a14.J(Integer.valueOf(a11));
            a14.I(Integer.valueOf(a11), b10);
        }
        a13.invoke(i2.a(i2.b(lVar)), lVar, 0);
        lVar.e(2058660585);
        b0 b0Var = b0.f25155a;
        lVar.e(-538768484);
        if (z10) {
            i11 = i12;
            str = str2;
        } else {
            lVar.e(-538768420);
            if (z11) {
                i11 = i12;
                d10 = d11;
                format = NumberAbbreviator.abbreviate$default(NumberAbbreviator.INSTANCE, (Context) lVar.C(j0.g()), f10, 0, 0, 8, (Object) null);
            } else {
                i11 = i12;
                d10 = d11;
                format = numberFormat.format(Float.valueOf(f10));
            }
            lVar.N();
            lVar.e(-538768012);
            if (z12) {
                str = str2;
                format2 = NumberAbbreviator.INSTANCE.abbreviate((Context) lVar.C(j0.g()), d10, (r12 & 4) != 0 ? 2 : 0, (r12 & 8) != 0 ? 0 : 0);
            } else {
                str = str2;
                format2 = numberFormat.format(d10);
            }
            lVar.N();
            f2.b(format + " / " + format2, null, s1.c.a(R.color.text_ternary, lVar, 6), t.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 3072, 0, 131058);
        }
        lVar.N();
        d0.a(z.a(b0Var, aVar, 1.0f, false, 2, null), lVar, 0);
        lVar.e(-1198900341);
        if (str != null) {
            f2.b(str, null, s1.c.a(R.color.text_ternary, lVar, 6), t.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, ((i11 >> 6) & 14) | 3072, 0, 131058);
        }
        lVar.N();
        lVar.N();
        lVar.O();
        lVar.N();
        lVar.N();
        if (n.K()) {
            n.U();
        }
    }
}
