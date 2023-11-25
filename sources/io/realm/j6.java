package io.realm;

import com.habitrpg.android.habitica.models.TutorialStep;

/* compiled from: com_habitrpg_android_habitica_models_user_FlagsRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface j6 {
    boolean realmGet$armoireEmpty();

    boolean realmGet$armoireEnabled();

    boolean realmGet$armoireOpened();

    boolean realmGet$classSelected();

    boolean realmGet$communityGuidelinesAccepted();

    boolean realmGet$dropsEnabled();

    boolean realmGet$isWarnedLowHealth();

    boolean realmGet$itemsEnabled();

    String realmGet$lastNewStuffRead();

    boolean realmGet$newStuff();

    boolean realmGet$rebirthEnabled();

    boolean realmGet$showTour();

    x0<TutorialStep> realmGet$tutorial();

    boolean realmGet$verifiedUsername();

    boolean realmGet$welcomed();

    void realmSet$armoireEmpty(boolean z10);

    void realmSet$armoireEnabled(boolean z10);

    void realmSet$armoireOpened(boolean z10);

    void realmSet$classSelected(boolean z10);

    void realmSet$communityGuidelinesAccepted(boolean z10);

    void realmSet$dropsEnabled(boolean z10);

    void realmSet$isWarnedLowHealth(boolean z10);

    void realmSet$itemsEnabled(boolean z10);

    void realmSet$lastNewStuffRead(String str);

    void realmSet$newStuff(boolean z10);

    void realmSet$rebirthEnabled(boolean z10);

    void realmSet$showTour(boolean z10);

    void realmSet$tutorial(x0<TutorialStep> x0Var);

    void realmSet$verifiedUsername(boolean z10);

    void realmSet$welcomed(boolean z10);
}
