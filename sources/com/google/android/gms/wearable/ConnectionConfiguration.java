package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
@ShowFirstParty
@SafeParcelable.Class(creator = "ConnectionConfigurationCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class ConnectionConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new zze();
    @SafeParcelable.Field(getter = "getName", id = 2)
    private final String zza;
    @SafeParcelable.Field(getter = "getAddress", id = 3)
    private final String zzb;
    @SafeParcelable.Field(getter = "getType", id = 4)
    private final int zzc;
    @SafeParcelable.Field(getter = "getRole", id = 5)
    private final int zzd;
    @SafeParcelable.Field(getter = "isEnabled", id = 6)
    private final boolean zze;
    @SafeParcelable.Field(getter = "isConnected", id = 7)
    private final boolean zzf;
    @SafeParcelable.Field(getter = "getPeerNodeId", id = 8)
    private volatile String zzg;
    @SafeParcelable.Field(getter = "getBtlePriority", id = 9)
    private final boolean zzh;
    @SafeParcelable.Field(getter = "getNodeId", id = 10)
    private final String zzi;
    @SafeParcelable.Field(getter = "getPackageName", id = 11)
    private final String zzj;
    @SafeParcelable.Field(getter = "getConnectionRetryStrategy", id = 12)
    private final int zzk;
    @SafeParcelable.Field(getter = "getAllowedConfigPackages", id = 13)
    private final List zzl;
    @SafeParcelable.Field(defaultValue = "false", getter = "isMigrating", id = 14)
    private final boolean zzm;
    @SafeParcelable.Field(defaultValue = "true", getter = "isDataItemSyncEnabled", id = 15)
    private final boolean zzn;
    @SafeParcelable.Field(getter = "getRestrictions", id = 16)
    private final zzf zzo;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public ConnectionConfiguration(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) int i10, @SafeParcelable.Param(id = 5) int i11, @SafeParcelable.Param(id = 6) boolean z10, @SafeParcelable.Param(id = 7) boolean z11, @SafeParcelable.Param(id = 8) String str3, @SafeParcelable.Param(id = 9) boolean z12, @SafeParcelable.Param(id = 10) String str4, @SafeParcelable.Param(id = 11) String str5, @SafeParcelable.Param(id = 12) int i12, @SafeParcelable.Param(id = 13) List list, @SafeParcelable.Param(id = 14) boolean z13, @SafeParcelable.Param(id = 15) boolean z14, @SafeParcelable.Param(id = 16) zzf zzfVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = z10;
        this.zzf = z11;
        this.zzg = str3;
        this.zzh = z12;
        this.zzi = str4;
        this.zzj = str5;
        this.zzk = i12;
        this.zzl = list;
        this.zzm = z13;
        this.zzn = z14;
        this.zzo = zzfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        if (!Objects.equal(this.zza, connectionConfiguration.zza) || !Objects.equal(this.zzb, connectionConfiguration.zzb) || !Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(connectionConfiguration.zzc)) || !Objects.equal(Integer.valueOf(this.zzd), Integer.valueOf(connectionConfiguration.zzd)) || !Objects.equal(Boolean.valueOf(this.zze), Boolean.valueOf(connectionConfiguration.zze)) || !Objects.equal(Boolean.valueOf(this.zzh), Boolean.valueOf(connectionConfiguration.zzh)) || !Objects.equal(Boolean.valueOf(this.zzm), Boolean.valueOf(connectionConfiguration.zzm)) || !Objects.equal(Boolean.valueOf(this.zzn), Boolean.valueOf(connectionConfiguration.zzn))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Boolean.valueOf(this.zze), Boolean.valueOf(this.zzh), Boolean.valueOf(this.zzm), Boolean.valueOf(this.zzn));
    }

    public final String toString() {
        return "ConnectionConfiguration[ Name=" + this.zza + ", Address=" + this.zzb + ", Type=" + this.zzc + ", Role=" + this.zzd + ", Enabled=" + this.zze + ", IsConnected=" + this.zzf + ", PeerNodeId=" + this.zzg + ", BtlePriority=" + this.zzh + ", NodeId=" + this.zzi + ", PackageName=" + this.zzj + ", ConnectionRetryStrategy=" + this.zzk + ", allowedConfigPackages=" + this.zzl + ", Migrating=" + this.zzm + ", DataItemSyncEnabled=" + this.zzn + ", ConnectionRestrictions=" + this.zzo + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzf);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeString(parcel, 10, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeStringList(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzn);
        SafeParcelWriter.writeParcelable(parcel, 16, this.zzo, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
