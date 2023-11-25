package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaf implements Parcelable.Creator<DataHolder> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DataHolder createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            if (fieldId != 1000) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader);
                            } else {
                                i10 = SafeParcelReader.readInt(parcel, readHeader);
                            }
                        } else {
                            bundle = SafeParcelReader.createBundle(parcel, readHeader);
                        }
                    } else {
                        i11 = SafeParcelReader.readInt(parcel, readHeader);
                    }
                } else {
                    cursorWindowArr = (CursorWindow[]) SafeParcelReader.createTypedArray(parcel, readHeader, CursorWindow.CREATOR);
                }
            } else {
                strArr = SafeParcelReader.createStringArray(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        DataHolder dataHolder = new DataHolder(i10, strArr, cursorWindowArr, i11, bundle);
        dataHolder.zad();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder[] newArray(int i10) {
        return new DataHolder[i10];
    }
}
