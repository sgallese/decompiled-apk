package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.DialogChallengeFilterBinding;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.ui.adapter.social.challenges.ChallengesFilterRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeFilterDialogHolder;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaBottomSheetDialog;
import dc.w;
import ec.t;
import java.util.List;
import qc.q;

/* compiled from: ChallengeFilterDialogHolder.kt */
/* loaded from: classes4.dex */
public final class ChallengeFilterDialogHolder {
    public static final Companion Companion = new Companion(null);
    private ChallengesFilterRecyclerViewAdapter adapter;
    private final DialogChallengeFilterBinding binding;
    private final Activity context;
    private ChallengeFilterOptions currentFilter;
    private List<? extends Group> filterGroups;
    private pc.l<? super ChallengeFilterOptions, w> selectedGroupsCallback;

    /* compiled from: ChallengeFilterDialogHolder.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showDialog$lambda$0(pc.l lVar, ChallengeFilterDialogHolder challengeFilterDialogHolder, DialogInterface dialogInterface) {
            List<Group> i10;
            q.i(lVar, "$selectedGroupsCallback");
            q.i(challengeFilterDialogHolder, "$holder");
            ChallengesFilterRecyclerViewAdapter challengesFilterRecyclerViewAdapter = challengeFilterDialogHolder.adapter;
            if (challengesFilterRecyclerViewAdapter == null || (i10 = challengesFilterRecyclerViewAdapter.getCheckedEntries()) == null) {
                i10 = t.i();
            }
            lVar.invoke(new ChallengeFilterOptions(i10, challengeFilterDialogHolder.binding.challengeFilterOwned.isChecked(), challengeFilterDialogHolder.binding.challengeFilterNotOwned.isChecked()));
        }

        public final void showDialog(Activity activity, List<? extends Group> list, ChallengeFilterOptions challengeFilterOptions, final pc.l<? super ChallengeFilterOptions, w> lVar) {
            q.i(activity, "activity");
            q.i(list, "filterGroups");
            q.i(lVar, "selectedGroupsCallback");
            View inflate = activity.getLayoutInflater().inflate(R.layout.dialog_challenge_filter, (ViewGroup) null);
            q.f(inflate);
            final ChallengeFilterDialogHolder challengeFilterDialogHolder = new ChallengeFilterDialogHolder(inflate, activity, null);
            HabiticaBottomSheetDialog habiticaBottomSheetDialog = new HabiticaBottomSheetDialog(activity);
            habiticaBottomSheetDialog.setContentView(inflate);
            habiticaBottomSheetDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.challenges.i
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ChallengeFilterDialogHolder.Companion.showDialog$lambda$0(pc.l.this, challengeFilterDialogHolder, dialogInterface);
                }
            });
            challengeFilterDialogHolder.bind(list, challengeFilterOptions, lVar);
            habiticaBottomSheetDialog.show();
        }
    }

    public /* synthetic */ ChallengeFilterDialogHolder(View view, Activity activity, qc.h hVar) {
        this(view, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ChallengeFilterDialogHolder challengeFilterDialogHolder, View view) {
        q.i(challengeFilterDialogHolder, "this$0");
        challengeFilterDialogHolder.allClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ChallengeFilterDialogHolder challengeFilterDialogHolder, View view) {
        q.i(challengeFilterDialogHolder, "this$0");
        challengeFilterDialogHolder.noneClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ChallengeFilterDialogHolder challengeFilterDialogHolder, CompoundButton compoundButton, boolean z10) {
        q.i(challengeFilterDialogHolder, "this$0");
        ChallengeFilterOptions challengeFilterOptions = challengeFilterDialogHolder.currentFilter;
        if (challengeFilterOptions != null) {
            challengeFilterOptions.setShowOwned(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ChallengeFilterDialogHolder challengeFilterDialogHolder, CompoundButton compoundButton, boolean z10) {
        q.i(challengeFilterDialogHolder, "this$0");
        ChallengeFilterOptions challengeFilterOptions = challengeFilterDialogHolder.currentFilter;
        if (challengeFilterOptions != null) {
            challengeFilterOptions.setNotOwned(z10);
        }
    }

    private final void allClicked() {
        List<Group> checkedEntries;
        List<Group> checkedEntries2;
        ChallengesFilterRecyclerViewAdapter challengesFilterRecyclerViewAdapter = this.adapter;
        if (challengesFilterRecyclerViewAdapter != null && (checkedEntries2 = challengesFilterRecyclerViewAdapter.getCheckedEntries()) != null) {
            checkedEntries2.clear();
        }
        ChallengesFilterRecyclerViewAdapter challengesFilterRecyclerViewAdapter2 = this.adapter;
        if (challengesFilterRecyclerViewAdapter2 != null && (checkedEntries = challengesFilterRecyclerViewAdapter2.getCheckedEntries()) != null) {
            checkedEntries.addAll(this.filterGroups);
        }
    }

    private final void fillChallengeGroups() {
        List<Group> list;
        ChallengesFilterRecyclerViewAdapter challengesFilterRecyclerViewAdapter;
        List<Group> checkedEntries;
        List<Group> i10;
        this.binding.challengeFilterRecyclerView.setLayoutManager(new LinearLayoutManager(this.context));
        this.adapter = new ChallengesFilterRecyclerViewAdapter(this.filterGroups);
        ChallengeFilterOptions challengeFilterOptions = this.currentFilter;
        if (challengeFilterOptions != null) {
            if (challengeFilterOptions != null) {
                list = challengeFilterOptions.getShowByGroups();
            } else {
                list = null;
            }
            if (list != null && (challengesFilterRecyclerViewAdapter = this.adapter) != null && (checkedEntries = challengesFilterRecyclerViewAdapter.getCheckedEntries()) != null) {
                ChallengeFilterOptions challengeFilterOptions2 = this.currentFilter;
                if (challengeFilterOptions2 == null || (i10 = challengeFilterOptions2.getShowByGroups()) == null) {
                    i10 = t.i();
                }
                checkedEntries.addAll(i10);
            }
        }
        this.binding.challengeFilterRecyclerView.setAdapter(this.adapter);
    }

    private final void noneClicked() {
        List<Group> checkedEntries;
        ChallengesFilterRecyclerViewAdapter challengesFilterRecyclerViewAdapter = this.adapter;
        if (challengesFilterRecyclerViewAdapter != null && (checkedEntries = challengesFilterRecyclerViewAdapter.getCheckedEntries()) != null) {
            checkedEntries.clear();
        }
    }

    public final void bind(List<? extends Group> list, ChallengeFilterOptions challengeFilterOptions, pc.l<? super ChallengeFilterOptions, w> lVar) {
        q.i(list, "filterGroups");
        this.filterGroups = list;
        this.currentFilter = challengeFilterOptions;
        this.selectedGroupsCallback = lVar;
        fillChallengeGroups();
        if (challengeFilterOptions != null) {
            this.binding.challengeFilterOwned.setChecked(challengeFilterOptions.getShowOwned());
            this.binding.challengeFilterNotOwned.setChecked(challengeFilterOptions.getNotOwned());
        }
    }

    private ChallengeFilterDialogHolder(View view, Activity activity) {
        List<? extends Group> i10;
        this.context = activity;
        DialogChallengeFilterBinding bind = DialogChallengeFilterBinding.bind(view);
        q.h(bind, "bind(...)");
        this.binding = bind;
        i10 = t.i();
        this.filterGroups = i10;
        bind.challengeFilterButtonAll.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.challenges.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChallengeFilterDialogHolder._init_$lambda$0(ChallengeFilterDialogHolder.this, view2);
            }
        });
        bind.challengeFilterButtonNone.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.challenges.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChallengeFilterDialogHolder._init_$lambda$1(ChallengeFilterDialogHolder.this, view2);
            }
        });
        bind.challengeFilterOwned.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.challenges.g
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ChallengeFilterDialogHolder._init_$lambda$2(ChallengeFilterDialogHolder.this, compoundButton, z10);
            }
        });
        bind.challengeFilterNotOwned.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.challenges.h
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ChallengeFilterDialogHolder._init_$lambda$3(ChallengeFilterDialogHolder.this, compoundButton, z10);
            }
        });
    }
}
