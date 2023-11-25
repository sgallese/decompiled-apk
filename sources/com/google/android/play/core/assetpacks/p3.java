package com.google.android.play.core.assetpacks;

import android.content.Context;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class p3 implements x7.f0 {

    /* renamed from: a  reason: collision with root package name */
    private final x7.f0 f10947a;

    /* renamed from: b  reason: collision with root package name */
    private final x7.f0 f10948b;

    /* renamed from: c  reason: collision with root package name */
    private final x7.f0 f10949c;

    public p3(x7.f0 f0Var, x7.f0 f0Var2, x7.f0 f0Var3) {
        this.f10947a = f0Var;
        this.f10948b = f0Var2;
        this.f10949c = f0Var3;
    }

    @Override // x7.f0
    public final /* bridge */ /* synthetic */ Object zza() {
        t3 t3Var;
        Context a10 = ((q3) this.f10947a).a();
        x7.b0 a11 = x7.d0.a(this.f10948b);
        x7.b0 a12 = x7.d0.a(this.f10949c);
        if (m3.b(a10) == null) {
            t3Var = (t3) a11.zza();
        } else {
            t3Var = (t3) a12.zza();
        }
        x7.e0.a(t3Var);
        return t3Var;
    }
}
