package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@SafeParcelable.Class(creator = "AuthenticatorSelectionCriteriaCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new zzm();
    @SafeParcelable.Field(getter = "getAttachmentAsString", id = 2, type = "java.lang.String")
    private final Attachment zza;
    @SafeParcelable.Field(getter = "getRequireResidentKey", id = 3)
    private final Boolean zzb;
    @SafeParcelable.Field(getter = "getRequireUserVerificationAsString", id = 4, type = "java.lang.String")
    private final zzay zzc;
    @SafeParcelable.Field(getter = "getResidentKeyRequirementAsString", id = 5, type = "java.lang.String")
    private final ResidentKeyRequirement zzd;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    /* loaded from: classes.dex */
    public static class Builder {
        private Attachment zza;
        private Boolean zzb;
        private ResidentKeyRequirement zzc;

        public AuthenticatorSelectionCriteria build() {
            String attachment;
            String residentKeyRequirement;
            Attachment attachment2 = this.zza;
            if (attachment2 == null) {
                attachment = null;
            } else {
                attachment = attachment2.toString();
            }
            Boolean bool = this.zzb;
            ResidentKeyRequirement residentKeyRequirement2 = this.zzc;
            if (residentKeyRequirement2 == null) {
                residentKeyRequirement = null;
            } else {
                residentKeyRequirement = residentKeyRequirement2.toString();
            }
            return new AuthenticatorSelectionCriteria(attachment, bool, null, residentKeyRequirement);
        }

        public Builder setAttachment(Attachment attachment) {
            this.zza = attachment;
            return this;
        }

        public Builder setRequireResidentKey(Boolean bool) {
            this.zzb = bool;
            return this;
        }

        public Builder setResidentKeyRequirement(ResidentKeyRequirement residentKeyRequirement) {
            this.zzc = residentKeyRequirement;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public AuthenticatorSelectionCriteria(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) Boolean bool, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3) {
        Attachment fromString;
        zzay zza;
        ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            fromString = null;
        } else {
            try {
                fromString = Attachment.fromString(str);
            } catch (Attachment.UnsupportedAttachmentException | ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | zzax e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.zza = fromString;
        this.zzb = bool;
        if (str2 == null) {
            zza = null;
        } else {
            zza = zzay.zza(str2);
        }
        this.zzc = zza;
        if (str3 != null) {
            residentKeyRequirement = ResidentKeyRequirement.fromString(str3);
        }
        this.zzd = residentKeyRequirement;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        if (!Objects.equal(this.zza, authenticatorSelectionCriteria.zza) || !Objects.equal(this.zzb, authenticatorSelectionCriteria.zzb) || !Objects.equal(this.zzc, authenticatorSelectionCriteria.zzc) || !Objects.equal(this.zzd, authenticatorSelectionCriteria.zzd)) {
            return false;
        }
        return true;
    }

    public Attachment getAttachment() {
        return this.zza;
    }

    public String getAttachmentAsString() {
        Attachment attachment = this.zza;
        if (attachment == null) {
            return null;
        }
        return attachment.toString();
    }

    public Boolean getRequireResidentKey() {
        return this.zzb;
    }

    public ResidentKeyRequirement getResidentKeyRequirement() {
        return this.zzd;
    }

    public String getResidentKeyRequirementAsString() {
        ResidentKeyRequirement residentKeyRequirement = this.zzd;
        if (residentKeyRequirement == null) {
            return null;
        }
        return residentKeyRequirement.toString();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        String zzayVar;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getAttachmentAsString(), false);
        SafeParcelWriter.writeBooleanObject(parcel, 3, getRequireResidentKey(), false);
        zzay zzayVar2 = this.zzc;
        if (zzayVar2 == null) {
            zzayVar = null;
        } else {
            zzayVar = zzayVar2.toString();
        }
        SafeParcelWriter.writeString(parcel, 4, zzayVar, false);
        SafeParcelWriter.writeString(parcel, 5, getResidentKeyRequirementAsString(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
