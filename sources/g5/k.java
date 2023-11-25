package g5;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Requests.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final b5.b f16188a = new b5.b(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);

    /* compiled from: Requests.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16189a;

        static {
            int[] iArr = new int[c5.e.values().length];
            try {
                iArr[c5.e.EXACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c5.e.INEXACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c5.e.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16189a = iArr;
        }
    }

    public static final boolean a(b5.h hVar) {
        int i10 = a.f16189a[hVar.H().ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                if ((hVar.q().m() != null || !(hVar.K() instanceof c5.d)) && (!(hVar.M() instanceof d5.c) || !(hVar.K() instanceof c5.m) || !(((d5.c) hVar.M()).getView() instanceof ImageView) || ((d5.c) hVar.M()).getView() != ((c5.m) hVar.K()).getView())) {
                    return false;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    public static final b5.b b() {
        return f16188a;
    }

    public static final Drawable c(b5.h hVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable == null) {
            if (num != null) {
                if (num.intValue() == 0) {
                    return null;
                }
                return d.a(hVar.l(), num.intValue());
            }
            return drawable2;
        }
        return drawable;
    }
}
