package com.habitrpg.android.habitica.ui.views;

import android.text.format.DateUtils;
import androidx.compose.ui.e;
import com.habitrpg.android.habitica.R;
import dc.w;
import f0.f2;
import j0.g2;
import j0.i2;
import j0.l3;
import j0.n;
import j0.v;
import j2.t;
import java.text.DateFormat;
import java.util.Date;
import n1.i0;
import n1.x;
import p1.g;
import pc.p;
import qc.q;
import t.u;
import v0.b;
import w.b0;
import w.y;

/* compiled from: CompletedAt.kt */
/* loaded from: classes4.dex */
public final class CompletedAtKt {
    private static final DateFormat completedTimeFormat;
    private static final DateFormat completedTimeFormatToday;

    static {
        DateFormat timeInstance = DateFormat.getTimeInstance(3);
        q.h(timeInstance, "getTimeInstance(...)");
        completedTimeFormatToday = timeInstance;
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(3, 3);
        q.h(dateTimeInstance, "getDateTimeInstance(...)");
        completedTimeFormat = dateTimeInstance;
    }

    public static final void CompletedAt(Date date, j0.l lVar, int i10) {
        boolean z10;
        String str;
        int i11;
        int i12;
        DateFormat dateFormat;
        j0.l q10 = lVar.q(-162196920);
        if (n.K()) {
            n.V(-162196920, i10, -1, "com.habitrpg.android.habitica.ui.views.CompletedAt (CompletedAt.kt:25)");
        }
        if (date != null) {
            z10 = DateUtils.isToday(date.getTime());
        } else {
            z10 = false;
        }
        b.c h10 = v0.b.f24258a.h();
        e.a aVar = androidx.compose.ui.e.f2335a;
        float f10 = 4;
        androidx.compose.ui.e m10 = androidx.compose.foundation.layout.j.m(aVar, 0.0f, j2.h.j(f10), 0.0f, 0.0f, 13, null);
        q10.e(693286680);
        i0 a10 = y.a(w.a.f25135a.e(), h10, q10, 48);
        q10.e(-1323940314);
        int a11 = j0.j.a(q10, 0);
        v F = q10.F();
        g.a aVar2 = p1.g.f20790l;
        pc.a<p1.g> a12 = aVar2.a();
        pc.q<i2<p1.g>, j0.l, Integer, w> a13 = x.a(m10);
        if (!(q10.u() instanceof j0.f)) {
            j0.j.c();
        }
        q10.s();
        if (q10.n()) {
            q10.B(a12);
        } else {
            q10.H();
        }
        j0.l a14 = l3.a(q10);
        l3.b(a14, a10, aVar2.e());
        l3.b(a14, F, aVar2.g());
        p<p1.g, Integer, w> b10 = aVar2.b();
        if (a14.n() || !q.d(a14.f(), Integer.valueOf(a11))) {
            a14.J(Integer.valueOf(a11));
            a14.I(Integer.valueOf(a11), b10);
        }
        a13.invoke(i2.a(i2.b(q10)), q10, 0);
        q10.e(2058660585);
        b0 b0Var = b0.f25155a;
        u.a(s1.f.d(R.drawable.completed, q10, 6), null, null, null, null, 0.0f, null, q10, 56, 124);
        Object[] objArr = new Object[1];
        if (date != null) {
            if (z10) {
                dateFormat = completedTimeFormatToday;
            } else {
                dateFormat = completedTimeFormat;
            }
            str = dateFormat.format(date);
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        String b11 = s1.h.b(R.string.completed_at, objArr, q10, 70);
        long g10 = t.g(14);
        if (z10) {
            q10.e(-1713236719);
            i12 = R.color.green_10;
            i11 = 6;
        } else {
            i11 = 6;
            q10.e(-1713236682);
            i12 = R.color.text_secondary;
        }
        long a15 = s1.c.a(i12, q10, i11);
        q10.N();
        f2.b(b11, androidx.compose.foundation.layout.j.m(aVar, j2.h.j(f10), 0.0f, 0.0f, 0.0f, 14, null), a15, g10, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, q10, 3120, 0, 131056);
        q10.N();
        q10.O();
        q10.N();
        q10.N();
        if (n.K()) {
            n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new CompletedAtKt$CompletedAt$2(date, i10));
        }
    }

    public static final DateFormat getCompletedTimeFormat() {
        return completedTimeFormat;
    }

    public static final DateFormat getCompletedTimeFormatToday() {
        return completedTimeFormatToday;
    }
}
