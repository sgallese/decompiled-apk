package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgf extends zzgc {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgf(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws zzge {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zze;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new zzge(e10, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        int i12 = zzfk.zza;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.zze;
        if (j11 != -1) {
            this.zze = j11 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgnVar) throws zzge {
        int i10;
        AssetFileDescriptor openAssetFileDescriptor;
        long j10;
        try {
            try {
                Uri normalizeScheme = zzgnVar.zza.normalizeScheme();
                this.zzb = normalizeScheme;
                zzi(zzgnVar);
                if ("content".equals(normalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.zza.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.zzc = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.zzd = fileInputStream;
                    if (length != -1 && zzgnVar.zzf > length) {
                        throw new zzge(null, 2008);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(zzgnVar.zzf + startOffset) - startOffset;
                    if (skip == zzgnVar.zzf) {
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.zze = -1L;
                                j10 = -1;
                            } else {
                                j10 = size - channel.position();
                                this.zze = j10;
                                if (j10 < 0) {
                                    throw new zzge(null, 2008);
                                }
                            }
                        } else {
                            j10 = length - skip;
                            this.zze = j10;
                            if (j10 < 0) {
                                throw new zzge(null, 2008);
                            }
                        }
                        long j11 = zzgnVar.zzg;
                        if (j11 != -1) {
                            if (j10 != -1) {
                                j11 = Math.min(j10, j11);
                            }
                            this.zze = j11;
                        }
                        this.zzf = true;
                        zzj(zzgnVar);
                        long j12 = zzgnVar.zzg;
                        if (j12 != -1) {
                            return j12;
                        }
                        return this.zze;
                    }
                    throw new zzge(null, 2008);
                }
                IOException iOException = new IOException("Could not open file descriptor for: " + String.valueOf(normalizeScheme));
                i10 = CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
                try {
                    throw new zzge(iOException, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
                } catch (IOException e10) {
                    e = e10;
                    if (true == (e instanceof FileNotFoundException)) {
                        i10 = 2005;
                    }
                    throw new zzge(e, i10);
                }
            } catch (zzge e11) {
                throw e11;
            }
        } catch (IOException e12) {
            e = e12;
            i10 = CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd() throws zzge {
        this.zzb = null;
        try {
            try {
                FileInputStream fileInputStream = this.zzd;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.zzd = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                    }
                } catch (IOException e10) {
                    throw new zzge(e10, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
                }
            } catch (IOException e11) {
                throw new zzge(e11, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
            }
        } catch (Throwable th) {
            this.zzd = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.zzc = null;
                    if (this.zzf) {
                        this.zzf = false;
                        zzh();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new zzge(e12, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
                }
            } catch (Throwable th2) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th2;
            }
        }
    }
}
