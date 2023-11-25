package com.habitrpg.android.habitica.ui.fragments.social.party;

import ad.a1;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.p0;
import androidx.lifecycle.w;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.FragmentPartyDetailBinding;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.helpers.HapticFeedbackManager;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.inventory.QuestMember;
import com.habitrpg.android.habitica.models.inventory.QuestProgress;
import com.habitrpg.android.habitica.models.invitations.PartyInvite;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment;
import com.habitrpg.android.habitica.ui.viewHolders.GroupMemberViewHolder;
import com.habitrpg.android.habitica.ui.viewmodels.PartyViewModel;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaBottomSheetDialog;
import com.habitrpg.android.habitica.ui.views.social.InvitationsView;
import com.habitrpg.android.habitica.ui.views.social.OldQuestProgressView;
import com.habitrpg.common.habitica.extensions.DataBindingUtils;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import com.habitrpg.common.habitica.views.PixelArtView;
import io.realm.x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import qc.g0;
import qc.j0;

/* compiled from: PartyDetailFragment.kt */
/* loaded from: classes4.dex */
public final class PartyDetailFragment extends Hilt_PartyDetailFragment<FragmentPartyDetailBinding> {
    public static final int $stable = 8;
    private FragmentPartyDetailBinding binding;
    public ChallengeRepository challengeRepository;
    public InventoryRepository inventoryRepository;
    public SocialRepository socialRepository;
    public UserRepository userRepository;
    private final dc.f viewModel$delegate;

    public PartyDetailFragment() {
        dc.f a10;
        a10 = dc.h.a(dc.j.NONE, new PartyDetailFragment$special$$inlined$viewModels$default$1(new PartyDetailFragment$viewModel$2(this)));
        this.viewModel$delegate = p0.b(this, g0.b(PartyViewModel.class), new PartyDetailFragment$special$$inlined$viewModels$default$2(a10), new PartyDetailFragment$special$$inlined$viewModels$default$3(null, a10), new PartyDetailFragment$special$$inlined$viewModels$default$4(this, a10));
    }

