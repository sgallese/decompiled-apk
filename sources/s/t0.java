package s;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 {
    public static /* synthetic */ boolean a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
