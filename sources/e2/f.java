package e2;

import android.text.Spannable;
import androidx.emoji2.text.j;
import j2.s;
import j2.u;
import java.util.List;
import qc.q;
import v1.d;
import v1.v;

/* compiled from: PlaceholderExtensions.android.kt */
/* loaded from: classes.dex */
public final class f {
    private static final int a(long j10) {
        long g10 = s.g(j10);
        u.a aVar = u.f19008b;
        if (u.g(g10, aVar.b())) {
            return 0;
        }
        if (u.g(g10, aVar.a())) {
            return 1;
        }
        return 2;
    }

    private static final int b(int i10) {
        v.a aVar = v.f24507a;
        if (v.i(i10, aVar.a())) {
            return 0;
        }
        if (v.i(i10, aVar.g())) {
            return 1;
        }
        if (v.i(i10, aVar.b())) {
            return 2;
        }
        if (v.i(i10, aVar.c())) {
            return 3;
        }
        if (v.i(i10, aVar.f())) {
            return 4;
        }
        if (v.i(i10, aVar.d())) {
            return 5;
        }
        if (v.i(i10, aVar.e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    private static final void c(Spannable spannable, v1.u uVar, int i10, int i11, j2.e eVar) {
        Object[] spans = spannable.getSpans(i10, i11, j.class);
        q.h(spans, "getSpans(start, end, EmojiSpan::class.java)");
        for (Object obj : spans) {
            spannable.removeSpan((j) obj);
        }
        g.t(spannable, new y1.j(s.h(uVar.c()), a(uVar.c()), s.h(uVar.a()), a(uVar.a()), eVar.p0() * eVar.getDensity(), b(uVar.b())), i10, i11);
    }

    public static final void d(Spannable spannable, List<d.b<v1.u>> list, j2.e eVar) {
        q.i(spannable, "<this>");
        q.i(list, "placeholders");
        q.i(eVar, "density");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            d.b<v1.u> bVar = list.get(i10);
            c(spannable, bVar.a(), bVar.b(), bVar.c(), eVar);
        }
    }
}
