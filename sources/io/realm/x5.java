package io.realm;

import com.habitrpg.android.habitica.models.auth.LocalAuthentication;
import com.habitrpg.android.habitica.models.user.AuthenticationTimestamps;
import com.habitrpg.android.habitica.models.user.auth.SocialAuthentication;

/* compiled from: com_habitrpg_android_habitica_models_user_AuthenticationRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface x5 {
    SocialAuthentication realmGet$appleAuthentication();

    boolean realmGet$blocked();

    SocialAuthentication realmGet$facebookAuthentication();

    SocialAuthentication realmGet$googleAuthentication();

    LocalAuthentication realmGet$localAuthentication();

    AuthenticationTimestamps realmGet$timestamps();

    void realmSet$appleAuthentication(SocialAuthentication socialAuthentication);

    void realmSet$blocked(boolean z10);

    void realmSet$facebookAuthentication(SocialAuthentication socialAuthentication);

    void realmSet$googleAuthentication(SocialAuthentication socialAuthentication);

    void realmSet$localAuthentication(LocalAuthentication localAuthentication);

    void realmSet$timestamps(AuthenticationTimestamps authenticationTimestamps);
}
