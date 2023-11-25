package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@SafeParcelable.Class(creator = "GassResponseParcelCreator")
/* loaded from: classes3.dex */
public final class zzfmm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfmm> CREATOR = new zzfmn();
    @SafeParcelable.VersionField(id = 1)
    public final int zza;
    @SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", id = 2, type = "byte[]")
    private zzaos zzb = null;
    private byte[] zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzfmm(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.zza = i10;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzaos zzaosVar = this.zzb;
        if (zzaosVar == null && this.zzc != null) {
            return;
        }
        if (zzaosVar != null && this.zzc == null) {
            return;
        }
        if (zzaosVar != null && this.zzc != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        }
        if (zzaosVar == null && this.zzc == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        }
        throw new IllegalStateException("Impossible");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzax();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzaos zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzaos.zze(this.zzc, zzgrc.zza());
                this.zzc = null;
            } catch (zzgsc | NullPointerException e10) {
                throw new IllegalStateException(e10);
            }
        }
        zzb();
        return this.zzb;
    }
}
