package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzasm extends zzatm {
    private static final zzatn zzi = new zzatn();
    private final Context zzj;

    public zzasm(zzary zzaryVar, String str, String str2, zzanv zzanvVar, int i10, int i11, Context context, zzano zzanoVar) {
        super(zzaryVar, "p0JEft1H0Ux+/zQoofBGK8/hHhAdN3veKIjNmetX6I2+7J67s0tf2NBKaWy11XvI", "yaxGJhC1WxugM+8EfEc/xAIuDWtPkz77G//hU7f/vWw=", zzanvVar, i10, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzaos zzc = this.zzb.zzc();
            if (zzc != null && zzc.zzaj()) {
                return zzc.zzh();
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        int i10;
        boolean z10;
        String str;
        zzapj zzapjVar;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzapj zzapjVar2 = (zzapj) zza.get();
            if (zzapjVar2 == null || zzasb.zzd(zzapjVar2.zza) || zzapjVar2.zza.equals("E") || zzapjVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!zzasb.zzd(null)) {
                    i10 = 5;
                } else {
                    if (!zzasb.zzd(null)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    bool.booleanValue();
                    i10 = 3;
                }
                if (i10 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean valueOf = Boolean.valueOf(z10);
                Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzci);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzch)).booleanValue()) {
                    str = zzb();
                } else {
                    str = null;
                }
                if (bool2.booleanValue() && this.zzb.zzp() && zzasb.zzd(str)) {
                    str = zzc();
                }
                zzapj zzapjVar3 = new zzapj((String) this.zzf.invoke(null, this.zzj, valueOf, str));
                if (zzasb.zzd(zzapjVar3.zza) || zzapjVar3.zza.equals("E")) {
                    int i11 = i10 - 1;
                    if (i11 != 3) {
                        if (i11 == 4) {
                            throw null;
                        }
                    } else {
                        String zzc = zzc();
                        if (!zzasb.zzd(zzc)) {
                            zzapjVar3.zza = zzc;
                        }
                    }
                }
                zza.set(zzapjVar3);
            }
            zzapjVar = (zzapj) zza.get();
        }
        synchronized (this.zze) {
            if (zzapjVar != null) {
                this.zze.zzx(zzapjVar.zza);
                this.zze.zzX(zzapjVar.zzb);
                this.zze.zzZ(zzapjVar.zzc);
                this.zze.zzi(zzapjVar.zzd);
                this.zze.zzw(zzapjVar.zze);
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzf = zzasb.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcj));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzasb.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzck)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final zzfyw zze = zzfyw.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzato
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    int type;
                    byte[] value;
                    zzfyw zzfywVar = zzfyw.this;
                    if (list == null) {
                        zzfywVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ApkChecksum a10 = c.a(list.get(i10));
                            type = a10.getType();
                            if (type == 8) {
                                value = a10.getValue();
                                zzfywVar.zzc(zzasb.zzb(value));
                                return;
                            }
                        }
                        zzfywVar.zzc(null);
                    } catch (Throwable unused) {
                        zzfywVar.zzc(null);
                    }
                }
            });
            return (String) zze.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
