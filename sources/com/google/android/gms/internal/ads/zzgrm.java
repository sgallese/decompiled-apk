package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgrm;
import com.google.android.gms.internal.ads.zzgrq;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzgrm<MessageType extends zzgrq<MessageType, BuilderType>, BuilderType extends zzgrm<MessageType, BuilderType>> extends zzgpq<MessageType, BuilderType> {
    protected zzgrq zza;
    private final zzgrq zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzgrm(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzaY()) {
            this.zza = messagetype.zzaD();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void zza(Object obj, Object obj2) {
        zzgti.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgpq
    /* renamed from: zzai  reason: merged with bridge method [inline-methods] */
    public final zzgrm clone() {
        zzgrm zzgrmVar = (zzgrm) this.zzb.zzb(5, null, null);
        zzgrmVar.zza = zzan();
        return zzgrmVar;
    }

    public final zzgrm zzaj(zzgrq zzgrqVar) {
        if (!this.zzb.equals(zzgrqVar)) {
            if (!this.zza.zzaY()) {
                zzaq();
            }
            zza(this.zza, zzgrqVar);
        }
        return this;
    }

    public final zzgrm zzak(byte[] bArr, int i10, int i11, zzgrc zzgrcVar) throws zzgsc {
        if (!this.zza.zzaY()) {
            zzaq();
        }
        try {
            zzgti.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i11, new zzgpu(zzgrcVar));
            return this;
        } catch (zzgsc e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgsc.zzj();
        }
    }

    public final MessageType zzal() {
        MessageType zzan = zzan();
        if (zzan.zzaX()) {
            return zzan;
        }
        throw new zzguj(zzan);
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    /* renamed from: zzam  reason: merged with bridge method [inline-methods] */
    public MessageType zzan() {
        if (!this.zza.zzaY()) {
            return (MessageType) this.zza;
        }
        this.zza.zzaS();
        return (MessageType) this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzap() {
        if (!this.zza.zzaY()) {
            zzaq();
        }
    }

    protected void zzaq() {
        zzgrq zzaD = this.zzb.zzaD();
        zza(zzaD, this.zza);
        this.zza = zzaD;
    }

    @Override // com.google.android.gms.internal.ads.zzgtb
    public final /* synthetic */ zzgta zzbf() {
        throw null;
    }
}
