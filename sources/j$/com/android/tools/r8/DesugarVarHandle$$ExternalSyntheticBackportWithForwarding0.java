package j$.com.android.tools.r8;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class DesugarVarHandle$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ boolean m(Unsafe unsafe, Object obj, long j10, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j10, obj2, obj3)) {
            if (unsafe.getObject(obj, j10) != obj2) {
                return false;
            }
        }
        return true;
    }
}
