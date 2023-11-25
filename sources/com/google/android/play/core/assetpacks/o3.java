package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class o3 implements x7.f0 {

    /* renamed from: a  reason: collision with root package name */
    private final x7.f0 f10932a;

    /* renamed from: b  reason: collision with root package name */
    private final x7.f0 f10933b;

    public o3(x7.f0 f0Var, x7.f0 f0Var2) {
        this.f10932a = f0Var;
        this.f10933b = f0Var2;
    }

    @Override // x7.f0
    public final /* bridge */ /* synthetic */ Object zza() {
        Object zza = this.f10932a.zza();
        Context a10 = ((q3) this.f10933b).a();
        k3 k3Var = (k3) zza;
        x7.s.a(a10.getPackageManager(), new ComponentName(a10.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        x7.s.a(a10.getPackageManager(), new ComponentName(a10.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
        x7.e0.a(k3Var);
        return k3Var;
    }
}
