package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import qc.q;

/* compiled from: GetTargetFragmentRequestCodeUsageViolation.kt */
/* loaded from: classes.dex */
public final class GetTargetFragmentRequestCodeUsageViolation extends TargetFragmentUsageViolation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTargetFragmentRequestCodeUsageViolation(Fragment fragment) {
        super(fragment, "Attempting to get target request code from fragment " + fragment);
        q.i(fragment, "fragment");
    }
}
