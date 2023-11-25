package io.realm;

import java.util.Date;

/* compiled from: com_habitrpg_android_habitica_models_TutorialStepRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface b2 {
    Date realmGet$displayedOn();

    String realmGet$identifier();

    String realmGet$key();

    String realmGet$tutorialGroup();

    boolean realmGet$wasCompleted();

    void realmSet$displayedOn(Date date);

    void realmSet$identifier(String str);

    void realmSet$key(String str);

    void realmSet$tutorialGroup(String str);

    void realmSet$wasCompleted(boolean z10);
}
