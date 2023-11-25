package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzhi extends zzgc {
    private final Resources zza;
    private final String zzb;
    private Uri zzc;
    private AssetFileDescriptor zzd;
    private InputStream zze;
    private long zzf;
    private boolean zzg;

    public zzhi(Context context) {
        super(false);
        this.zza = context.getResources();
        this.zzb = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws zzhh {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zzf;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new zzhh(null, e10, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
            }
        }
        InputStream inputStream = this.zze;
        int i12 = zzfk.zza;
        int read = inputStream.read(bArr, i10, i11);
        if (read == -1) {
            if (this.zzf == -1) {
                return -1;
            }
            throw new zzhh("End of stream reached having not read sufficient data.", new EOFException(), CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        }
        long j11 = this.zzf;
        if (j11 != -1) {
            this.zzf = j11 - read;
        }
        zzg(read);
        return read;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        if (r3.matches("\\d+") != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0172  */
    @Override // com.google.android.gms.internal.ads.zzgi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(com.google.android.gms.internal.ads.zzgn r18) throws com.google.android.gms.internal.ads.zzhh {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhi.zzb(com.google.android.gms.internal.ads.zzgn):long");
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd() throws zzhh {
        this.zzc = null;
        try {
            try {
                InputStream inputStream = this.zze;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zze = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzd;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.zzd = null;
                        if (this.zzg) {
                            this.zzg = false;
                            zzh();
                        }
                    }
                } catch (IOException e10) {
                    throw new zzhh(null, e10, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
                }
            } catch (IOException e11) {
                throw new zzhh(null, e11, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
            }
        } catch (Throwable th) {
            this.zze = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.zzd;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.zzd = null;
                    if (this.zzg) {
                        this.zzg = false;
                        zzh();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new zzhh(null, e12, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
                }
            } catch (Throwable th2) {
                this.zzd = null;
                if (this.zzg) {
                    this.zzg = false;
                    zzh();
                }
                throw th2;
            }
        }
    }
}
