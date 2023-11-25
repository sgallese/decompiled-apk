package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class d2 implements x7.f0 {

    /* renamed from: a  reason: collision with root package name */
    private final x7.f0 f10760a;

    /* renamed from: b  reason: collision with root package name */
    private final x7.f0 f10761b;

    /* renamed from: c  reason: collision with root package name */
    private final x7.f0 f10762c;

    /* renamed from: d  reason: collision with root package name */
    private final x7.f0 f10763d;

    /* renamed from: e  reason: collision with root package name */
    private final x7.f0 f10764e;

    /* renamed from: f  reason: collision with root package name */
    private final x7.f0 f10765f;

    /* renamed from: g  reason: collision with root package name */
    private final x7.f0 f10766g;

    public d2(x7.f0 f0Var, x7.f0 f0Var2, x7.f0 f0Var3, x7.f0 f0Var4, x7.f0 f0Var5, x7.f0 f0Var6, x7.f0 f0Var7) {
        this.f10760a = f0Var;
        this.f10761b = f0Var2;
        this.f10762c = f0Var3;
        this.f10763d = f0Var4;
        this.f10764e = f0Var5;
        this.f10765f = f0Var6;
        this.f10766g = f0Var7;
    }

    @Override // x7.f0
    public final /* bridge */ /* synthetic */ Object zza() {
        File externalFilesDir;
        String str = (String) this.f10760a.zza();
        Object zza = this.f10761b.zza();
        Object zza2 = this.f10762c.zza();
        Context a10 = ((q3) this.f10763d).a();
        Object zza3 = this.f10764e.zza();
        x7.b0 a11 = x7.d0.a(this.f10765f);
        x xVar = (x) zza;
        g1 g1Var = (g1) zza2;
        q2 q2Var = (q2) zza3;
        o2 o2Var = (o2) this.f10766g.zza();
        if (str != null) {
            externalFilesDir = new File(a10.getExternalFilesDir(null), str);
        } else {
            externalFilesDir = a10.getExternalFilesDir(null);
        }
        return new c2(externalFilesDir, xVar, g1Var, a10, q2Var, a11, o2Var);
    }
}
