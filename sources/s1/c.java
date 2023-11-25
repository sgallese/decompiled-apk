package s1;

import a1.r1;
import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.j0;
import j0.l;
import j0.n;

/* compiled from: ColorResources.android.kt */
/* loaded from: classes.dex */
public final class c {
    public static final long a(int i10, l lVar, int i11) {
        long b10;
        if (n.K()) {
            n.V(-1777644873, i11, -1, "androidx.compose.ui.res.colorResource (ColorResources.android.kt:36)");
        }
        Context context = (Context) lVar.C(j0.g());
        if (Build.VERSION.SDK_INT >= 23) {
            b10 = b.f22938a.a(context, i10);
        } else {
            b10 = r1.b(context.getResources().getColor(i10));
        }
        if (n.K()) {
            n.U();
        }
        return b10;
    }
}
