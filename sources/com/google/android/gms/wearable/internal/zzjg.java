package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzjg implements Callable {
    final /* synthetic */ ParcelFileDescriptor zza;
    final /* synthetic */ byte[] zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjg(zzjj zzjjVar, ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.zza = parcelFileDescriptor;
        this.zzb = bArr;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (Log.isLoggable("WearableClient", 3)) {
            Log.d("WearableClient", "processAssets: writing data to FD : ".concat(String.valueOf(this.zza)));
        }
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(this.zza);
        try {
            try {
                autoCloseOutputStream.write(this.zzb);
                autoCloseOutputStream.flush();
                if (Log.isLoggable("WearableClient", 3)) {
                    Log.d("WearableClient", "processAssets: wrote data: " + String.valueOf(this.zza));
                }
                Boolean bool = Boolean.TRUE;
                try {
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "processAssets: closing: " + String.valueOf(this.zza));
                    }
                    autoCloseOutputStream.close();
                    return bool;
                } catch (IOException unused) {
                    return bool;
                }
            } catch (IOException unused2) {
                Log.w("WearableClient", "processAssets: writing data failed: " + String.valueOf(this.zza));
                try {
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "processAssets: closing: " + String.valueOf(this.zza));
                    }
                    autoCloseOutputStream.close();
                } catch (IOException unused3) {
                }
                return Boolean.FALSE;
            }
        } catch (Throwable th) {
            try {
                if (Log.isLoggable("WearableClient", 3)) {
                    Log.d("WearableClient", "processAssets: closing: " + String.valueOf(this.zza));
                }
                autoCloseOutputStream.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }
}
