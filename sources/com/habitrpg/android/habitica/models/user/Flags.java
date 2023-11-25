package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import com.habitrpg.android.habitica.models.TutorialStep;
import com.habitrpg.shared.habitica.models.AvatarFlags;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.j6;
import io.realm.x0;

/* compiled from: Flags.kt */
/* loaded from: classes4.dex */
public class Flags extends d1 implements BaseObject, AvatarFlags, j6 {
    public static final int $stable = 8;
    private boolean armoireEmpty;
    private boolean armoireEnabled;
    private boolean armoireOpened;
    private boolean classSelected;
    private boolean communityGuidelinesAccepted;
    private boolean dropsEnabled;
    private boolean isWarnedLowHealth;
    private boolean itemsEnabled;
    private String lastNewStuffRead;
    private boolean newStuff;
    private boolean rebirthEnabled;
    private boolean showTour;
    private x0<TutorialStep> tutorial;
    private boolean verifiedUsername;
    private boolean welcomed;

    public Flags() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final boolean getArmoireEmpty() {
        return realmGet$armoireEmpty();
    }

    public final boolean getArmoireEnabled() {
        return realmGet$armoireEnabled();
    }

    public final boolean getArmoireOpened() {
        return realmGet$armoireOpened();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarFlags
    public boolean getClassSelected() {
        return realmGet$classSelected();
    }

    public final boolean getCommunityGuidelinesAccepted() {
        return realmGet$communityGuidelinesAccepted();
    }

    public final boolean getDropsEnabled() {
        return realmGet$dropsEnabled();
    }

    public final boolean getItemsEnabled() {
        return realmGet$itemsEnabled();
    }

    public final String getLastNewStuffRead() {
        return realmGet$lastNewStuffRead();
    }

    public final boolean getNewStuff() {
        return realmGet$newStuff();
    }

    public final boolean getRebirthEnabled() {
        return realmGet$rebirthEnabled();
    }

    public final boolean getShowTour() {
        return realmGet$showTour();
    }

    public final x0<TutorialStep> getTutorial() {
        return realmGet$tutorial();
    }

    public final boolean getVerifiedUsername() {
        return realmGet$verifiedUsername();
    }

    public final boolean getWelcomed() {
        return realmGet$welcomed();
    }

    public final boolean isWarnedLowHealth() {
        return realmGet$isWarnedLowHealth();
    }

    @Override // io.realm.j6
    public boolean realmGet$armoireEmpty() {
        return this.armoireEmpty;
    }

    @Override // io.realm.j6
    public boolean realmGet$armoireEnabled() {
        return this.armoireEnabled;
    }

    @Override // io.realm.j6
    public boolean realmGet$armoireOpened() {
        return this.armoireOpened;
    }

    @Override // io.realm.j6
    public boolean realmGet$classSelected() {
        return this.classSelected;
    }

    @Override // io.realm.j6
    public boolean realmGet$communityGuidelinesAccepted() {
        return this.communityGuidelinesAccepted;
    }

    @Override // io.realm.j6
    public boolean realmGet$dropsEnabled() {
        return this.dropsEnabled;
    }

    @Override // io.realm.j6
    public boolean realmGet$isWarnedLowHealth() {
        return this.isWarnedLowHealth;
    }

    @Override // io.realm.j6
    public boolean realmGet$itemsEnabled() {
        return this.itemsEnabled;
    }

    @Override // io.realm.j6
    public String realmGet$lastNewStuffRead() {
        return this.lastNewStuffRead;
    }

    @Override // io.realm.j6
    public boolean realmGet$newStuff() {
        return this.newStuff;
    }

    @Override // io.realm.j6
    public boolean realmGet$rebirthEnabled() {
        return this.rebirthEnabled;
    }

    @Override // io.realm.j6
    public boolean realmGet$showTour() {
        return this.showTour;
    }

    @Override // io.realm.j6
    public x0 realmGet$tutorial() {
        return this.tutorial;
    }

    @Override // io.realm.j6
    public boolean realmGet$verifiedUsername() {
        return this.verifiedUsername;
    }

    @Override // io.realm.j6
    public boolean realmGet$welcomed() {
        return this.welcomed;
    }

    @Override // io.realm.j6
    public void realmSet$armoireEmpty(boolean z10) {
        this.armoireEmpty = z10;
    }

    @Override // io.realm.j6
    public void realmSet$armoireEnabled(boolean z10) {
        this.armoireEnabled = z10;
    }

    @Override // io.realm.j6
    public void realmSet$armoireOpened(boolean z10) {
        this.armoireOpened = z10;
    }

    @Override // io.realm.j6
    public void realmSet$classSelected(boolean z10) {
        this.classSelected = z10;
    }

    @Override // io.realm.j6
    public void realmSet$communityGuidelinesAccepted(boolean z10) {
        this.communityGuidelinesAccepted = z10;
    }

    @Override // io.realm.j6
    public void realmSet$dropsEnabled(boolean z10) {
        this.dropsEnabled = z10;
    }

    @Override // io.realm.j6
    public void realmSet$isWarnedLowHealth(boolean z10) {
        this.isWarnedLowHealth = z10;
    }

    @Override // io.realm.j6
    public void realmSet$itemsEnabled(boolean z10) {
        this.itemsEnabled = z10;
    }

    @Override // io.realm.j6
    public void realmSet$lastNewStuffRead(String str) {
        this.lastNewStuffRead = str;
    }

    @Override // io.realm.j6
    public void realmSet$newStuff(boolean z10) {
        this.newStuff = z10;
    }

    @Override // io.realm.j6
    public void realmSet$rebirthEnabled(boolean z10) {
        this.rebirthEnabled = z10;
    }

    @Override // io.realm.j6
    public void realmSet$showTour(boolean z10) {
        this.showTour = z10;
    }

    @Override // io.realm.j6
    public void realmSet$tutorial(x0 x0Var) {
        this.tutorial = x0Var;
    }

    @Override // io.realm.j6
    public void realmSet$verifiedUsername(boolean z10) {
        this.verifiedUsername = z10;
    }

    @Override // io.realm.j6
    public void realmSet$welcomed(boolean z10) {
        this.welcomed = z10;
    }

    public final void setArmoireEmpty(boolean z10) {
        realmSet$armoireEmpty(z10);
    }

    public final void setArmoireEnabled(boolean z10) {
        realmSet$armoireEnabled(z10);
    }

    public final void setArmoireOpened(boolean z10) {
        realmSet$armoireOpened(z10);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarFlags
    public void setClassSelected(boolean z10) {
        realmSet$classSelected(z10);
    }

    public final void setCommunityGuidelinesAccepted(boolean z10) {
        realmSet$communityGuidelinesAccepted(z10);
    }

    public final void setDropsEnabled(boolean z10) {
        realmSet$dropsEnabled(z10);
    }

    public final void setItemsEnabled(boolean z10) {
        realmSet$itemsEnabled(z10);
    }

    public final void setLastNewStuffRead(String str) {
        realmSet$lastNewStuffRead(str);
    }

    public final void setNewStuff(boolean z10) {
        realmSet$newStuff(z10);
    }

    public final void setRebirthEnabled(boolean z10) {
        realmSet$rebirthEnabled(z10);
    }

    public final void setShowTour(boolean z10) {
        realmSet$showTour(z10);
    }

    public final void setTutorial(x0<TutorialStep> x0Var) {
        realmSet$tutorial(x0Var);
    }

    public final void setVerifiedUsername(boolean z10) {
        realmSet$verifiedUsername(z10);
    }

    public final void setWarnedLowHealth(boolean z10) {
        realmSet$isWarnedLowHealth(z10);
    }

    public final void setWelcomed(boolean z10) {
        realmSet$welcomed(z10);
    }
}
