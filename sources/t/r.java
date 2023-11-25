package t;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* compiled from: EdgeEffectCompat.kt */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f23203a = new r();

    private r() {
    }

    public final EdgeEffect a(Context context, AttributeSet attributeSet) {
        qc.q.i(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            return c.f23122a.a(context, attributeSet);
        }
        return new t(context);
    }

    public final float b(EdgeEffect edgeEffect) {
        qc.q.i(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return c.f23122a.b(edgeEffect);
        }
        return 0.0f;
    }

    public final void c(EdgeEffect edgeEffect, int i10) {
        qc.q.i(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i10);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i10);
        }
    }

    public final float d(EdgeEffect edgeEffect, float f10, float f11) {
        qc.q.i(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return c.f23122a.c(edgeEffect, f10, f11);
        }
        edgeEffect.onPull(f10, f11);
        return f10;
    }

    public final void e(EdgeEffect edgeEffect, float f10) {
        qc.q.i(edgeEffect, "<this>");
        if (edgeEffect instanceof t) {
            ((t) edgeEffect).a(f10);
        } else {
            edgeEffect.onRelease();
        }
    }
}
