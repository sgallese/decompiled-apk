package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes4.dex */
public final class c implements Continuation<Object> {

    /* renamed from: f  reason: collision with root package name */
    public static final c f19455f = new c();

    private c() {
    }

    @Override // kotlin.coroutines.Continuation
    public hc.f getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
