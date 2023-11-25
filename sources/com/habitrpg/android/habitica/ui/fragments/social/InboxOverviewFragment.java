package com.habitrpg.android.habitica.ui.fragments.social;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.DialogChooseMessageRecipientBinding;
import com.habitrpg.android.habitica.databinding.FragmentInboxBinding;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.fragments.social.InboxOverviewFragmentDirections;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import pc.p;
import qc.q;

/* compiled from: InboxOverviewFragment.kt */
/* loaded from: classes4.dex */
public final class InboxOverviewFragment extends Hilt_InboxOverviewFragment<FragmentInboxBinding> implements SwipeRefreshLayout.j, View.OnClickListener {
    public static final int $stable = 8;
    private FragmentInboxBinding binding;
    public AppConfigManager configManager;
    public SocialRepository socialRepository;
    public MainUserViewModel userViewModel;

    private final void loadMessages() {
        ad.i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new InboxOverviewFragment$loadMessages$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openInboxMessages(String str, String str2) {
        MainNavigationController mainNavigationController = MainNavigationController.INSTANCE;
        InboxOverviewFragmentDirections.OpenInboxDetail openInboxDetail = InboxOverviewFragmentDirections.openInboxDetail(str, str2);
        q.h(openInboxDetail, "openInboxDetail(...)");
        mainNavigationController.navigate(openInboxDetail);
    }

    private final void openNewMessageDialog() {
        DialogChooseMessageRecipientBinding inflate = DialogChooseMessageRecipientBinding.inflate(getLayoutInflater());
        q.h(inflate, "inflate(...)");
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(mainActivity);
            habiticaAlertDialog.setTitle(getString(R.string.choose_recipient_title));
            String string = getString(R.string.action_continue);
            q.h(string, "getString(...)");
            habiticaAlertDialog.addButton(string, true, false, false, (p<? super HabiticaAlertDialog, ? super Integer, dc.w>) new InboxOverviewFragment$openNewMessageDialog$1$1(inflate, this, habiticaAlertDialog));
            String string2 = getString(R.string.action_cancel);
            q.h(string2, "getString(...)");
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, string2, false, false, false, (p) new InboxOverviewFragment$openNewMessageDialog$1$2(mainActivity), 12, (Object) null);
            habiticaAlertDialog.setAdditionalContentView(inflate.getRoot());
            inflate.uuidEditText.requestFocus();
            habiticaAlertDialog.show();
        }
    }

    private final void retrieveMessages() {
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new InboxOverviewFragment$retrieveMessages$1(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setInboxMessages(java.util.List<? extends com.habitrpg.android.habitica.models.social.InboxConversation> r11) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.InboxOverviewFragment.setInboxMessages(java.util.List):void");
    }

    public final AppConfigManager getConfigManager() {
        AppConfigManager appConfigManager = this.configManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        q.z("configManager");
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        UsernameLabel usernameLabel;
        String str;
        q.i(view, "v");
        View findViewById = view.findViewById(R.id.display_name_textview);
        if (findViewById instanceof UsernameLabel) {
            usernameLabel = (UsernameLabel) findViewById;
        } else {
            usernameLabel = null;
        }
        if (usernameLabel == null || (str = usernameLabel.getUsername()) == null) {
            str = "";
        }
        openInboxMessages(view.getTag().toString(), str);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        MenuInflater menuInflater2;
        q.i(menu, "menu");
        q.i(menuInflater, "inflater");
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null && (menuInflater2 = mainActivity.getMenuInflater()) != null) {
            menuInflater2.inflate(R.menu.inbox, menu);
        }
        tintMenuIcon(menu.findItem(R.id.send_message));
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setHidesToolbar(true);
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new InboxOverviewFragment$onCreateView$1(this, null), 1, null);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getSocialRepository().close();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        q.i(menuItem, "item");
        if (menuItem.getItemId() == R.id.send_message) {
            openNewMessageDialog();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        SwipeRefreshLayout swipeRefreshLayout;
        FragmentInboxBinding binding = getBinding();
        if (binding != null) {
            swipeRefreshLayout = binding.inboxRefreshLayout;
        } else {
            swipeRefreshLayout = null;
        }
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
        retrieveMessages();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        SwipeRefreshLayout swipeRefreshLayout;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        FragmentInboxBinding binding = getBinding();
        if (binding != null && (swipeRefreshLayout = binding.inboxRefreshLayout) != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        getUserViewModel().getUser().j(getViewLifecycleOwner(), new InboxOverviewFragment$sam$androidx_lifecycle_Observer$0(new InboxOverviewFragment$onViewCreated$1(this)));
        loadMessages();
        retrieveMessages();
    }

    public final void setConfigManager(AppConfigManager appConfigManager) {
        q.i(appConfigManager, "<set-?>");
        this.configManager = appConfigManager;
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
    public FragmentInboxBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentInboxBinding inflate = FragmentInboxBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentInboxBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentInboxBinding fragmentInboxBinding) {
        this.binding = fragmentInboxBinding;
    }
}
