package ad;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* compiled from: CoroutineStart.kt */
/* loaded from: classes4.dex */
public enum m0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* compiled from: CoroutineStart.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f534a;

        static {
            int[] iArr = new int[m0.values().length];
            try {
                iArr[m0.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m0.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m0.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m0.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f534a = iArr;
        }
    }

    public final <T> void invoke(pc.l<? super Continuation<? super T>, ? extends Object> lVar, Continuation<? super T> continuation) {
        int i10 = a.f534a[ordinal()];
        if (i10 == 1) {
            gd.a.c(lVar, continuation);
        } else if (i10 == 2) {
            hc.e.b(lVar, continuation);
        } else if (i10 == 3) {
            gd.b.a(lVar, continuation);
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }

    public final <R, T> void invoke(pc.p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r10, Continuation<? super T> continuation) {
        int i10 = a.f534a[ordinal()];
        if (i10 == 1) {
            gd.a.e(pVar, r10, continuation, null, 4, null);
        } else if (i10 == 2) {
            hc.e.c(pVar, r10, continuation);
        } else if (i10 == 3) {
            gd.b.b(pVar, r10, continuation);
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ void isLazy$annotations() {
    }
}
