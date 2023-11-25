package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* compiled from: AndroidAccessibilityManager.android.kt */
/* loaded from: classes.dex */
public final class l implements i {

    /* renamed from: b  reason: collision with root package name */
    private static final a f2740b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityManager f2741a;

    /* compiled from: AndroidAccessibilityManager.android.kt */
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public l(Context context) {
        qc.q.i(context, "context");
        Object systemService = context.getSystemService("accessibility");
        qc.q.g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f2741a = (AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.i
    public long a(long j10, boolean z10, boolean z11, boolean z12) {
        int i10 = z10;
        if (j10 >= 2147483647L) {
            return j10;
        }
        if (z11) {
            i10 = (z10 ? 1 : 0) | true;
        }
        if (z12) {
            i10 = (i10 == true ? 1 : 0) | 4;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int a10 = s0.f2820a.a(this.f2741a, (int) j10, i10);
            if (a10 != Integer.MAX_VALUE) {
                return a10;
            }
        } else if (!z12 || !this.f2741a.isTouchExplorationEnabled()) {
            return j10;
        }
        return Long.MAX_VALUE;
    }
}
