package ec;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SetsJVM.kt */
/* loaded from: classes4.dex */
public class t0 {
    public static <T> Set<T> a(T t10) {
        Set<T> singleton = Collections.singleton(t10);
        qc.q.h(singleton, "singleton(element)");
        return singleton;
    }
}
