package y0;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: FocusState.kt */
/* loaded from: classes.dex */
public enum p implements o {
    Active,
    ActiveParent,
    Captured,
    Inactive;

    /* compiled from: FocusState.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26173a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26173a = iArr;
        }
    }

    public boolean getHasFocus() {
        int i10 = a.f26173a[ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public boolean isCaptured() {
        int i10 = a.f26173a[ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2 && i10 != 3 && i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    @Override // y0.o
    public boolean isFocused() {
        int i10 = a.f26173a[ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 != 3 && i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }
}
