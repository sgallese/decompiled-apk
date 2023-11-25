package va;

import android.os.Looper;

/* compiled from: ThreadUtil.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Thread f25109a;

    public static void a() {
        if (b()) {
            return;
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }

    public static boolean b() {
        if (f25109a == null) {
            f25109a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == f25109a) {
            return true;
        }
        return false;
    }
}
