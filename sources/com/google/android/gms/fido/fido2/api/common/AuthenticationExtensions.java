package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@SafeParcelable.Class(creator = "AuthenticationExtensionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new zzd();
    @SafeParcelable.Field(getter = "getFidoAppIdExtension", id = 2)
    private final FidoAppIdExtension zza;
    @SafeParcelable.Field(getter = "getCableAuthenticationExtension", id = 3)
    private final zzs zzb;
    @SafeParcelable.Field(getter = "getUserVerificationMethodExtension", id = 4)
    private final UserVerificationMethodExtension zzc;
    @SafeParcelable.Field(getter = "getGoogleMultiAssertionExtension", id = 5)
    private final zzz zzd;
    @SafeParcelable.Field(getter = "getGoogleSessionIdExtension", id = 6)
    private final zzab zze;
    @SafeParcelable.Field(getter = "getGoogleSilentVerificationExtension", id = 7)
    private final zzad zzf;
    @SafeParcelable.Field(getter = "getDevicePublicKeyExtension", id = 8)
    private final zzu zzg;
    @SafeParcelable.Field(getter = "getGoogleTunnelServerIdExtension", id = 9)
    private final zzag zzh;
    @SafeParcelable.Field(getter = "getGoogleThirdPartyPaymentExtension", id = 10)
    private final GoogleThirdPartyPaymentExtension zzi;
    @SafeParcelable.Field(getter = "getPrfExtension", id = 11)
    private final zzai zzj;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private FidoAppIdExtension zza;
        private UserVerificationMethodExtension zzb;
        private zzs zzc;
        private zzz zzd;
        private zzab zze;
        private zzad zzf;
        private zzu zzg;
        private zzag zzh;
        private GoogleThirdPartyPaymentExtension zzi;
        private zzai zzj;

        public Builder() {
        }

        public AuthenticationExtensions build() {
            return new AuthenticationExtensions(this.zza, this.zzc, this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj);
        }

        public Builder setFido2Extension(FidoAppIdExtension fidoAppIdExtension) {
            this.zza = fidoAppIdExtension;
            return this;
        }

        public Builder setGoogleThirdPartyPaymentExtension(GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
            this.zzi = googleThirdPartyPaymentExtension;
            return this;
        }

        public Builder setUserVerificationMethodExtension(UserVerificationMethodExtension userVerificationMethodExtension) {
            this.zzb = userVerificationMethodExtension;
            return this;
        }

        public Builder(AuthenticationExtensions authenticationExtensions) {
            if (authenticationExtensions != null) {
                this.zza = authenticationExtensions.getFidoAppIdExtension();
                this.zzb = authenticationExtensions.getUserVerificationMethodExtension();
                this.zzc = authenticationExtensions.zza();
                this.zzd = authenticationExtensions.zzc();
                this.zze = authenticationExtensions.zzd();
                this.zzf = authenticationExtensions.zze();
                this.zzg = authenticationExtensions.zzb();
                this.zzh = authenticationExtensions.zzg();
                this.zzi = authenticationExtensions.zzf();
                this.zzj = authenticationExtensions.zzh();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public AuthenticationExtensions(@SafeParcelable.Param(id = 2) FidoAppIdExtension fidoAppIdExtension, @SafeParcelable.Param(id = 3) zzs zzsVar, @SafeParcelable.Param(id = 4) UserVerificationMethodExtension userVerificationMethodExtension, @SafeParcelable.Param(id = 5) zzz zzzVar, @SafeParcelable.Param(id = 6) zzab zzabVar, @SafeParcelable.Param(id = 7) zzad zzadVar, @SafeParcelable.Param(id = 8) zzu zzuVar, @SafeParcelable.Param(id = 9) zzag zzagVar, @SafeParcelable.Param(id = 10) GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, @SafeParcelable.Param(id = 11) zzai zzaiVar) {
        this.zza = fidoAppIdExtension;
        this.zzc = userVerificationMethodExtension;
        this.zzb = zzsVar;
        this.zzd = zzzVar;
        this.zze = zzabVar;
        this.zzf = zzadVar;
        this.zzg = zzuVar;
        this.zzh = zzagVar;
        this.zzi = googleThirdPartyPaymentExtension;
        this.zzj = zzaiVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        if (!Objects.equal(this.zza, authenticationExtensions.zza) || !Objects.equal(this.zzb, authenticationExtensions.zzb) || !Objects.equal(this.zzc, authenticationExtensions.zzc) || !Objects.equal(this.zzd, authenticationExtensions.zzd) || !Objects.equal(this.zze, authenticationExtensions.zze) || !Objects.equal(this.zzf, authenticationExtensions.zzf) || !Objects.equal(this.zzg, authenticationExtensions.zzg) || !Objects.equal(this.zzh, authenticationExtensions.zzh) || !Objects.equal(this.zzi, authenticationExtensions.zzi) || !Objects.equal(this.zzj, authenticationExtensions.zzj)) {
            return false;
        }
        return true;
    }

    public FidoAppIdExtension getFidoAppIdExtension() {
        return this.zza;
    }

    public UserVerificationMethodExtension getUserVerificationMethodExtension() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getFidoAppIdExtension(), i10, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getUserVerificationMethodExtension(), i10, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zze, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzj, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzs zza() {
        return this.zzb;
    }

    public final zzu zzb() {
        return this.zzg;
    }

    public final zzz zzc() {
        return this.zzd;
    }

    public final zzab zzd() {
        return this.zze;
    }

    public final zzad zze() {
        return this.zzf;
    }

    public final GoogleThirdPartyPaymentExtension zzf() {
        return this.zzi;
    }

    public final zzag zzg() {
        return this.zzh;
    }

    public final zzai zzh() {
        return this.zzj;
    }
}