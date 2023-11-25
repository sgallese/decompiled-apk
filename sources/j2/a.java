package j2;

import android.content.Context;

/* compiled from: AndroidDensity.android.kt */
/* loaded from: classes.dex */
public final class a {
    public static final e a(Context context) {
        qc.q.i(context, "context");
        return g.a(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }
}
