package androidx.compose.ui.platform;

import android.graphics.Rect;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* loaded from: classes.dex */
public final class u3 {

    /* renamed from: a  reason: collision with root package name */
    private final t1.p f2849a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f2850b;

    public u3(t1.p pVar, Rect rect) {
        qc.q.i(pVar, "semanticsNode");
        qc.q.i(rect, "adjustedBounds");
        this.f2849a = pVar;
        this.f2850b = rect;
    }

    public final Rect a() {
        return this.f2850b;
    }

    public final t1.p b() {
        return this.f2849a;
    }
}
