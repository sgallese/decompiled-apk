package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import qc.q;

/* compiled from: FragmentTagUsageViolation.kt */
/* loaded from: classes.dex */
public final class FragmentTagUsageViolation extends Violation {

    /* renamed from: m  reason: collision with root package name */
    private final ViewGroup f4811m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentTagUsageViolation(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        q.i(fragment, "fragment");
        this.f4811m = viewGroup;
    }
}
