package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfnz extends zzfnn {
    private zzfry<Integer> zza;
    private zzfry<Integer> zzb;
    private zzfny zzc;
    private HttpURLConnection zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfnz(zzfry<Integer> zzfryVar, zzfry<Integer> zzfryVar2, zzfny zzfnyVar) {
        this.zza = zzfryVar;
        this.zzb = zzfryVar2;
        this.zzc = zzfnyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfno.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfno.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfny zzfnyVar = this.zzc;
        zzfnyVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfnyVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfny zzfnyVar, final int i10, final int i11) throws IOException {
        this.zza = new zzfry() { // from class: com.google.android.gms.internal.ads.zzfnp
            @Override // com.google.android.gms.internal.ads.zzfry
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i10);
                return valueOf;
            }
        };
        this.zzb = new zzfry() { // from class: com.google.android.gms.internal.ads.zzfnq
            @Override // com.google.android.gms.internal.ads.zzfry
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i11);
                return valueOf;
            }
        };
        this.zzc = zzfnyVar;
        return zzm();
    }

    public HttpURLConnection zzo(final Network network, final URL url, final int i10, final int i11) throws IOException {
        this.zza = new zzfry() { // from class: com.google.android.gms.internal.ads.zzfnr
            @Override // com.google.android.gms.internal.ads.zzfry
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i10);
                return valueOf;
            }
        };
        this.zzb = new zzfry() { // from class: com.google.android.gms.internal.ads.zzfns
            @Override // com.google.android.gms.internal.ads.zzfry
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i11);
                return valueOf;
            }
        };
        this.zzc = new zzfny() { // from class: com.google.android.gms.internal.ads.zzfnt
            @Override // com.google.android.gms.internal.ads.zzfny
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = network.openConnection(url);
                return openConnection;
            }
        };
        return zzm();
    }

    public URLConnection zzr(final URL url, final int i10) throws IOException {
        this.zza = new zzfry() { // from class: com.google.android.gms.internal.ads.zzfnu
            @Override // com.google.android.gms.internal.ads.zzfry
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i10);
                return valueOf;
            }
        };
        this.zzc = new zzfny() { // from class: com.google.android.gms.internal.ads.zzfnv
            @Override // com.google.android.gms.internal.ads.zzfny
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = url.openConnection();
                return openConnection;
            }
        };
        return zzm();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfnz() {
        this(new zzfry() { // from class: com.google.android.gms.internal.ads.zzfnw
            @Override // com.google.android.gms.internal.ads.zzfry
            public final Object zza() {
                return zzfnz.zzf();
            }
        }, new zzfry() { // from class: com.google.android.gms.internal.ads.zzfnx
            @Override // com.google.android.gms.internal.ads.zzfry
            public final Object zza() {
                return zzfnz.zzg();
            }
        }, null);
    }
}
