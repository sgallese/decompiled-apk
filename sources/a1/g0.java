package a1;

import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: AndroidColorFilter.android.kt */
/* loaded from: classes.dex */
public final class g0 {
    public static final q1 a(long j10, int i10) {
        BlendModeColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            porterDuffColorFilter = d1.f92a.a(j10, i10);
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(r1.k(j10), d0.b(i10));
        }
        return new q1(porterDuffColorFilter);
    }

    public static final ColorFilter b(q1 q1Var) {
        qc.q.i(q1Var, "<this>");
        return q1Var.a();
    }
}
