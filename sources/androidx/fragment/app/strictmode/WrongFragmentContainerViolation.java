package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import qc.q;

/* compiled from: WrongFragmentContainerViolation.kt */
/* loaded from: classes.dex */
public final class WrongFragmentContainerViolation extends Violation {

    /* renamed from: m  reason: collision with root package name */
    private final ViewGroup f4816m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongFragmentContainerViolation(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        q.i(fragment, "fragment");
        q.i(viewGroup, "container");
        this.f4816m = viewGroup;
    }
}
