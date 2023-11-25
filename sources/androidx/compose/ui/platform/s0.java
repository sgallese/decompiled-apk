package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;

/* compiled from: AndroidAccessibilityManager.android.kt */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    public static final s0 f2820a = new s0();

    private s0() {
    }

    public final int a(AccessibilityManager accessibilityManager, int i10, int i11) {
        qc.q.i(accessibilityManager, "accessibilityManager");
        return accessibilityManager.getRecommendedTimeoutMillis(i10, i11);
    }
}
