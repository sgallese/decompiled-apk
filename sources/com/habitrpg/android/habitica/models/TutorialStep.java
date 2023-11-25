package com.habitrpg.android.habitica.models;

import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import io.realm.a1;
import io.realm.b2;
import io.realm.d1;
import io.realm.internal.o;
import java.util.Date;
import qc.q;

/* compiled from: TutorialStep.kt */
/* loaded from: classes4.dex */
public class TutorialStep extends d1 implements BaseMainObject, b2 {
    public static final int $stable = 8;
    private Date displayedOn;
    private String identifier;
    private String key;
    private String tutorialGroup;
    private boolean wasCompleted;

    public TutorialStep() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final Date getDisplayedOn() {
        return realmGet$displayedOn();
    }

    public final String getFlagPath() {
        return "flags.tutorial." + realmGet$tutorialGroup() + "." + realmGet$identifier();
    }

    public final String getIdentifier() {
        return realmGet$identifier();
    }

    public final String getKey() {
        return realmGet$key();
    }

    public final boolean getLinkFAQ() {
        return q.d(realmGet$identifier(), NavigationDrawerFragment.SIDEBAR_PARTY);
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifier() {
        return realmGet$key();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifierName() {
        return "key";
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public Class<? extends a1> getRealmClass() {
        return TutorialStep.class;
    }

    public final boolean getShouldDisplay() {
        long j10;
        if (!realmGet$wasCompleted()) {
            if (realmGet$displayedOn() != null) {
                long time = new Date().getTime();
                Date realmGet$displayedOn = realmGet$displayedOn();
                if (realmGet$displayedOn != null) {
                    j10 = realmGet$displayedOn.getTime();
                } else {
                    j10 = 0;
                }
                if (time - j10 > 86400000) {
                }
            }
            return true;
        }
        return false;
    }

    public final String getTutorialGroup() {
        return realmGet$tutorialGroup();
    }

    public final boolean getWasCompleted() {
        return realmGet$wasCompleted();
    }

    @Override // io.realm.b2
    public Date realmGet$displayedOn() {
        return this.displayedOn;
    }

    @Override // io.realm.b2
    public String realmGet$identifier() {
        return this.identifier;
    }

    @Override // io.realm.b2
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.b2
    public String realmGet$tutorialGroup() {
        return this.tutorialGroup;
    }

    @Override // io.realm.b2
    public boolean realmGet$wasCompleted() {
        return this.wasCompleted;
    }

    @Override // io.realm.b2
    public void realmSet$displayedOn(Date date) {
        this.displayedOn = date;
    }

    @Override // io.realm.b2
    public void realmSet$identifier(String str) {
        this.identifier = str;
    }

    @Override // io.realm.b2
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.b2
    public void realmSet$tutorialGroup(String str) {
        this.tutorialGroup = str;
    }

    @Override // io.realm.b2
    public void realmSet$wasCompleted(boolean z10) {
        this.wasCompleted = z10;
    }

    public final void setDisplayedOn(Date date) {
        realmSet$displayedOn(date);
    }

    public final void setIdentifier(String str) {
        realmSet$identifier(str);
        realmSet$key(realmGet$tutorialGroup() + "_" + str);
    }

    public final void setKey(String str) {
        realmSet$key(str);
    }

    public final void setTutorialGroup(String str) {
        realmSet$tutorialGroup(str);
        realmSet$key(str + "_" + realmGet$identifier());
    }

    public final void setWasCompleted(boolean z10) {
        realmSet$wasCompleted(z10);
    }
}
