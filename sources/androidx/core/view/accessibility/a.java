package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: f  reason: collision with root package name */
    private final int f4069f;

    /* renamed from: m  reason: collision with root package name */
    private final n0 f4070m;

    /* renamed from: p  reason: collision with root package name */
    private final int f4071p;

    public a(int i10, n0 n0Var, int i11) {
        this.f4069f = i10;
        this.f4070m = n0Var;
        this.f4071p = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4069f);
        this.f4070m.d0(this.f4071p, bundle);
    }
}
