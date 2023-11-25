package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import c8.o;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class zzc extends ResultReceiver {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ o f11137f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(c cVar, Handler handler, o oVar) {
        super(handler);
        this.f11137f = oVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f11137f.e(null);
    }
}
