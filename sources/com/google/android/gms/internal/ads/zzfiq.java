package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfiq {
    private final zzfiy zza;
    private final zzfiy zzb;
    private final zzfiu zzc;
    private final zzfix zzd;

    private zzfiq(zzfiu zzfiuVar, zzfix zzfixVar, zzfiy zzfiyVar, zzfiy zzfiyVar2, boolean z10) {
        this.zzc = zzfiuVar;
        this.zzd = zzfixVar;
        this.zza = zzfiyVar;
        if (zzfiyVar2 == null) {
            this.zzb = zzfiy.NONE;
        } else {
            this.zzb = zzfiyVar2;
        }
    }

    public static zzfiq zza(zzfiu zzfiuVar, zzfix zzfixVar, zzfiy zzfiyVar, zzfiy zzfiyVar2, boolean z10) {
        zzfke.zzb(zzfixVar, "ImpressionType is null");
        zzfke.zzb(zzfiyVar, "Impression owner is null");
        if (zzfiyVar != zzfiy.NONE) {
            if (zzfiuVar == zzfiu.DEFINED_BY_JAVASCRIPT && zzfiyVar == zzfiy.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (zzfixVar == zzfix.DEFINED_BY_JAVASCRIPT && zzfiyVar == zzfiy.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return new zzfiq(zzfiuVar, zzfixVar, zzfiyVar, zzfiyVar2, true);
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfjz.zze(jSONObject, "impressionOwner", this.zza);
        zzfjz.zze(jSONObject, "mediaEventsOwner", this.zzb);
        zzfjz.zze(jSONObject, "creativeType", this.zzc);
        zzfjz.zze(jSONObject, "impressionType", this.zzd);
        zzfjz.zze(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
