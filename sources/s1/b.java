package s1;

import a1.r1;
import android.content.Context;
import qc.q;

/* compiled from: ColorResources.android.kt */
/* loaded from: classes.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f22938a = new b();

    private b() {
    }

    public final long a(Context context, int i10) {
        int color;
        q.i(context, "context");
        color = context.getResources().getColor(i10, context.getTheme());
        return r1.b(color);
    }
}
