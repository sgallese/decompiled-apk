package androidx.compose.runtime;

import qc.q;

/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class ComposeRuntimeError extends IllegalStateException {

    /* renamed from: f  reason: collision with root package name */
    private final String f2306f;

    public ComposeRuntimeError(String str) {
        q.i(str, "message");
        this.f2306f = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f2306f;
    }
}
