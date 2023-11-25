package x7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class q implements ServiceConnection {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ r f25852f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q(r rVar, p pVar) {
        this.f25852f = rVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        r.f(this.f25852f).d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f25852f.c().post(new n(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        r.f(this.f25852f).d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f25852f.c().post(new o(this));
    }
}
