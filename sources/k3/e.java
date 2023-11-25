package k3;

import android.os.Bundle;

/* compiled from: NavAction.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final int f19305a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.navigation.m f19306b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f19307c;

    public e(int i10, androidx.navigation.m mVar, Bundle bundle) {
        this.f19305a = i10;
        this.f19306b = mVar;
        this.f19307c = bundle;
    }

    public final Bundle a() {
        return this.f19307c;
    }

    public final int b() {
        return this.f19305a;
    }

    public final androidx.navigation.m c() {
        return this.f19306b;
    }

    public final void d(Bundle bundle) {
        this.f19307c = bundle;
    }

    public final void e(androidx.navigation.m mVar) {
        this.f19306b = mVar;
    }

    public /* synthetic */ e(int i10, androidx.navigation.m mVar, Bundle bundle, int i11, qc.h hVar) {
        this(i10, (i11 & 2) != 0 ? null : mVar, (i11 & 4) != 0 ? null : bundle);
    }
}
