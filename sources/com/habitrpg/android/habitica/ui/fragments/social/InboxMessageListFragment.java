package com.habitrpg.android.habitica.ui.fragments.social;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p0;
import androidx.fragment.app.q;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.FragmentInboxMessageListBinding;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.ui.activities.FullProfileActivity;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.adapter.social.InboxAdapter;
import com.habitrpg.android.habitica.ui.fragments.ReportBottomSheetFragment;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.android.habitica.ui.helpers.SafeDefaultItemAnimator;
import com.habitrpg.android.habitica.ui.viewmodels.InboxViewModel;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.android.habitica.ui.views.social.ChatBarView;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import java.util.List;
import pc.p;
import qc.g0;
import yc.v;

/* compiled from: InboxMessageListFragment.kt */
/* loaded from: classes4.dex */
public final class InboxMessageListFragment extends Hilt_InboxMessageListFragment<FragmentInboxMessageListBinding> {
    public static final int $stable = 8;
    private FragmentInboxMessageListBinding binding;
    private InboxAdapter chatAdapter;
    public AppConfigManager configManager;
    public SocialRepository socialRepository;
    private final dc.f viewModel$delegate;

    public InboxMessageListFragment() {
        dc.f a10;
        a10 = dc.h.a(dc.j.NONE, new InboxMessageListFragment$special$$inlined$viewModels$default$2(new InboxMessageListFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = p0.b(this, g0.b(InboxViewModel.class), new InboxMessageListFragment$special$$inlined$viewModels$default$3(a10), new InboxMessageListFragment$special$$inlined$viewModels$default$4(null, a10), new InboxMessageListFragment$special$$inlined$viewModels$default$5(this, a10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copyMessageToClipboard(ChatMessage chatMessage) {
        Object obj;
        ClipboardManager clipboardManager;
        q activity = getActivity();
        MainActivity mainActivity = null;
        if (activity != null) {
            obj = activity.getSystemService("clipboard");
        } else {
            obj = null;
        }
        if (obj instanceof ClipboardManager) {
            clipboardManager = (ClipboardManager) obj;
        } else {
            clipboardManager = null;
        }
        ClipData newPlainText = ClipData.newPlainText("Chat message", chatMessage.getText());
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(newPlainText);
        }
        q activity2 = getActivity();
        if (activity2 instanceof MainActivity) {
            mainActivity = (MainActivity) activity2;
        }
        if (mainActivity != null && Build.VERSION.SDK_INT <= 32) {
            HabiticaSnackbar.Companion.showSnackbar(mainActivity.getSnackbarContainer(), getString(R.string.chat_message_copied), HabiticaSnackbar.SnackbarDisplayType.NORMAL, (r16 & 8) != 0 ? false : false, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? 0 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InboxViewModel getViewModel() {
        return (InboxViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markMessagesAsRead(List<? extends ChatMessage> list) {
        getSocialRepository().markSomePrivateMessagesAsRead(getViewModel().getUser().f(), list);
    }

    private final void openProfile() {
        String recipientID = getViewModel().getRecipientID();
        if (recipientID != null) {
            FullProfileActivity.Companion.open(recipientID);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshConversation() {
        boolean u10;
        String memberID = getViewModel().getMemberID();
        boolean z10 = false;
        if (memberID != null) {
            u10 = v.u(memberID);
            if ((!u10) == true) {
                z10 = true;
            }
        }
        if (z10) {
            ad.i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new InboxMessageListFragment$refreshConversation$1(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMessage(String str) {
        String memberID = getViewModel().getMemberID();
        if (memberID != null) {
            ad.i.d(w.a(this), ExceptionHandler.Companion.coroutine(new InboxMessageListFragment$sendMessage$1$1(this, str)), null, new InboxMessageListFragment$sendMessage$1$2(this, memberID, str, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDeleteConfirmationDialog(ChatMessage chatMessage) {
        Context context = getContext();
        if (context != null) {
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
            habiticaAlertDialog.setTitle(R.string.confirm_delete_tag_title);
            habiticaAlertDialog.setMessage(R.string.confirm_delete_tag_message);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.yes, true, true, false, (p) new InboxMessageListFragment$showDeleteConfirmationDialog$1(this, chatMessage), 8, (Object) null);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.no, false, false, false, (p) null, 28, (Object) null);
            habiticaAlertDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFlagMessageBottomSheet(ChatMessage chatMessage) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ReportBottomSheetFragment.Companion companion = ReportBottomSheetFragment.Companion;
        String username = chatMessage.getUsername();
        if (username == null) {
            str = "";
        } else {
            str = username;
        }
        String id2 = chatMessage.getId();
        String text = chatMessage.getText();
        if (text == null) {
            str2 = "";
        } else {
            str2 = text;
        }
        String groupId = chatMessage.getGroupId();
        if (groupId == null) {
            str3 = "";
        } else {
            str3 = groupId;
        }
        String userID = chatMessage.getUserID();
        if (userID == null) {
            str4 = "";
        } else {
            str4 = userID;
        }
        String a10 = g0.b(InboxMessageListFragment.class).a();
        if (a10 == null) {
            str5 = "";
        } else {
            str5 = a10;
        }
        ReportBottomSheetFragment.Companion.newInstance$default(companion, ReportBottomSheetFragment.REPORT_TYPE_MESSAGE, str, null, str4, id2, str2, str3, str5, 4, null).show(getChildFragmentManager(), ReportBottomSheetFragment.TAG);
    }

    public final AppConfigManager getConfigManager() {
        AppConfigManager appConfigManager = this.configManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        qc.q.z("configManager");
        return null;
    }

    public final SocialRepository getSocialRepository() {
        SocialRepository socialRepository = this.socialRepository;
        if (socialRepository != null) {
            return socialRepository;
        }
        qc.q.z("socialRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.social.Hilt_InboxMessageListFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        qc.q.i(context, "context");
        View view = getView();
        if (view != null) {
            view.invalidate();
        }
        View view2 = getView();
        if (view2 != null) {
            view2.forceLayout();
        }
        super.onAttach(context);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        MenuInflater menuInflater2;
        qc.q.i(menu, "menu");
        qc.q.i(menuInflater, "inflater");
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null && (menuInflater2 = mainActivity.getMenuInflater()) != null) {
            menuInflater2.inflate(R.menu.inbox_chat, menu);
        }
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qc.q.i(layoutInflater, "inflater");
        setHidesToolbar(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getSocialRepository().close();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        qc.q.i(menuItem, "item");
        if (menuItem.getItemId() == R.id.open_profile) {
            openProfile();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            r3 = this;
            com.habitrpg.android.habitica.ui.viewmodels.InboxViewModel r0 = r3.getViewModel()
            java.lang.String r0 = r0.getRecipientID()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L15
            boolean r0 = yc.m.u(r0)
            r0 = r0 ^ r2
            if (r0 != r2) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 != 0) goto L33
            com.habitrpg.android.habitica.ui.viewmodels.InboxViewModel r0 = r3.getViewModel()
            java.lang.String r0 = r0.getRecipientUsername()
            if (r0 == 0) goto L2a
            boolean r0 = yc.m.u(r0)
            r0 = r0 ^ r2
            if (r0 != r2) goto L2a
            r1 = 1
        L2a:
            if (r1 != 0) goto L33
            androidx.fragment.app.FragmentManager r0 = r3.getParentFragmentManager()
            r0.g1()
        L33:
            super.onResume()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.InboxMessageListFragment.onResume():void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        RecyclerViewEmptySupport recyclerViewEmptySupport2;
        RecyclerViewEmptySupport recyclerViewEmptySupport3;
        ChatBarView chatBarView;
        ChatBarView chatBarView2;
        ChatBarView chatBarView3;
        qc.q.i(view, "view");
        setShowsBackButton(true);
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.K2(true);
        linearLayoutManager.L2(false);
        FragmentInboxMessageListBinding binding = getBinding();
        if (binding != null) {
            recyclerViewEmptySupport = binding.recyclerView;
        } else {
            recyclerViewEmptySupport = null;
        }
        if (recyclerViewEmptySupport != null) {
            recyclerViewEmptySupport.setLayoutManager(linearLayoutManager);
        }
        ad.i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new InboxMessageListFragment$onViewCreated$1(this, null), 2, null);
        InboxAdapter inboxAdapter = new InboxAdapter(getViewModel().getUser().f());
        this.chatAdapter = inboxAdapter;
        inboxAdapter.registerAdapterDataObserver(new RecyclerView.j() { // from class: com.habitrpg.android.habitica.ui.fragments.social.InboxMessageListFragment$onViewCreated$2
            @Override // androidx.recyclerview.widget.RecyclerView.j
            public void onItemRangeInserted(int i10, int i11) {
                FragmentInboxMessageListBinding binding2;
                RecyclerViewEmptySupport recyclerViewEmptySupport4;
                if (i10 == 0 && (binding2 = InboxMessageListFragment.this.getBinding()) != null && (recyclerViewEmptySupport4 = binding2.recyclerView) != null) {
                    recyclerViewEmptySupport4.scrollToPosition(0);
                }
            }
        });
        FragmentInboxMessageListBinding binding2 = getBinding();
        if (binding2 != null) {
            recyclerViewEmptySupport2 = binding2.recyclerView;
        } else {
            recyclerViewEmptySupport2 = null;
        }
        if (recyclerViewEmptySupport2 != null) {
            recyclerViewEmptySupport2.setAdapter(this.chatAdapter);
        }
        FragmentInboxMessageListBinding binding3 = getBinding();
        if (binding3 != null) {
            recyclerViewEmptySupport3 = binding3.recyclerView;
        } else {
            recyclerViewEmptySupport3 = null;
        }
        if (recyclerViewEmptySupport3 != null) {
            recyclerViewEmptySupport3.setItemAnimator(new SafeDefaultItemAnimator());
        }
        InboxAdapter inboxAdapter2 = this.chatAdapter;
        if (inboxAdapter2 != null) {
            inboxAdapter2.setOnOpenProfile(InboxMessageListFragment$onViewCreated$3$1.INSTANCE);
            inboxAdapter2.setOnDeleteMessage(new InboxMessageListFragment$onViewCreated$3$2(this));
            inboxAdapter2.setOnFlagMessage(new InboxMessageListFragment$onViewCreated$3$3(this));
            inboxAdapter2.setOnCopyMessage(new InboxMessageListFragment$onViewCreated$3$4(this));
        }
        getViewModel().getMessages().j(getViewLifecycleOwner(), new InboxMessageListFragment$sam$androidx_lifecycle_Observer$0(new InboxMessageListFragment$onViewCreated$4(this)));
        FragmentInboxMessageListBinding binding4 = getBinding();
        if (binding4 != null) {
            chatBarView = binding4.chatBarView;
        } else {
            chatBarView = null;
        }
        if (chatBarView != null) {
            chatBarView.setSendAction(new InboxMessageListFragment$onViewCreated$5(this));
        }
        FragmentInboxMessageListBinding binding5 = getBinding();
        if (binding5 != null) {
            chatBarView2 = binding5.chatBarView;
        } else {
            chatBarView2 = null;
        }
        if (chatBarView2 != null) {
            chatBarView2.setMaxChatLength$Habitica_2311256681_prodRelease(getConfigManager().maxChatLength());
        }
        FragmentInboxMessageListBinding binding6 = getBinding();
        if (binding6 != null) {
            chatBarView3 = binding6.chatBarView;
        } else {
            chatBarView3 = null;
        }
        if (chatBarView3 != null) {
            chatBarView3.setHasAcceptedGuidelines(true);
        }
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new InboxMessageListFragment$onViewCreated$6(this, null), 1, null);
    }

    public final void setConfigManager(AppConfigManager appConfigManager) {
        qc.q.i(appConfigManager, "<set-?>");
        this.configManager = appConfigManager;
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentInboxMessageListBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qc.q.i(layoutInflater, "inflater");
        FragmentInboxMessageListBinding inflate = FragmentInboxMessageListBinding.inflate(layoutInflater, viewGroup, false);
        qc.q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentInboxMessageListBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentInboxMessageListBinding fragmentInboxMessageListBinding) {
        this.binding = fragmentInboxMessageListBinding;
    }
}
