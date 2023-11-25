package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@SafeParcelable.Class(creator = "AuthenticationExtensionsClientOutputsCreator")
/* loaded from: classes.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new zzc();
    @SafeParcelable.Field(getter = "getUvmEntries", id = 1)
    private final UvmEntries zza;
    @SafeParcelable.Field(getter = "getDevicePubKey", id = 2)
    private final zzf zzb;
    @SafeParcelable.Field(getter = "getCredProps", id = 3)
    private final AuthenticationExtensionsCredPropsOutputs zzc;
    @SafeParcelable.Field(getter = "getPrf", id = 4)
    private final zzh zzd;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private UvmEntries zza;
        private AuthenticationExtensionsCredPropsOutputs zzb;

        public AuthenticationExtensionsClientOutputs build() {
            return new AuthenticationExtensionsClientOutputs(this.zza, null, this.zzb, null);
        }

        public Builder setCredProps(AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs) {
            this.zzb = authenticationExtensionsCredPropsOutputs;
            return this;
        }

        public Builder setUserVerificationMethodEntries(UvmEntries uvmEntries) {
            this.zza = uvmEntries;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public AuthenticationExtensionsClientOutputs(@SafeParcelable.Param(id = 1) UvmEntries uvmEntries, @SafeParcelable.Param(id = 2) zzf zzfVar, @SafeParcelable.Param(id = 3) AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, @SafeParcelable.Param(id = 4) zzh zzhVar) {
        this.zza = uvmEntries;
        this.zzb = zzfVar;
        this.zzc = authenticationExtensionsCredPropsOutputs;
        this.zzd = zzhVar;
    }

    public static AuthenticationExtensionsClientOutputs deserializeFromBytes(byte[] bArr) {
        return (AuthenticationExtensionsClientOutputs) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        if (!Objects.equal(this.zza, authenticationExtensionsClientOutputs.zza) || !Objects.equal(this.zzb, authenticationExtensionsClientOutputs.zzb) || !Objects.equal(this.zzc, authenticationExtensionsClientOutputs.zzc) || !Objects.equal(this.zzd, authenticationExtensionsClientOutputs.zzd)) {
            return false;
        }
        return true;
    }

    public AuthenticationExtensionsCredPropsOutputs getCredProps() {
        return this.zzc;
    }

    public UvmEntries getUvmEntries() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getUvmEntries(), i10, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getCredProps(), i10, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
