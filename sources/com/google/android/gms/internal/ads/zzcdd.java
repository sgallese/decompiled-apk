package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcdd implements zzgi {
    private final Context zza;
    private final zzgi zzb;
    private final String zzc;
    private final int zzd;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzawq zzi;
    private zzgn zzm;
    private boolean zzj = false;
    private boolean zzk = false;
    private final AtomicLong zzl = new AtomicLong(-1);
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbN)).booleanValue();

    public zzcdd(Context context, zzgi zzgiVar, String str, int i10, zzhk zzhkVar, zzcdc zzcdcVar) {
        this.zza = context;
        this.zzb = zzgiVar;
        this.zzc = str;
        this.zzd = i10;
    }

    private final boolean zzg() {
        if (!this.zze) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeh)).booleanValue() && !this.zzj) {
            return true;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzei)).booleanValue() || this.zzk) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (this.zzg) {
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                return inputStream.read(bArr, i10, i11);
            }
            return this.zzb.zza(bArr, i10, i11);
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v11 */
    @Override // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgnVar) throws IOException {
        Long l10;
        if (!this.zzg) {
            this.zzg = true;
            Uri uri = zzgnVar.zza;
            this.zzh = uri;
            this.zzm = zzgnVar;
            this.zzi = zzawq.zza(uri);
            zzawn zzawnVar = 0;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzee)).booleanValue()) {
                if (this.zzi != null) {
                    this.zzi.zzh = zzgnVar.zzf;
                    this.zzi.zzi = zzfrx.zzc(this.zzc);
                    this.zzi.zzj = this.zzd;
                    if (this.zzi.zzg) {
                        l10 = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeg);
                    } else {
                        l10 = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzef);
                    }
                    long longValue = l10.longValue();
                    com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                    com.google.android.gms.ads.internal.zzt.zzd();
                    Future zza = zzaxb.zza(this.zza, this.zzi);
                    try {
                        zzaxc zzaxcVar = (zzaxc) zza.get(longValue, TimeUnit.MILLISECONDS);
                        zzaxcVar.zzd();
                        this.zzj = zzaxcVar.zzf();
                        this.zzk = zzaxcVar.zze();
                        zzaxcVar.zza();
                        if (!zzg()) {
                            this.zzf = zzaxcVar.zzc();
                            com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                            throw null;
                        }
                        com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                        throw null;
                    } catch (InterruptedException unused) {
                        zza.cancel(false);
                        Thread.currentThread().interrupt();
                        com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                        throw null;
                    } catch (ExecutionException | TimeoutException unused2) {
                        zza.cancel(false);
                        com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                        throw null;
                    }
                }
            } else {
                if (this.zzi != null) {
                    this.zzi.zzh = zzgnVar.zzf;
                    this.zzi.zzi = zzfrx.zzc(this.zzc);
                    this.zzi.zzj = this.zzd;
                    zzawnVar = com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zzi);
                }
                if (zzawnVar != 0 && zzawnVar.zze()) {
                    this.zzj = zzawnVar.zzg();
                    this.zzk = zzawnVar.zzf();
                    if (!zzg()) {
                        this.zzf = zzawnVar.zzc();
                        return -1L;
                    }
                }
            }
            if (this.zzi != null) {
                this.zzm = new zzgn(Uri.parse(this.zzi.zza), null, zzgnVar.zze, zzgnVar.zzf, zzgnVar.zzg, null, zzgnVar.zzi);
            }
            return this.zzb.zzb(this.zzm);
        }
        throw new IOException("Attempt to open an already open CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd() throws IOException {
        if (this.zzg) {
            this.zzg = false;
            this.zzh = null;
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                IOUtils.closeQuietly(inputStream);
                this.zzf = null;
                return;
            }
            this.zzb.zzd();
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzf(zzhk zzhkVar) {
    }
}
