package com.habitrpg.android.habitica.ui.adapter.social;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.ChallengeItemBinding;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.social.ChallengeMembership;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.android.habitica.ui.adapter.BaseRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeFilterOptions;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.common.habitica.helpers.EmojiParser;
import dc.w;
import ec.t;
import io.realm.OrderedRealmCollection;
import io.realm.RealmQuery;
import io.realm.g1;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import pc.l;
import qc.q;

/* compiled from: ChallengesListViewAdapter.kt */
/* loaded from: classes4.dex */
public final class ChallengesListViewAdapter extends BaseRecyclerViewAdapter<Challenge, ChallengeViewHolder> {
    public static final int $stable = 8;
    private List<? extends ChallengeMembership> challengeMemberships;
    private l<? super String, w> onOpenChallengeFragment;
    private List<? extends Challenge> unfilteredData;
    private final String userId;
    private final boolean viewUserChallengesOnly;

    /* compiled from: ChallengesListViewAdapter.kt */
    /* loaded from: classes4.dex */
    public static final class ChallengeViewHolder extends RecyclerView.f0 {
        public static final int $stable = 8;
        private final ChallengeItemBinding binding;
        private Challenge challenge;
        private final boolean viewUserChallengesOnly;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeViewHolder(View view, boolean z10) {
            super(view);
            q.i(view, "itemView");
            this.viewUserChallengesOnly = z10;
            ChallengeItemBinding bind = ChallengeItemBinding.bind(view);
            q.h(bind, "bind(...)");
            this.binding = bind;
            bind.gemIcon.setImageBitmap(HabiticaIconsHelper.imageOfGem());
        }

        public final void bind(Challenge challenge, boolean z10) {
            String str;
            int i10;
            int i11;
            boolean z11;
            q.i(challenge, ClientData.KEY_CHALLENGE);
            this.challenge = challenge;
            TextView textView = this.binding.challengeName;
            EmojiParser emojiParser = EmojiParser.INSTANCE;
            String name = challenge.getName();
            int i12 = 0;
            if (name != null) {
                int length = name.length() - 1;
                int i13 = 0;
                boolean z12 = false;
                while (i13 <= length) {
                    if (!z12) {
                        i11 = i13;
                    } else {
                        i11 = length;
                    }
                    if (q.k(name.charAt(i11), 32) <= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z12) {
                        if (!z11) {
                            z12 = true;
                        } else {
                            i13++;
                        }
                    } else if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                }
                str = name.subSequence(i13, length + 1).toString();
            } else {
                str = null;
            }
            textView.setText(emojiParser.parseEmojis(str));
            this.binding.challengeShorttext.setText(challenge.getSummary());
            TextView textView2 = this.binding.officialChallengeView;
            if (challenge.getOfficial()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView2.setVisibility(i10);
            if (this.viewUserChallengesOnly) {
                this.binding.isJoinedLabel.setVisibility(8);
            } else {
                TextView textView3 = this.binding.isJoinedLabel;
                if (!z10) {
                    i12 = 8;
                }
                textView3.setVisibility(i12);
            }
            this.binding.participantCount.setText(String.valueOf(challenge.getMemberCount()));
            this.binding.gemPrizeTextView.setText(String.valueOf(challenge.getPrize()));
        }
    }

    public ChallengesListViewAdapter(boolean z10, String str) {
        q.i(str, TaskFormActivity.USER_ID_KEY);
        this.viewUserChallengesOnly = z10;
        this.userId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$3$lambda$2(Challenge challenge, ChallengesListViewAdapter challengesListViewAdapter, View view) {
        String id2;
        l<? super String, w> lVar;
        q.i(challenge, "$challenge");
        q.i(challengesListViewAdapter, "this$0");
        if (challenge.isManaged() && challenge.isValid() && (id2 = challenge.getId()) != null && (lVar = challengesListViewAdapter.onOpenChallengeFragment) != null) {
            lVar.invoke(id2);
        }
    }

    public final void filter(ChallengeFilterOptions challengeFilterOptions) {
        OrderedRealmCollection orderedRealmCollection;
        q.i(challengeFilterOptions, "filterOptions");
        List<? extends Challenge> list = this.unfilteredData;
        RealmQuery realmQuery = null;
        if (list instanceof OrderedRealmCollection) {
            orderedRealmCollection = (OrderedRealmCollection) list;
        } else {
            orderedRealmCollection = null;
        }
        if (orderedRealmCollection == null) {
            return;
        }
        RealmQuery B = orderedRealmCollection.B();
        if ((!challengeFilterOptions.getShowByGroups().isEmpty()) != false) {
            String[] strArr = new String[challengeFilterOptions.getShowByGroups().size()];
            Iterator<Group> it = challengeFilterOptions.getShowByGroups().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                strArr[i10] = it.next().getId();
                i10++;
            }
            if (B != null) {
                B = B.v(TaskFormActivity.GROUP_ID_KEY, strArr);
            } else {
                B = null;
            }
        }
        if (challengeFilterOptions.getShowOwned() != challengeFilterOptions.getNotOwned()) {
            if (challengeFilterOptions.getShowOwned()) {
                if (B != null) {
                    realmQuery = B.n("leaderId", this.userId);
                }
            } else if (B != null) {
                realmQuery = B.F("leaderId", this.userId);
            }
            B = realmQuery;
        }
        if (B != null) {
            g1 p10 = B.p();
            q.h(p10, "findAll(...)");
            setData(p10);
        }
    }

    public final l<String, w> getOnOpenChallengeFragment() {
        return this.onOpenChallengeFragment;
    }

    public final void setOnOpenChallengeFragment(l<? super String, w> lVar) {
        this.onOpenChallengeFragment = lVar;
    }

    public final void updateUnfilteredData(List<? extends Challenge> list) {
        List<? extends Challenge> list2;
        if (list == null) {
            list2 = t.i();
        } else {
            list2 = list;
        }
        setData(list2);
        this.unfilteredData = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(ChallengeViewHolder challengeViewHolder, int i10) {
        q.i(challengeViewHolder, "holder");
        final Challenge challenge = getData().get(i10);
        List<? extends ChallengeMembership> list = this.challengeMemberships;
        if (list != null) {
            for (ChallengeMembership challengeMembership : list) {
                if (q.d(challenge.getId(), challengeMembership.getChallengeID())) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        challengeMembership = null;
        challengeViewHolder.bind(challenge, challengeMembership != null);
        challengeViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.adapter.social.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChallengesListViewAdapter.onBindViewHolder$lambda$3$lambda$2(Challenge.this, this, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public ChallengeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        q.i(viewGroup, "parent");
        return new ChallengeViewHolder(ViewGroupExt.inflate$default(viewGroup, R.layout.challenge_item, false, 2, null), this.viewUserChallengesOnly);
    }
}
