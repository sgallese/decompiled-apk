package s1;

import j0.l;
import j0.n;
import java.util.Arrays;
import qc.q;

/* compiled from: StringResources.android.kt */
/* loaded from: classes.dex */
public final class h {
    public static final String a(int i10, l lVar, int i11) {
        if (n.K()) {
            n.V(1223887937, i11, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = g.a(lVar, 0).getString(i10);
        q.h(string, "resources.getString(id)");
        if (n.K()) {
            n.U();
        }
        return string;
    }

    public static final String b(int i10, Object[] objArr, l lVar, int i11) {
        q.i(objArr, "formatArgs");
        if (n.K()) {
            n.V(2071230100, i11, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = g.a(lVar, 0).getString(i10, Arrays.copyOf(objArr, objArr.length));
        q.h(string, "resources.getString(id, *formatArgs)");
        if (n.K()) {
            n.U();
        }
        return string;
    }
}
