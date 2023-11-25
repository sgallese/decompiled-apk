package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
@SafeParcelable.Class(creator = "AuthorizationRequestCreator")
/* loaded from: classes.dex */
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new zbd();
    @SafeParcelable.Field(getter = "getRequestedScopes", id = 1)
    private final List zba;
    @SafeParcelable.Field(getter = "getServerClientId", id = 2)
    private final String zbb;
    @SafeParcelable.Field(getter = "isOfflineAccessRequested", id = 3)
    private final boolean zbc;
    @SafeParcelable.Field(getter = "isIdTokenRequested", id = 4)
    private final boolean zbd;
    @SafeParcelable.Field(getter = "getAccount", id = 5)
    private final Account zbe;
    @SafeParcelable.Field(getter = "getHostedDomain", id = 6)
    private final String zbf;
    @SafeParcelable.Field(getter = "getSessionId", id = 7)
    private final String zbg;
    @SafeParcelable.Field(getter = "isForceCodeForRefreshToken", id = 8)
    private final boolean zbh;

    /* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private List zba;
        private String zbb;
        private boolean zbc;
        private boolean zbd;
        private Account zbe;
        private String zbf;
        private String zbg;
        private boolean zbh;

        private final String zbc(String str) {
            Preconditions.checkNotNull(str);
            String str2 = this.zbb;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            Preconditions.checkArgument(z10, "two different server client ids provided");
            return str;
        }

        public AuthorizationRequest build() {
            return new AuthorizationRequest(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, this.zbh);
        }

        public Builder filterByHostedDomain(String str) {
            this.zbf = Preconditions.checkNotEmpty(str);
            return this;
        }

        public Builder requestOfflineAccess(String str) {
            requestOfflineAccess(str, false);
            return this;
        }

        public Builder setAccount(Account account) {
            this.zbe = (Account) Preconditions.checkNotNull(account);
            return this;
        }

        public Builder setRequestedScopes(List<Scope> list) {
            boolean z10 = false;
            if (list != null && !list.isEmpty()) {
                z10 = true;
            }
            Preconditions.checkArgument(z10, "requestedScopes cannot be null or empty");
            this.zba = list;
            return this;
        }

        @ShowFirstParty
        public final Builder zba(String str) {
            zbc(str);
            this.zbb = str;
            this.zbd = true;
            return this;
        }

        public final Builder zbb(String str) {
            this.zbg = str;
            return this;
        }

        public Builder requestOfflineAccess(String str, boolean z10) {
            zbc(str);
            this.zbb = str;
            this.zbc = true;
            this.zbh = z10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public AuthorizationRequest(@SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) boolean z10, @SafeParcelable.Param(id = 4) boolean z11, @SafeParcelable.Param(id = 5) Account account, @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) boolean z12) {
        boolean z13 = false;
        if (list != null && !list.isEmpty()) {
            z13 = true;
        }
        Preconditions.checkArgument(z13, "requestedScopes cannot be null or empty");
        this.zba = list;
        this.zbb = str;
        this.zbc = z10;
        this.zbd = z11;
        this.zbe = account;
        this.zbf = str2;
        this.zbg = str3;
        this.zbh = z12;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder zba(AuthorizationRequest authorizationRequest) {
        Preconditions.checkNotNull(authorizationRequest);
        Builder builder = builder();
        builder.setRequestedScopes(authorizationRequest.getRequestedScopes());
        boolean isForceCodeForRefreshToken = authorizationRequest.isForceCodeForRefreshToken();
        String str = authorizationRequest.zbg;
        String hostedDomain = authorizationRequest.getHostedDomain();
        Account account = authorizationRequest.getAccount();
        String serverClientId = authorizationRequest.getServerClientId();
        if (str != null) {
            builder.zbb(str);
        }
        if (hostedDomain != null) {
            builder.filterByHostedDomain(hostedDomain);
        }
        if (account != null) {
            builder.setAccount(account);
        }
        if (authorizationRequest.zbd && serverClientId != null) {
            builder.zba(serverClientId);
        }
        if (authorizationRequest.isOfflineAccessRequested() && serverClientId != null) {
            builder.requestOfflineAccess(serverClientId, isForceCodeForRefreshToken);
        }
        return builder;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        if (this.zba.size() != authorizationRequest.zba.size() || !this.zba.containsAll(authorizationRequest.zba) || this.zbc != authorizationRequest.zbc || this.zbh != authorizationRequest.zbh || this.zbd != authorizationRequest.zbd || !Objects.equal(this.zbb, authorizationRequest.zbb) || !Objects.equal(this.zbe, authorizationRequest.zbe) || !Objects.equal(this.zbf, authorizationRequest.zbf) || !Objects.equal(this.zbg, authorizationRequest.zbg)) {
            return false;
        }
        return true;
    }

    public Account getAccount() {
        return this.zbe;
    }

    public String getHostedDomain() {
        return this.zbf;
    }

    public List<Scope> getRequestedScopes() {
        return this.zba;
    }

    public String getServerClientId() {
        return this.zbb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb, Boolean.valueOf(this.zbc), Boolean.valueOf(this.zbh), Boolean.valueOf(this.zbd), this.zbe, this.zbf, this.zbg);
    }

    public boolean isForceCodeForRefreshToken() {
        return this.zbh;
    }

    public boolean isOfflineAccessRequested() {
        return this.zbc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getRequestedScopes(), false);
        SafeParcelWriter.writeString(parcel, 2, getServerClientId(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, isOfflineAccessRequested());
        SafeParcelWriter.writeBoolean(parcel, 4, this.zbd);
        SafeParcelWriter.writeParcelable(parcel, 5, getAccount(), i10, false);
        SafeParcelWriter.writeString(parcel, 6, getHostedDomain(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zbg, false);
        SafeParcelWriter.writeBoolean(parcel, 8, isForceCodeForRefreshToken());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
