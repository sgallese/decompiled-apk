package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.lifecycle.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements s {

    /* renamed from: f  reason: collision with root package name */
    private final Object f4884f;

    /* renamed from: m  reason: collision with root package name */
    private final d.a f4885m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f4884f = obj;
        this.f4885m = d.f4951c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.s
    public void c(v vVar, p.a aVar) {
        this.f4885m.a(vVar, aVar, this.f4884f);
    }
}
