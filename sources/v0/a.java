package v0;

import qc.q;

/* compiled from: Actual.kt */
/* loaded from: classes.dex */
public final class a {
    public static final boolean a(Object obj, Object obj2) {
        q.i(obj, "a");
        q.i(obj2, "b");
        if (obj.getClass() == obj2.getClass()) {
            return true;
        }
        return false;
    }
}
