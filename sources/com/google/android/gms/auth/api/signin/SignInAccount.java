package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
@SafeParcelable.Class(creator = "SignInAccountCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new zbc();
    @SafeParcelable.Field(defaultValue = "", id = 4)
    @Deprecated
    final String zba;
    @SafeParcelable.Field(defaultValue = "", id = 8)
    @Deprecated
    final String zbb;
    @SafeParcelable.Field(getter = "getGoogleSignInAccount", id = 7)
    private final GoogleSignInAccount zbc;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public SignInAccount(@SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 7) GoogleSignInAccount googleSignInAccount, @SafeParcelable.Param(id = 8) String str2) {
        this.zbc = googleSignInAccount;
        this.zba = Preconditions.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.zbb = Preconditions.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 4, this.zba, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zbc, i10, false);
        SafeParcelWriter.writeString(parcel, 8, this.zbb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final GoogleSignInAccount zba() {
        return this.zbc;
    }
}
