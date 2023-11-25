package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@SafeParcelable.Class(creator = "PublicKeyCredentialDescriptorCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    @SafeParcelable.Field(getter = "getTypeAsString", id = 2, type = "java.lang.String")
    private final PublicKeyCredentialType zzb;
    @SafeParcelable.Field(getter = "getId", id = 3)
    private final byte[] zzc;
    @SafeParcelable.Field(getter = "getTransports", id = 4)
    private final List zzd;
    private static final com.google.android.gms.internal.fido.zzau zza = com.google.android.gms.internal.fido.zzau.zzi(com.google.android.gms.internal.fido.zzh.zza, com.google.android.gms.internal.fido.zzh.zzb);
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR = new zzam();

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    /* loaded from: classes.dex */
    public static class UnsupportedPubKeyCredDescriptorException extends Exception {
        public UnsupportedPubKeyCredDescriptorException(String str) {
            super(str);
        }

        public UnsupportedPubKeyCredDescriptorException(String str, Throwable th) {
            super(str, th);
        }
    }

    @SafeParcelable.Constructor
    public PublicKeyCredentialDescriptor(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) List<Transport> list) {
        Preconditions.checkNotNull(str);
        try {
            this.zzb = PublicKeyCredentialType.fromString(str);
            this.zzc = (byte[]) Preconditions.checkNotNull(bArr);
            this.zzd = list;
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.zzb.equals(publicKeyCredentialDescriptor.zzb) || !Arrays.equals(this.zzc, publicKeyCredentialDescriptor.zzc)) {
            return false;
        }
        List list2 = this.zzd;
        if (list2 == null && publicKeyCredentialDescriptor.zzd == null) {
            return true;
        }
        if (list2 == null || (list = publicKeyCredentialDescriptor.zzd) == null || !list2.containsAll(list) || !publicKeyCredentialDescriptor.zzd.containsAll(this.zzd)) {
            return false;
        }
        return true;
    }

    public byte[] getId() {
        return this.zzc;
    }

    public List<Transport> getTransports() {
        return this.zzd;
    }

    public PublicKeyCredentialType getType() {
        return this.zzb;
    }

    public String getTypeAsString() {
        return this.zzb.toString();
    }

    public int hashCode() {
        return Objects.hashCode(this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)), this.zzd);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getTypeAsString(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getId(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, getTransports(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
