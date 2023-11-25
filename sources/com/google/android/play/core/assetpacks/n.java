package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class n extends j {

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ r f10911p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, c8.o oVar) {
        super(rVar, oVar);
        this.f10911p = rVar;
    }

    @Override // com.google.android.play.core.assetpacks.j, x7.n0
    public final void w(Bundle bundle, Bundle bundle2) {
        AtomicBoolean atomicBoolean;
        x7.f fVar;
        super.w(bundle, bundle2);
        atomicBoolean = this.f10911p.f10963f;
        if (!atomicBoolean.compareAndSet(true, false)) {
            fVar = r.f10956g;
            fVar.e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f10911p.zzf();
        }
    }

    @Override // com.google.android.play.core.assetpacks.j, x7.n0
    public final void zzd(Bundle bundle) {
        x7.r rVar;
        x7.f fVar;
        rVar = this.f10911p.f10962e;
        rVar.s(this.f10850f);
        int i10 = bundle.getInt("error_code");
        fVar = r.f10956g;
        fVar.b("onError(%d)", Integer.valueOf(i10));
        this.f10850f.d(new AssetPackException(i10));
    }
}
