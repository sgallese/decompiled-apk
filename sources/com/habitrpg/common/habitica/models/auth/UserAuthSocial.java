package com.habitrpg.common.habitica.models.auth;

/* compiled from: UserAuthSocial.kt */
/* loaded from: classes4.dex */
public final class UserAuthSocial {
    private UserAuthSocialTokens authResponse;
    private String network;

    public final UserAuthSocialTokens getAuthResponse() {
        return this.authResponse;
    }

    public final String getNetwork() {
        return this.network;
    }

    public final void setAuthResponse(UserAuthSocialTokens userAuthSocialTokens) {
        this.authResponse = userAuthSocialTokens;
    }

    public final void setNetwork(String str) {
        this.network = str;
    }
}
