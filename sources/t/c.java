package t;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* compiled from: EdgeEffectCompat.kt */
/* loaded from: classes.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f23122a = new c();

    private c() {
    }

    public final EdgeEffect a(Context context, AttributeSet attributeSet) {
        qc.q.i(context, "context");
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public final float b(EdgeEffect edgeEffect) {
        qc.q.i(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public final float c(EdgeEffect edgeEffect, float f10, float f11) {
        qc.q.i(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.onPullDistance(f10, f11);
        } catch (Throwable unused) {
            edgeEffect.onPull(f10, f11);
            return 0.0f;
        }
    }
}
