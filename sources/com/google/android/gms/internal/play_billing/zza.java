package com.google.android.gms.internal.play_billing;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
public enum zza {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);

    private static final zzx zzp;
    private final int zzr;

    static {
        zzw zzwVar = new zzw();
        for (zza zzaVar : values()) {
            zzwVar.zza(Integer.valueOf(zzaVar.zzr), zzaVar);
        }
        zzp = zzwVar.zzb();
    }

    zza(int i10) {
        this.zzr = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zza zza(int i10) {
        zzx zzxVar = zzp;
        Integer valueOf = Integer.valueOf(i10);
        if (!zzxVar.containsKey(valueOf)) {
            return RESPONSE_CODE_UNSPECIFIED;
        }
        return (zza) zzxVar.get(valueOf);
    }
}
