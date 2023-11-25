package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
@ShowFirstParty
@SafeParcelable.Class(creator = "AppThemeParcelableCreator")
/* loaded from: classes3.dex */
public class AppTheme extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AppTheme> CREATOR = new zzc();
    @SafeParcelable.Field(getter = "getColorTheme", id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getDynamicColor", id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getScreenAlignment", id = 3)
    private final int zzc;
    @SafeParcelable.Field(getter = "getScreenItemsSize", id = 4)
    private final int zzd;

    public AppTheme() {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppTheme)) {
            return false;
        }
        AppTheme appTheme = (AppTheme) obj;
        if (this.zzb == appTheme.zzb && this.zza == appTheme.zza && this.zzc == appTheme.zzc && this.zzd == appTheme.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zzb * 31) + this.zza) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final String toString() {
        return "AppTheme {dynamicColor =" + this.zzb + ", colorTheme =" + this.zza + ", screenAlignment =" + this.zzc + ", screenItemsSize =" + this.zzd + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        int i11 = this.zza;
        int i12 = 1;
        if (i11 == 0) {
            i11 = 1;
        }
        SafeParcelWriter.writeInt(parcel, 1, i11);
        int i13 = this.zzb;
        if (i13 == 0) {
            i13 = 1;
        }
        SafeParcelWriter.writeInt(parcel, 2, i13);
        int i14 = this.zzc;
        if (i14 != 0) {
            i12 = i14;
        }
        int i15 = 3;
        SafeParcelWriter.writeInt(parcel, 3, i12);
        int i16 = this.zzd;
        if (i16 != 0) {
            i15 = i16;
        }
        SafeParcelWriter.writeInt(parcel, 4, i15);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public AppTheme(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 4) int i13) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
    }
}
