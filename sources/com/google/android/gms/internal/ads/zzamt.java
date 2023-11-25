package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzamt extends zzalp {
    private final Object zza;
    private final zzalu zzb;

    public zzamt(int i10, String str, zzalu zzaluVar, zzalt zzaltVar) {
        super(i10, str, zzaltVar);
        this.zza = new Object();
        this.zzb = zzaluVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzalp
    public final zzalv zzh(zzall zzallVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzallVar.zzb;
            Map map = zzallVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i10 = 1;
                while (true) {
                    if (i10 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i10].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i10++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzallVar.zzb);
        }
        return zzalv.zzb(str, zzamm.zzb(zzallVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzalp
    /* renamed from: zzz  reason: merged with bridge method [inline-methods] */
    public void zzo(String str) {
        zzalu zzaluVar;
        synchronized (this.zza) {
            zzaluVar = this.zzb;
        }
        zzaluVar.zza(str);
    }
}
