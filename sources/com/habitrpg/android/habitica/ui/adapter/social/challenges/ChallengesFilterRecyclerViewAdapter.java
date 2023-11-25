package com.habitrpg.android.habitica.ui.adapter.social.challenges;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.DialogChallengeFilterGroupItemBinding;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.ui.adapter.social.challenges.ChallengesFilterRecyclerViewAdapter;
import java.util.ArrayList;
import java.util.List;
import qc.q;

/* compiled from: ChallengesFilterRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public final class ChallengesFilterRecyclerViewAdapter extends RecyclerView.h<ChallengeViewHolder> {
    public static final int $stable = 8;
    private final List<Group> checkedEntries;
    private final List<Group> entries;

    /* compiled from: ChallengesFilterRecyclerViewAdapter.kt */
    /* loaded from: classes4.dex */
    public static final class ChallengeViewHolder extends RecyclerView.f0 {
        public static final int $stable = 8;
        private final DialogChallengeFilterGroupItemBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeViewHolder(View view) {
            super(view);
            q.i(view, "itemView");
            DialogChallengeFilterGroupItemBinding bind = DialogChallengeFilterGroupItemBinding.bind(view);
            q.h(bind, "bind(...)");
            this.binding = bind;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(List list, Group group, CompoundButton compoundButton, boolean z10) {
            q.i(list, "$checkedEntries");
            q.i(group, "$group");
            if (z10 && !list.contains(group)) {
                list.add(group);
            } else if (!z10 && list.contains(group)) {
                list.remove(group);
            }
        }

        public final void bind(final Group group, final List<Group> list) {
            q.i(group, "group");
            q.i(list, "checkedEntries");
            this.binding.getRoot().setText(group.getName());
            this.binding.getRoot().setChecked(list.contains(group));
            this.binding.getRoot().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.habitrpg.android.habitica.ui.adapter.social.challenges.b
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    ChallengesFilterRecyclerViewAdapter.ChallengeViewHolder.bind$lambda$0(list, group, compoundButton, z10);
                }
            });
        }
    }

    public ChallengesFilterRecyclerViewAdapter(List<? extends Group> list) {
        q.i(list, "entries");
        this.checkedEntries = new ArrayList();
        this.entries = new ArrayList(list);
    }

    public final List<Group> getCheckedEntries() {
        return this.checkedEntries;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.entries.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(ChallengeViewHolder challengeViewHolder, int i10) {
        q.i(challengeViewHolder, "holder");
        challengeViewHolder.bind(this.entries.get(i10), this.checkedEntries);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public ChallengeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        q.i(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dialog_challenge_filter_group_item, viewGroup, false);
        q.f(inflate);
        return new ChallengeViewHolder(inflate);
    }
}
