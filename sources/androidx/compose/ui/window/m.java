package androidx.compose.ui.window;

import kotlin.NoWhenBranchMatchedException;
import qc.q;

/* compiled from: SecureFlagPolicy.android.kt */
/* loaded from: classes.dex */
public final class m {

    /* compiled from: SecureFlagPolicy.android.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3168a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3168a = iArr;
        }
    }

    public static final boolean a(l lVar, boolean z10) {
        q.i(lVar, "<this>");
        int i10 = a.f3168a[lVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return z10;
            }
            return true;
        }
        return false;
    }
}
