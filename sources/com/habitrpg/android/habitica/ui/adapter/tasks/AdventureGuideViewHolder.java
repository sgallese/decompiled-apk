package com.habitrpg.android.habitica.ui.adapter.tasks;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.models.user.UserAchievement;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import ec.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import qc.q;

/* compiled from: RealmBaseTasksRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public final class AdventureGuideViewHolder extends RecyclerView.f0 {
    public static final int $stable = 8;
    private TextView countView;
    private ProgressBar progressBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdventureGuideViewHolder(View view) {
        super(view);
        q.i(view, "itemView");
        View findViewById = view.findViewById(R.id.progress_bar);
        q.h(findViewById, "findViewById(...)");
        this.progressBar = (ProgressBar) findViewById;
        View findViewById2 = view.findViewById(R.id.count_view);
        q.h(findViewById2, "findViewById(...)");
        this.countView = (TextView) findViewById2;
        ((TextView) view.findViewById(R.id.gold_textview)).setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(view.getResources(), HabiticaIconsHelper.imageOfGold()), (Drawable) null, (Drawable) null, (Drawable) null);
        ((TextView) view.findViewById(R.id.gold_textview)).setCompoundDrawablePadding(IntExtensionsKt.dpToPx(4, view.getContext()));
    }

    public final void update(User user) {
        q.i(user, "user");
        List<UserAchievement> onboardingAchievements = user.getOnboardingAchievements();
        List<UserAchievement> list = onboardingAchievements;
        int i10 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((UserAchievement) it.next()).getEarned() && (i10 = i10 + 1) < 0) {
                    t.q();
                }
            }
        }
        this.progressBar.setMax(onboardingAchievements.size());
        this.progressBar.setProgress(i10);
        this.countView.setText(i10 + " / " + onboardingAchievements.size());
    }
}
