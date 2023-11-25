package io.realm;

import com.habitrpg.android.habitica.models.social.ChatMessageLike;
import com.habitrpg.android.habitica.models.social.UserStyles;
import com.habitrpg.android.habitica.models.user.Backer;
import com.habitrpg.android.habitica.models.user.ContributorInfo;

/* compiled from: com_habitrpg_android_habitica_models_social_ChatMessageRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface v4 {
    Backer realmGet$backer();

    ContributorInfo realmGet$contributor();

    int realmGet$flagCount();

    String realmGet$groupId();

    String realmGet$id();

    boolean realmGet$isInboxMessage();

    boolean realmGet$isSeen();

    int realmGet$likeCount();

    x0<ChatMessageLike> realmGet$likes();

    boolean realmGet$sent();

    String realmGet$text();

    Long realmGet$timestamp();

    String realmGet$user();

    String realmGet$userID();

    UserStyles realmGet$userStyles();

    String realmGet$username();

    String realmGet$uuid();

    void realmSet$backer(Backer backer);

    void realmSet$contributor(ContributorInfo contributorInfo);

    void realmSet$flagCount(int i10);

    void realmSet$groupId(String str);

    void realmSet$id(String str);

    void realmSet$isInboxMessage(boolean z10);

    void realmSet$isSeen(boolean z10);

    void realmSet$likeCount(int i10);

    void realmSet$likes(x0<ChatMessageLike> x0Var);

    void realmSet$sent(boolean z10);

    void realmSet$text(String str);

    void realmSet$timestamp(Long l10);

    void realmSet$user(String str);

    void realmSet$userID(String str);

    void realmSet$userStyles(UserStyles userStyles);

    void realmSet$username(String str);

    void realmSet$uuid(String str);
}
