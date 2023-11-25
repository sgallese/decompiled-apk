package t4;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: DecodeUtils.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f23583a = new h();

    /* compiled from: DecodeUtils.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23584a;

        static {
            int[] iArr = new int[c5.h.values().length];
            try {
                iArr[c5.h.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c5.h.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23584a = iArr;
        }
    }

    private h() {
    }

    public static final int a(int i10, int i11, int i12, int i13, c5.h hVar) {
        int min;
        int d10;
        int highestOneBit = Integer.highestOneBit(i10 / i12);
        int highestOneBit2 = Integer.highestOneBit(i11 / i13);
        int i14 = a.f23584a[hVar.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                min = Math.max(highestOneBit, highestOneBit2);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            min = Math.min(highestOneBit, highestOneBit2);
        }
        d10 = vc.l.d(min, 1);
        return d10;
    }

    public static final double b(double d10, double d11, double d12, double d13, c5.h hVar) {
        double d14 = d12 / d10;
        double d15 = d13 / d11;
        int i10 = a.f23584a[hVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return Math.min(d14, d15);
            }
            throw new NoWhenBranchMatchedException();
        }
        return Math.max(d14, d15);
    }

    public static final double c(int i10, int i11, int i12, int i13, c5.h hVar) {
        double d10 = i12 / i10;
        double d11 = i13 / i11;
        int i14 = a.f23584a[hVar.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                return Math.min(d10, d11);
            }
            throw new NoWhenBranchMatchedException();
        }
        return Math.max(d10, d11);
    }
}
