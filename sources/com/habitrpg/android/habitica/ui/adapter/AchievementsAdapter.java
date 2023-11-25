package com.habitrpg.android.habitica.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.AchievementChallengeItemBinding;
import com.habitrpg.android.habitica.databinding.AchievementQuestItemBinding;
import com.habitrpg.android.habitica.databinding.AchievementSectionHeaderBinding;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.models.Achievement;
import com.habitrpg.android.habitica.models.QuestAchievement;
import com.habitrpg.android.habitica.ui.views.dialogs.AchievementDetailDialog;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import dc.l;
import ec.t;
import java.util.List;
import qc.q;

/* compiled from: AchievementsAdapter.kt */
/* loaded from: classes4.dex */
public final class AchievementsAdapter extends RecyclerView.h<RecyclerView.f0> {
    public static final int $stable = 8;
    private List<? extends Object> entries;
    private boolean useGridLayout;

    /* compiled from: AchievementsAdapter.kt */
    /* loaded from: classes4.dex */
    public static final class AchievementViewHolder extends RecyclerView.f0 implements View.OnClickListener {
        public static final int $stable = 8;
        private Achievement achievement;
        private final ViewGroup achievementContainer;
        private final TextView achievementCountView;
        private final TextView achievementDescriptionView;
        private final PixelArtView achievementIconView;
        private final TextView achievementTitleView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AchievementViewHolder(View view) {
            super(view);
            q.i(view, "itemView");
            view.setOnClickListener(this);
            this.achievementContainer = (ViewGroup) view.findViewById(R.id.achievement_container);
            View findViewById = view.findViewById(R.id.achievement_icon);
            q.h(findViewById, "findViewById(...)");
            this.achievementIconView = (PixelArtView) findViewById;
            View findViewById2 = view.findViewById(R.id.achievement_count_label);
            q.h(findViewById2, "findViewById(...)");
            this.achievementCountView = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.achievement_title);
            q.h(findViewById3, "findViewById(...)");
            this.achievementTitleView = (TextView) findViewById3;
            this.achievementDescriptionView = (TextView) view.findViewById(R.id.achievement_description);
        }

        public final void bind(Achievement achievement) {
            String str;
            int i10;
            q.i(achievement, "achievement");
            this.achievement = achievement;
            if (achievement.getEarned()) {
                str = achievement.getIcon() + "2x";
            } else {
                str = "achievement-unearned2x";
            }
            DataBindingUtilsKt.loadImage$default(this.achievementIconView, str, null, 2, null);
            this.achievementTitleView.setText(achievement.getTitle());
            TextView textView = this.achievementDescriptionView;
            if (textView != null) {
                textView.setText(achievement.getText());
            }
            Integer optionalCount = achievement.getOptionalCount();
            if (optionalCount != null) {
                i10 = optionalCount.intValue();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.achievementCountView.setVisibility(0);
                this.achievementCountView.setText(String.valueOf(achievement.getOptionalCount()));
            } else {
                this.achievementCountView.setVisibility(8);
            }
            ViewGroup viewGroup = this.achievementContainer;
            if (viewGroup != null) {
                viewGroup.setClipToOutline(true);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Achievement achievement = this.achievement;
            if (achievement != null) {
                Context context = this.itemView.getContext();
                q.h(context, "getContext(...)");
                new AchievementDetailDialog(achievement, context).show();
            }
        }
    }

    /* compiled from: AchievementsAdapter.kt */
    /* loaded from: classes4.dex */
    public static final class ChallengeAchievementViewHolder extends RecyclerView.f0 {
        public static final int $stable = 8;
        private AchievementChallengeItemBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeAchievementViewHolder(View view) {
            super(view);
            q.i(view, "itemView");
            AchievementChallengeItemBinding bind = AchievementChallengeItemBinding.bind(view);
            q.h(bind, "bind(...)");
            this.binding = bind;
        }

        public final void bind(String str) {
            q.i(str, "challengeName");
            this.binding.achievementTitle.setText(str);
        }
    }

    /* compiled from: AchievementsAdapter.kt */
    /* loaded from: classes4.dex */
    public static final class QuestAchievementViewHolder extends RecyclerView.f0 {
        public static final int $stable = 8;
        private QuestAchievement achievement;
        private AchievementQuestItemBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuestAchievementViewHolder(View view) {
            super(view);
            q.i(view, "itemView");
            AchievementQuestItemBinding bind = AchievementQuestItemBinding.bind(view);
            q.h(bind, "bind(...)");
            this.binding = bind;
        }

