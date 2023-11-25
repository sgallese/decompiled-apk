package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import qc.q;

/* compiled from: SetTargetFragmentUsageViolation.kt */
/* loaded from: classes.dex */
public final class SetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {

    /* renamed from: m  reason: collision with root package name */
    private final Fragment f4812m;

    /* renamed from: p  reason: collision with root package name */
    private final int f4813p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTargetFragmentUsageViolation(Fragment fragment, Fragment fragment2, int i10) {
        super(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i10 + " for fragment " + fragment);
        q.i(fragment, "fragment");
        q.i(fragment2, "targetFragment");
        this.f4812m = fragment2;
        this.f4813p = i10;
    }
}
