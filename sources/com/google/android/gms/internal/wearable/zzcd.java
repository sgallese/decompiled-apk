package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.zzcd;
import com.google.android.gms.internal.wearable.zzcg;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public class zzcd<MessageType extends zzcg<MessageType, BuilderType>, BuilderType extends zzcd<MessageType, BuilderType>> extends zzaq<MessageType, BuilderType> {
    protected zzcg zza;
    private final zzcg zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcd(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzaf()) {
            this.zza = messagetype.zzP();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    @Override // com.google.android.gms.internal.wearable.zzdo
    public final /* bridge */ /* synthetic */ zzdn zzag() {
        throw null;
    }

    @Override // com.google.android.gms.internal.wearable.zzaq
    /* renamed from: zzp  reason: merged with bridge method [inline-methods] */
    public final zzcd clone() {
        zzcd zzcdVar = (zzcd) this.zzb.zzG(5, null, null);
        zzcdVar.zza = zzs();
        return zzcdVar;
    }

    public final MessageType zzq() {
        MessageType zzs = zzs();
        if (zzs.zzae()) {
            return zzs;
        }
        throw new zzeo(zzs);
    }

    @Override // com.google.android.gms.internal.wearable.zzdm
    /* renamed from: zzr  reason: merged with bridge method [inline-methods] */
    public MessageType zzs() {
        if (!this.zza.zzaf()) {
            return (MessageType) this.zza;
        }
        this.zza.zzZ();
        return (MessageType) this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzu() {
        if (!this.zza.zzaf()) {
            zzv();
        }
    }

    protected void zzv() {
        zzcg zzP = this.zzb.zzP();
        zzdv.zza().zzb(zzP.getClass()).zzg(zzP, this.zza);
        this.zza = zzP;
    }
}
