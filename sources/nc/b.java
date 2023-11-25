package nc;

import java.io.Closeable;

/* compiled from: Closeable.kt */
/* loaded from: classes4.dex */
public final class b {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                dc.b.a(th, th2);
            }
        }
    }
}
