package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
class j extends x7.m0 {

    /* renamed from: f  reason: collision with root package name */
    final c8.o f10850f;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ r f10851m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(r rVar, c8.o oVar) {
        this.f10851m = rVar;
        this.f10850f = oVar;
    }

    @Override // x7.n0
    public void A(int i10, Bundle bundle) {
        x7.r rVar;
        x7.f fVar;
        rVar = this.f10851m.f10961d;
        rVar.s(this.f10850f);
        fVar = r.f10956g;
        fVar.d("onStartDownload(%d)", Integer.valueOf(i10));
    }

    @Override // x7.n0
    public final void G(int i10, Bundle bundle) {
        x7.r rVar;
        x7.f fVar;
        rVar = this.f10851m.f10961d;
        rVar.s(this.f10850f);
        fVar = r.f10956g;
        fVar.d("onGetSession(%d)", Integer.valueOf(i10));
    }

    @Override // x7.n0
    public final void I(Bundle bundle, Bundle bundle2) {
        x7.r rVar;
        x7.f fVar;
        rVar = this.f10851m.f10961d;
        rVar.s(this.f10850f);
        fVar = r.f10956g;
        fVar.d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // x7.n0
    public void b(Bundle bundle, Bundle bundle2) throws RemoteException {
        x7.r rVar;
        x7.f fVar;
        rVar = this.f10851m.f10961d;
        rVar.s(this.f10850f);
        fVar = r.f10956g;
        fVar.d("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // x7.n0
    public void d(List list) {
        x7.r rVar;
        x7.f fVar;
        rVar = this.f10851m.f10961d;
        rVar.s(this.f10850f);
        fVar = r.f10956g;
        fVar.d("onGetSessionStates", new Object[0]);
    }

    @Override // x7.n0
    public final void j(Bundle bundle, Bundle bundle2) {
        x7.r rVar;
        x7.f fVar;
        rVar = this.f10851m.f10961d;
        rVar.s(this.f10850f);
        fVar = r.f10956g;
        fVar.d("onRemoveModule()", new Object[0]);
    }

    @Override // x7.n0
    public void l(Bundle bundle, Bundle bundle2) {
        x7.r rVar;
        x7.f fVar;
        rVar = this.f10851m.f10961d;
        rVar.s(this.f10850f);
        fVar = r.f10956g;
        fVar.d("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // x7.n0
    public final void o(Bundle bundle) {
        x7.r rVar;
        x7.f fVar;
        rVar = this.f10851m.f10961d;
        rVar.s(this.f10850f);
        fVar = r.f10956g;
        fVar.d("onCancelDownloads()", new Object[0]);
    }

    @Override // x7.n0
    public final void r(Bundle bundle, Bundle bundle2) {
        x7.r rVar;
        x7.f fVar;
        rVar = this.f10851m.f10961d;
        rVar.s(this.f10850f);
        fVar = r.f10956g;
        fVar.d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // x7.n0
    public final void u(Bundle bundle, Bundle bundle2) {
        x7.r rVar;
        x7.f fVar;
        rVar = this.f10851m.f10961d;
        rVar.s(this.f10850f);
        fVar = r.f10956g;
        fVar.d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // x7.n0
    public void w(Bundle bundle, Bundle bundle2) {
        x7.r rVar;
        x7.f fVar;
        rVar = this.f10851m.f10962e;
        rVar.s(this.f10850f);
        fVar = r.f10956g;
        fVar.d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // x7.n0
    public final void zzb(int i10, Bundle bundle) {
        x7.r rVar;
        x7.f fVar;
        rVar = this.f10851m.f10961d;
        rVar.s(this.f10850f);
        fVar = r.f10956g;
        fVar.d("onCancelDownload(%d)", Integer.valueOf(i10));
    }

    @Override // x7.n0
    public void zzd(Bundle bundle) {
        x7.r rVar;
        x7.f fVar;
        rVar = this.f10851m.f10961d;
        rVar.s(this.f10850f);
        int i10 = bundle.getInt("error_code");
        fVar = r.f10956g;
        fVar.b("onError(%d)", Integer.valueOf(i10));
        this.f10850f.d(new AssetPackException(i10));
    }
}
