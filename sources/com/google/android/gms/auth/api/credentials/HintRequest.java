package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
@SafeParcelable.Class(creator = "HintRequestCreator")
@Deprecated
/* loaded from: classes.dex */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new zbe();
    @SafeParcelable.Field(id = 1000)
    final int zba;
    @SafeParcelable.Field(getter = "getHintPickerConfig", id = 1)
    private final CredentialPickerConfig zbb;
    @SafeParcelable.Field(getter = "isEmailAddressIdentifierSupported", id = 2)
    private final boolean zbc;
    @SafeParcelable.Field(getter = "isPhoneNumberIdentifierSupported", id = 3)
    private final boolean zbd;
    @SafeParcelable.Field(getter = "getAccountTypes", id = 4)
    private final String[] zbe;
    @SafeParcelable.Field(getter = "isIdTokenRequested", id = 5)
    private final boolean zbf;
    @SafeParcelable.Field(getter = "getServerClientId", id = 6)
    private final String zbg;
    @SafeParcelable.Field(getter = "getIdTokenNonce", id = 7)
    private final String zbh;

    /* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean zba;
        private boolean zbb;
        private String[] zbc;
        private CredentialPickerConfig zbd = new CredentialPickerConfig.Builder().build();
        private boolean zbe = false;
        private String zbf;
        private String zbg;

        public HintRequest build() {
            if (this.zbc == null) {
                this.zbc = new String[0];
            }
            if (!this.zba && !this.zbb && this.zbc.length == 0) {
                throw new IllegalStateException("At least one authentication method must be specified");
            }
            return new HintRequest(2, this.zbd, this.zba, this.zbb, this.zbc, this.zbe, this.zbf, this.zbg);
        }

        public Builder setAccountTypes(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.zbc = strArr;
            return this;
        }

        public Builder setEmailAddressIdentifierSupported(boolean z10) {
            this.zba = z10;
            return this;
        }

        public Builder setHintPickerConfig(CredentialPickerConfig credentialPickerConfig) {
            this.zbd = (CredentialPickerConfig) Preconditions.checkNotNull(credentialPickerConfig);
            return this;
        }

        public Builder setIdTokenNonce(String str) {
            this.zbg = str;
            return this;
        }

        public Builder setIdTokenRequested(boolean z10) {
            this.zbe = z10;
            return this;
        }

        public Builder setPhoneNumberIdentifierSupported(boolean z10) {
            this.zbb = z10;
            return this;
        }

        public Builder setServerClientId(String str) {
            this.zbf = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public HintRequest(@SafeParcelable.Param(id = 1000) int i10, @SafeParcelable.Param(id = 1) CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param(id = 2) boolean z10, @SafeParcelable.Param(id = 3) boolean z11, @SafeParcelable.Param(id = 4) String[] strArr, @SafeParcelable.Param(id = 5) boolean z12, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) String str2) {
        this.zba = i10;
        this.zbb = (CredentialPickerConfig) Preconditions.checkNotNull(credentialPickerConfig);
        this.zbc = z10;
        this.zbd = z11;
        this.zbe = (String[]) Preconditions.checkNotNull(strArr);
        if (i10 < 2) {
            this.zbf = true;
            this.zbg = null;
            this.zbh = null;
            return;
        }
        this.zbf = z12;
        this.zbg = str;
        this.zbh = str2;
    }

    public String[] getAccountTypes() {
        return this.zbe;
    }

    public CredentialPickerConfig getHintPickerConfig() {
        return this.zbb;
    }

    public String getIdTokenNonce() {
        return this.zbh;
    }

    public String getServerClientId() {
        return this.zbg;
    }

    public boolean isEmailAddressIdentifierSupported() {
        return this.zbc;
    }

    public boolean isIdTokenRequested() {
        return this.zbf;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getHintPickerConfig(), i10, false);
        SafeParcelWriter.writeBoolean(parcel, 2, isEmailAddressIdentifierSupported());
        SafeParcelWriter.writeBoolean(parcel, 3, this.zbd);
        SafeParcelWriter.writeStringArray(parcel, 4, getAccountTypes(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, isIdTokenRequested());
        SafeParcelWriter.writeString(parcel, 6, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 7, getIdTokenNonce(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zba);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
