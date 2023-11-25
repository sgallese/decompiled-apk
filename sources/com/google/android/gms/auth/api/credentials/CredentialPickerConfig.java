package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
@SafeParcelable.Class(creator = "CredentialPickerConfigCreator")
@Deprecated
/* loaded from: classes.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new zbb();
    @SafeParcelable.Field(id = 1000)
    final int zba;
    @SafeParcelable.Field(getter = "shouldShowAddAccountButton", id = 1)
    private final boolean zbb;
    @SafeParcelable.Field(getter = "shouldShowCancelButton", id = 2)
    private final boolean zbc;
    @SafeParcelable.Field(getter = "getPromptInternalId", id = 4)
    private final int zbd;

    /* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
    /* loaded from: classes.dex */
    public static class Builder {
        private boolean zba = false;
        private boolean zbb = true;
        private int zbc = 1;

        public CredentialPickerConfig build() {
            return new CredentialPickerConfig(2, this.zba, this.zbb, false, this.zbc);
        }

        @Deprecated
        public Builder setForNewAccount(boolean z10) {
            int i10 = 1;
            if (true == z10) {
                i10 = 3;
            }
            this.zbc = i10;
            return this;
        }

        public Builder setPrompt(int i10) {
            this.zbc = i10;
            return this;
        }

        public Builder setShowAddAccountButton(boolean z10) {
            this.zba = z10;
            return this;
        }

        public Builder setShowCancelButton(boolean z10) {
            this.zbb = z10;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Prompt {
        public static final int CONTINUE = 1;
        public static final int SIGN_IN = 2;
        public static final int SIGN_UP = 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public CredentialPickerConfig(@SafeParcelable.Param(id = 1000) int i10, @SafeParcelable.Param(id = 1) boolean z10, @SafeParcelable.Param(id = 2) boolean z11, @SafeParcelable.Param(id = 3) boolean z12, @SafeParcelable.Param(id = 4) int i11) {
        this.zba = i10;
        this.zbb = z10;
        this.zbc = z11;
        if (i10 < 2) {
            this.zbd = true == z12 ? 3 : 1;
        } else {
            this.zbd = i11;
        }
    }

    @Deprecated
    public boolean isForNewAccount() {
        if (this.zbd == 3) {
            return true;
        }
        return false;
    }

    public boolean shouldShowAddAccountButton() {
        return this.zbb;
    }

    public boolean shouldShowCancelButton() {
        return this.zbc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, shouldShowAddAccountButton());
        SafeParcelWriter.writeBoolean(parcel, 2, shouldShowCancelButton());
        SafeParcelWriter.writeBoolean(parcel, 3, isForNewAccount());
        SafeParcelWriter.writeInt(parcel, 4, this.zbd);
        SafeParcelWriter.writeInt(parcel, 1000, this.zba);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
