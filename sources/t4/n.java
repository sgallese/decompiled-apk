package t4;

import ec.u0;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ExifUtils.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f23593a;

    /* compiled from: ExifUtils.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23594a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.RESPECT_PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.IGNORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.RESPECT_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23594a = iArr;
        }
    }

    static {
        Set<String> d10;
        d10 = u0.d("image/jpeg", "image/webp", "image/heic", "image/heif");
        f23593a = d10;
    }

    public static final boolean a(j jVar) {
        if (jVar.a() > 0) {
            return true;
        }
        return false;
    }

    public static final boolean b(j jVar) {
        if (jVar.a() != 90 && jVar.a() != 270) {
            return false;
        }
        return true;
    }

    public static final boolean c(l lVar, String str) {
        int i10 = a.f23594a[lVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return false;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (str == null || !f23593a.contains(str)) {
            return false;
        }
        return true;
    }
}
