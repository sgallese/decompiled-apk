package t;

import android.os.Build;
import android.view.View;

/* compiled from: PlatformMagnifier.kt */
/* loaded from: classes.dex */
public interface l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23184a = a.f23185a;

    /* compiled from: PlatformMagnifier.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f23185a = new a();

        private a() {
        }

        public final l0 a() {
            if (z.c(0, 1, null)) {
                if (Build.VERSION.SDK_INT == 28) {
                    return m0.f23189b;
                }
                return n0.f23192b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    boolean a();

    k0 b(a0 a0Var, View view, j2.e eVar, float f10);
}
