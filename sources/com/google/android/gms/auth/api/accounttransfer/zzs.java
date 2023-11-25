package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
@SafeParcelable.Class(creator = "AccountTransferProgressCreator")
/* loaded from: classes.dex */
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    private static final a zzb;
    @SafeParcelable.VersionField(id = 1)
    final int zza;
    @SafeParcelable.Field(getter = "getRegisteredAccountTypes", id = 2)
    private List zzc;
    @SafeParcelable.Field(getter = "getInProgressAccountTypes", id = 3)
    private List zzd;
    @SafeParcelable.Field(getter = "getSuccessAccountTypes", id = 4)
    private List zze;
    @SafeParcelable.Field(getter = "getFailedAccountTypes", id = 5)
    private List zzf;
    @SafeParcelable.Field(getter = "getEscrowedAccountTypes", id = 6)
    private List zzg;

    static {
        a aVar = new a();
        zzb = aVar;
        aVar.put("registered", FastJsonResponse.Field.forStrings("registered", 2));
        aVar.put("in_progress", FastJsonResponse.Field.forStrings("in_progress", 3));
        aVar.put("success", FastJsonResponse.Field.forStrings("success", 4));
        aVar.put("failed", FastJsonResponse.Field.forStrings("failed", 5));
        aVar.put("escrowed", FastJsonResponse.Field.forStrings("escrowed", 6));
    }

    public zzs() {
        this.zza = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map getFieldMappings() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        switch (field.getSafeParcelableFieldId()) {
            case 1:
                return Integer.valueOf(this.zza);
            case 2:
                return this.zzc;
            case 3:
                return this.zzd;
            case 4:
                return this.zze;
            case 5:
                return this.zzf;
            case 6:
                return this.zzg;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + field.getSafeParcelableFieldId());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setStringsInternal(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 2) {
            if (safeParcelableFieldId != 3) {
                if (safeParcelableFieldId != 4) {
                    if (safeParcelableFieldId != 5) {
                        if (safeParcelableFieldId == 6) {
                            this.zzg = arrayList;
                            return;
                        }
                        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(safeParcelableFieldId)));
                    }
                    this.zzf = arrayList;
                    return;
                }
                this.zze = arrayList;
                return;
            }
            this.zzd = arrayList;
            return;
        }
        this.zzc = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzd, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.zze, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) List list2, @SafeParcelable.Param(id = 4) List list3, @SafeParcelable.Param(id = 5) List list4, @SafeParcelable.Param(id = 6) List list5) {
        this.zza = i10;
        this.zzc = list;
        this.zzd = list2;
        this.zze = list3;
        this.zzf = list4;
        this.zzg = list5;
    }
}
