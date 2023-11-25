package com.habitrpg.android.habitica.ui.fragments.social.guilds;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p0;
import androidx.lifecycle.p;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.FragmentViewpagerBinding;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.ui.activities.GroupFormActivity;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.fragments.social.ChatFragment;
import com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.GroupViewType;
import dc.j;
import java.util.List;
import qc.g0;
import qc.q;

/* compiled from: GuildFragment.kt */
/* loaded from: classes4.dex */
public final class GuildFragment extends Hilt_GuildFragment<FragmentViewpagerBinding> {
    public static final int $stable = 8;
    private FragmentViewpagerBinding binding;
    private ChatFragment chatFragment;
    private final androidx.activity.result.b<Intent> groupFormResult;
    private GuildDetailFragment guildInformationFragment;
    private final dc.f viewModel$delegate;

    public GuildFragment() {
        dc.f a10;
        a10 = dc.h.a(j.NONE, new GuildFragment$special$$inlined$viewModels$default$2(new GuildFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = p0.b(this, g0.b(GroupViewModel.class), new GuildFragment$special$$inlined$viewModels$default$3(a10), new GuildFragment$special$$inlined$viewModels$default$4(null, a10), new GuildFragment$special$$inlined$viewModels$default$5(this, a10));
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new f.d(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.fragments.social.guilds.f
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                GuildFragment.groupFormResult$lambda$6(GuildFragment.this, (ActivityResult) obj);
            }
        });
        q.h(registerForActivityResult, "registerForActivityResult(...)");
        this.groupFormResult = registerForActivityResult;
    }