        public final void bind(QuestAchievement questAchievement) {
            q.i(questAchievement, "achievement");
            this.achievement = questAchievement;
            this.binding.achievementTitle.setText(questAchievement.getTitle());
            this.binding.achievementCountLabel.setText(String.valueOf(questAchievement.getCount()));
        }
    }

    /* compiled from: AchievementsAdapter.kt */
    /* loaded from: classes4.dex */
    public static final class SectionViewHolder extends RecyclerView.f0 {
        public static final int $stable = 8;
        private AchievementSectionHeaderBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SectionViewHolder(View view) {
            super(view);
            q.i(view, "itemView");
            AchievementSectionHeaderBinding bind = AchievementSectionHeaderBinding.bind(view);
            q.h(bind, "bind(...)");
            this.binding = bind;
        }

        public final void bind(l<?, ?> lVar) {
            String str;
            q.i(lVar, "category");
            TextView textView = this.binding.title;
            Object c10 = lVar.c();
            if (c10 instanceof String) {
                str = (String) c10;
            } else {
                str = null;
            }
            textView.setText(str);
            this.binding.countLabel.setText(String.valueOf(lVar.d()));
        }
    }

    public AchievementsAdapter() {
        List<? extends Object> i10;
        i10 = t.i();
        this.entries = i10;
    }

    public final List<Object> getEntries() {
        return this.entries;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.entries.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (this.entries.size() <= i10) {
            return 0;
        }
        Object obj = this.entries.get(i10);
        if (obj instanceof l) {
            return 0;
        }
        if (obj instanceof QuestAchievement) {
            return 3;
        }
        if (obj instanceof String) {
            return 4;
        }
        if (this.useGridLayout) {
            return 1;
        }
        return 2;
    }

    public final boolean getUseGridLayout() {
        return this.useGridLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.f0 f0Var, int i10) {
        q.i(f0Var, "holder");
        Object obj = this.entries.get(i10);
        SectionViewHolder sectionViewHolder = null;
        AchievementViewHolder achievementViewHolder = null;
        QuestAchievementViewHolder questAchievementViewHolder = null;
        ChallengeAchievementViewHolder challengeAchievementViewHolder = null;
        if (obj instanceof Achievement) {
            if (f0Var instanceof AchievementViewHolder) {
                achievementViewHolder = (AchievementViewHolder) f0Var;
            }
            if (achievementViewHolder != null) {
                achievementViewHolder.bind((Achievement) obj);
            }
        } else if (obj instanceof QuestAchievement) {
            if (f0Var instanceof QuestAchievementViewHolder) {
                questAchievementViewHolder = (QuestAchievementViewHolder) f0Var;
            }
            if (questAchievementViewHolder != null) {
                questAchievementViewHolder.bind((QuestAchievement) obj);
            }
        } else if (obj instanceof String) {
            if (f0Var instanceof ChallengeAchievementViewHolder) {
                challengeAchievementViewHolder = (ChallengeAchievementViewHolder) f0Var;
            }
            if (challengeAchievementViewHolder != null) {
                challengeAchievementViewHolder.bind((String) obj);
            }
        } else if (obj instanceof l) {
            if (f0Var instanceof SectionViewHolder) {
                sectionViewHolder = (SectionViewHolder) f0Var;
            }
            if (sectionViewHolder != null) {
                sectionViewHolder.bind((l) obj);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View inflate$default;
        q.i(viewGroup, "parent");
        if (i10 != 0) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (this.useGridLayout) {
                        inflate$default = ViewGroupExt.inflate$default(viewGroup, R.layout.achievement_grid_item, false, 2, null);
                    } else {
                        inflate$default = ViewGroupExt.inflate$default(viewGroup, R.layout.achievement_list_item, false, 2, null);
                    }
                    return new AchievementViewHolder(inflate$default);
                }
                return new ChallengeAchievementViewHolder(ViewGroupExt.inflate$default(viewGroup, R.layout.achievement_challenge_item, false, 2, null));
            }
            return new QuestAchievementViewHolder(ViewGroupExt.inflate$default(viewGroup, R.layout.achievement_quest_item, false, 2, null));
        }
        return new SectionViewHolder(ViewGroupExt.inflate$default(viewGroup, R.layout.achievement_section_header, false, 2, null));
    }

    public final void setEntries(List<? extends Object> list) {
        q.i(list, "<set-?>");
        this.entries = list;
    }

    public final void setUseGridLayout(boolean z10) {
        this.useGridLayout = z10;
    }
}
