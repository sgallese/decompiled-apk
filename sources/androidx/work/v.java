package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* compiled from: WorkManager.java */
@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes.dex */
public abstract class v {
    public static v d(Context context) {
        return g4.j.k(context);
    }

    public static void e(Context context, b bVar) {
        g4.j.e(context, bVar);
    }

    public abstract o a(String str);

    public final o b(w wVar) {
        return c(Collections.singletonList(wVar));
    }

    public abstract o c(List<? extends w> list);
}