    private final void displayEditForm() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        Bundle bundle = new Bundle();
        Group f10 = getViewModel$Habitica_2311256681_prodRelease().getGroupData().f();
        String str5 = null;
        if (f10 != null) {
            str = f10.getId();
        } else {
            str = null;
        }
        bundle.putString("groupID", str);
        if (f10 != null) {
            str2 = f10.getName();
        } else {
            str2 = null;
        }
        bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
        if (f10 != null) {
            str3 = f10.getDescription();
        } else {
            str3 = null;
        }
        bundle.putString("description", str3);
        if (f10 != null) {
            str4 = f10.getPrivacy();
        } else {
            str4 = null;
        }
        bundle.putString("privacy", str4);
        if (f10 != null) {
            str5 = f10.getLeaderID();
        }
        bundle.putString("leader", str5);
        if (f10 != null) {
            z10 = f10.getLeaderOnlyChallenges();
        } else {
            z10 = true;
        }
        bundle.putBoolean("leaderOnlyChallenges", z10);
        Intent intent = new Intent(getMainActivity(), GroupFormActivity.class);
        intent.putExtras(bundle);
        intent.setFlags(131072);
        this.groupFormResult.a(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void groupFormResult$lambda$6(GuildFragment guildFragment, ActivityResult activityResult) {
        Bundle bundle;
        q.i(guildFragment, "this$0");
        if (activityResult.b() == -1) {
            Intent a10 = activityResult.a();
            if (a10 != null) {
                bundle = a10.getExtras();
            } else {
                bundle = null;
            }
            guildFragment.getViewModel$Habitica_2311256681_prodRelease().updateGroup(bundle);
        }
    }

    private final void setFragments() {
        List<Fragment> y02 = getChildFragmentManager().y0();
        q.h(y02, "getFragments(...)");
        for (Fragment fragment : y02) {
            if (fragment instanceof ChatFragment) {
                this.chatFragment = (ChatFragment) fragment;
            }
            if (fragment instanceof GuildDetailFragment) {
                this.guildInformationFragment = (GuildDetailFragment) fragment;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setGroup(Group group) {
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.invalidateOptionsMenu();
        }
        if (getViewModel$Habitica_2311256681_prodRelease().isPublicGuild()) {
            ChatFragment chatFragment = this.chatFragment;
            if (chatFragment != null) {
                chatFragment.setAutocompleteContext("publicGuild");
                return;
            }
            return;
        }
        ChatFragment chatFragment2 = this.chatFragment;
        if (chatFragment2 != null) {
            chatFragment2.setAutocompleteContext("privateGuild");
        }
    }

    private final void setViewPagerAdapter() {
        ViewPager2 viewPager2;
        FragmentViewpagerBinding binding;
        ViewPager2 viewPager22;
        ViewPager2 viewPager23;
        final FragmentManager childFragmentManager = getChildFragmentManager();
        q.h(childFragmentManager, "getChildFragmentManager(...)");
        FragmentViewpagerBinding binding2 = getBinding();
        if (binding2 != null) {
            viewPager2 = binding2.viewPager;
        } else {
            viewPager2 = null;
        }
        if (viewPager2 != null) {
            final p lifecycle = getLifecycle();
            viewPager2.setAdapter(new FragmentStateAdapter(childFragmentManager, lifecycle) { // from class: com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildFragment$setViewPagerAdapter$1
                @Override // androidx.viewpager2.adapter.FragmentStateAdapter
                public Fragment createFragment(int i10) {
                    Fragment fragment;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            fragment = new Fragment();
                        } else {
                            this.chatFragment = new ChatFragment();
                            fragment = this.chatFragment;
                        }
                    } else {
                        this.guildInformationFragment = GuildDetailFragment.Companion.newInstance();
                        fragment = this.guildInformationFragment;
                    }
                    if (fragment == null) {
                        return new Fragment();
                    }
                    return fragment;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.h
                public int getItemCount() {
                    return 2;
                }
            });
        }
        FragmentViewpagerBinding binding3 = getBinding();
        if (binding3 != null && (viewPager23 = binding3.viewPager) != null) {
            viewPager23.g(new ViewPager2.i() { // from class: com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildFragment$setViewPagerAdapter$2
                /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
                
                    r1 = r0.this$0.chatFragment;
                 */
                @Override // androidx.viewpager2.widget.ViewPager2.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onPageScrolled(int r1, float r2, int r3) {
                    /*
                        r0 = this;
                        r2 = 1
                        if (r1 != r2) goto Le
                        com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildFragment r1 = com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildFragment.this
                        com.habitrpg.android.habitica.ui.fragments.social.ChatFragment r1 = com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildFragment.access$getChatFragment$p(r1)
                        if (r1 == 0) goto Le
                        r1.setNavigatedToFragment()
                    Le:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildFragment$setViewPagerAdapter$2.onPageScrolled(int, float, int):void");
                }

                /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
                
                    r2 = r1.this$0.chatFragment;
                 */
                @Override // androidx.viewpager2.widget.ViewPager2.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onPageSelected(int r2) {
                    /*
                        r1 = this;
                        r0 = 1
                        if (r2 != r0) goto Le
                        com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildFragment r2 = com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildFragment.this
                        com.habitrpg.android.habitica.ui.fragments.social.ChatFragment r2 = com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildFragment.access$getChatFragment$p(r2)
                        if (r2 == 0) goto Le
                        r2.setNavigatedToFragment()
                    Le:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildFragment$setViewPagerAdapter$2.onPageSelected(int):void");
                }
            });
        }
        TabLayout tabLayout = getTabLayout();
        if (tabLayout != null && (binding = getBinding()) != null && (viewPager22 = binding.viewPager) != null) {
            new com.google.android.material.tabs.e(tabLayout, viewPager22, new e.b() { // from class: com.habitrpg.android.habitica.ui.fragments.social.guilds.g
                @Override // com.google.android.material.tabs.e.b
                public final void a(TabLayout.g gVar, int i10) {
                    GuildFragment.setViewPagerAdapter$lambda$5$lambda$4$lambda$3(GuildFragment.this, gVar, i10);
                }
            }).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setViewPagerAdapter$lambda$5$lambda$4$lambda$3(GuildFragment guildFragment, TabLayout.g gVar, int i10) {
        String str;
        q.i(guildFragment, "this$0");
        q.i(gVar, "tab");
        String str2 = null;
        if (i10 != 0) {
            if (i10 != 1) {
                str = "";
                gVar.s(str);
            }
            Context context = guildFragment.getContext();
            if (context != null) {
                str2 = context.getString(R.string.chat);
            }
        } else {
            Context context2 = guildFragment.getContext();
            if (context2 != null) {
                str2 = context2.getString(R.string.guild);
            }
        }
        str = str2;
        gVar.s(str);
    }

    public final GroupViewModel getViewModel$Habitica_2311256681_prodRelease() {
        return (GroupViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        MenuInflater menuInflater2;
        MenuInflater menuInflater3;
        MenuInflater menuInflater4;
        q.i(menu, "menu");
        q.i(menuInflater, "inflater");
        if (getMainActivity() != null) {
            if (getViewModel$Habitica_2311256681_prodRelease().isMember()) {
                if (getViewModel$Habitica_2311256681_prodRelease().isLeader()) {
                    MainActivity mainActivity = getMainActivity();
                    if (mainActivity != null && (menuInflater4 = mainActivity.getMenuInflater()) != null) {
                        menuInflater4.inflate(R.menu.guild_admin, menu);
                    }
                } else {
                    MainActivity mainActivity2 = getMainActivity();
                    if (mainActivity2 != null && (menuInflater3 = mainActivity2.getMenuInflater()) != null) {
                        menuInflater3.inflate(R.menu.guild_member, menu);
                    }
                }
            } else {
                MainActivity mainActivity3 = getMainActivity();
                if (mainActivity3 != null && (menuInflater2 = mainActivity3.getMenuInflater()) != null) {
                    menuInflater2.inflate(R.menu.guild_nonmember, menu);
                }
            }
        }
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setUsesTabLayout(true);
        setHidesToolbar(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        q.i(menuItem, "item");
        switch (menuItem.getItemId()) {
            case R.id.menu_guild_edit /* 2131297048 */:
                displayEditForm();
                return true;
            case R.id.menu_guild_join /* 2131297049 */:
                GroupViewModel.joinGroup$default(getViewModel$Habitica_2311256681_prodRelease(), null, null, 3, null);
                return true;
            case R.id.menu_guild_leave /* 2131297050 */:
                GuildDetailFragment guildDetailFragment = this.guildInformationFragment;
                if (guildDetailFragment != null) {
                    guildDetailFragment.leaveGuild$Habitica_2311256681_prodRelease();
                }
                return true;
            case R.id.menuHeaderView /* 2131297051 */:
            case R.id.menu_create_item /* 2131297052 */:
            default:
                return super.onOptionsItemSelected(menuItem);
            case R.id.menu_guild_refresh /* 2131297053 */:
                getViewModel$Habitica_2311256681_prodRelease().retrieveGroupChat(GuildFragment$onOptionsItemSelected$1.INSTANCE);
                getViewModel$Habitica_2311256681_prodRelease().retrieveGroup(GuildFragment$onOptionsItemSelected$2.INSTANCE);
                return true;
        }
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        ViewPager2 viewPager2;
        super.onResume();
        Bundle arguments = getArguments();
        if (arguments != null) {
            GuildFragmentArgs fromBundle = GuildFragmentArgs.fromBundle(arguments);
            q.h(fromBundle, "fromBundle(...)");
            FragmentViewpagerBinding binding = getBinding();
            if (binding != null && (viewPager2 = binding.viewPager) != null) {
                viewPager2.j(fromBundle.getTabToOpen(), false);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Context context;
        q.i(view, "view");
        setShowsBackButton(true);
        super.onViewCreated(view, bundle);
        getViewModel$Habitica_2311256681_prodRelease().setGroupViewType(GroupViewType.GUILD);
        getViewModel$Habitica_2311256681_prodRelease().getGroupData().j(getViewLifecycleOwner(), new GuildFragment$sam$androidx_lifecycle_Observer$0(new GuildFragment$onViewCreated$1(this)));
        getViewModel$Habitica_2311256681_prodRelease().getIsMemberData().j(getViewLifecycleOwner(), new GuildFragment$sam$androidx_lifecycle_Observer$0(new GuildFragment$onViewCreated$2(this)));
        Bundle arguments = getArguments();
        if (arguments != null) {
            GuildFragmentArgs fromBundle = GuildFragmentArgs.fromBundle(arguments);
            q.h(fromBundle, "fromBundle(...)");
            GroupViewModel viewModel$Habitica_2311256681_prodRelease = getViewModel$Habitica_2311256681_prodRelease();
            String groupID = fromBundle.getGroupID();
            q.h(groupID, "getGroupID(...)");
            viewModel$Habitica_2311256681_prodRelease.setGroupID(groupID);
        }
        setViewPagerAdapter();
        setFragments();
        if (q.d(getViewModel$Habitica_2311256681_prodRelease().getGroupID(), "f2db2a7f-13c5-454d-b3ee-ea1f5089e601") && (context = getContext()) != null) {
            FirebaseAnalytics.getInstance(context).a("opened_no_party_guild", null);
        }
        getViewModel$Habitica_2311256681_prodRelease().retrieveGroup(GuildFragment$onViewCreated$5.INSTANCE);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentViewpagerBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentViewpagerBinding inflate = FragmentViewpagerBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentViewpagerBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentViewpagerBinding fragmentViewpagerBinding) {
        this.binding = fragmentViewpagerBinding;
    }
}
