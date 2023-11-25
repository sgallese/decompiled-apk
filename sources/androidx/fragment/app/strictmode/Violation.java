package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import qc.q;

/* compiled from: Violation.kt */
/* loaded from: classes.dex */
public abstract class Violation extends RuntimeException {

    /* renamed from: f  reason: collision with root package name */
    private final Fragment f4815f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(Fragment fragment, String str) {
        super(str);
        q.i(fragment, "fragment");
        this.f4815f = fragment;
    }

    public final Fragment a() {
        return this.f4815f;
    }
}
