package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import qc.q;

/* compiled from: WrongNestedHierarchyViolation.kt */
/* loaded from: classes.dex */
public final class WrongNestedHierarchyViolation extends Violation {

    /* renamed from: m  reason: collision with root package name */
    private final Fragment f4817m;

    /* renamed from: p  reason: collision with root package name */
    private final int f4818p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongNestedHierarchyViolation(Fragment fragment, Fragment fragment2, int i10) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + fragment2 + " via container with ID " + i10 + " without using parent's childFragmentManager");
        q.i(fragment, "fragment");
        q.i(fragment2, "expectedParentFragment");
        this.f4817m = fragment2;
        this.f4818p = i10;
    }
}
