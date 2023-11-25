package io.realm;

import java.util.Date;

/* compiled from: com_habitrpg_android_habitica_models_user_AuthenticationTimestampsRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface z5 {
    Date realmGet$createdAt();

    Date realmGet$lastLoggedIn();

    void realmSet$createdAt(Date date);

    void realmSet$lastLoggedIn(Date date);
}
