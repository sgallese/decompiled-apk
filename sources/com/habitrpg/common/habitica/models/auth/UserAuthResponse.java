package com.habitrpg.common.habitica.models.auth;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import qc.q;

/* compiled from: UserAuthResponse.kt */
/* loaded from: classes4.dex */
public final class UserAuthResponse {
    private String apiToken = "";

    /* renamed from: id  reason: collision with root package name */
    private String f12936id = "";
    private boolean newUser;

    public final String getApiToken() {
        return this.apiToken;
    }

    public final String getId() {
        return this.f12936id;
    }

    public final boolean getNewUser() {
        return this.newUser;
    }

    public final String getToken() {
        return this.apiToken;
    }

    public final void setApiToken(String str) {
        q.i(str, "<set-?>");
        this.apiToken = str;
    }

    public final void setId(String str) {
        q.i(str, "<set-?>");
        this.f12936id = str;
    }

    public final void setNewUser(boolean z10) {
        this.newUser = z10;
    }

    public final void setToken(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.apiToken = str;
    }
}
