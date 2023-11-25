package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class p extends j {

    /* renamed from: p  reason: collision with root package name */
    final int f10934p;

    /* renamed from: q  reason: collision with root package name */
    final String f10935q;

    /* renamed from: r  reason: collision with root package name */
    final int f10936r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ r f10937s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, c8.o oVar, int i10, String str, int i11) {
        super(rVar, oVar);
        this.f10937s = rVar;
        this.f10934p = i10;
        this.f10935q = str;
        this.f10936r = i11;
    }

    @Override // com.google.android.play.core.assetpacks.j, x7.n0
    public final void zzd(Bundle bundle) {
        x7.r rVar;
        x7.f fVar;
        rVar = this.f10937s.f10961d;
        rVar.s(this.f10850f);
        int i10 = bundle.getInt("error_code");
        fVar = r.f10956g;
        fVar.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i10));
        int i11 = this.f10936r;
        if (i11 > 0) {
            this.f10937s.i(this.f10934p, this.f10935q, i11 - 1);
        }
    }
}
