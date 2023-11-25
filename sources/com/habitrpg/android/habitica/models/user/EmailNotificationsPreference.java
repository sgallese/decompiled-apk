package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.h6;
import io.realm.internal.o;

/* compiled from: EmailNotificationsPreference.kt */
/* loaded from: classes4.dex */
public class EmailNotificationsPreference extends d1 implements BaseObject, h6 {
    public static final int $stable = 8;
    private boolean giftedGems;
    private boolean giftedSubscription;
    private boolean invitedGuild;
    private boolean invitedParty;
    private boolean invitedQuest;
    private boolean kickedGroup;
    private boolean majorUpdates;
    private boolean newPM;
    private boolean onboarding;
    private boolean questStarted;
    private boolean subscriptionReminders;
    private boolean unsubscribeFromAll;
    private boolean wonChallenge;

    public EmailNotificationsPreference() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final boolean getGiftedGems() {
        return realmGet$giftedGems();
    }

    public final boolean getGiftedSubscription() {
        return realmGet$giftedSubscription();
    }

    public final boolean getInvitedGuild() {
        return realmGet$invitedGuild();
    }

    public final boolean getInvitedParty() {
        return realmGet$invitedParty();
    }

    public final boolean getInvitedQuest() {
        return realmGet$invitedQuest();
    }

    public final boolean getKickedGroup() {
        return realmGet$kickedGroup();
    }

    public final boolean getMajorUpdates() {
        return realmGet$majorUpdates();
    }

    public final boolean getNewPM() {
        return realmGet$newPM();
    }

    public final boolean getOnboarding() {
        return realmGet$onboarding();
    }

    public final boolean getQuestStarted() {
        return realmGet$questStarted();
    }

    public final boolean getSubscriptionReminders() {
        return realmGet$subscriptionReminders();
    }

    public final boolean getUnsubscribeFromAll() {
        return realmGet$unsubscribeFromAll();
    }

    public final boolean getWonChallenge() {
        return realmGet$wonChallenge();
    }

    @Override // io.realm.h6
    public boolean realmGet$giftedGems() {
        return this.giftedGems;
    }

    @Override // io.realm.h6
    public boolean realmGet$giftedSubscription() {
        return this.giftedSubscription;
    }

    @Override // io.realm.h6
    public boolean realmGet$invitedGuild() {
        return this.invitedGuild;
    }

    @Override // io.realm.h6
    public boolean realmGet$invitedParty() {
        return this.invitedParty;
    }

    @Override // io.realm.h6
    public boolean realmGet$invitedQuest() {
        return this.invitedQuest;
    }

    @Override // io.realm.h6
    public boolean realmGet$kickedGroup() {
        return this.kickedGroup;
    }

    @Override // io.realm.h6
    public boolean realmGet$majorUpdates() {
        return this.majorUpdates;
    }

    @Override // io.realm.h6
    public boolean realmGet$newPM() {
        return this.newPM;
    }

    @Override // io.realm.h6
    public boolean realmGet$onboarding() {
        return this.onboarding;
    }

    @Override // io.realm.h6
    public boolean realmGet$questStarted() {
        return this.questStarted;
    }

    @Override // io.realm.h6
    public boolean realmGet$subscriptionReminders() {
        return this.subscriptionReminders;
    }

    @Override // io.realm.h6
    public boolean realmGet$unsubscribeFromAll() {
        return this.unsubscribeFromAll;
    }

    @Override // io.realm.h6
    public boolean realmGet$wonChallenge() {
        return this.wonChallenge;
    }

    @Override // io.realm.h6
    public void realmSet$giftedGems(boolean z10) {
        this.giftedGems = z10;
    }

    @Override // io.realm.h6
    public void realmSet$giftedSubscription(boolean z10) {
        this.giftedSubscription = z10;
    }

    @Override // io.realm.h6
    public void realmSet$invitedGuild(boolean z10) {
        this.invitedGuild = z10;
    }

    @Override // io.realm.h6
    public void realmSet$invitedParty(boolean z10) {
        this.invitedParty = z10;
    }

    @Override // io.realm.h6
    public void realmSet$invitedQuest(boolean z10) {
        this.invitedQuest = z10;
    }

    @Override // io.realm.h6
    public void realmSet$kickedGroup(boolean z10) {
        this.kickedGroup = z10;
    }

    @Override // io.realm.h6
    public void realmSet$majorUpdates(boolean z10) {
        this.majorUpdates = z10;
    }

    @Override // io.realm.h6
    public void realmSet$newPM(boolean z10) {
        this.newPM = z10;
    }

    @Override // io.realm.h6
    public void realmSet$onboarding(boolean z10) {
        this.onboarding = z10;
    }

    @Override // io.realm.h6
    public void realmSet$questStarted(boolean z10) {
        this.questStarted = z10;
    }

    @Override // io.realm.h6
    public void realmSet$subscriptionReminders(boolean z10) {
        this.subscriptionReminders = z10;
    }

    @Override // io.realm.h6
    public void realmSet$unsubscribeFromAll(boolean z10) {
        this.unsubscribeFromAll = z10;
    }

    @Override // io.realm.h6
    public void realmSet$wonChallenge(boolean z10) {
        this.wonChallenge = z10;
    }

    public final void setGiftedGems(boolean z10) {
        realmSet$giftedGems(z10);
    }

    public final void setGiftedSubscription(boolean z10) {
        realmSet$giftedSubscription(z10);
    }

    public final void setInvitedGuild(boolean z10) {
        realmSet$invitedGuild(z10);
    }

    public final void setInvitedParty(boolean z10) {
        realmSet$invitedParty(z10);
    }

    public final void setInvitedQuest(boolean z10) {
        realmSet$invitedQuest(z10);
    }

    public final void setKickedGroup(boolean z10) {
        realmSet$kickedGroup(z10);
    }

    public final void setMajorUpdates(boolean z10) {
        realmSet$majorUpdates(z10);
    }

    public final void setNewPM(boolean z10) {
        realmSet$newPM(z10);
    }

    public final void setOnboarding(boolean z10) {
        realmSet$onboarding(z10);
    }

    public final void setQuestStarted(boolean z10) {
        realmSet$questStarted(z10);
    }

    public final void setSubscriptionReminders(boolean z10) {
        realmSet$subscriptionReminders(z10);
    }

    public final void setUnsubscribeFromAll(boolean z10) {
        realmSet$unsubscribeFromAll(z10);
    }

    public final void setWonChallenge(boolean z10) {
        realmSet$wonChallenge(z10);
    }
}
