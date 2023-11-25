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
final class zzji implements Runnable {
    final /* synthetic */ Uri zza;
    final /* synthetic */ BaseImplementation.ResultHolder zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzjj zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzji(zzjj zzjjVar, Uri uri, BaseImplementation.ResultHolder resultHolder, String str, long j10, long j11) {
        this.zzf = zzjjVar;
        this.zza = uri;
        this.zzb = resultHolder;
        this.zzc = str;
        this.zzd = j10;
        this.zze = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.io.File] */
    @Override // java.lang.Runnable
    public final void run() {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "Executing sendFileToChannelTask");
        }
        String scheme = this.zza.getScheme();
        if (scheme != "file" && (scheme == null || !scheme.equals("file"))) {
            Log.w("WearableClient", "Channel.sendFile used with non-file URI");
            this.zzb.setFailedResult(new Status(10, "Channel.sendFile used with non-file URI"));
            return;
        }
        ParcelFileDescriptor file = new File(this.zza.getPath());
        try {
            try {
                file = ParcelFileDescriptor.open(file, 268435456);
                try {
                    ((zzft) this.zzf.getService()).zzw(new zzja(this.zzb), this.zzc, file, this.zzd, this.zze);
                    try {
                        file.close();
                    } catch (IOException e10) {
                        Log.w("WearableClient", "Failed to close sourceFd", e10);
                    }
                } catch (RemoteException e11) {
                    Log.w("WearableClient", "Channel.sendFile failed.", e11);
                    this.zzb.setFailedResult(new Status(8));
                    try {
                        file.close();
                    } catch (IOException e12) {
                        Log.w("WearableClient", "Failed to close sourceFd", e12);
                    }
                }
            } catch (FileNotFoundException unused) {
                Log.w("WearableClient", "File couldn't be opened for Channel.sendFile: ".concat(file.toString()));
                this.zzb.setFailedResult(new Status(13));
            }
        } catch (Throwable th) {
            try {
                file.close();
            } catch (IOException e13) {
                Log.w("WearableClient", "Failed to close sourceFd", e13);
            }
            throw th;
        }
    }
}
