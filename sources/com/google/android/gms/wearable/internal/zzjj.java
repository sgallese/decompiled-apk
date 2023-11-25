package com.google.android.gms.wearable.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageClient;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzjj extends GmsClient {
    private final ExecutorService zze;
    private final zzfx zzf;
    private final zzfx zzg;
    private final zzfx zzh;
    private final zzfx zzi;
    private final zzfx zzj;
    private final zzfx zzk;
    private final zzfx zzl;
    private final zzfx zzm;
    private final zzfx zzn;
    private final zzfx zzo;
    private final zzfx zzp;
    private final zzfx zzq;
    private final zzjr zzr;
    private final com.google.android.gms.internal.wearable.zzah zzs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjj(final Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings) {
        super(context, looper, 14, clientSettings, connectionCallbacks, onConnectionFailedListener);
        com.google.android.gms.internal.wearable.zzh.zza();
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        zzjr zza = zzjr.zza(context);
        this.zzf = new zzfx();
        this.zzg = new zzfx();
        this.zzh = new zzfx();
        this.zzi = new zzfx();
        this.zzj = new zzfx();
        this.zzk = new zzfx();
        this.zzl = new zzfx();
        this.zzm = new zzfx();
        this.zzn = new zzfx();
        this.zzo = new zzfx();
        this.zzp = new zzfx();
        this.zzq = new zzfx();
        this.zze = (ExecutorService) Preconditions.checkNotNull(unconfigurableExecutorService);
        this.zzr = zza;
        this.zzs = com.google.android.gms.internal.wearable.zzak.zza(new com.google.android.gms.internal.wearable.zzah() { // from class: com.google.android.gms.wearable.internal.zzjf
            @Override // com.google.android.gms.internal.wearable.zzah
            public final Object zza() {
                File file = new File(new File(context.getFilesDir(), "wearos_assets"), "streamtmp");
                file.mkdirs();
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        file2.delete();
                    }
                }
                return file;
            }
        });
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void connect(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        int i10;
        if (!requiresGooglePlayServices()) {
            try {
                Bundle bundle = getContext().getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                if (bundle != null) {
                    i10 = bundle.getInt("com.google.android.wearable.api.version", 0);
                } else {
                    i10 = 0;
                }
                if (i10 < 8600000) {
                    Log.w("WearableClient", "The Wear OS app is out of date. Requires API version 8600000 but found " + i10);
                    Context context = getContext();
                    Context context2 = getContext();
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context2.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    triggerNotAvailable(connectionProgressReportCallbacks, 6, PendingIntent.getActivity(context, 0, intent, com.google.android.gms.internal.wearable.zzd.zza));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                triggerNotAvailable(connectionProgressReportCallbacks, 16, null);
                return;
            }
        }
        super.connect(connectionProgressReportCallbacks);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        if (queryLocalInterface instanceof zzft) {
            return (zzft) queryLocalInterface;
        }
        return new zzft(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return com.google.android.gms.wearable.zzj.zzx;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 8600000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServicePackage() {
        if (this.zzr.zzb()) {
            return "com.google.android.wearable.app.cn";
        }
        return "com.google.android.gms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "onPostInitHandler: statusCode " + i10);
        }
        if (i10 == 0) {
            this.zzf.zzb(iBinder);
            this.zzg.zzb(iBinder);
            this.zzh.zzb(iBinder);
            this.zzj.zzb(iBinder);
            this.zzk.zzb(iBinder);
            this.zzl.zzb(iBinder);
            this.zzm.zzb(iBinder);
            this.zzn.zzb(iBinder);
            this.zzo.zzb(iBinder);
            this.zzi.zzb(iBinder);
            i10 = 0;
        }
        super.onPostInitHandler(i10, iBinder, bundle, i11);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        if (!this.zzr.zzb()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzA(BaseImplementation.ResultHolder resultHolder, MessageApi.MessageListener messageListener) throws RemoteException {
        this.zzk.zzc(this, resultHolder, messageListener);
    }

    public final void zzB(BaseImplementation.ResultHolder resultHolder, MessageClient.RpcService rpcService) throws RemoteException {
        this.zzl.zzc(this, resultHolder, rpcService);
    }

    public final void zzC(BaseImplementation.ResultHolder resultHolder, String str, Uri uri, long j10, long j11) {
        boolean z10;
        boolean z11;
        try {
            ExecutorService executorService = this.zze;
            Preconditions.checkNotNull(resultHolder);
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(uri);
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkArgument(z10, "startOffset is negative: %s", Long.valueOf(j10));
            if (j11 >= -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkArgument(z11, "invalid length: %s", Long.valueOf(j11));
            executorService.execute(new zzji(this, uri, resultHolder, str, j10, j11));
        } catch (RuntimeException e10) {
            resultHolder.setFailedResult(new Status(8));
            throw e10;
        }
    }

    public final void zzp(BaseImplementation.ResultHolder resultHolder, CapabilityApi.CapabilityListener capabilityListener, ListenerHolder listenerHolder, IntentFilter[] intentFilterArr) throws RemoteException {
        this.zzo.zza(this, resultHolder, capabilityListener, zzjq.zzl(listenerHolder, intentFilterArr));
    }

    public final void zzq(BaseImplementation.ResultHolder resultHolder, ChannelApi.ChannelListener channelListener, ListenerHolder listenerHolder, String str, IntentFilter[] intentFilterArr) throws RemoteException {
        if (str == null) {
            this.zzh.zza(this, resultHolder, channelListener, zzjq.zzn(listenerHolder, intentFilterArr));
            return;
        }
        this.zzh.zza(this, resultHolder, new zzia(str, channelListener), zzjq.zzo(listenerHolder, str, intentFilterArr));
    }

    public final void zzr(BaseImplementation.ResultHolder resultHolder, DataApi.DataListener dataListener, ListenerHolder listenerHolder, IntentFilter[] intentFilterArr) throws RemoteException {
        this.zzj.zza(this, resultHolder, dataListener, zzjq.zzp(listenerHolder, intentFilterArr));
    }

    public final void zzs(BaseImplementation.ResultHolder resultHolder, MessageApi.MessageListener messageListener, ListenerHolder listenerHolder, IntentFilter[] intentFilterArr) throws RemoteException {
        this.zzk.zza(this, resultHolder, messageListener, zzjq.zzq(listenerHolder, intentFilterArr));
    }

    public final void zzt(BaseImplementation.ResultHolder resultHolder, MessageClient.RpcService rpcService, ListenerHolder listenerHolder, IntentFilter[] intentFilterArr) throws RemoteException {
        this.zzl.zza(this, resultHolder, rpcService, zzjq.zzr(listenerHolder, intentFilterArr));
    }

    public final void zzu(BaseImplementation.ResultHolder resultHolder, Asset asset) throws RemoteException {
        ((zzft) getService()).zzr(new zziv(resultHolder), asset);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzv(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r17, com.google.android.gms.wearable.PutDataRequest r18) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzjj.zzv(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder, com.google.android.gms.wearable.PutDataRequest):void");
    }

    public final void zzw(BaseImplementation.ResultHolder resultHolder, String str, Uri uri, boolean z10) {
        try {
            ExecutorService executorService = this.zze;
            Preconditions.checkNotNull(resultHolder);
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(uri);
            executorService.execute(new zzjh(this, uri, resultHolder, z10, str));
        } catch (RuntimeException e10) {
            resultHolder.setFailedResult(new Status(8));
            throw e10;
        }
    }

    public final void zzx(BaseImplementation.ResultHolder resultHolder, CapabilityApi.CapabilityListener capabilityListener) throws RemoteException {
        this.zzo.zzc(this, resultHolder, capabilityListener);
    }

    public final void zzy(BaseImplementation.ResultHolder resultHolder, ChannelApi.ChannelListener channelListener, String str) throws RemoteException {
        if (str == null) {
            this.zzh.zzc(this, resultHolder, channelListener);
            return;
        }
        this.zzh.zzc(this, resultHolder, new zzia(str, channelListener));
    }

    public final void zzz(BaseImplementation.ResultHolder resultHolder, DataApi.DataListener dataListener) throws RemoteException {
        this.zzj.zzc(this, resultHolder, dataListener);
    }
}
