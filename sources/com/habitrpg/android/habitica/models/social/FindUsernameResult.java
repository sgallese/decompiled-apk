package com.habitrpg.android.habitica.models.social;

import com.habitrpg.android.habitica.models.auth.LocalAuthentication;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.models.user.Profile;
import fa.c;

/* compiled from: FindUsernameResult.kt */
/* loaded from: classes4.dex */
public final class FindUsernameResult {
    public static final int $stable = 8;
    private Authentication authentication;
    private ContributorInfo contributor;
    @c("_id")

    /* renamed from: id  reason: collision with root package name */
    private String f12519id;
    private Profile profile;

    public final Authentication getAuthentication() {
        return this.authentication;
    }

    public final ContributorInfo getContributor() {
        return this.contributor;
    }

    public final String getFormattedUsername() {
        if (getUsername() != null) {
            return "@" + getUsername();
        }
        return null;
    }

    public final String getId() {
        return this.f12519id;
    }

    public final Profile getProfile() {
        return this.profile;
    }

    public final String getUsername() {
        LocalAuthentication localAuthentication;
        Authentication authentication = this.authentication;
        if (authentication != null && (localAuthentication = authentication.getLocalAuthentication()) != null) {
            return localAuthentication.getUsername();
        }
        return null;
    }

    public final void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public final void setContributor(ContributorInfo contributorInfo) {
        this.contributor = contributorInfo;
    }

    public final void setId(String str) {
        this.f12519id = str;
    }

    public final void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String toString() {
        String str;
        LocalAuthentication localAuthentication;
        Authentication authentication = this.authentication;
        if (authentication == null || (localAuthentication = authentication.getLocalAuthentication()) == null || (str = localAuthentication.getUsername()) == null) {
            str = "";
        }
        return "@" + str;
    }
}
