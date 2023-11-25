package t;

import android.content.res.Configuration;

/* compiled from: DarkTheme.android.kt */
/* loaded from: classes.dex */
public final class o {
    public static final boolean a(j0.l lVar, int i10) {
        boolean z10;
        if (j0.n.K()) {
            j0.n.V(-882615028, i10, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)");
        }
        if ((((Configuration) lVar.C(androidx.compose.ui.platform.j0.f())).uiMode & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        return z10;
    }
}
