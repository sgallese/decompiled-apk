package x7;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class k extends g {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ r f25848m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(r rVar) {
        this.f25848m = rVar;
    }

    @Override // x7.g
    public final void a() {
        IInterface iInterface;
        f fVar;
        Context context;
        ServiceConnection serviceConnection;
        r rVar = this.f25848m;
        iInterface = rVar.f25867n;
        if (iInterface != null) {
            fVar = rVar.f25855b;
            fVar.d("Unbind from service.", new Object[0]);
            r rVar2 = this.f25848m;
            context = rVar2.f25854a;
            serviceConnection = rVar2.f25866m;
            context.unbindService(serviceConnection);
            this.f25848m.f25860g = false;
            this.f25848m.f25867n = null;
            this.f25848m.f25866m = null;
        }
        this.f25848m.u();
    }
}
