package a2;

import android.content.Context;
import android.os.Build;

/* compiled from: AndroidFontResolveInterceptor.android.kt */
/* loaded from: classes.dex */
public final class e {
    public static final d a(Context context) {
        int i10;
        qc.q.i(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = context.getResources().getConfiguration().fontWeightAdjustment;
        } else {
            i10 = 0;
        }
        return new d(i10);
    }
}
