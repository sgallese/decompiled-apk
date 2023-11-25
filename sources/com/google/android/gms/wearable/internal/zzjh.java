package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzjh implements Runnable {
    final /* synthetic */ Uri zza;
    final /* synthetic */ BaseImplementation.ResultHolder zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzjj zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjh(zzjj zzjjVar, Uri uri, BaseImplementation.ResultHolder resultHolder, boolean z10, String str) {
        this.zze = zzjjVar;
        this.zza = uri;
        this.zzb = resultHolder;
        this.zzc = z10;
        this.zzd = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "Executing receiveFileFromChannelTask");
        }
        String scheme = this.zza.getScheme();
        if (scheme != "file" && (scheme == null || !scheme.equals("file"))) {
            Log.w("WearableClient", "Channel.receiveFile used with non-file URI");
            this.zzb.setFailedResult(new Status(10, "Channel.receiveFile used with non-file URI"));
            return;
        }
        File file = new File(this.zza.getPath());
        if (true != this.zzc) {
            i10 = 0;
        } else {
            i10 = 33554432;
        }
        try {
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, i10 | 671088640);
            try {
                try {
                    ((zzft) this.zze.getService()).zzC(new zzje(this.zzb), this.zzd, open);
                    try {
                        open.close();
                    } catch (IOException e10) {
                        Log.w("WearableClient", "Failed to close targetFd", e10);
                    }
                } catch (RemoteException e11) {
                    Log.w("WearableClient", "Channel.receiveFile failed.", e11);
                    this.zzb.setFailedResult(new Status(8));
                    try {
                        open.close();
                    } catch (IOException e12) {
                        Log.w("WearableClient", "Failed to close targetFd", e12);
                    }
                }
            } catch (Throwable th) {
                try {
                    open.close();
                } catch (IOException e13) {
                    Log.w("WearableClient", "Failed to close targetFd", e13);
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            Log.w("WearableClient", "File couldn't be opened for Channel.receiveFile: ".concat(file.toString()));
            this.zzb.setFailedResult(new Status(13));
        }
    }
}
