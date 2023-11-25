package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import qc.q;

/* compiled from: FragmentReuseViolation.kt */
/* loaded from: classes.dex */
public final class FragmentReuseViolation extends Violation {

    /* renamed from: m  reason: collision with root package name */
    private final String f4810m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        q.i(fragment, "fragment");
        q.i(str, "previousFragmentId");
        this.f4810m = str;
    }
}
