package com.habitrpg.android.habitica.ui.adapter.social;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.ProfileAchievementItemBinding;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.models.Achievement;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.viewHolders.SectionViewHolder;
import com.habitrpg.android.habitica.ui.views.dialogs.AchievementDetailDialog;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import ec.t;
import java.util.List;
import qc.q;

/* compiled from: AchievementProfileAdapter.kt */
/* loaded from: classes4.dex */
public final class AchievementProfileAdapter extends RecyclerView.h<RecyclerView.f0> {
    public static final int $stable = 8;
    private MainActivity activity;
    private List<? extends Object> itemList;
    private String itemType;

    /* compiled from: AchievementProfileAdapter.kt */
    /* loaded from: classes4.dex */
    public static final class AchievementViewHolder extends RecyclerView.f0 implements View.OnClickListener {
        private Achievement achievement;
        private final ProfileAchievementItemBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AchievementViewHolder(View view) {
            super(view);
            q.i(view, "itemView");
            ProfileAchievementItemBinding bind = ProfileAchievementItemBinding.bind(view);
            q.h(bind, "bind(...)");
            this.binding = bind;
            view.setClickable(true);
            view.setOnClickListener(this);
        }

        public final void bind(Achievement achievement) {
            String icon;
            Integer optionalCount;
            q.i(achievement, "item");
            PixelArtView pixelArtView = this.binding.achievementDrawee;
            q.h(pixelArtView, "achievementDrawee");
            if (!achievement.getEarned()) {
                icon = "achievement-unearned";
            } else {
                icon = achievement.getIcon();
            }
            DataBindingUtilsKt.loadImage$default(pixelArtView, icon + "2x", null, 2, null);
            this.achievement = achievement;
            this.binding.achievementText.setText(achievement.getTitle());
            if (achievement.getOptionalCount() != null && ((optionalCount = achievement.getOptionalCount()) == null || optionalCount.intValue() != 0)) {
                this.binding.achievementCountLabel.setVisibility(0);
                this.binding.achievementCountLabel.setText(String.valueOf(achievement.getOptionalCount()));
                return;
            }
            this.binding.achievementCountLabel.setVisibility(8);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q.i(view, "view");
            Achievement achievement = this.achievement;
            if (achievement != null) {
                Context context = this.itemView.getContext();
                q.h(context, "getContext(...)");
                new AchievementDetailDialog(achievement, context).show();
            }
        }
    }

    public AchievementProfileAdapter() {
        List<? extends Object> i10;
        i10 = t.i();
        this.itemList = i10;
    }

    public final MainActivity getActivity() {
        return this.activity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.itemList.size();
    }

    public final String getItemType() {
        return this.itemType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (this.itemList.size() <= i10) {
            return 0;
        }
        return !q.d(this.itemList.get(i10).getClass(), String.class) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.f0 f0Var, int i10) {
        q.i(f0Var, "holder");
        Object obj = this.itemList.get(i10);
        AchievementViewHolder achievementViewHolder = null;
        SectionViewHolder sectionViewHolder = null;
        if (q.d(obj.getClass(), String.class)) {
            if (f0Var instanceof SectionViewHolder) {
                sectionViewHolder = (SectionViewHolder) f0Var;
            }
            if (sectionViewHolder != null) {
                q.g(obj, "null cannot be cast to non-null type kotlin.String");
                sectionViewHolder.bind((String) obj);
                return;
            }
            return;
        }
        if (f0Var instanceof AchievementViewHolder) {
            achievementViewHolder = (AchievementViewHolder) f0Var;
        }
        if (achievementViewHolder != null) {
            Object obj2 = this.itemList.get(i10);
            q.g(obj2, "null cannot be cast to non-null type com.habitrpg.android.habitica.models.Achievement");
            achievementViewHolder.bind((Achievement) obj2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        q.i(viewGroup, "parent");
        if (i10 == 0) {
            return new SectionViewHolder(ViewGroupExt.inflate$default(viewGroup, R.layout.profile_achievement_category, false, 2, null));
        }
        return new AchievementViewHolder(ViewGroupExt.inflate$default(viewGroup, R.layout.profile_achievement_item, false, 2, null));
    }

    public final void setActivity(MainActivity mainActivity) {
        this.activity = mainActivity;
    }

    public final void setItemList(List<? extends Object> list) {
        q.i(list, "itemList");
        this.itemList = list;
        notifyDataSetChanged();
    }

    public final void setItemType(String str) {
        this.itemType = str;
    }
}
