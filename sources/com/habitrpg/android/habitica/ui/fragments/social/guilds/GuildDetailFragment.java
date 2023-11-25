package com.habitrpg.android.habitica.ui.fragments.social.guilds;

import ad.a1;
import ad.i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.p0;
import androidx.lifecycle.w;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.MainNavDirections;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.FragmentGuildDetailBinding;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.SnackbarActivity;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import com.habitrpg.common.habitica.helpers.MarkdownParserKt;
import com.habitrpg.common.habitica.views.AvatarView;
import dc.j;
import java.util.ArrayList;
import java.util.List;
import qc.g0;
import qc.q;

/* compiled from: GuildDetailFragment.kt */
/* loaded from: classes4.dex */
public final class GuildDetailFragment extends Hilt_GuildDetailFragment<FragmentGuildDetailBinding> {
    private FragmentGuildDetailBinding binding;
    public ChallengeRepository challengeRepository;
    public AppConfigManager configManager;
    private final androidx.activity.result.b<Intent> sendInvitesResult;
    public UserRepository userRepository;
    private final dc.f viewModel$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GuildDetailFragment.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        public final GuildDetailFragment newInstance() {
            Bundle bundle = new Bundle();
            GuildDetailFragment guildDetailFragment = new GuildDetailFragment();
            guildDetailFragment.setArguments(bundle);
            return guildDetailFragment;
        }
    }

    public GuildDetailFragment() {
        dc.f a10;
        a10 = dc.h.a(j.NONE, new GuildDetailFragment$special$$inlined$viewModels$default$1(new GuildDetailFragment$viewModel$2(this)));
        this.viewModel$delegate = p0.b(this, g0.b(GroupViewModel.class), new GuildDetailFragment$special$$inlined$viewModels$default$2(a10), new GuildDetailFragment$special$$inlined$viewModels$default$3(null, a10), new GuildDetailFragment$special$$inlined$viewModels$default$4(this, a10));
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new f.d(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.fragments.social.guilds.e
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                GuildDetailFragment.sendInvitesResult$lambda$7(GuildDetailFragment.this, (ActivityResult) obj);
            }
        });
        q.h(registerForActivityResult, "registerForActivityResult(...)");
        this.sendInvitesResult = registerForActivityResult;
    }

    private final List<Challenge> getGroupChallenges() {
        ArrayList arrayList = new ArrayList();
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new GuildDetailFragment$getGroupChallenges$1(this, arrayList, null), 1, null);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(GuildDetailFragment guildDetailFragment) {
        q.i(guildDetailFragment, "this$0");
        guildDetailFragment.refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(GuildDetailFragment guildDetailFragment, View view) {
        q.i(guildDetailFragment, "this$0");
        guildDetailFragment.leaveGuild$Habitica_2311256681_prodRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(GuildDetailFragment guildDetailFragment, View view) {
        q.i(guildDetailFragment, "this$0");
        GroupViewModel.joinGroup$default(guildDetailFragment.getViewModel(), null, new GuildDetailFragment$onViewCreated$6$1(guildDetailFragment), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(GuildDetailFragment guildDetailFragment, View view) {
        q.i(guildDetailFragment, "this$0");
        String leaderID = guildDetailFragment.getViewModel().getLeaderID();
        if (leaderID != null) {
            MainNavDirections.OpenProfileActivity openProfileActivity = MainNavDirections.openProfileActivity(leaderID);
            q.h(openProfileActivity, "openProfileActivity(...)");
            MainNavigationController.INSTANCE.navigate(openProfileActivity);
        }
    }

    private final void refresh() {
        getViewModel().retrieveGroup(new GuildDetailFragment$refresh$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void sendInvitesResult$lambda$7(com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildDetailFragment r13, androidx.activity.result.ActivityResult r14) {
        /*
            java.lang.String r0 = "this$0"
            qc.q.i(r13, r0)
            int r0 = r14.b()
            r1 = -1
            if (r0 != r1) goto Lb2
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel r1 = r13.getViewModel()
            androidx.lifecycle.LiveData r1 = r1.getUser()
            java.lang.Object r1 = r1.f()
            com.habitrpg.android.habitica.models.user.User r1 = (com.habitrpg.android.habitica.models.user.User) r1
            java.lang.String r2 = ""
            if (r1 == 0) goto L2f
            com.habitrpg.android.habitica.models.user.Profile r1 = r1.getProfile()
            if (r1 == 0) goto L2f
            java.lang.String r1 = r1.getName()
            if (r1 != 0) goto L30
        L2f:
            r1 = r2
        L30:
            java.lang.String r3 = "inviter"
            r0.put(r3, r1)
            android.content.Intent r1 = r14.a()
            java.lang.String r3 = "emails"
            r4 = 0
            if (r1 == 0) goto L43
            java.lang.String[] r1 = r1.getStringArrayExtra(r3)
            goto L44
        L43:
            r1 = r4
        L44:
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L53
            int r7 = r1.length
            if (r7 != 0) goto L4d
            r7 = 1
            goto L4e
        L4d:
            r7 = 0
        L4e:
            if (r7 == 0) goto L51
            goto L53
        L51:
            r7 = 0
            goto L54
        L53:
            r7 = 1
        L54:
            if (r7 != 0) goto L7c
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r8 = r1.length
            r9 = 0
        L5d:
            if (r9 >= r8) goto L79
            r10 = r1[r9]
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.lang.String r12 = "name"
            r11.put(r12, r2)
            qc.q.f(r10)
            java.lang.String r12 = "email"
            r11.put(r12, r10)
            r7.add(r11)
            int r9 = r9 + 1
            goto L5d
        L79:
            r0.put(r3, r7)
        L7c:
            android.content.Intent r14 = r14.a()
            if (r14 == 0) goto L88
            java.lang.String r1 = "userIDs"
            java.lang.String[] r4 = r14.getStringArrayExtra(r1)
        L88:
            if (r4 == 0) goto L94
            int r14 = r4.length
            if (r14 != 0) goto L8f
            r14 = 1
            goto L90
        L8f:
            r14 = 0
        L90:
            if (r14 == 0) goto L93
            goto L94
        L93:
            r6 = 0
        L94:
            if (r6 != 0) goto Lab
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r1 = r4.length
        L9c:
            if (r5 >= r1) goto La6
            r2 = r4[r5]
            r14.add(r2)
            int r5 = r5 + 1
            goto L9c
        La6:
            java.lang.String r1 = "usernames"
            r0.put(r1, r14)
        Lab:
            com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel r13 = r13.getViewModel()
            r13.inviteToGroup(r0)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildDetailFragment.sendInvitesResult$lambda$7(com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildDetailFragment, androidx.activity.result.ActivityResult):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLeader(Member member) {
        UsernameLabel usernameLabel;
        UsernameLabel usernameLabel2;
        int i10;
        AvatarView avatarView;
        if (member == null) {
            return;
        }
        FragmentGuildDetailBinding binding = getBinding();
        TextView textView = null;
        if (binding != null && (avatarView = binding.leaderAvatarView) != null) {
            AvatarView.setAvatar$default(avatarView, member, null, 2, null);
        }
        FragmentGuildDetailBinding binding2 = getBinding();
        if (binding2 != null) {
            usernameLabel = binding2.leaderProfileName;
        } else {
            usernameLabel = null;
        }
        if (usernameLabel != null) {
            usernameLabel.setUsername(member.getDisplayName());
        }
        FragmentGuildDetailBinding binding3 = getBinding();
        if (binding3 != null) {
            usernameLabel2 = binding3.leaderProfileName;
        } else {
            usernameLabel2 = null;
        }
        if (usernameLabel2 != null) {
            ContributorInfo contributor = member.getContributor();
            if (contributor != null) {
                i10 = contributor.getLevel();
            } else {
                i10 = 0;
            }
            usernameLabel2.setTier(i10);
        }
        FragmentGuildDetailBinding binding4 = getBinding();
        if (binding4 != null) {
            textView = binding4.leaderUsername;
        }
        if (textView != null) {
            textView.setText(member.getFormattedUsername());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLeaveSnackbar() {
        MainActivity mainActivity;
        androidx.fragment.app.q activity = getActivity();
        if (activity instanceof MainActivity) {
            mainActivity = (MainActivity) activity;
        } else {
            mainActivity = null;
        }
        MainActivity mainActivity2 = mainActivity;
        if (mainActivity2 != null) {
            SnackbarActivity.DefaultImpls.showSnackbar$default(mainActivity2, null, getString(R.string.left_guild), null, null, null, null, null, null, false, 509, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateGuild(Group group) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        String str;
        Integer num;
        Integer num2;
        ImageView imageView;
        int i10;
        String str2;
        FragmentGuildDetailBinding binding = getBinding();
        String str3 = null;
        if (binding != null) {
            textView = binding.titleView;
        } else {
            textView = null;
        }
        if (textView != null) {
            if (group != null) {
                str2 = group.getName();
            } else {
                str2 = null;
            }
            textView.setText(str2);
        }
        FragmentGuildDetailBinding binding2 = getBinding();
        if (binding2 != null && (imageView = binding2.guildMembersIcon) != null) {
            if (group != null) {
                i10 = group.getMemberCount();
            } else {
                i10 = 0;
            }
            imageView.setImageBitmap(HabiticaIconsHelper.imageOfGuildCrestMedium(i10));
        }
        FragmentGuildDetailBinding binding3 = getBinding();
        if (binding3 != null) {
            textView2 = binding3.guildMembersText;
        } else {
            textView2 = null;
        }
        if (textView2 != null) {
            if (group != null) {
                num2 = Integer.valueOf(group.getMemberCount());
            } else {
                num2 = null;
            }
            textView2.setText(String.valueOf(num2));
        }
        FragmentGuildDetailBinding binding4 = getBinding();
        if (binding4 != null) {
            textView3 = binding4.guildBankText;
        } else {
            textView3 = null;
        }
        if (textView3 != null) {
            if (group != null) {
                num = Integer.valueOf(group.getGemCount());
            } else {
                num = null;
            }
            textView3.setText(String.valueOf(num));
        }
        FragmentGuildDetailBinding binding5 = getBinding();
        if (binding5 != null && (textView5 = binding5.guildSummary) != null) {
            if (group != null) {
                str = group.getSummary();
            } else {
                str = null;
            }
            MarkdownParserKt.setMarkdown(textView5, str);
        }
        FragmentGuildDetailBinding binding6 = getBinding();
        if (binding6 != null && (textView4 = binding6.guildDescription) != null) {
            if (group != null) {
                str3 = group.getDescription();
            }
            MarkdownParserKt.setMarkdown(textView4, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMembership(Boolean bool) {
        Button button;
        int i10;
        FragmentGuildDetailBinding binding = getBinding();
        Button button2 = null;
        if (binding != null) {
            button = binding.joinButton;
        } else {
            button = null;
        }
        int i11 = 8;
        if (button != null) {
            if (q.d(bool, Boolean.TRUE)) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            button.setVisibility(i10);
        }
        FragmentGuildDetailBinding binding2 = getBinding();
        if (binding2 != null) {
            button2 = binding2.leaveButton;
        }
        if (button2 != null) {
            if (q.d(bool, Boolean.TRUE)) {
                i11 = 0;
            }
            button2.setVisibility(i11);
        }
    }

    public final ChallengeRepository getChallengeRepository() {
        ChallengeRepository challengeRepository = this.challengeRepository;
        if (challengeRepository != null) {
            return challengeRepository;
        }
        q.z("challengeRepository");
        return null;
    }

    public final AppConfigManager getConfigManager() {
        AppConfigManager appConfigManager = this.configManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        q.z("configManager");
        return null;
    }

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        q.z("userRepository");
        return null;
    }

    public final GroupViewModel getViewModel() {
        return (GroupViewModel) this.viewModel$delegate.getValue();
    }

    public final void leaveGuild$Habitica_2311256681_prodRelease() {
        Context context = getContext();
        if (context != null) {
            i.d(w.a(this), a1.c(), null, new GuildDetailFragment$leaveGuild$1(getGroupChallenges(), context, this, null), 2, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        LinearLayout linearLayout;
        Button button;
        Button button2;
        ImageView imageView;
        SwipeRefreshLayout swipeRefreshLayout;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        FragmentGuildDetailBinding binding = getBinding();
        if (binding != null && (swipeRefreshLayout = binding.refreshLayout) != null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: com.habitrpg.android.habitica.ui.fragments.social.guilds.a
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
                public final void onRefresh() {
                    GuildDetailFragment.onViewCreated$lambda$0(GuildDetailFragment.this);
                }
            });
        }
        getViewModel().getGroupData().j(getViewLifecycleOwner(), new GuildDetailFragment$sam$androidx_lifecycle_Observer$0(new GuildDetailFragment$onViewCreated$2(this)));
        getViewModel().getLeaderData().j(getViewLifecycleOwner(), new GuildDetailFragment$sam$androidx_lifecycle_Observer$0(new GuildDetailFragment$onViewCreated$3(this)));
        getViewModel().getIsMemberData().j(getViewLifecycleOwner(), new GuildDetailFragment$sam$androidx_lifecycle_Observer$0(new GuildDetailFragment$onViewCreated$4(this)));
        FragmentGuildDetailBinding binding2 = getBinding();
        TextView textView2 = null;
        if (binding2 != null) {
            textView = binding2.guildDescription;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        FragmentGuildDetailBinding binding3 = getBinding();
        if (binding3 != null) {
            textView2 = binding3.guildSummary;
        }
        if (textView2 != null) {
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        FragmentGuildDetailBinding binding4 = getBinding();
        if (binding4 != null && (imageView = binding4.guildBankIcon) != null) {
            imageView.setImageBitmap(HabiticaIconsHelper.imageOfGem());
        }
        FragmentGuildDetailBinding binding5 = getBinding();
        if (binding5 != null && (button2 = binding5.leaveButton) != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.guilds.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    GuildDetailFragment.onViewCreated$lambda$1(GuildDetailFragment.this, view2);
                }
            });
        }
        FragmentGuildDetailBinding binding6 = getBinding();
        if (binding6 != null && (button = binding6.joinButton) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.guilds.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    GuildDetailFragment.onViewCreated$lambda$2(GuildDetailFragment.this, view2);
                }
            });
        }
        FragmentGuildDetailBinding binding7 = getBinding();
        if (binding7 != null && (linearLayout = binding7.leaderWrapper) != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.guilds.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    GuildDetailFragment.onViewCreated$lambda$4(GuildDetailFragment.this, view2);
                }
            });
        }
    }

    public final void setChallengeRepository(ChallengeRepository challengeRepository) {
        q.i(challengeRepository, "<set-?>");
        this.challengeRepository = challengeRepository;
    }

    public final void setConfigManager(AppConfigManager appConfigManager) {
        q.i(appConfigManager, "<set-?>");
        this.configManager = appConfigManager;
    }

    public final void setUserRepository(UserRepository userRepository) {
        q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentGuildDetailBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentGuildDetailBinding inflate = FragmentGuildDetailBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentGuildDetailBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentGuildDetailBinding fragmentGuildDetailBinding) {
        this.binding = fragmentGuildDetailBinding;
    }
}
