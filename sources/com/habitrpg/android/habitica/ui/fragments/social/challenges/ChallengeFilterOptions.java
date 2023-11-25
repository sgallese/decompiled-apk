package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import com.habitrpg.android.habitica.models.social.Group;
import java.util.List;
import qc.q;

/* compiled from: ChallengeFilterOptions.kt */
/* loaded from: classes4.dex */
public final class ChallengeFilterOptions {
    public static final int $stable = 8;
    private boolean notOwned;
    private List<? extends Group> showByGroups;
    private boolean showOwned;

    public ChallengeFilterOptions(List<? extends Group> list, boolean z10, boolean z11) {
        q.i(list, "showByGroups");
        this.showByGroups = list;
        this.showOwned = z10;
        this.notOwned = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChallengeFilterOptions copy$default(ChallengeFilterOptions challengeFilterOptions, List list, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = challengeFilterOptions.showByGroups;
        }
        if ((i10 & 2) != 0) {
            z10 = challengeFilterOptions.showOwned;
        }
        if ((i10 & 4) != 0) {
            z11 = challengeFilterOptions.notOwned;
        }
        return challengeFilterOptions.copy(list, z10, z11);
    }

    public final List<Group> component1() {
        return this.showByGroups;
    }

    public final boolean component2() {
        return this.showOwned;
    }

    public final boolean component3() {
        return this.notOwned;
    }

    public final ChallengeFilterOptions copy(List<? extends Group> list, boolean z10, boolean z11) {
        q.i(list, "showByGroups");
        return new ChallengeFilterOptions(list, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeFilterOptions)) {
            return false;
        }
        ChallengeFilterOptions challengeFilterOptions = (ChallengeFilterOptions) obj;
        if (q.d(this.showByGroups, challengeFilterOptions.showByGroups) && this.showOwned == challengeFilterOptions.showOwned && this.notOwned == challengeFilterOptions.notOwned) {
            return true;
        }
        return false;
    }

    public final boolean getNotOwned() {
        return this.notOwned;
    }

    public final List<Group> getShowByGroups() {
        return this.showByGroups;
    }

    public final boolean getShowOwned() {
        return this.showOwned;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.showByGroups.hashCode() * 31;
        boolean z10 = this.showOwned;
        int i10 = 1;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        boolean z11 = this.notOwned;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        return i12 + i10;
    }

    public final void setNotOwned(boolean z10) {
        this.notOwned = z10;
    }

    public final void setShowByGroups(List<? extends Group> list) {
        q.i(list, "<set-?>");
        this.showByGroups = list;
    }

    public final void setShowOwned(boolean z10) {
        this.showOwned = z10;
    }

    public String toString() {
        return "ChallengeFilterOptions(showByGroups=" + this.showByGroups + ", showOwned=" + this.showOwned + ", notOwned=" + this.notOwned + ")";
    }

    public /* synthetic */ ChallengeFilterOptions(List list, boolean z10, boolean z11, int i10, qc.h hVar) {
        this(list, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11);
    }
}
