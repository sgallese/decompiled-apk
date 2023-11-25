package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgp implements zzgi {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzgi zzc;
    private zzgi zzd;
    private zzgi zze;
    private zzgi zzf;
    private zzgi zzg;
    private zzgi zzh;
    private zzgi zzi;
    private zzgi zzj;
    private zzgi zzk;

    public zzgp(Context context, zzgi zzgiVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzgiVar;
    }

    private final zzgi zzg() {
        if (this.zze == null) {
            zzgb zzgbVar = new zzgb(this.zza);
            this.zze = zzgbVar;
            zzh(zzgbVar);
        }
        return this.zze;
    }

    private final void zzh(zzgi zzgiVar) {
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzgiVar.zzf((zzhk) this.zzb.get(i10));
        }
    }

    private static final void zzi(zzgi zzgiVar, zzhk zzhkVar) {
        if (zzgiVar != null) {
            zzgiVar.zzf(zzhkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        zzgi zzgiVar = this.zzk;
        zzgiVar.getClass();
        return zzgiVar.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgnVar) throws IOException {
        boolean z10;
        zzgi zzgiVar;
        if (this.zzk == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzf(z10);
        String scheme = zzgnVar.zza.getScheme();
        Uri uri = zzgnVar.zza;
        int i10 = zzfk.zza;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            if ("asset".equals(scheme)) {
                this.zzk = zzg();
            } else if ("content".equals(scheme)) {
                if (this.zzf == null) {
                    zzgf zzgfVar = new zzgf(this.zza);
                    this.zzf = zzgfVar;
                    zzh(zzgfVar);
                }
                this.zzk = this.zzf;
            } else if ("rtmp".equals(scheme)) {
                if (this.zzg == null) {
                    try {
                        zzgi zzgiVar2 = (zzgi) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.zzg = zzgiVar2;
                        zzh(zzgiVar2);
                    } catch (ClassNotFoundException unused) {
                        zzes.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating RTMP extension", e10);
                    }
                    if (this.zzg == null) {
                        this.zzg = this.zzc;
                    }
                }
                this.zzk = this.zzg;
            } else if ("udp".equals(scheme)) {
                if (this.zzh == null) {
                    zzhm zzhmVar = new zzhm(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
                    this.zzh = zzhmVar;
                    zzh(zzhmVar);
                }
                this.zzk = this.zzh;
            } else if ("data".equals(scheme)) {
                if (this.zzi == null) {
                    zzgg zzggVar = new zzgg();
                    this.zzi = zzggVar;
                    zzh(zzggVar);
                }
                this.zzk = this.zzi;
            } else {
                if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    zzgiVar = this.zzc;
                } else {
                    if (this.zzj == null) {
                        zzhi zzhiVar = new zzhi(this.zza);
                        this.zzj = zzhiVar;
                        zzh(zzhiVar);
                    }
                    zzgiVar = this.zzj;
                }
                this.zzk = zzgiVar;
            }
        } else {
            String path = zzgnVar.zza.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.zzk = zzg();
            } else {
                if (this.zzd == null) {
                    zzgy zzgyVar = new zzgy();
                    this.zzd = zzgyVar;
                    zzh(zzgyVar);
                }
                this.zzk = this.zzd;
            }
        }
        return this.zzk.zzb(zzgnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        zzgi zzgiVar = this.zzk;
        if (zzgiVar == null) {
            return null;
        }
        return zzgiVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd() throws IOException {
        zzgi zzgiVar = this.zzk;
        if (zzgiVar != null) {
            try {
                zzgiVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final Map zze() {
        zzgi zzgiVar = this.zzk;
        if (zzgiVar == null) {
            return Collections.emptyMap();
        }
        return zzgiVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzf(zzhk zzhkVar) {
        zzhkVar.getClass();
        this.zzc.zzf(zzhkVar);
        this.zzb.add(zzhkVar);
        zzi(this.zzd, zzhkVar);
        zzi(this.zze, zzhkVar);
        zzi(this.zzf, zzhkVar);
        zzi(this.zzg, zzhkVar);
        zzi(this.zzh, zzhkVar);
        zzi(this.zzi, zzhkVar);
        zzi(this.zzj, zzhkVar);
    }
}
