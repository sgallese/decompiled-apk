package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;
import j$.time.Duration;
import j$.time.TimeConversions;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 {
    public static /* synthetic */ void a(AccessibilityNodeInfo accessibilityNodeInfo, Duration duration) {
        accessibilityNodeInfo.setMinDurationBetweenContentChanges(TimeConversions.convert(duration));
    }
}
