package com.habitrpg.android.habitica.ui.fragments.social;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p0;
import androidx.fragment.app.q;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.FragmentChatBinding;
import com.habitrpg.android.habitica.extensions.BaseViewModelExtensionsKt;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.user.Flags;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.adapter.social.ChatRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.fragments.ReportBottomSheetFragment;
import com.habitrpg.android.habitica.ui.helpers.AutocompleteAdapter;
import com.habitrpg.android.habitica.ui.helpers.SafeDefaultItemAnimator;
import com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.android.habitica.ui.views.social.ChatBarView;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import java.util.List;
import pc.p;
import qc.g0;
import yc.w;

/* compiled from: ChatFragment.kt */
/* loaded from: classes4.dex */
public class ChatFragment extends Hilt_ChatFragment<FragmentChatBinding> {
    public static final int $stable = 8;
    private String autocompleteContext;
    private FragmentChatBinding binding;
    private ChatRecyclerViewAdapter chatAdapter;
    public AppConfigManager configManager;
    private boolean isFirstRefresh;
    private boolean isScrolledToBottom;
    private boolean navigatedOnceToFragment;
    public SocialRepository socialRepository;
    private final dc.f viewModel$delegate;

    public ChatFragment() {
        dc.f a10;
        a10 = dc.h.a(dc.j.NONE, new ChatFragment$special$$inlined$viewModels$default$1(new ChatFragment$viewModel$2(this)));
        this.viewModel$delegate = p0.b(this, g0.b(GroupViewModel.class), new ChatFragment$special$$inlined$viewModels$default$2(a10), new ChatFragment$special$$inlined$viewModels$default$3(null, a10), new ChatFragment$special$$inlined$viewModels$default$4(this, a10));
        this.isScrolledToBottom = true;
        this.isFirstRefresh = true;
        this.autocompleteContext = "";
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

    private final void markMessagesAsSeen() {
        if (this.navigatedOnceToFragment) {
            getViewModel().markMessagesSeen();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(ChatFragment chatFragment, User user) {
        ChatBarView chatBarView;
        Flags flags;
        qc.q.i(chatFragment, "this$0");
        ChatRecyclerViewAdapter chatRecyclerViewAdapter = chatFragment.chatAdapter;
        if (chatRecyclerViewAdapter != null) {
            chatRecyclerViewAdapter.setUser$Habitica_2311256681_prodRelease(user);
        }
        FragmentChatBinding binding = chatFragment.getBinding();
        if (binding != null) {
            chatBarView = binding.chatBarView;
        } else {
            chatBarView = null;
        }
        if (chatBarView != null) {
            boolean z10 = false;
            if (user != null && (flags = user.getFlags()) != null && flags.getCommunityGuidelinesAccepted()) {
                z10 = true;
            }
            chatBarView.setHasAcceptedGuidelines(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refresh() {
        getViewModel().retrieveGroupChat(new ChatFragment$refresh$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendChatMessage(String str) {
        getViewModel().postGroupChat(str, new ChatFragment$sendChatMessage$1(this), new ChatFragment$sendChatMessage$2(this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setChatMessages(List<? extends ChatMessage> list) {
        ChatBarView chatBarView;
        ChatRecyclerViewAdapter chatRecyclerViewAdapter = this.chatAdapter;
        if (chatRecyclerViewAdapter != null) {
            chatRecyclerViewAdapter.setData(list);
        }
        FragmentChatBinding binding = getBinding();
        if (binding != null) {
            chatBarView = binding.chatBarView;
        } else {
            chatBarView = null;
        }
        if (chatBarView != null) {
            chatBarView.setChatMessages(list);
        }
        getViewModel().setGotNewMessages(true);
        markMessagesAsSeen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setReplyTo(String str) {
        String str2;
        boolean K;
        ChatBarView chatBarView;
        FragmentChatBinding binding = getBinding();
        if (binding == null || (chatBarView = binding.chatBarView) == null || (str2 = chatBarView.getMessage()) == null) {
            str2 = "";
        }
        ChatBarView chatBarView2 = null;
        K = w.K(str2, "@" + str, false, 2, null);
        if (K) {
            return;
        }
        FragmentChatBinding binding2 = getBinding();
        if (binding2 != null) {
            chatBarView2 = binding2.chatBarView;
        }
        if (chatBarView2 != null) {
            chatBarView2.setMessage("@" + str + " " + str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDeleteConfirmationDialog(ChatMessage chatMessage) {
        Context context = getContext();
        if (context != null) {
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
            habiticaAlertDialog.setTitle(R.string.confirm_delete_tag_title);
            habiticaAlertDialog.setMessage(R.string.confirm_delete_tag_message);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.yes, true, true, false, (p) new ChatFragment$showDeleteConfirmationDialog$1(this, chatMessage), 8, (Object) null);
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
        String a10 = g0.b(getClass()).a();
        if (a10 == null) {
            str5 = "";
        } else {
            str5 = a10;
        }
        ReportBottomSheetFragment.Companion.newInstance$default(companion, ReportBottomSheetFragment.REPORT_TYPE_MESSAGE, str, null, str4, id2, str2, str3, str5, 4, null).show(getChildFragmentManager(), ReportBottomSheetFragment.TAG);
    }

    public final String getAutocompleteContext() {
        return this.autocompleteContext;
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

    public GroupViewModel getViewModel() {
        return (GroupViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        setNavigatedToFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        ChatBarView chatBarView;
        ChatBarView chatBarView2;
        ChatBarView chatBarView3;
        ChatBarView chatBarView4;
        ChatBarView chatBarView5;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        ChatBarView chatBarView6;
        RecyclerView recyclerView4;
        String str;
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.K2(true);
        linearLayoutManager.L2(false);
        FragmentChatBinding binding = getBinding();
        if (binding != null) {
            recyclerView = binding.recyclerView;
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        ChatRecyclerViewAdapter chatRecyclerViewAdapter = new ChatRecyclerViewAdapter(null, true);
        this.chatAdapter = chatRecyclerViewAdapter;
        chatRecyclerViewAdapter.setOnOpenProfile(ChatFragment$onViewCreated$1$1.INSTANCE);
        chatRecyclerViewAdapter.setOnDeleteMessage(new ChatFragment$onViewCreated$1$2(this));
        chatRecyclerViewAdapter.setOnFlagMessage(new ChatFragment$onViewCreated$1$3(this));
        chatRecyclerViewAdapter.setOnReply(new ChatFragment$onViewCreated$1$4(this));
        chatRecyclerViewAdapter.setOnCopyMessage(new ChatFragment$onViewCreated$1$5(this));
        chatRecyclerViewAdapter.setOnMessageLike(new ChatFragment$onViewCreated$1$6(this));
        FragmentChatBinding binding2 = getBinding();
        if (binding2 != null) {
            chatBarView = binding2.chatBarView;
        } else {
            chatBarView = null;
        }
        if (chatBarView != null) {
            chatBarView.setSendAction(new ChatFragment$onViewCreated$2(this));
        }
        FragmentChatBinding binding3 = getBinding();
        if (binding3 != null) {
            chatBarView2 = binding3.chatBarView;
        } else {
            chatBarView2 = null;
        }
        if (chatBarView2 != null) {
            chatBarView2.setMaxChatLength$Habitica_2311256681_prodRelease(getConfigManager().maxChatLength());
        }
        FragmentChatBinding binding4 = getBinding();
        if (binding4 != null) {
            chatBarView3 = binding4.chatBarView;
        } else {
            chatBarView3 = null;
        }
        if (chatBarView3 != null) {
            chatBarView3.setAutocompleteContext(NavigationDrawerFragment.SIDEBAR_PARTY);
        }
        FragmentChatBinding binding5 = getBinding();
        if (binding5 != null) {
            chatBarView4 = binding5.chatBarView;
        } else {
            chatBarView4 = null;
        }
        if (chatBarView4 != null) {
            Group f10 = getViewModel().getGroupData().f();
            if (f10 != null) {
                str = f10.getId();
            } else {
                str = null;
            }
            chatBarView4.setGroupID(str);
        }
        FragmentChatBinding binding6 = getBinding();
        if (binding6 != null) {
            chatBarView5 = binding6.chatBarView;
        } else {
            chatBarView5 = null;
        }
        if (chatBarView5 != null) {
            Context requireContext = requireContext();
            qc.q.h(requireContext, "requireContext(...)");
            chatBarView5.setAutocompleteAdapter(new AutocompleteAdapter(requireContext, getSocialRepository(), this.autocompleteContext, getViewModel().getGroupID(), getConfigManager().enableUsernameAutocomplete()));
        }
        FragmentChatBinding binding7 = getBinding();
        if (binding7 != null) {
            recyclerView2 = binding7.recyclerView;
        } else {
            recyclerView2 = null;
        }
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.chatAdapter);
        }
        FragmentChatBinding binding8 = getBinding();
        if (binding8 != null) {
            recyclerView3 = binding8.recyclerView;
        } else {
            recyclerView3 = null;
        }
        if (recyclerView3 != null) {
            recyclerView3.setItemAnimator(new SafeDefaultItemAnimator());
        }
        FragmentChatBinding binding9 = getBinding();
        if (binding9 != null && (recyclerView4 = binding9.recyclerView) != null) {
            recyclerView4.addOnScrollListener(new RecyclerView.u() { // from class: com.habitrpg.android.habitica.ui.fragments.social.ChatFragment$onViewCreated$3
                @Override // androidx.recyclerview.widget.RecyclerView.u
                public void onScrolled(RecyclerView recyclerView5, int i10, int i11) {
                    boolean z10;
                    qc.q.i(recyclerView5, "recyclerView");
                    super.onScrolled(recyclerView5, i10, i11);
                    ChatFragment chatFragment = ChatFragment.this;
                    if (linearLayoutManager.i2() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    chatFragment.isScrolledToBottom = z10;
                }
            });
        }
        getViewModel().getChatmessages().j(getViewLifecycleOwner(), new ChatFragment$sam$androidx_lifecycle_Observer$0(new ChatFragment$onViewCreated$4(this)));
        FragmentChatBinding binding10 = getBinding();
        if (binding10 != null) {
            chatBarView6 = binding10.chatBarView;
        } else {
            chatBarView6 = null;
        }
        if (chatBarView6 != null) {
            chatBarView6.setOnCommunityGuidelinesAccepted(new ChatFragment$onViewCreated$5(this));
        }
        LiveData<User> user = getViewModel().getUser();
        v viewLifecycleOwner = getViewLifecycleOwner();
        qc.q.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BaseViewModelExtensionsKt.observeOnce(user, viewLifecycleOwner, new androidx.lifecycle.g0() { // from class: com.habitrpg.android.habitica.ui.fragments.social.a
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                ChatFragment.onViewCreated$lambda$1(ChatFragment.this, (User) obj);
            }
        });
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new ChatFragment$onViewCreated$7(this, null), 1, null);
    }

    public final void setAutocompleteContext(String str) {
        qc.q.i(str, "<set-?>");
        this.autocompleteContext = str;
    }

    public final void setConfigManager(AppConfigManager appConfigManager) {
        qc.q.i(appConfigManager, "<set-?>");
        this.configManager = appConfigManager;
    }

    public final void setNavigatedToFragment() {
        this.navigatedOnceToFragment = true;
        markMessagesAsSeen();
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentChatBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qc.q.i(layoutInflater, "inflater");
        FragmentChatBinding inflate = FragmentChatBinding.inflate(layoutInflater, viewGroup, false);
        qc.q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentChatBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentChatBinding fragmentChatBinding) {
        this.binding = fragmentChatBinding;
    }
}
