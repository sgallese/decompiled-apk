package androidx.compose.ui.platform;

import android.view.ViewConfiguration;

/* compiled from: AndroidViewConfiguration.android.kt */
/* loaded from: classes.dex */
public final class q0 implements g4 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewConfiguration f2801a;

    public q0(ViewConfiguration viewConfiguration) {
        qc.q.i(viewConfiguration, "viewConfiguration");
        this.f2801a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.g4
    public long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.g4
    public long b() {
        return 40L;
    }

    @Override // androidx.compose.ui.platform.g4
    public long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.g4
    public /* synthetic */ long d() {
        return f4.a(this);
    }

    @Override // androidx.compose.ui.platform.g4
    public float e() {
        return this.f2801a.getScaledTouchSlop();
    }
}
