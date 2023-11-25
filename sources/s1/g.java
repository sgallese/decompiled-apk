package s1;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.j0;
import j0.l;
import j0.n;
import qc.q;

/* compiled from: Resources.android.kt */
/* loaded from: classes.dex */
public final class g {
    public static final Resources a(l lVar, int i10) {
        if (n.K()) {
            n.V(1554054999, i10, -1, "androidx.compose.ui.res.resources (Resources.android.kt:30)");
        }
        lVar.C(j0.f());
        Resources resources = ((Context) lVar.C(j0.g())).getResources();
        q.h(resources, "LocalContext.current.resources");
        if (n.K()) {
            n.U();
        }
        return resources;
    }
}
