package qb;

import android.content.Context;

/* compiled from: Dip.java */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final float f21646a;

    public b(float f10) {
        this.f21646a = f10;
    }

    public static b a(Context context) {
        return new b(context.getResources().getDisplayMetrics().density);
    }

    public int b(int i10) {
        return (int) ((i10 * this.f21646a) + 0.5f);
    }
}
