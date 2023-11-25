package com.habitrpg.android.habitica.models.user;

import com.google.android.gms.common.internal.ImagesContract;
import com.habitrpg.android.habitica.BuildConfig;
import com.habitrpg.android.habitica.models.BaseObject;
import com.habitrpg.android.habitica.models.auth.LocalAuthentication;
import com.habitrpg.android.habitica.models.user.auth.SocialAuthentication;
import com.habitrpg.shared.habitica.models.AvatarAuthentication;
import ec.t;
import fa.c;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.x0;
import io.realm.x5;
import java.util.List;
import qc.q;

/* compiled from: Authentication.kt */
/* loaded from: classes4.dex */
public class Authentication extends d1 implements BaseObject, AvatarAuthentication, x5 {
    public static final int $stable = 8;
    @c("apple")
    private SocialAuthentication appleAuthentication;
    private boolean blocked;
    @c("facebook")
    private SocialAuthentication facebookAuthentication;
    @c(BuildConfig.STORE)
    private SocialAuthentication googleAuthentication;
    @c(ImagesContract.LOCAL)
    private LocalAuthentication localAuthentication;
    private AuthenticationTimestamps timestamps;

    public Authentication() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final String findFirstSocialEmail() {
        List<SocialAuthentication> l10;
        boolean z10;
        x0<String> emails;
        l10 = t.l(realmGet$googleAuthentication(), realmGet$appleAuthentication(), realmGet$facebookAuthentication());
        for (SocialAuthentication socialAuthentication : l10) {
            if (socialAuthentication != null && (emails = socialAuthentication.getEmails()) != null && (!emails.isEmpty()) == true) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return socialAuthentication.getEmails().first();
            }
        }
        return null;
    }

    public final SocialAuthentication getAppleAuthentication() {
        return realmGet$appleAuthentication();
    }

    public final boolean getBlocked() {
        return realmGet$blocked();
    }

    public final SocialAuthentication getFacebookAuthentication() {
        return realmGet$facebookAuthentication();
    }

    public final SocialAuthentication getGoogleAuthentication() {
        return realmGet$googleAuthentication();
    }

    public final boolean getHasAppleAuth() {
        x0<String> emails;
        SocialAuthentication realmGet$appleAuthentication = realmGet$appleAuthentication();
        boolean z10 = false;
        if (realmGet$appleAuthentication != null && (emails = realmGet$appleAuthentication.getEmails()) != null && emails.isEmpty()) {
            z10 = true;
        }
        return !z10;
    }

    public final boolean getHasFacebookAuth() {
        x0<String> emails;
        SocialAuthentication realmGet$facebookAuthentication = realmGet$facebookAuthentication();
        boolean z10 = false;
        if (realmGet$facebookAuthentication != null && (emails = realmGet$facebookAuthentication.getEmails()) != null && emails.isEmpty()) {
            z10 = true;
        }
        return !z10;
    }

    public final boolean getHasGoogleAuth() {
        x0<String> emails;
        SocialAuthentication realmGet$googleAuthentication = realmGet$googleAuthentication();
        boolean z10 = false;
        if (realmGet$googleAuthentication != null && (emails = realmGet$googleAuthentication.getEmails()) != null && emails.isEmpty()) {
            z10 = true;
        }
        return !z10;
    }

    public final boolean getHasPassword() {
        LocalAuthentication localAuthentication = getLocalAuthentication();
        if (localAuthentication != null) {
            return q.d(localAuthentication.getHasPassword(), Boolean.TRUE);
        }
        return false;
    }

    public final AuthenticationTimestamps getTimestamps() {
        return realmGet$timestamps();
    }

    @Override // io.realm.x5
    public SocialAuthentication realmGet$appleAuthentication() {
        return this.appleAuthentication;
    }

    @Override // io.realm.x5
    public boolean realmGet$blocked() {
        return this.blocked;
    }

    @Override // io.realm.x5
    public SocialAuthentication realmGet$facebookAuthentication() {
        return this.facebookAuthentication;
    }

    @Override // io.realm.x5
    public SocialAuthentication realmGet$googleAuthentication() {
        return this.googleAuthentication;
    }

    @Override // io.realm.x5
    public LocalAuthentication realmGet$localAuthentication() {
        return this.localAuthentication;
    }

    @Override // io.realm.x5
    public AuthenticationTimestamps realmGet$timestamps() {
        return this.timestamps;
    }

    @Override // io.realm.x5
    public void realmSet$appleAuthentication(SocialAuthentication socialAuthentication) {
        this.appleAuthentication = socialAuthentication;
    }

    @Override // io.realm.x5
    public void realmSet$blocked(boolean z10) {
        this.blocked = z10;
    }

    @Override // io.realm.x5
    public void realmSet$facebookAuthentication(SocialAuthentication socialAuthentication) {
        this.facebookAuthentication = socialAuthentication;
    }

    @Override // io.realm.x5
    public void realmSet$googleAuthentication(SocialAuthentication socialAuthentication) {
        this.googleAuthentication = socialAuthentication;
    }

    @Override // io.realm.x5
    public void realmSet$localAuthentication(LocalAuthentication localAuthentication) {
        this.localAuthentication = localAuthentication;
    }

    @Override // io.realm.x5
    public void realmSet$timestamps(AuthenticationTimestamps authenticationTimestamps) {
        this.timestamps = authenticationTimestamps;
    }

    public final void setAppleAuthentication(SocialAuthentication socialAuthentication) {
        realmSet$appleAuthentication(socialAuthentication);
    }

    public final void setBlocked(boolean z10) {
        realmSet$blocked(z10);
    }

    public final void setFacebookAuthentication(SocialAuthentication socialAuthentication) {
        realmSet$facebookAuthentication(socialAuthentication);
    }

    public final void setGoogleAuthentication(SocialAuthentication socialAuthentication) {
        realmSet$googleAuthentication(socialAuthentication);
    }

    public void setLocalAuthentication(LocalAuthentication localAuthentication) {
        realmSet$localAuthentication(localAuthentication);
    }

    public final void setTimestamps(AuthenticationTimestamps authenticationTimestamps) {
        realmSet$timestamps(authenticationTimestamps);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarAuthentication
    public LocalAuthentication getLocalAuthentication() {
        return realmGet$localAuthentication();
    }
}
