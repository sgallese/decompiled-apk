package f0;

import android.content.Context;
import android.content.res.Resources;
import f0.p1;

/* compiled from: Strings.android.kt */
/* loaded from: classes.dex */
public final class q1 {
    public static final String a(int i10, j0.l lVar, int i11) {
        String str;
        lVar.e(-726638443);
        if (j0.n.K()) {
            j0.n.V(-726638443, i11, -1, "androidx.compose.material.getString (Strings.android.kt:24)");
        }
        lVar.C(androidx.compose.ui.platform.j0.f());
        Resources resources = ((Context) lVar.C(androidx.compose.ui.platform.j0.g())).getResources();
        p1.a aVar = p1.f14995a;
        if (p1.i(i10, aVar.e())) {
            str = resources.getString(v0.i.f24314h);
            qc.q.h(str, "resources.getString(R.string.navigation_menu)");
        } else if (p1.i(i10, aVar.a())) {
            str = resources.getString(v0.i.f24307a);
            qc.q.h(str, "resources.getString(R.string.close_drawer)");
        } else if (p1.i(i10, aVar.b())) {
            str = resources.getString(v0.i.f24308b);
            qc.q.h(str, "resources.getString(R.string.close_sheet)");
        } else if (p1.i(i10, aVar.c())) {
            str = resources.getString(v0.i.f24309c);
            qc.q.h(str, "resources.getString(R.st…ng.default_error_message)");
        } else if (p1.i(i10, aVar.d())) {
            str = resources.getString(v0.i.f24311e);
            qc.q.h(str, "resources.getString(R.string.dropdown_menu)");
        } else if (p1.i(i10, aVar.g())) {
            str = resources.getString(v0.i.f24319m);
            qc.q.h(str, "resources.getString(R.string.range_start)");
        } else if (p1.i(i10, aVar.f())) {
            str = resources.getString(v0.i.f24318l);
            qc.q.h(str, "resources.getString(R.string.range_end)");
        } else {
            str = "";
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return str;
    }
}
