package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import qc.q;

/* compiled from: SetUserVisibleHintViolation.kt */
/* loaded from: classes.dex */
public final class SetUserVisibleHintViolation extends Violation {

    /* renamed from: m  reason: collision with root package name */
    private final boolean f4814m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetUserVisibleHintViolation(Fragment fragment, boolean z10) {
        super(fragment, "Attempting to set user visible hint to " + z10 + " for fragment " + fragment);
        q.i(fragment, "fragment");
        this.f4814m = z10;
    }
}
