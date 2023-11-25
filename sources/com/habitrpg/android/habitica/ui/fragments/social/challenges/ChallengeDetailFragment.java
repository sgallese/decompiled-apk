package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.w;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.DialogChallengeDetailTaskGroupBinding;
import com.habitrpg.android.habitica.databinding.FragmentChallengeDetailBinding;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity;
import com.habitrpg.android.habitica.ui.activities.FullProfileActivity;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.viewHolders.tasks.DailyViewHolder;
import com.habitrpg.android.habitica.ui.viewHolders.tasks.HabitViewHolder;
import com.habitrpg.android.habitica.ui.viewHolders.tasks.RewardViewHolder;
import com.habitrpg.android.habitica.ui.viewHolders.tasks.TodoViewHolder;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.EmojiParser;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MarkdownParserKt;
import com.habitrpg.common.habitica.views.AvatarView;
import java.util.ArrayList;
import pc.p;
import qc.q;

/* compiled from: ChallengeDetailFragment.kt */
/* loaded from: classes4.dex */
public final class ChallengeDetailFragment extends Hilt_ChallengeDetailFragment<FragmentChallengeDetailBinding> {
    public static final int $stable = 8;
    private FragmentChallengeDetailBinding binding;
    private Challenge challenge;
    private String challengeID;
    public ChallengeRepository challengeRepository;
    private boolean isCreator;
    public SocialRepository socialRepository;
    public MainUserViewModel userViewModel;

