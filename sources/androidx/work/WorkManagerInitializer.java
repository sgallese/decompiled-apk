package androidx.work;

import android.content.Context;
import androidx.work.b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements z3.a<v> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7384a = l.f("WrkMgrInitializer");

    @Override // z3.a
    public List<Class<? extends z3.a<?>>> a() {
        return Collections.emptyList();
    }

    @Override // z3.a
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public v b(Context context) {
        l.c().a(f7384a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        v.e(context, new b.C0167b().a());
        return v.d(context);
    }
}
