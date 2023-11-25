package com.habitrpg.common.habitica.models;

import android.content.Context;
import androidx.core.content.a;
import com.habitrpg.common.habitica.R;
import ec.t;
import java.util.ArrayList;
import java.util.List;
import qc.h;
import qc.q;

/* compiled from: PlayerTier.kt */
/* loaded from: classes4.dex */
public final class PlayerTier {
    public static final Companion Companion = new Companion(null);

    /* renamed from: id  reason: collision with root package name */
    private final int f12935id;
    private final String title;

    /* compiled from: PlayerTier.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final int getColorForTier(Context context, int i10) {
            q.i(context, "context");
            switch (i10) {
                case 1:
                    return a.c(context, R.color.contributor_1);
                case 2:
                    return a.c(context, R.color.contributor_2);
                case 3:
                    return a.c(context, R.color.contributor_3);
                case 4:
                    return a.c(context, R.color.contributor_4);
                case 5:
                    return a.c(context, R.color.contributor_5);
                case 6:
                    return a.c(context, R.color.contributor_6);
                case 7:
                    return a.c(context, R.color.contributor_7);
                case 8:
                    return a.c(context, R.color.contributor_mod);
                case 9:
                    return a.c(context, R.color.contributor_staff);
                default:
                    return a.c(context, R.color.contributor_0);
            }
        }

        public final List<PlayerTier> getTiers() {
            ArrayList e10;
            e10 = t.e(new PlayerTier("Tier 1 (Friend)", 1), new PlayerTier("Tier 2 (Friend)", 2), new PlayerTier("Tier 3 (Elite)", 3), new PlayerTier("Tier 4 (Elite)", 4), new PlayerTier("Tier 5 (Champion)", 5), new PlayerTier("Tier 6 (Champion)", 6), new PlayerTier("Tier 7 (Legendary)", 7), new PlayerTier("Staff (Heroic)", 9));
            return e10;
        }
    }

    public PlayerTier(String str, int i10) {
        q.i(str, "title");
        this.title = str;
        this.f12935id = i10;
    }

    public final int getId() {
        return this.f12935id;
    }

    public final String getTitle() {
        return this.title;
    }
}