    private final List<Challenge> getGroupChallenges() {
        ArrayList arrayList = new ArrayList();
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new PartyDetailFragment$getGroupChallenges$1(this, arrayList, null), 1, null);
        return arrayList;
    }

    private final void inviteNewQuest() {
        ItemDialogFragment itemDialogFragment = new ItemDialogFragment();
        itemDialogFragment.setItemType("quests");
        itemDialogFragment.setItemTypeText(getString(R.string.quest));
        itemDialogFragment.setModal(true);
        itemDialogFragment.show(getParentFragmentManager(), "questDialog");
    }

    private final void onQuestAccept() {
        HapticFeedbackManager.Companion companion = HapticFeedbackManager.Companion;
        View requireView = requireView();
        qc.q.h(requireView, "requireView(...)");
        companion.tap(requireView);
        getViewModel().acceptQuest();
    }

    private final void onQuestReject() {
        HapticFeedbackManager.Companion companion = HapticFeedbackManager.Companion;
        View requireView = requireView();
        qc.q.h(requireView, "requireView(...)");
        companion.tap(requireView);
        getViewModel().rejectQuest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(PartyDetailFragment partyDetailFragment) {
        qc.q.i(partyDetailFragment, "this$0");
        partyDetailFragment.refreshParty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(PartyDetailFragment partyDetailFragment, View view) {
        qc.q.i(partyDetailFragment, "this$0");
        partyDetailFragment.onQuestAccept();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(PartyDetailFragment partyDetailFragment, View view) {
        qc.q.i(partyDetailFragment, "this$0");
        partyDetailFragment.onQuestReject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(PartyDetailFragment partyDetailFragment, View view) {
        qc.q.i(partyDetailFragment, "this$0");
        partyDetailFragment.inviteNewQuest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(PartyDetailFragment partyDetailFragment, View view) {
        qc.q.i(partyDetailFragment, "this$0");
        partyDetailFragment.questDetailButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5(PartyDetailFragment partyDetailFragment, View view) {
        qc.q.i(partyDetailFragment, "this$0");
        partyDetailFragment.leaveParty$Habitica_2311256681_prodRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6(View view) {
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.partyInvitationFragment, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7(PartyDetailFragment partyDetailFragment, View view) {
        qc.q.i(partyDetailFragment, "this$0");
        partyDetailFragment.showQuestMechanicsDialog();
    }

    private final void questDetailButtonClicked() {
        MainNavigationController mainNavigationController = MainNavigationController.INSTANCE;
        k3.k openQuestDetail = PartyFragmentDirections.openQuestDetail();
        qc.q.h(openQuestDetail, "openQuestDetail(...)");
        mainNavigationController.navigate(openQuestDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshParty() {
        getViewModel().retrieveGroup(new PartyDetailFragment$refreshParty$1(this));
    }

    private final boolean showParticipantButtons() {
        return getViewModel().showParticipantButtons();
    }

    private final void showQuestMechanicsDialog() {
        Context requireContext = requireContext();
        qc.q.h(requireContext, "requireContext(...)");
        HabiticaBottomSheetDialog habiticaBottomSheetDialog = new HabiticaBottomSheetDialog(requireContext);
        habiticaBottomSheetDialog.setContentView(R.layout.quest_mechanics_dialog);
        habiticaBottomSheetDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRemoveMemberDialog(String str, String str2) {
        HabiticaAlertDialog habiticaAlertDialog;
        Context context = getContext();
        String str3 = null;
        if (context != null) {
            habiticaAlertDialog = new HabiticaAlertDialog(context);
        } else {
            habiticaAlertDialog = null;
        }
        if (habiticaAlertDialog != null) {
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.remove, true, false, false, (pc.p) new PartyDetailFragment$showRemoveMemberDialog$1(this, str, str2), 12, (Object) null);
        }
        if (habiticaAlertDialog != null) {
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, 17039360, false, false, false, (pc.p) new PartyDetailFragment$showRemoveMemberDialog$2(this), 12, (Object) null);
        }
        if (habiticaAlertDialog != null) {
            Context context2 = getContext();
            if (context2 != null) {
                str3 = context2.getString(R.string.remove_member_confirm, str2);
            }
            habiticaAlertDialog.setTitle(str3);
        }
        if (habiticaAlertDialog != null) {
            habiticaAlertDialog.show();
        }
        if (habiticaAlertDialog != null) {
            habiticaAlertDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSendMessageToUserDialog(String str, String str2) {
        HabiticaAlertDialog habiticaAlertDialog = null;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.profile_new_message_dialog, (ViewGroup) null);
        AppCompatEditText appCompatEditText = (AppCompatEditText) inflate.findViewById(R.id.edit_new_message_text);
        TextView textView = (TextView) inflate.findViewById(R.id.new_message_title);
        j0 j0Var = j0.f21683a;
        String string = getString(R.string.profile_send_message_to);
        qc.q.h(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str2}, 1));
        qc.q.h(format, "format(format, *args)");
        textView.setText(format);
        Context context = getContext();
        if (context != null) {
            habiticaAlertDialog = new HabiticaAlertDialog(context);
        }
        if (habiticaAlertDialog != null) {
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, 17039370, true, false, false, (pc.p) new PartyDetailFragment$showSendMessageToUserDialog$1(this, str, appCompatEditText, str2), 12, (Object) null);
        }
        if (habiticaAlertDialog != null) {
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, 17039360, false, false, false, (pc.p) new PartyDetailFragment$showSendMessageToUserDialog$2(this), 12, (Object) null);
        }
        if (habiticaAlertDialog != null) {
            habiticaAlertDialog.setAdditionalContentView(inflate);
        }
        if (habiticaAlertDialog != null) {
            habiticaAlertDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTransferOwnerShipDialog(String str, String str2) {
        HabiticaAlertDialog habiticaAlertDialog;
        String str3;
        Context context = getContext();
        String str4 = null;
        if (context != null) {
            habiticaAlertDialog = new HabiticaAlertDialog(context);
        } else {
            habiticaAlertDialog = null;
        }
        if (habiticaAlertDialog != null) {
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.transfer, true, false, false, (pc.p) new PartyDetailFragment$showTransferOwnerShipDialog$1(this, str, str2), 12, (Object) null);
        }
        if (habiticaAlertDialog != null) {
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, 17039360, false, false, false, (pc.p) new PartyDetailFragment$showTransferOwnerShipDialog$2(this), 12, (Object) null);
        }
        if (habiticaAlertDialog != null) {
            Context context2 = getContext();
            if (context2 != null) {
                str3 = context2.getString(R.string.transfer_ownership_confirm);
            } else {
                str3 = null;
            }
            habiticaAlertDialog.setTitle(str3);
        }
        if (habiticaAlertDialog != null) {
            Context context3 = getContext();
            if (context3 != null) {
                str4 = context3.getString(R.string.transfer_ownership_confirm_message, str2);
            }
            habiticaAlertDialog.setMessage(str4);
        }
        if (habiticaAlertDialog != null) {
            habiticaAlertDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMembersList(List<? extends Member> list) {
        int i10;
        View view;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        String str;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        String leaderID = getViewModel().getLeaderID();
        if (list != null) {
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    ec.t.r();
                }
                Member member = (Member) obj;
                FragmentPartyDetailBinding binding = getBinding();
                if (binding != null && (linearLayout4 = binding.membersWrapper) != null) {
                    i10 = linearLayout4.getChildCount();
                } else {
                    i10 = 0;
                }
                String str2 = null;
                if (i10 > i11) {
                    FragmentPartyDetailBinding binding2 = getBinding();
                    if (binding2 != null && (linearLayout3 = binding2.membersWrapper) != null) {
                        view = linearLayout3.getChildAt(i11);
                    } else {
                        view = null;
                    }
                } else {
                    FragmentPartyDetailBinding binding3 = getBinding();
                    if (binding3 != null && (linearLayout2 = binding3.membersWrapper) != null) {
                        qc.q.f(linearLayout2);
                        view = ViewGroupExt.inflate(linearLayout2, R.layout.party_member, false);
                    } else {
                        view = null;
                    }
                    FragmentPartyDetailBinding binding4 = getBinding();
                    if (binding4 != null && (linearLayout = binding4.membersWrapper) != null) {
                        linearLayout.addView(view);
                    }
                    if (view != null) {
                        view.setTag(member.getId());
                    }
                }
                if (view != null) {
                    GroupMemberViewHolder groupMemberViewHolder = new GroupMemberViewHolder(view);
                    if (leaderID == null) {
                        str = "";
                    } else {
                        str = leaderID;
                    }
                    User f10 = getViewModel().getUser().f();
                    if (f10 != null) {
                        str2 = f10.getId();
                    }
                    groupMemberViewHolder.bind(member, str, str2);
                    groupMemberViewHolder.setOnClickEvent(new PartyDetailFragment$updateMembersList$1$1(member));
                    groupMemberViewHolder.setSendMessageEvent(new PartyDetailFragment$updateMembersList$1$2(this, member));
                    groupMemberViewHolder.setTransferOwnershipEvent(new PartyDetailFragment$updateMembersList$1$3(this, member));
                    groupMemberViewHolder.setRemoveMemberEvent(new PartyDetailFragment$updateMembersList$1$4(this, member));
                }
                i11 = i12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateParty(com.habitrpg.android.habitica.models.social.Group r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment.updateParty(com.habitrpg.android.habitica.models.social.Group):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateQuestContent(QuestContent questContent) {
        TextView textView;
        TextView textView2;
        PixelArtView pixelArtView;
        LinearLayout linearLayout;
        OldQuestProgressView oldQuestProgressView;
        OldQuestProgressView oldQuestProgressView2;
        x0<QuestMember> x0Var;
        ArrayList arrayList;
        TextView textView3;
        TextView textView4;
        String str;
        Integer num;
        Integer num2;
        boolean z10;
        Quest quest;
        OldQuestProgressView oldQuestProgressView3;
        x0<QuestMember> x0Var2;
        QuestMember questMember;
        TextView textView5;
        LinearLayout linearLayout2;
        OldQuestProgressView oldQuestProgressView4;
        TextView textView6;
        FragmentPartyDetailBinding binding;
        TextView textView7;
        String str2;
        TextView textView8;
        TextView textView9;
        int i10;
        String str3;
        QuestMember questMember2;
        Quest quest2;
        OldQuestProgressView oldQuestProgressView5;
        QuestProgress questProgress;
        Quest quest3;
        FragmentPartyDetailBinding binding2;
        TextView textView10;
        PixelArtView pixelArtView2;
        PixelArtView pixelArtView3;
        FragmentPartyDetailBinding binding3 = getBinding();
        TextView textView11 = null;
        if (binding3 != null) {
            textView = binding3.questTitleView;
        } else {
            textView = null;
        }
        if (textView != null && questContent.isValid()) {
            FragmentPartyDetailBinding binding4 = getBinding();
            if (binding4 != null) {
                textView2 = binding4.questTitleView;
            } else {
                textView2 = null;
            }
            if (textView2 != null) {
                textView2.setText(questContent.getText());
            }
            FragmentPartyDetailBinding binding5 = getBinding();
            if (binding5 != null && (pixelArtView3 = binding5.questScrollImageView) != null) {
                DataBindingUtilsKt.loadImage$default(pixelArtView3, "inventory_quest_scroll_" + questContent.getKey(), null, 2, null);
            }
            if (questContent.hasGifImage()) {
                FragmentPartyDetailBinding binding6 = getBinding();
                if (binding6 != null && (pixelArtView2 = binding6.questImageView) != null) {
                    DataBindingUtilsKt.loadImage(pixelArtView2, "quest_" + questContent.getKey(), "gif");
                }
            } else {
                Context context = getContext();
                if (context != null) {
                    DataBindingUtils.INSTANCE.loadImage(context, "quest_" + questContent.getKey(), new PartyDetailFragment$updateQuestContent$1$1(this, context));
                }
                FragmentPartyDetailBinding binding7 = getBinding();
                if (binding7 != null && (pixelArtView = binding7.questImageView) != null) {
                    DataBindingUtilsKt.loadImage$default(pixelArtView, "quest_" + questContent.getKey(), null, 2, null);
                }
            }
            FragmentPartyDetailBinding binding8 = getBinding();
            if (binding8 != null) {
                linearLayout = binding8.questImageWrapper;
            } else {
                linearLayout = null;
            }
            if (linearLayout != null) {
                linearLayout.setAlpha(1.0f);
            }
            FragmentPartyDetailBinding binding9 = getBinding();
            if (binding9 != null) {
                oldQuestProgressView = binding9.questProgressView;
            } else {
                oldQuestProgressView = null;
            }
            if (oldQuestProgressView != null) {
                oldQuestProgressView.setAlpha(1.0f);
            }
            Context context2 = getContext();
            if (context2 != null && (binding2 = getBinding()) != null && (textView10 = binding2.questParticipationView) != null) {
                textView10.setTextColor(androidx.core.content.a.c(context2, R.color.text_ternary));
            }
            int i11 = 0;
            if (getViewModel().isQuestActive$Habitica_2311256681_prodRelease()) {
                FragmentPartyDetailBinding binding10 = getBinding();
                if (binding10 != null) {
                    oldQuestProgressView3 = binding10.questProgressView;
                } else {
                    oldQuestProgressView3 = null;
                }
                if (oldQuestProgressView3 != null) {
                    oldQuestProgressView3.setVisibility(0);
                }
                FragmentPartyDetailBinding binding11 = getBinding();
                if (binding11 != null && (oldQuestProgressView5 = binding11.questProgressView) != null) {
                    Group f10 = getViewModel().getGroupData().f();
                    if (f10 != null && (quest3 = f10.getQuest()) != null) {
                        questProgress = quest3.getProgress();
                    } else {
                        questProgress = null;
                    }
                    oldQuestProgressView5.setData(questContent, questProgress);
                }
                Group f11 = getViewModel().getGroupData().f();
                if (f11 != null && (quest2 = f11.getQuest()) != null) {
                    x0Var2 = quest2.getMembers();
                } else {
                    x0Var2 = null;
                }
                if (x0Var2 != null) {
                    Iterator<QuestMember> it = x0Var2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            questMember2 = it.next();
                            if (qc.q.d(questMember2.getKey(), getViewModel().getUserViewModel().getUserID())) {
                                break;
                            }
                        } else {
                            questMember2 = null;
                            break;
                        }
                    }
                    questMember = questMember2;
                } else {
                    questMember = null;
                }
                if (questMember != null) {
                    FragmentPartyDetailBinding binding12 = getBinding();
                    if (binding12 != null) {
                        textView8 = binding12.questParticipationView;
                    } else {
                        textView8 = null;
                    }
                    if (textView8 != null) {
                        Context context3 = getContext();
                        if (context3 != null) {
                            str3 = context3.getString(R.string.number_participants, Integer.valueOf(x0Var2.size()));
                        } else {
                            str3 = null;
                        }
                        textView8.setText(str3);
                    }
                    FragmentPartyDetailBinding binding13 = getBinding();
                    if (binding13 != null) {
                        textView9 = binding13.questPendingDamageView;
                    } else {
                        textView9 = null;
                    }
                    if (textView9 != null) {
                        if (questContent.isBossQuest()) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        textView9.setVisibility(i10);
                    }
                    FragmentPartyDetailBinding binding14 = getBinding();
                    if (binding14 != null) {
                        textView11 = binding14.questPendingItemsView;
                    }
                    if (textView11 != null) {
                        if ((!questContent.isBossQuest()) == false) {
                            i11 = 8;
                        }
                        textView11.setVisibility(i11);
                        return;
                    }
                    return;
                }
                FragmentPartyDetailBinding binding15 = getBinding();
                if (binding15 != null) {
                    textView5 = binding15.questParticipationView;
                } else {
                    textView5 = null;
                }
                if (textView5 != null) {
                    Context context4 = getContext();
                    if (context4 != null) {
                        str2 = context4.getString(R.string.not_participating);
                    } else {
                        str2 = null;
                    }
                    textView5.setText(str2);
                }
                Context context5 = getContext();
                if (context5 != null && (binding = getBinding()) != null && (textView7 = binding.questParticipationView) != null) {
                    textView7.setTextColor(androidx.core.content.a.c(context5, R.color.red_10));
                }
                FragmentPartyDetailBinding binding16 = getBinding();
                if (binding16 != null) {
                    linearLayout2 = binding16.questImageWrapper;
                } else {
                    linearLayout2 = null;
                }
                if (linearLayout2 != null) {
                    linearLayout2.setAlpha(0.5f);
                }
                FragmentPartyDetailBinding binding17 = getBinding();
                if (binding17 != null) {
                    oldQuestProgressView4 = binding17.questProgressView;
                } else {
                    oldQuestProgressView4 = null;
                }
                if (oldQuestProgressView4 != null) {
                    oldQuestProgressView4.setAlpha(0.5f);
                }
                FragmentPartyDetailBinding binding18 = getBinding();
                if (binding18 != null) {
                    textView6 = binding18.questPendingDamageView;
                } else {
                    textView6 = null;
                }
                if (textView6 != null) {
                    textView6.setVisibility(8);
                }
                FragmentPartyDetailBinding binding19 = getBinding();
                if (binding19 != null) {
                    textView11 = binding19.questPendingItemsView;
                }
                if (textView11 != null) {
                    textView11.setVisibility(8);
                    return;
                }
                return;
            }
            FragmentPartyDetailBinding binding20 = getBinding();
            if (binding20 != null) {
                oldQuestProgressView2 = binding20.questProgressView;
            } else {
                oldQuestProgressView2 = null;
            }
            if (oldQuestProgressView2 != null) {
                oldQuestProgressView2.setVisibility(8);
            }
            Group f12 = getViewModel().getGroupData().f();
            if (f12 != null && (quest = f12.getQuest()) != null) {
                x0Var = quest.getMembers();
            } else {
                x0Var = null;
            }
            if (x0Var != null) {
                arrayList = new ArrayList();
                for (QuestMember questMember3 : x0Var) {
                    if (questMember3.isParticipating() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList.add(questMember3);
                    }
                }
            } else {
                arrayList = null;
            }
            FragmentPartyDetailBinding binding21 = getBinding();
            if (binding21 != null) {
                textView3 = binding21.questParticipationView;
            } else {
                textView3 = null;
            }
            if (textView3 != null) {
                Context context6 = getContext();
                if (context6 != null) {
                    Object[] objArr = new Object[2];
                    if (arrayList != null) {
                        num = Integer.valueOf(arrayList.size());
                    } else {
                        num = null;
                    }
                    objArr[0] = num;
                    if (x0Var != null) {
                        num2 = Integer.valueOf(x0Var.size());
                    } else {
                        num2 = null;
                    }
                    objArr[1] = num2;
                    str = context6.getString(R.string.number_responded, objArr);
                } else {
                    str = null;
                }
                textView3.setText(str);
            }
            FragmentPartyDetailBinding binding22 = getBinding();
            if (binding22 != null) {
                textView4 = binding22.questPendingDamageView;
            } else {
                textView4 = null;
            }
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            FragmentPartyDetailBinding binding23 = getBinding();
            if (binding23 != null) {
                textView11 = binding23.questPendingItemsView;
            }
            if (textView11 != null) {
                textView11.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateUser(com.habitrpg.android.habitica.models.user.User r12) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment.updateUser(com.habitrpg.android.habitica.models.user.User):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUser$lambda$13$lambda$10(PartyInvite partyInvite, PartyDetailFragment partyDetailFragment, View view) {
        FragmentPartyDetailBinding binding;
        InvitationsView invitationsView;
        pc.l<String, dc.w> acceptCall;
        qc.q.i(partyDetailFragment, "this$0");
        String id2 = partyInvite.getId();
        if (id2 != null && (binding = partyDetailFragment.getBinding()) != null && (invitationsView = binding.invitationsView) != null && (acceptCall = invitationsView.getAcceptCall()) != null) {
            acceptCall.invoke(id2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUser$lambda$13$lambda$12(PartyInvite partyInvite, PartyDetailFragment partyDetailFragment, View view) {
        FragmentPartyDetailBinding binding;
        InvitationsView invitationsView;
        pc.l<String, dc.w> rejectCall;
        qc.q.i(partyDetailFragment, "this$0");
        String id2 = partyInvite.getId();
        if (id2 != null && (binding = partyDetailFragment.getBinding()) != null && (invitationsView = binding.invitationsView) != null && (rejectCall = invitationsView.getRejectCall()) != null) {
            rejectCall.invoke(id2);
        }
    }

    public final ChallengeRepository getChallengeRepository() {
        ChallengeRepository challengeRepository = this.challengeRepository;
        if (challengeRepository != null) {
            return challengeRepository;
        }
        qc.q.z("challengeRepository");
        return null;
    }

    public final InventoryRepository getInventoryRepository() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        qc.q.z("inventoryRepository");
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

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        qc.q.z("userRepository");
        return null;
    }

    public final PartyViewModel getViewModel() {
        return (PartyViewModel) this.viewModel$delegate.getValue();
    }

    public final void leaveParty$Habitica_2311256681_prodRelease() {
        Context context = getContext();
        if (context != null) {
            ad.i.d(w.a(this), a1.c(), null, new PartyDetailFragment$leaveParty$1(getGroupChallenges(), context, this, null), 2, null);
        }
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getInventoryRepository().close();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        InvitationsView invitationsView;
        InvitationsView invitationsView2;
        Button button;
        ComposeView composeView;
        Button button2;
        Button button3;
        LinearLayout linearLayout;
        Button button4;
        Button button5;
        Button button6;
        SwipeRefreshLayout swipeRefreshLayout;
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        FragmentPartyDetailBinding binding = getBinding();
        if (binding != null && (swipeRefreshLayout = binding.refreshLayout) != null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.h
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
                public final void onRefresh() {
                    PartyDetailFragment.onViewCreated$lambda$0(PartyDetailFragment.this);
                }
            });
        }
        FragmentPartyDetailBinding binding2 = getBinding();
        if (binding2 != null && (button6 = binding2.questAcceptButton) != null) {
            button6.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PartyDetailFragment.onViewCreated$lambda$1(PartyDetailFragment.this, view2);
                }
            });
        }
        FragmentPartyDetailBinding binding3 = getBinding();
        if (binding3 != null && (button5 = binding3.questRejectButton) != null) {
            button5.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PartyDetailFragment.onViewCreated$lambda$2(PartyDetailFragment.this, view2);
                }
            });
        }
        FragmentPartyDetailBinding binding4 = getBinding();
        if (binding4 != null && (button4 = binding4.newQuestButton) != null) {
            button4.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PartyDetailFragment.onViewCreated$lambda$3(PartyDetailFragment.this, view2);
                }
            });
        }
        FragmentPartyDetailBinding binding5 = getBinding();
        if (binding5 != null && (linearLayout = binding5.questDetailButton) != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PartyDetailFragment.onViewCreated$lambda$4(PartyDetailFragment.this, view2);
                }
            });
        }
        FragmentPartyDetailBinding binding6 = getBinding();
        if (binding6 != null && (button3 = binding6.leaveButton) != null) {
            button3.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PartyDetailFragment.onViewCreated$lambda$5(PartyDetailFragment.this, view2);
                }
            });
        }
        FragmentPartyDetailBinding binding7 = getBinding();
        if (binding7 != null && (button2 = binding7.findNewMember) != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PartyDetailFragment.onViewCreated$lambda$6(view2);
                }
            });
        }
        FragmentPartyDetailBinding binding8 = getBinding();
        InvitationsView invitationsView3 = null;
        if (binding8 != null) {
            invitationsView = binding8.invitationsView;
        } else {
            invitationsView = null;
        }
        if (invitationsView != null) {
            invitationsView.setGetLeader(null);
        }
        FragmentPartyDetailBinding binding9 = getBinding();
        if (binding9 != null) {
            invitationsView2 = binding9.invitationsView;
        } else {
            invitationsView2 = null;
        }
        if (invitationsView2 != null) {
            invitationsView2.setAcceptCall(new PartyDetailFragment$onViewCreated$8(this));
        }
        FragmentPartyDetailBinding binding10 = getBinding();
        if (binding10 != null) {
            invitationsView3 = binding10.invitationsView;
        }
        if (invitationsView3 != null) {
            invitationsView3.setRejectCall(new PartyDetailFragment$onViewCreated$9(this));
        }
        FragmentPartyDetailBinding binding11 = getBinding();
        if (binding11 != null && (composeView = binding11.invitesWrapper) != null) {
            composeView.setContent(q0.c.c(505437183, true, new PartyDetailFragment$onViewCreated$10(this)));
        }
        getViewModel().getGroupData().j(getViewLifecycleOwner(), new PartyDetailFragment$sam$androidx_lifecycle_Observer$0(new PartyDetailFragment$onViewCreated$11(this)));
        getViewModel().getUser().j(getViewLifecycleOwner(), new PartyDetailFragment$sam$androidx_lifecycle_Observer$0(new PartyDetailFragment$onViewCreated$12(this)));
        getViewModel().getMembersData().j(getViewLifecycleOwner(), new PartyDetailFragment$sam$androidx_lifecycle_Observer$0(new PartyDetailFragment$onViewCreated$13(this)));
        FragmentPartyDetailBinding binding12 = getBinding();
        if (binding12 != null && (button = binding12.questMechanicsButton) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PartyDetailFragment.onViewCreated$lambda$7(PartyDetailFragment.this, view2);
                }
            });
        }
    }

    public final void setChallengeRepository(ChallengeRepository challengeRepository) {
        qc.q.i(challengeRepository, "<set-?>");
        this.challengeRepository = challengeRepository;
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        qc.q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    public final void setUserRepository(UserRepository userRepository) {
        qc.q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentPartyDetailBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qc.q.i(layoutInflater, "inflater");
        FragmentPartyDetailBinding inflate = FragmentPartyDetailBinding.inflate(layoutInflater, viewGroup, false);
        qc.q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentPartyDetailBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentPartyDetailBinding fragmentPartyDetailBinding) {
        this.binding = fragmentPartyDetailBinding;
    }
}
