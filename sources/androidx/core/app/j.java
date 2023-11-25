package androidx.core.app;

import android.content.res.Configuration;

/* compiled from: MultiWindowModeChangedInfo.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f3656a;

    /* renamed from: b  reason: collision with root package name */
    private final Configuration f3657b;

    public j(boolean z10) {
        this.f3656a = z10;
        this.f3657b = null;
    }

    public boolean a() {
        return this.f3656a;
    }

    public j(boolean z10, Configuration configuration) {
        this.f3656a = z10;
        this.f3657b = configuration;
    }
}
