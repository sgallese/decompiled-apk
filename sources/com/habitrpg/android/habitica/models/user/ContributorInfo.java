package com.habitrpg.android.habitica.models.user;

import android.util.SparseIntArray;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.f6;
import io.realm.internal.o;
import qc.h;

/* compiled from: ContributorInfo.kt */
/* loaded from: classes4.dex */
public class ContributorInfo extends d1 implements BaseObject, f6 {
    private static final SparseIntArray CONTRIBUTOR_COLOR_DICT;
    private boolean admin;
    private String contributions;
    private int level;
    private String text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ContributorInfo.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final SparseIntArray getCONTRIBUTOR_COLOR_DICT() {
            return ContributorInfo.CONTRIBUTOR_COLOR_DICT;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        CONTRIBUTOR_COLOR_DICT = sparseIntArray;
        sparseIntArray.put(0, R.color.contributor_0);
        sparseIntArray.put(1, R.color.contributor_1);
        sparseIntArray.put(2, R.color.contributor_2);
        sparseIntArray.put(3, R.color.contributor_3);
        sparseIntArray.put(4, R.color.contributor_4);
        sparseIntArray.put(5, R.color.contributor_5);
        sparseIntArray.put(6, R.color.contributor_6);
        sparseIntArray.put(7, R.color.contributor_7);
        sparseIntArray.put(8, R.color.contributor_mod);
        sparseIntArray.put(9, R.color.contributor_staff);
    }

    public ContributorInfo() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final boolean getAdmin() {
        return realmGet$admin();
    }

    public final String getContributions() {
        return realmGet$contributions();
    }

    public final int getContributorColor() {
        SparseIntArray sparseIntArray = CONTRIBUTOR_COLOR_DICT;
        if (sparseIntArray.get(realmGet$level(), -1) > 0) {
            return sparseIntArray.get(realmGet$level());
        }
        return R.color.text_primary;
    }

    public final int getLevel() {
        return realmGet$level();
    }

    public final String getText() {
        return realmGet$text();
    }

    @Override // io.realm.f6
    public boolean realmGet$admin() {
        return this.admin;
    }

    @Override // io.realm.f6
    public String realmGet$contributions() {
        return this.contributions;
    }

    @Override // io.realm.f6
    public int realmGet$level() {
        return this.level;
    }

    @Override // io.realm.f6
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.f6
    public void realmSet$admin(boolean z10) {
        this.admin = z10;
    }

    @Override // io.realm.f6
    public void realmSet$contributions(String str) {
        this.contributions = str;
    }

    @Override // io.realm.f6
    public void realmSet$level(int i10) {
        this.level = i10;
    }

    @Override // io.realm.f6
    public void realmSet$text(String str) {
        this.text = str;
    }

    public final void setAdmin(boolean z10) {
        realmSet$admin(z10);
    }

    public final void setContributions(String str) {
        realmSet$contributions(str);
    }

    public final void setLevel(int i10) {
        realmSet$level(i10);
    }

    public final void setText(String str) {
        realmSet$text(str);
    }
}