    /* JADX INFO: Access modifiers changed from: private */
    public final void addDailys(ArrayList<Task> arrayList) {
        LinearLayout linearLayout;
        LayoutInflater layoutInflater = getLayoutInflater();
        FragmentChallengeDetailBinding binding = getBinding();
        if (binding != null) {
            linearLayout = binding.taskGroupLayout;
        } else {
            linearLayout = null;
        }
        DialogChallengeDetailTaskGroupBinding inflate = DialogChallengeDetailTaskGroupBinding.inflate(layoutInflater, linearLayout, true);
        q.h(inflate, "inflate(...)");
        inflate.taskGroupName.setText(getLabelByTypeAndCount(Challenge.TASK_ORDER_DAILYS, arrayList.size()));
        inflate.taskCountView.setText(String.valueOf(arrayList.size()));
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Task task = arrayList.get(i10);
            q.h(task, "get(...)");
            LinearLayout linearLayout2 = inflate.tasksLayout;
            q.h(linearLayout2, "tasksLayout");
            View inflate$default = ViewGroupExt.inflate$default(linearLayout2, R.layout.daily_item_card, false, 2, null);
            DailyViewHolder dailyViewHolder = new DailyViewHolder(inflate$default, ChallengeDetailFragment$addDailys$viewHolder$1.INSTANCE, ChallengeDetailFragment$addDailys$viewHolder$2.INSTANCE, ChallengeDetailFragment$addDailys$viewHolder$3.INSTANCE, ChallengeDetailFragment$addDailys$viewHolder$4.INSTANCE, null);
            dailyViewHolder.setLocked(true);
            dailyViewHolder.bind(task, i10, "normal");
            inflate.tasksLayout.addView(inflate$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addHabits(ArrayList<Task> arrayList) {
        LinearLayout linearLayout;
        LayoutInflater layoutInflater = getLayoutInflater();
        FragmentChallengeDetailBinding binding = getBinding();
        if (binding != null) {
            linearLayout = binding.taskGroupLayout;
        } else {
            linearLayout = null;
        }
        DialogChallengeDetailTaskGroupBinding inflate = DialogChallengeDetailTaskGroupBinding.inflate(layoutInflater, linearLayout, true);
        q.h(inflate, "inflate(...)");
        inflate.taskGroupName.setText(getLabelByTypeAndCount(Challenge.TASK_ORDER_HABITS, arrayList.size()));
        inflate.taskCountView.setText(String.valueOf(arrayList.size()));
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Task task = arrayList.get(i10);
            q.h(task, "get(...)");
            LinearLayout linearLayout2 = inflate.tasksLayout;
            q.h(linearLayout2, "tasksLayout");
            View inflate$default = ViewGroupExt.inflate$default(linearLayout2, R.layout.habit_item_card, false, 2, null);
            HabitViewHolder habitViewHolder = new HabitViewHolder(inflate$default, ChallengeDetailFragment$addHabits$viewHolder$1.INSTANCE, ChallengeDetailFragment$addHabits$viewHolder$2.INSTANCE, ChallengeDetailFragment$addHabits$viewHolder$3.INSTANCE, null);
            habitViewHolder.setLocked(true);
            habitViewHolder.bind(task, i10, "normal");
            inflate.tasksLayout.addView(inflate$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addRewards(ArrayList<Task> arrayList) {
        LinearLayout linearLayout;
        LayoutInflater layoutInflater = getLayoutInflater();
        FragmentChallengeDetailBinding binding = getBinding();
        if (binding != null) {
            linearLayout = binding.taskGroupLayout;
        } else {
            linearLayout = null;
        }
        DialogChallengeDetailTaskGroupBinding inflate = DialogChallengeDetailTaskGroupBinding.inflate(layoutInflater, linearLayout, true);
        q.h(inflate, "inflate(...)");
        inflate.taskGroupName.setText(getLabelByTypeAndCount(Challenge.TASK_ORDER_REWARDS, arrayList.size()));
        inflate.taskCountView.setText(String.valueOf(arrayList.size()));
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Task task = arrayList.get(i10);
            q.h(task, "get(...)");
            Task task2 = task;
            LinearLayout linearLayout2 = inflate.tasksLayout;
            q.h(linearLayout2, "tasksLayout");
            View inflate$default = ViewGroupExt.inflate$default(linearLayout2, R.layout.reward_item_card, false, 2, null);
            RewardViewHolder rewardViewHolder = new RewardViewHolder(inflate$default, ChallengeDetailFragment$addRewards$viewHolder$1.INSTANCE, ChallengeDetailFragment$addRewards$viewHolder$2.INSTANCE, ChallengeDetailFragment$addRewards$viewHolder$3.INSTANCE, null);
            rewardViewHolder.setLocked(true);
            rewardViewHolder.bind(task2, i10, true, "normal", null);
            inflate.tasksLayout.addView(inflate$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addTodos(ArrayList<Task> arrayList) {
        LinearLayout linearLayout;
        LayoutInflater layoutInflater = getLayoutInflater();
        FragmentChallengeDetailBinding binding = getBinding();
        if (binding != null) {
            linearLayout = binding.taskGroupLayout;
        } else {
            linearLayout = null;
        }
        DialogChallengeDetailTaskGroupBinding inflate = DialogChallengeDetailTaskGroupBinding.inflate(layoutInflater, linearLayout, true);
        q.h(inflate, "inflate(...)");
        inflate.taskGroupName.setText(getLabelByTypeAndCount(Challenge.TASK_ORDER_TODOS, arrayList.size()));
        inflate.taskCountView.setText(String.valueOf(arrayList.size()));
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Task task = arrayList.get(i10);
            q.h(task, "get(...)");
            LinearLayout linearLayout2 = inflate.tasksLayout;
            q.h(linearLayout2, "tasksLayout");
            View inflate$default = ViewGroupExt.inflate$default(linearLayout2, R.layout.todo_item_card, false, 2, null);
            TodoViewHolder todoViewHolder = new TodoViewHolder(inflate$default, ChallengeDetailFragment$addTodos$viewHolder$1.INSTANCE, ChallengeDetailFragment$addTodos$viewHolder$2.INSTANCE, ChallengeDetailFragment$addTodos$viewHolder$3.INSTANCE, ChallengeDetailFragment$addTodos$viewHolder$4.INSTANCE, null);
            todoViewHolder.setLocked(true);
            todoViewHolder.bind(task, i10, "normal");
            inflate.tasksLayout.addView(inflate$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getLabelByTypeAndCount(java.lang.String r5, int r6) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = -1339234950(0xffffffffb02ce57a, float:-6.289934E-10)
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L50
            r1 = -1224929921(0xffffffffb6fd0d7f, float:-7.5415587E-6)
            if (r0 == r1) goto L33
            r1 = 1100650276(0x419a9724, float:19.3238)
            if (r0 == r1) goto L16
            goto L58
        L16:
            java.lang.String r0 = "rewards"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L1f
            goto L58
        L1f:
            android.content.Context r5 = r4.getContext()
            if (r5 == 0) goto L7f
            if (r6 != r2) goto L2b
            r6 = 2131953013(0x7f130575, float:1.9542485E38)
            goto L2e
        L2b:
            r6 = 2131953016(0x7f130578, float:1.9542491E38)
        L2e:
            java.lang.String r3 = r5.getString(r6)
            goto L7f
        L33:
            java.lang.String r0 = "habits"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L3c
            goto L58
        L3c:
            android.content.Context r5 = r4.getContext()
            if (r5 == 0) goto L7f
            if (r6 != r2) goto L48
            r6 = 2131952317(0x7f1302bd, float:1.9541073E38)
            goto L4b
        L48:
            r6 = 2131952325(0x7f1302c5, float:1.954109E38)
        L4b:
            java.lang.String r3 = r5.getString(r6)
            goto L7f
        L50:
            java.lang.String r0 = "dailys"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L6c
        L58:
            android.content.Context r5 = r4.getContext()
            if (r5 == 0) goto L7f
            if (r6 != r2) goto L64
            r6 = 2131953319(0x7f1306a7, float:1.9543106E38)
            goto L67
        L64:
            r6 = 2131953323(0x7f1306ab, float:1.9543114E38)
        L67:
            java.lang.String r3 = r5.getString(r6)
            goto L7f
        L6c:
            android.content.Context r5 = r4.getContext()
            if (r5 == 0) goto L7f
            if (r6 != r2) goto L78
            r6 = 2131952003(0x7f130183, float:1.9540436E38)
            goto L7b
        L78:
            r6 = 2131952002(0x7f130182, float:1.9540434E38)
        L7b:
            java.lang.String r3 = r5.getString(r6)
        L7f:
            if (r3 != 0) goto L83
            java.lang.String r3 = ""
        L83:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment.getLabelByTypeAndCount(java.lang.String, int):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(ChallengeDetailFragment challengeDetailFragment, View view) {
        String leaderId;
        q.i(challengeDetailFragment, "this$0");
        Challenge challenge = challengeDetailFragment.challenge;
        if (challenge != null && (leaderId = challenge.getLeaderId()) != null) {
            FullProfileActivity.Companion.open(leaderId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(ChallengeDetailFragment challengeDetailFragment, View view) {
        q.i(challengeDetailFragment, "this$0");
        Challenge challenge = challengeDetailFragment.challenge;
        if (challenge != null) {
            ExceptionHandlerKt.launchCatching$default(w.a(challengeDetailFragment), null, new ChallengeDetailFragment$onViewCreated$4$1$1(challengeDetailFragment, challenge, null), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5(ChallengeDetailFragment challengeDetailFragment, View view) {
        q.i(challengeDetailFragment, "this$0");
        challengeDetailFragment.showChallengeLeaveDialog();
    }

    private final void refresh() {
        String str = this.challengeID;
        if (str != null) {
            ExceptionHandlerKt.launchCatching(w.a(this), ChallengeDetailFragment$refresh$1$1.INSTANCE, new ChallengeDetailFragment$refresh$1$2(this, str, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set(Challenge challenge) {
        TextView textView;
        this.challenge = challenge;
        FragmentChallengeDetailBinding binding = getBinding();
        TextView textView2 = binding != null ? binding.challengeName : null;
        if (textView2 != null) {
            textView2.setText(EmojiParser.INSTANCE.parseEmojis(challenge.getName()));
        }
        FragmentChallengeDetailBinding binding2 = getBinding();
        if (binding2 != null && (textView = binding2.challengeDescription) != null) {
            MarkdownParserKt.setMarkdown(textView, challenge.getDescription());
        }
        FragmentChallengeDetailBinding binding3 = getBinding();
        UsernameLabel usernameLabel = binding3 != null ? binding3.creatorLabel : null;
        if (usernameLabel != null) {
            usernameLabel.setUsername(challenge.getLeaderName());
        }
        FragmentChallengeDetailBinding binding4 = getBinding();
        TextView textView3 = binding4 != null ? binding4.gemAmount : null;
        if (textView3 != null) {
            textView3.setText(String.valueOf(challenge.getPrize()));
        }
        FragmentChallengeDetailBinding binding5 = getBinding();
        TextView textView4 = binding5 != null ? binding5.participantCount : null;
        if (textView4 == null) {
            return;
        }
        textView4.setText(String.valueOf(challenge.getMemberCount()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setJoined(boolean z10) {
        Button button;
        FrameLayout frameLayout;
        Button button2;
        int i10;
        int i11;
        int i12;
        FragmentChallengeDetailBinding binding = getBinding();
        FrameLayout frameLayout2 = null;
        if (binding != null) {
            button = binding.joinButton;
        } else {
            button = null;
        }
        int i13 = 0;
        if (button != null) {
            if (!z10) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            button.setVisibility(i12);
        }
        FragmentChallengeDetailBinding binding2 = getBinding();
        if (binding2 != null) {
            frameLayout = binding2.joinButtonWrapper;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            if (!z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            frameLayout.setVisibility(i11);
        }
        FragmentChallengeDetailBinding binding3 = getBinding();
        if (binding3 != null) {
            button2 = binding3.leaveButton;
        } else {
            button2 = null;
        }
        if (button2 != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            button2.setVisibility(i10);
        }
        FragmentChallengeDetailBinding binding4 = getBinding();
        if (binding4 != null) {
            frameLayout2 = binding4.leaveButtonWrapper;
        }
        if (frameLayout2 != null) {
            if (!z10) {
                i13 = 8;
            }
            frameLayout2.setVisibility(i13);
        }
    }

    private final void showChallengeLeaveDialog() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
        habiticaAlertDialog.setTitle(getString(R.string.challenge_leave_title));
        habiticaAlertDialog.setMessage(getString(R.string.challenge_leave_description));
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.leave_keep_tasks, true, false, false, (p) new ChallengeDetailFragment$showChallengeLeaveDialog$1(this), 12, (Object) null);
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.leave_delete_tasks, false, true, false, (p) new ChallengeDetailFragment$showChallengeLeaveDialog$2(this), 8, (Object) null);
        habiticaAlertDialog.setExtraCloseButtonVisibility(0);
        habiticaAlertDialog.show();
    }

    private final void showEndChallengeDialog() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
        habiticaAlertDialog.setTitle(R.string.action_end_challenge);
        habiticaAlertDialog.setMessage(R.string.end_challenge_description);
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.open_website, true, false, false, (p) new ChallengeDetailFragment$showEndChallengeDialog$1(this, context), 8, (Object) null);
        AlertDialogExtensionsKt.addCloseButton$default(habiticaAlertDialog, false, null, 3, null);
        habiticaAlertDialog.show();
    }

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final String getChallengeID() {
        return this.challengeID;
    }

    public final ChallengeRepository getChallengeRepository() {
        ChallengeRepository challengeRepository = this.challengeRepository;
        if (challengeRepository != null) {
            return challengeRepository;
        }
        q.z("challengeRepository");
        return null;
    }

    public final SocialRepository getSocialRepository() {
        SocialRepository socialRepository = this.socialRepository;
        if (socialRepository != null) {
            return socialRepository;
        }
        q.z("socialRepository");
        return null;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        q.z("userViewModel");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        q.i(menu, "menu");
        q.i(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.menu_challenge_details, menu);
        MenuItem findItem = menu.findItem(R.id.action_edit);
        if (findItem != null) {
            findItem.setVisible(this.isCreator);
        }
        MenuItem findItem2 = menu.findItem(R.id.action_end_challenge);
        if (findItem2 != null) {
            findItem2.setVisible(this.isCreator);
        }
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setHidesToolbar(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        q.i(menuItem, "item");
        switch (menuItem.getItemId()) {
            case R.id.action_edit /* 2131296337 */:
                Intent intent = new Intent(getActivity(), ChallengeFormActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString(ChallengeFormActivity.CHALLENGE_ID_KEY, this.challengeID);
                intent.putExtras(bundle);
                startActivity(intent);
                return true;
            case R.id.action_end_challenge /* 2131296338 */:
                showEndChallengeDialog();
                break;
            case R.id.action_share /* 2131296353 */:
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.SEND");
                Context context = getContext();
                String str2 = null;
                if (context != null) {
                    str = context.getString(R.string.base_url);
                } else {
                    str = null;
                }
                intent2.putExtra("android.intent.extra.TEXT", str + "/challenges/" + this.challengeID);
                intent2.setType("text/plain");
                Context context2 = getContext();
                if (context2 != null) {
                    str2 = context2.getString(R.string.share_challenge_with);
                }
                startActivity(Intent.createChooser(intent2, str2));
                break;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        Button button;
        Button button2;
        LinearLayout linearLayout;
        ImageView imageView;
        ImageView imageView2;
        q.i(view, "view");
        setShowsBackButton(true);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ChallengeDetailFragmentArgs fromBundle = ChallengeDetailFragmentArgs.fromBundle(arguments);
            q.h(fromBundle, "fromBundle(...)");
            this.challengeID = fromBundle.getChallengeID();
        }
        FragmentChallengeDetailBinding binding = getBinding();
        if (binding != null && (imageView2 = binding.gemAmountIcon) != null) {
            imageView2.setImageBitmap(HabiticaIconsHelper.imageOfGem_36());
        }
        FragmentChallengeDetailBinding binding2 = getBinding();
        if (binding2 != null && (imageView = binding2.participantCountIcon) != null) {
            imageView.setImageBitmap(HabiticaIconsHelper.imageOfParticipantsIcon());
        }
        FragmentChallengeDetailBinding binding3 = getBinding();
        if (binding3 != null) {
            textView = binding3.challengeDescription;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        FragmentChallengeDetailBinding binding4 = getBinding();
        if (binding4 != null && (linearLayout = binding4.challengeCreatorWrapper) != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.challenges.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChallengeDetailFragment.onViewCreated$lambda$1(ChallengeDetailFragment.this, view2);
                }
            });
        }
        String str = this.challengeID;
        if (str != null) {
            ExceptionHandlerKt.launchCatching$default(w.a(this), null, new ChallengeDetailFragment$onViewCreated$3$1(this, str, null), 1, null);
            ExceptionHandlerKt.launchCatching$default(w.a(this), null, new ChallengeDetailFragment$onViewCreated$3$2(this, str, null), 1, null);
            ExceptionHandlerKt.launchCatching$default(w.a(this), null, new ChallengeDetailFragment$onViewCreated$3$3(this, str, null), 1, null);
        }
        FragmentChallengeDetailBinding binding5 = getBinding();
        if (binding5 != null && (button2 = binding5.joinButton) != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.challenges.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChallengeDetailFragment.onViewCreated$lambda$4(ChallengeDetailFragment.this, view2);
                }
            });
        }
        FragmentChallengeDetailBinding binding6 = getBinding();
        if (binding6 != null && (button = binding6.leaveButton) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.challenges.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChallengeDetailFragment.onViewCreated$lambda$5(ChallengeDetailFragment.this, view2);
                }
            });
        }
        refresh();
    }

    public final void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public final void setChallengeID(String str) {
        this.challengeID = str;
    }

    public final void setChallengeRepository(ChallengeRepository challengeRepository) {
        q.i(challengeRepository, "<set-?>");
        this.challengeRepository = challengeRepository;
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentChallengeDetailBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentChallengeDetailBinding inflate = FragmentChallengeDetailBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentChallengeDetailBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentChallengeDetailBinding fragmentChallengeDetailBinding) {
        this.binding = fragmentChallengeDetailBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set(Member member) {
        AvatarView avatarView;
        if (member == null) {
            return;
        }
        FragmentChallengeDetailBinding binding = getBinding();
        if (binding != null && (avatarView = binding.creatorAvatarview) != null) {
            AvatarView.setAvatar$default(avatarView, member, null, 2, null);
        }
        FragmentChallengeDetailBinding binding2 = getBinding();
        UsernameLabel usernameLabel = binding2 != null ? binding2.creatorLabel : null;
        if (usernameLabel != null) {
            ContributorInfo contributor = member.getContributor();
            usernameLabel.setTier(contributor != null ? contributor.getLevel() : 0);
        }
        FragmentChallengeDetailBinding binding3 = getBinding();
        UsernameLabel usernameLabel2 = binding3 != null ? binding3.creatorLabel : null;
        if (usernameLabel2 != null) {
            usernameLabel2.setUsername(member.getDisplayName());
        }
        this.isCreator = q.d(member.getId(), getUserViewModel().getUserID());
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.invalidateOptionsMenu();
        }
    }
}
