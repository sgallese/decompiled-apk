package io.realm;

import com.habitrpg.android.habitica.models.social.UserStyles;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import java.util.Date;

/* compiled from: com_habitrpg_android_habitica_models_social_InboxConversationRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface d5 {
    String realmGet$combinedID();

    ContributorInfo realmGet$contributor();

    String realmGet$text();

    Date realmGet$timestamp();

    String realmGet$user();

    String realmGet$userID();

    UserStyles realmGet$userStyles();

    String realmGet$username();

    String realmGet$uuid();

    void realmSet$combinedID(String str);

    void realmSet$contributor(ContributorInfo contributorInfo);

    void realmSet$text(String str);

    void realmSet$timestamp(Date date);

    void realmSet$user(String str);

    void realmSet$userID(String str);

    void realmSet$userStyles(UserStyles userStyles);

    void realmSet$username(String str);

    void realmSet$uuid(String str);
}
