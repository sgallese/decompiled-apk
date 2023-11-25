package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f2735a = new k();

    private k() {
    }

    public final void a(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list) {
        qc.q.i(accessibilityNodeInfo, "node");
        qc.q.i(list, "data");
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
