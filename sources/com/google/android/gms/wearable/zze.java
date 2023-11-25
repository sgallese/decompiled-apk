package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList<String> arrayList = null;
        zzf zzfVar = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i12 = 0;
        boolean z13 = false;
        boolean z14 = true;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 6:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 7:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 8:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 11:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 12:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 13:
                    arrayList = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 14:
                    z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 15:
                    z14 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 16:
                    zzfVar = (zzf) SafeParcelReader.createParcelable(parcel, readHeader, zzf.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new ConnectionConfiguration(str, str2, i10, i11, z10, z11, str3, z12, str4, str5, i12, arrayList, z13, z14, zzfVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionConfiguration[i10];
    }
}
